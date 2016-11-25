// ----- 01

/* O m�todo get: N�o recebe nenhum par�metro e sempre retorna o mesmo tipo de dado do atributo 
 * da classe tem por finalidade retornar o valor da vari�vel para as outras classes
 */

/* SET: M�todo de configura��o de valor do atributo
 * O m�todo set: M�todo que atribui/modifica o valor d um atributo, informa 
 * um par�metro sempre do mesmo tipo do atributo 
 */

package pacote_encapsulamento;

public class Cliente {
	
	private int matricula;
	private String nome;
	private String identidade;
	private String cpf;
/* Get: Capitura o valor do atributo
 * O m�todo get n�o recebe nenhum par�metro e retorna sempre a vari�vel "privada" para ser
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