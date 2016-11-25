// -----01
package pacote_acesso_arquivos;

class regAgenda {
	/*
	 * Para representar uma estrutura do tipo registro em Java, utilizou-se uma classe "regAgenda" que possui como 
	 * atributos nome, endereco, telelefone,.Essa forma de representa��o � necess�ria, uma vez que o Java trabalha 
	 * com objetos, assim, cada entrada de regAgenda corresponde a um novo registro. A declara��o da classe 
	 * correspondente ao registro e feita 2,17-19, nas linhas de 22 a 24 e definido o m�todo construtor respons�vel 
	 * por instanciar('reservar espa�o em mem�ria") para os novos objetos.
	 */
	

	/*
	 * Cada vez que se cadastra um novo registro os seus campos s�o submetidos aos seus respectivos m�todos para 
	 * que os memos possam ser armazenados no  arquivo
	 * 
	 */
	// Atributos da classe
	private String Nome;
	private String End;
	private String Tel;
	
	// M�todo Construtor
	
	/*
	Em Java, o construtor � definido como um m�todo cujo nome deve ser o 
	mesmo nome da classe e sem indica��o do tipo de retorno -- nem mesmo 
	void. 
	O construtor � unicamente invocado no momento da cria��o do objeto 
	atrav�s do operador new. 
	O retorno do operador new � uma refer�ncia para o objeto rec�m-criado.
	*/
	public regAgenda(String nome, String endereco, String telefone){
		Nome=nome;
		End=endereco;
		Tel=telefone;
		
	}
	
	// Criando os m�todos para retornar os dados
	
	public String mostraNome(){
		return Nome;
	}
	
	public String mostraEnd(){
		return End;
	}
	
	public String mostraTel(){
		return Tel;
	}

	
	
}
