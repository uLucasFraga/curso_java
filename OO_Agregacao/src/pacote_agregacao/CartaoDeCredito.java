//----- 01(Fixa��o:34)

/*
 Duas classes deveriam ser criadas: uma para definir os atributos e m�todos dos clientes e outra
para os atributos e m�todos dos cart�es de cr�dito. Para expressar o relacionamento entre 
cliente e cart�o de cr�dito, podemos adicionar um atributo do tipo Cliente na classe 
CartaoDeCredito.
 */

/*
Defina um v�nculo entre os objetos que representam os clientes e os objetos que representam
os cart�es de cr�dito. 
 */
package pacote_agregacao;
// Definido a classe CartaoDeCredito
class CartaoDeCredito {
	// Declara��o dos atributos
	int numero ;
	String dataDeValidade ;
	// Adiconando um atributo do tipo Cliente na classe CartaoDeCredito
	Cliente cliente;
	
	
}

