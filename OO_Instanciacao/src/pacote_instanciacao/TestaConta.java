// -----08
package pacote_instanciacao;

class TestaConta {
	public static void main ( String [] args ) {
	// Instanciando dois objetos c1 e c2
	/* Note que os dis objetos instanciados passam a ter acesso aos atributos da classe Conta */
		Conta c1 = new Conta ();
		c1. numero = 1234;
		c1. saldo = 1000;
		c1. limite = 500;
		
		Conta c2 = new Conta ();
		c2. numero = 5678;
		c2. saldo = 2000;
		c2. limite = 250;
		
		System .out . println (c1. numero );
		System .out . println (c1. saldo );
		System .out . println (c1. limite );
		
		System .out . println (c2. numero );
		System .out . println (c2. saldo );
		System .out . println (c2. limite );
		}
		}
	
	

