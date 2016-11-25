//----- 03

package pacote_agregacao;

class TestaClienteECartao {
public static void main ( String [] args ) {
 // Criando alguns objetos
Cliente c = new Cliente ();

// Carregando alguns dados
c. nome = " Rafael Cosentino ";
c.saldo=20000;
c.codigo=00111;
c.sexo='M';

CartaoDeCredito cdc = new CartaoDeCredito ();

cdc.dataDeValidade="12/02/2000";
cdc . numero = 111111;


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
cdc . cliente = c;

System .out . println (cdc . numero );
System .out . println (cdc .dataDeValidade );

/* Devido a este relacionamento o objeto cdc pode  através do atributo cliente da classe  
CartaoDeCredito acessar o atributo nome da classe "Cliente".
*/
System .out . println (cdc . cliente . nome );
System .out . println (cdc . cliente . sexo );
System .out . println (cdc . cliente .codigo );
System .out . println (cdc . cliente .saldo );


  }
}