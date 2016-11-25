package pacote_vetores_matrizes;
import java.util.ArrayList;

public class M07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> nomes=new ArrayList<String>();
		
		// ArrayList n�o pode trabalhar com tipos primitivos s� pode trabalhar com objetos wrappers
		// O ArrayList n�o precisa definir uma quantidade de objetos
		// Adicionando objetos ao ArrayList
		
		nomes.add("Carlos");
		nomes.add("Marcela");
		nomes.add("Viviane");
		nomes.add("Carla");
		nomes.add("Eduardo");
		nomes.add("Dianna");
		nomes.add("Paula");
		nomes.add("Ricardo");
		nomes.add("Fernanda");
		nomes.add("Dulcidio");
		nomes.add("Catarina");
		nomes.add("Carolina");
		
		//Apresentando o conte�do do ArrayList
		System.out.println(nomes.toString());
		System.out.println("");
		// Retorna o tamanho do seu ArrayList
		System.out.println("");
		System.out.println(nomes.size());
		System.out.println("");
		// Retorna a posi��o do objeto no seu ArrayList
		System.out.println("");
		System.out.println(nomes.indexOf("Catarina"));
		System.out.println("");
		// Removendo pela posi��o
		System.out.println(nomes.remove(0));
		System.out.println("");
		System.out.println(nomes.toString());
		// Removendo pelo objeto
		System.out.println(nomes.remove("Ricardo"));
		System.out.println("");
		System.out.println(nomes.toString());
		// Acessando uma determinada posi��o do ArrayList
		System.out.println("");
		System.out.println(nomes.get(0));
		System.out.println("");
		// Pesquisa no ArrayList se o mesmo cont�m o objeto informado
		System.out.println("");
		System.out.println(nomes.contains("Dianna"));
		System.out.println("");
		// Informando se o ArrayList esta vazio
		System.out.println("");
		System.out.println(nomes.isEmpty());
		System.out.println("");
		// M�todo clear remove todas as posi��es do ArrayList
		System.out.println("--------------------");
		nomes.clear();
		System.out.println("--------------------");	
	}

}
