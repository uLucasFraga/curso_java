// -----04
package pacote_modificadores_01;

public class Funcionario01 {
	// Teste dentro da pr�pria classe
		public String nome;
		public double matricula;
		public String cpf;
		public String identidade;
		public double salario;
		/*
	Modificador public: aplica o encapsulamento p�blico aos atributos e m�todos. 
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
			
			System.out.println("O nome do funcion�rio �: "+f1.nome);
			System.out.println("A matricula do funcion�rio �: "+f1.matricula);
			System.out.println("O cpf do funcion�rio �: "+f1.cpf);
			System.out.println("A identidade do funcion�rio �: "+f1.identidade);
			System.out.println("O salario do funcion�rio �: "+f1.salario);
			
			/*
			 * As vari�veis e m�todos com modificador public s�o representadas
			 * por uma bola verde que representa a sua restri��o.
			 */
		}

	}


