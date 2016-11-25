package pacote_fundamentos;

public class Variavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variáveis são referencias a dados
		
		System.out.println("Variáveis!");
		// Variáveis devem sempre começar com letras minúsculas e a partir da seguna palavra ser utilizada a inicial em maiúscula
		// String: Armazena um o tipo de dados texto. (Não é uma variável primitiva pois cria um objeto na memória).
		String primeiroNome="Roberto";
		boolean solteiro=true;
		
		System.out.println("Tipos primitivos!");
		double preco=12.45;
		// O conteúdo da variável do tipo char deve sempre ser carregado com aspas simples.
		char sexo='M';
		int i=2000000;//-2147.483.648 até 2147.483.647
		long numero_longo=9000_000_000_000_000l;// 9 quintilhões
		// Valores reais (Casas decimais)
		float f=1.4567000f;
		
		// Impressão das variáveis
		System.out.println("Esta variável é do tipo String: "+primeiroNome);
		System.out.println("Esta variável é do tipo int: "+i);
		System.out.println("Esta variável é do tipo boolean: "+solteiro);
		System.out.println("Esta variável é do tipo char: "+sexo);
		System.out.println("Esta variável é do tipo double: "+preco);
		System.out.println("Esta variável é do tipo float: "+f);
		System.out.println("Esta variável é do tipo long: "+numero_longo);
		
		
	}

}
