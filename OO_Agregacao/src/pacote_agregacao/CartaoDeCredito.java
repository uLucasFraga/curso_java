//----- 01(Fixação:34)

/*
 Duas classes deveriam ser criadas: uma para definir os atributos e métodos dos clientes e outra
para os atributos e métodos dos cartões de crédito. Para expressar o relacionamento entre 
cliente e cartão de crédito, podemos adicionar um atributo do tipo Cliente na classe 
CartaoDeCredito.
 */

/*
Defina um vínculo entre os objetos que representam os clientes e os objetos que representam
os cartões de crédito. 
 */
package pacote_agregacao;
// Definido a classe CartaoDeCredito
class CartaoDeCredito {
	// Declaração dos atributos
	int numero ;
	String dataDeValidade ;
	// Adiconando um atributo do tipo Cliente na classe CartaoDeCredito
	Cliente cliente;
	
	
}

