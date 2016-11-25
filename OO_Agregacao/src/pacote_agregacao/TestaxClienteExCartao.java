package pacote_agregacao;

public class TestaxClienteExCartao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xCliente xc = new xCliente ();

		// Carregando alguns dados
		xc. nome = " Rafael Cosentino ";
		xc.saldo=20000;
		xc.codigo=00111;
		xc.sexo='M';

		xCartaoDeCredito xcdc = new xCartaoDeCredito ();

		xcdc.dataDeValidade="12/02/2000";
		xcdc . numero = 111111;


		/*
		 * O relacionamento entre um objeto da classe Cliente e um objeto da classe CartaoDeCredito só
		é concretizado quando a referência do objeto da classe Cliente é armazenada no atributo cliente
		do objeto da classe CartaoDeCredito. Depois de relacionados, podemos acessar, indiretamente, os
		atributos do cliente através da referência do objeto da classe CartaoDeCredito.
		 
		 */

		/*
		 * ANALISANDO: 
		 * Criou-se um atributo com o nome de cliente na classe "CartaoDeCredito".
		 * Instanciou-se um objeto "c" para a classe Cliente
		 * A referência do objeto da classe Cliente é armazenada no atributo cliente
		do objeto da classe CartaoDeCredito.
		 */

		//Ligando os objetos
		xc . cartao = xcdc;

		System .out . println (xcdc . numero );
		System .out . println (xcdc .dataDeValidade );

		/* Devido a este relacionamento o objeto cdc pode  através do atributo cliente da classe  
		CartaoDeCredito acessar o atributo nome da classe "Cliente".
		*/
		System .out . println (xc . cartao .numero );
		System .out . println (xc . cartao .dataDeValidade );
		

	  }
		
	}


