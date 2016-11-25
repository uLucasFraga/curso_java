package pacote_acesso_arquivos;

import java.io.*;

public class consultaRegistro {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader entrada;
			entrada=new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader arqentrada;
			// FileReader: Abre e lê o arquivo
			arqentrada=new BufferedReader(new FileReader("/WorkSpace/Agenda.txt"));
			// Digita o nome através de uma entrada do teclado
			System.out.println("Digite o nome: ");
			String Nome=entrada.readLine();
			/* StringBuffer: Possibilita operações mais avançadas a nivel de
			 * de memória como por exemplo utilizar append, que adiciona um novo
			 * conteúdo ao conteúdo já existente sem perda de dados
			 */
			
			StringBuffer memoria=new StringBuffer();
			String linha;
			// Estrutura de busca até a última linha do arquivo
			while((linha=arqentrada.readLine())!=null){
				memoria.append(linha+"\n");
			}
			
			int inicio=-1;
			/* A busca é feita na variável memória
			 * com o método indexOf que recebe nome como
			 * parâmetro, dado obtido pela entrada de dados via teclado
			 */
			
			/*
			 * Esse método retorna a posição onde se inicia o caracter pesquisado
			 * As posições são numeradas a partir de 0, significando que o teste
			 * de condição verifica se o valor atribuido a variável inicio foi 
			 * alterado. Em caso afirmativo, ou seja, se início é diferente de -1
			 * executam-se os comandos internos do laço.
			 */
			inicio=memoria.indexOf(Nome);
			
			if(inicio!=-1){
				/*
				 * Para que seja possível obter a sequência de caracteres
				 * correspondente ao registro completo é necessário
				 * determinar o seu final. Isto é feito pelo comando:
				 * memoria.indexOf("\n", inicio);
				 * que busca o caracter "/n" que significa nova linha.
				 * imediatamente após o primeiro caracter encontrado. 
				 */
				int fim=memoria.indexOf("\n", inicio);
				/*
				 * Utiliza-se o método getChars para se obter os caracteres 
				 * correspondentes ao registro, passando-se os parâmetros
				 * inicio e fim como delimitadores.
				 */
				char [] destino=new char[fim-inicio];
				
				memoria.getChars(inicio, fim, destino, 0);
				/*
				 * A String obtida é armazenada na própria variável linha
				 * que será utilizada para exibição dos dados
				 */
				linha="";
				// Procura-se a linha final 
				for(int i=0;i<fim-inicio;i++){
					linha +=destino[i];
				}
				// Imprime a linha na tela
				System.out.println(linha);
			}else{
				System.out.println("Item não encontrado!");
			}
			entrada.close();
			
		}catch(FileNotFoundException erro){
			System.out.println("Arquivo não encontrado!");
		
		}catch (Exception erro){
		System.out.println("Erro de leitura!");
	}
}

}
