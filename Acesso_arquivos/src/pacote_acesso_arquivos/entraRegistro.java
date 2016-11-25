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
			// Para ler a entrada de dados do teclado declarou-se a variável entrada
			BufferedReader entrada;
			entrada=new BufferedReader (new InputStreamReader(System.in));
			/* Declarou-se a variável saída que através do objeto FileWriter armazena 
			 * o registro no arquivo "Agenda.txt" dentro da pasta do projeto
			 * Caso o arquivo não exista o mesmo será criado automaticamente
			*/
			BufferedWriter saida;
			// FileWriter: Indica a saída para o arquivo /WorkSpace/Agenda.txt
			/* Condição Append=true, ou seja, os dados serão gravados sempre no final
			 * do arquivo
			 */
			saida=new BufferedWriter(new FileWriter("/WorkSpace/Agenda.txt", true));
			
			// Processo de entrada de dados
			System.out.println("Digite o nome: ");
			String nome=entrada.readLine();
			
			System.out.println("Digite o endereço: ");
			String endereco=entrada.readLine();
			
			System.out.println("Digite o telefone: ");
			String telefone=entrada.readLine();
			
			/* Chama-se o método construtor da classe "regAgenda" instanciando-se um novo objeto 
			 * "regAg1" que irá receber o que esta armazenado nas variáveis:"Nome, Endereco, Telefone"
			 */
			regAgenda regAg1=new regAgenda(nome, endereco, telefone);
			// A saída dos dados é feita por meio dos códigos 41,42,43
			// "/t": Espaço de tabulação
			// Submete-se as variáveis aos seus respectivos métodos
			// A variável saida com o método write escreve os dados na mémória
			saida.write(regAg1.mostraNome()+"\t");
			saida.write(regAg1.mostraEnd()+"\t");
			saida.write(regAg1.mostraTel()+"\n");
			// Transfere os dados da memória para o arquivo
			saida.flush();
			// Fecha o arquivo
			saida.close();

			
		}catch (Exception e){
			System.out.println("Ocorreu um erro durante a leitura!");

		}
	}

}

