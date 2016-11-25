// ----- 01

/* O método get: Não recebe nenhum parâmetro e sempre retorna o mesmo tipo de dado do atributo 
 * da classe tem por finalidade retornar o valor da variável para as outras classes
 */

/* SET: Método de configuração de valor do atributo
 * O método set: Método que atribui/modifica o valor d um atributo, informa 
 * um parâmetro sempre do mesmo tipo do atributo 
 */

package pacote_encapsulamento;

public class Cliente {
	
	private int matricula;
	private String nome;
	private String identidade;
	private String cpf;
/* Get: Capitura o valor do atributo
 * O método get não recebe nenhum parâmetro e retorna sempre a variável "privada" para ser
 * utilizada por outras classes
*/	
	public int getMatricula(){
		return matricula;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getIdentidade(){
		return identidade;
	}

	public String getCpf(){
	return cpf;	
	}

//---------------------------------------------------
	public void setMatricula ( int matricula ) {
		this .matricula = matricula ;
		}
		
		public void setNome ( String nome ) {
		this . nome = nome ;
		}
		
		public void setIdentidade ( String identidade ) {
			this . identidade = identidade ;
		}
		
		public void setCpf(String cpf){
			this.cpf=cpf;
		}
	
}