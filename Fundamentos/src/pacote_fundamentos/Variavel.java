package pacote_fundamentos;

public class Variavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vari�veis s�o referencias a dados
		
		System.out.println("Vari�veis!");
		// Vari�veis devem sempre come�ar com letras min�sculas e a partir da seguna palavra ser utilizada a inicial em mai�scula
		// String: Armazena um o tipo de dados texto. (N�o � uma vari�vel primitiva pois cria um objeto na mem�ria).
		String primeiroNome="Roberto";
		boolean solteiro=true;
		
		System.out.println("Tipos primitivos!");
		double preco=12.45;
		// O conte�do da vari�vel do tipo char deve sempre ser carregado com aspas simples.
		char sexo='M';
		int i=2000000;//-2147.483.648 at� 2147.483.647
		long numero_longo=9000_000_000_000_000l;// 9 quintilh�es
		// Valores reais (Casas decimais)
		float f=1.4567000f;
		
		// Impress�o das vari�veis
		System.out.println("Esta vari�vel � do tipo String: "+primeiroNome);
		System.out.println("Esta vari�vel � do tipo int: "+i);
		System.out.println("Esta vari�vel � do tipo boolean: "+solteiro);
		System.out.println("Esta vari�vel � do tipo char: "+sexo);
		System.out.println("Esta vari�vel � do tipo double: "+preco);
		System.out.println("Esta vari�vel � do tipo float: "+f);
		System.out.println("Esta vari�vel � do tipo long: "+numero_longo);
		
		
	}

}
