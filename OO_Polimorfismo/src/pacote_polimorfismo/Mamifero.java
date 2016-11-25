// -----01
package pacote_polimorfismo;

/*
 * Classes Abstratas
Pode-se dizer que as classes abstratas servem como �modelo� para outras classes 
que dela herdem, n�o podendo ser instanciada por si s�. Para ter um objeto de 
uma classe abstrata � necess�rio criar uma classe mais especializada herdando 
dela e ent�o instanciar essa nova classe. Os m�todos da classe abstrata devem 
ent�o serem sobrescritos nas classes filhas.
*/

/*
O Polimorfismo Din�mico acontece na heran�a, quando a subclasse sobrep�e o m�todo original. 
Agora o m�todo escolhido se d� em tempo de execu��o e n�o mais em tempo de compila��o. 
A escolha de qual m�todo ser� chamado depende do tipo do objeto que recebe a mensagem.
*/
abstract class Mamifero {
	public abstract double obterCotaDiariaDeLeite();
}