// -----01
package pacote_acesso_arquivos;

class regAgenda {
	/*
	 * Para representar uma estrutura do tipo registro em Java, utilizou-se uma classe "regAgenda" que possui como 
	 * atributos nome, endereco, telelefone,.Essa forma de representação é necessária, uma vez que o Java trabalha 
	 * com objetos, assim, cada entrada de regAgenda corresponde a um novo registro. A declaração da classe 
	 * correspondente ao registro e feita 2,17-19, nas linhas de 22 a 24 e definido o método construtor responsável 
	 * por instanciar('reservar espaço em memória") para os novos objetos.
	 */
	

	/*
	 * Cada vez que se cadastra um novo registro os seus campos são submetidos aos seus respectivos métodos para 
	 * que os memos possam ser armazenados no  arquivo
	 * 
	 */
	// Atributos da classe
	private String Nome;
	private String End;
	private String Tel;
	
	// Método Construtor
	
	/*
	Em Java, o construtor é definido como um método cujo nome deve ser o 
	mesmo nome da classe e sem indicação do tipo de retorno -- nem mesmo 
	void. 
	O construtor é unicamente invocado no momento da criação do objeto 
	através do operador new. 
	O retorno do operador new é uma referência para o objeto recém-criado.
	*/
	public regAgenda(String nome, String endereco, String telefone){
		Nome=nome;
		End=endereco;
		Tel=telefone;
		
	}
	
	// Criando os métodos para retornar os dados
	
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
