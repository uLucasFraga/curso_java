// -----04
package pacote_polimorfismo;

public class AplicativoMamifero {
	
	public static void main(String args[]){
	System.out.println("Exemplo de Polimorfismo\n");
	Elefante mamifero1 = new Elefante();
	System.out.println("Cota diaria de leite do elefante: " + mamifero1.obterCotaDiariaDeLeite());
	Rato mamifero2 = new Rato();
	System.out.println("Cota diaria de leite do rato: " + mamifero2.obterCotaDiariaDeLeite());
	}
}


