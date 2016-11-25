// -----01
/*
 * Polimorfismo de inclus�o
A Sobrescrita de M�todos pode ser classificada como polimorfismo de inclus�o. 
Quando um m�todo sobrescreve um m�todo herdado de uma classe, temos uma 
sobrescrita de m�todo. Este m�todo de sobrescrita tem que ser id�ntico 
ao m�todo da classe herdada, ou seja, eles precisam ter o mesmo nome, 
valor de retorno e argumentos. Portanto, temos que uma classe filha fornece 
apenas uma nova implementa��o para o m�todo herdado e n�o um novo m�todo. 
*/

/*
O Polimorfismo Din�mico acontece na heran�a, quando a subclasse sobrep�e o m�todo original. 
Agora o m�todo escolhido se d� em tempo de execu��o e n�o mais em tempo de compila��o. 
A escolha de qual m�todo ser� chamado depende do tipo do objeto que recebe a mensagem.
*/
package pacote_polimorfismo;
public class Transporte {
	String mover(){
		return "Sou um meio de transporte!";
	}
}
