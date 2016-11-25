//----- 02
package pacote_instanciacao;

class TestaCliente {
/*
 * OBJETOS: De maneira geral, Objeto é uma classe sendo estanciada!! De maneira mais Conceitual, 
 * um objeto é algo distinguível que contém atributos (ou propriedades) e possui um comportamento. 
 * Cada objeto tem uma identidade e é distinguível de outro mesmo que seus atributos sejam 
 * idênticos.
 */
	/*
	 * MÉTODOS: São as ações que podem ser realizadas por determinado objeto.
	 * Ex: Um cliente de um banco pode - sacar, depositar, verificar o saldo e etc...
	 * 
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	// Instanciação - Criar objetos a partir que utilizem os atributos de uma "classe"
	// Instanciando dois objetos c1 e c2
/* Note que os dis objetos instanciados passam a ter acesso aos atributos da classe Cliente */
		
		Cliente c1 = new Cliente ();
		
		
		
		c1. nome = "Rafael Cosentino ";
		c1.sexo='M';
		c1. codigo = 1;
		c1.saldo=4000;
	
		
		Cliente c2 = new Cliente ();
		c2. nome = "Jonas Hirata ";
		c2.sexo='M';
		c2. codigo = 2;
		c2.saldo=5000;
		
		Cliente c3 = new Cliente ();
		
		c3. nome = "Manuela Dias ";
		c3.sexo='M';
		c3. codigo = 2;
		c3.saldo=25000;
		
		System .out . println (c1. nome );
		System .out . println (c1. sexo );
		System .out . println (c1. codigo );
		System .out . println (c1. saldo );
		
		System .out . println (c2. nome );
		System .out . println (c2. sexo );
		System .out . println (c2. codigo );
		System .out . println (c2. saldo );
		
		System .out . println (c3. nome );
		System .out . println (c3. sexo );
		System .out . println (c3. codigo );
		System .out . println (c3. saldo );

	}

}
