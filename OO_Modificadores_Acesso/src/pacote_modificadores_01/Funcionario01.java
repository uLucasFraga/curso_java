// -----04
package pacote_modificadores_01;

public class Funcionario01 {
	// Teste dentro da própria classe
		public String nome;
		public double matricula;
		public String cpf;
		public String identidade;
		public double salario;
		/*
	Modificador public: aplica o encapsulamento público aos atributos e métodos. 
	Permite que os mesmo sejam acessados por qualquer classe no projeto inclusive fora
	do pacote.
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Funcionario01 f1=new Funcionario01();
			
			f1.nome="Ricardo Dias";
			f1.matricula=001;
			f1.cpf="071671797-28";
			f1.identidade="10026208-8";
			f1.salario=3000;
			
			System.out.println("O nome do funcionário é: "+f1.nome);
			System.out.println("A matricula do funcionário é: "+f1.matricula);
			System.out.println("O cpf do funcionário é: "+f1.cpf);
			System.out.println("A identidade do funcionário é: "+f1.identidade);
			System.out.println("O salario do funcionário é: "+f1.salario);
			
			/*
			 * As variáveis e métodos com modificador public são representadas
			 * por uma bola verde que representa a sua restrição.
			 */
		}

	}


