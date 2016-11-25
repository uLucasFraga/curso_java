// -----01
/*
 * Polimorfismo de inclusão
A Sobrescrita de Métodos pode ser classificada como polimorfismo de inclusão. 
Quando um método sobrescreve um método herdado de uma classe, temos uma 
sobrescrita de método. Este método de sobrescrita tem que ser idêntico 
ao método da classe herdada, ou seja, eles precisam ter o mesmo nome, 
valor de retorno e argumentos. Portanto, temos que uma classe filha fornece 
apenas uma nova implementação para o método herdado e não um novo método. 
*/

/*
O Polimorfismo Dinâmico acontece na herança, quando a subclasse sobrepõe o método original. 
Agora o método escolhido se dá em tempo de execução e não mais em tempo de compilação. 
A escolha de qual método será chamado depende do tipo do objeto que recebe a mensagem.
*/
package pacote_polimorfismo;
public class Transporte {
	String mover(){
		return "Sou um meio de transporte!";
	}
}
