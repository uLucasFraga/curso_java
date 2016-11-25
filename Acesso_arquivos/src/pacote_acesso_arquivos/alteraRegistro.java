package pacote_acesso_arquivos;

	import java.io.*;
	public class alteraRegistro {
	static StringBuffer memoria=new StringBuffer();
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			try{
				BufferedReader entrada;
				entrada=new BufferedReader(new InputStreamReader(System.in));
				
				BufferedReader arqentrada;
				arqentrada=new BufferedReader(new FileReader("Agenda.txt"));
				
				System.out.println("Digite o nome: ");
				String Nome=entrada.readLine();
				
				String Endereco="";
				String Telefone="";
				String linha="";
				
				while((linha=arqentrada.readLine())!=null){
					memoria.append(linha+"\n");
				}
				
				int inicio=-1;
				inicio=memoria.indexOf(Nome);
				
				if(inicio !=-1){
					int ultimo=memoria.indexOf("\t", inicio);
					Nome=Ler(inicio,ultimo);
					
					int primeiro=ultimo+1;
					ultimo=memoria.indexOf("\t", primeiro);
					Endereco=Ler(primeiro,ultimo);
					primeiro=ultimo+1;
					
					int fim=memoria.indexOf("\n",primeiro);
					Telefone=Ler(primeiro,fim);
					regAgenda02 regAg1=new regAgenda02 (Nome, Endereco, Telefone);
					
					System.out.println("Endereco: "+regAg1.mostraEnd()+" "+"Telefone: "+regAg1.mostraTel());
					System.out.println("Entre com novo endereco: ");
					Endereco=entrada.readLine();
					System.out.println("Entre com novo Telefone: ");
					Telefone=entrada.readLine();
					regAg1.alteraTel(Telefone);
					memoria.replace(inicio, fim, regAg1.mostraNome()+regAg1.mostraEnd()+"\t"+regAg1.mostraTel());
					gravar();
					
					arqentrada.close();
				}
				
			}catch(FileNotFoundException erro){
				System.out.println("Arquivo não encontrado!");
			
			}catch (Exception erro){
			System.out.println("Erro de leitura!");
		}
			

		}

	public static String Ler(int primeiro, int ultimo){
		String dados="";
		char[] destino=new char[ultimo-primeiro];
		memoria.getChars(primeiro, ultimo, destino, 0);
		
		for(int i=0; i<destino.length;i++){
		dados+=destino[i];	
		
	}
		return dados;
	}

	public static void gravar(){
		try{
			BufferedWriter saida;
			saida=new BufferedWriter(new FileWriter("Agenda.txt"));
			saida.write(memoria.toString());
			saida.flush();
			saida.close();
		}catch (Exception erro){
			System.out.println("Erro de gravação!");
		}
		
		
	}

	}

