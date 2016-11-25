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
			// FileReader: Abre e l� o arquivo
			arqentrada=new BufferedReader(new FileReader("/WorkSpace/Agenda.txt"));
			// Digita o nome atrav�s de uma entrada do teclado
			System.out.println("Digite o nome: ");
			String Nome=entrada.readLine();
			/* StringBuffer: Possibilita opera��es mais avan�adas a nivel de
			 * de mem�ria como por exemplo utilizar append, que adiciona um novo
			 * conte�do ao conte�do j� existente sem perda de dados
			 */
			
			StringBuffer memoria=new StringBuffer();
			String linha;
			// Estrutura de busca at� a �ltima linha do arquivo
			while((linha=arqentrada.readLine())!=null){
				memoria.append(linha+"\n");
			}
			
			int inicio=-1;
			/* A busca � feita na vari�vel mem�ria
			 * com o m�todo indexOf que recebe nome como
			 * par�metro, dado obtido pela entrada de dados via teclado
			 */
			
			/*
			 * Esse m�todo retorna a posi��o onde se inicia o caracter pesquisado
			 * As posi��es s�o numeradas a partir de 0, significando que o teste
			 * de condi��o verifica se o valor atribuido a vari�vel inicio foi 
			 * alterado. Em caso afirmativo, ou seja, se in�cio � diferente de -1
			 * executam-se os comandos internos do la�o.
			 */
			inicio=memoria.indexOf(Nome);
			
			if(inicio!=-1){
				/*
				 * Para que seja poss�vel obter a sequ�ncia de caracteres
				 * correspondente ao registro completo � necess�rio
				 * determinar o seu final. Isto � feito pelo comando:
				 * memoria.indexOf("\n", inicio);
				 * que busca o caracter "/n" que significa nova linha.
				 * imediatamente ap�s o primeiro caracter encontrado. 
				 */
				int fim=memoria.indexOf("\n", inicio);
				/*
				 * Utiliza-se o m�todo getChars para se obter os caracteres 
				 * correspondentes ao registro, passando-se os par�metros
				 * inicio e fim como delimitadores.
				 */
				char [] destino=new char[fim-inicio];
				
				memoria.getChars(inicio, fim, destino, 0);
				/*
				 * A String obtida � armazenada na pr�pria vari�vel linha
				 * que ser� utilizada para exibi��o dos dados
				 */
				linha="";
				// Procura-se a linha final 
				for(int i=0;i<fim-inicio;i++){
					linha +=destino[i];
				}
				// Imprime a linha na tela
				System.out.println(linha);
			}else{
				System.out.println("Item n�o encontrado!");
			}
			entrada.close();
			
		}catch(FileNotFoundException erro){
			System.out.println("Arquivo n�o encontrado!");
		
		}catch (Exception erro){
		System.out.println("Erro de leitura!");
	}
}

}
