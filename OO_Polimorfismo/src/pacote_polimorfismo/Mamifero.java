// -----01
package pacote_polimorfismo;

/*
 * Classes Abstratas
Pode-se dizer que as classes abstratas servem como “modelo” para outras classes 
que dela herdem, não podendo ser instanciada por si só. Para ter um objeto de 
uma classe abstrata é necessário criar uma classe mais especializada herdando 
dela e então instanciar essa nova classe. Os métodos da classe abstrata devem 
então serem sobrescritos nas classes filhas.
*/

/*
O Polimorfismo Dinâmico acontece na herança, quando a subclasse sobrepõe o método original. 
Agora o método escolhido se dá em tempo de execução e não mais em tempo de compilação. 
A escolha de qual método será chamado depende do tipo do objeto que recebe a mensagem.
*/
abstract class Mamifero {
	public abstract double obterCotaDiariaDeLeite();
}