//----- 04
package pacote_instanciacao;

class TestaCartaoDeCredito {
	public static void main ( String [] args ) {
		// Instancia��o - Criar objetos a partir que utilizem os atributos de uma "classe"
		// Instanciando dois objetos cdc1 e cdc2
	CartaoDeCredito cdc1 = new CartaoDeCredito ();
	cdc1.numero = 111111;
	cdc1.dataDeValidade = " 01/01/2013 ";
	
	CartaoDeCredito cdc2 = new CartaoDeCredito ();
	cdc2.numero = 222222;
	cdc2.dataDeValidade = " 01/01/2014 ";
	
	System.out.println( cdc1.numero );
	System.out.println( cdc1.dataDeValidade );
	
	System.out.println( cdc2.numero );
	System.out.println(cdc2.dataDeValidade );

}
}