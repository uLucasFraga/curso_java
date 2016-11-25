// -----02
package pacote_acesso_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class entraRegistro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			// Para ler a entrada de dados do teclado declarou-se a vari�vel entrada
			BufferedReader entrada;
			entrada=new BufferedReader (new InputStreamReader(System.in));
			/* Declarou-se a vari�vel sa�da que atrav�s do objeto FileWriter armazena 
			 * o registro no arquivo "Agenda.txt" dentro da pasta do projeto
			 * Caso o arquivo n�o exista o mesmo ser� criado automaticamente
			*/
			BufferedWriter saida;
			// FileWriter: Indica a sa�da para o arquivo /WorkSpace/Agenda.txt
			/* Condi��o Append=true, ou seja, os dados ser�o gravados sempre no final
			 * do arquivo
			 */
			saida=new BufferedWriter(new FileWriter("/WorkSpace/Agenda.txt", true));
			
			// Processo de entrada de dados
			System.out.println("Digite o nome: ");
			String nome=entrada.readLine();
			
			System.out.println("Digite o endere�o: ");
			String endereco=entrada.readLine();
			
			System.out.println("Digite o telefone: ");
			String telefone=entrada.readLine();
			
			/* Chama-se o m�todo construtor da classe "regAgenda" instanciando-se um novo objeto 
			 * "regAg1" que ir� receber o que esta armazenado nas vari�veis:"Nome, Endereco, Telefone"
			 */
			regAgenda regAg1=new regAgenda(nome, endereco, telefone);
			// A sa�da dos dados � feita por meio dos c�digos 41,42,43
			// "/t": Espa�o de tabula��o
			// Submete-se as vari�veis aos seus respectivos m�todos
			// A vari�vel saida com o m�todo write escreve os dados na m�m�ria
			saida.write(regAg1.mostraNome()+"\t");
			saida.write(regAg1.mostraEnd()+"\t");
			saida.write(regAg1.mostraTel()+"\n");
			// Transfere os dados da mem�ria para o arquivo
			saida.flush();
			// Fecha o arquivo
			saida.close();

			
		}catch (Exception e){
			System.out.println("Ocorreu um erro durante a leitura!");

		}
	}

}

