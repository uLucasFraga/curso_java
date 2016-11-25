// -----04
package pacote_instanciacaoex;

public class TestaFuncionario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciação - Criar objetos a partir que utilizem os atributos de uma "classe"
		// Instanciando dois objetos a1 e a2
		/* Note que os dis objetos instanciados passam a ter acesso aos atributos da classe Aluno */
			
			Funcionario f1 = new Funcionario ();
			f1. nome = " Milena Albuquerque ";
			f1. cargo = "Supervisora de RH";
			f1.salario=5000;
			
			Funcionario f2 = new Funcionario ();
			f2. nome = " Dianna Oliveira ";
			f2. cargo = "Analista de TI";
			f2.salario=6000;
			
			System .out . println (f1. nome );
			System .out . println (f1. cargo );
			System .out . println (f1. salario);
			
			System .out . println (f2. nome );
			System .out . println (f2. cargo );
			System .out . println (f2. salario );
			

		}

	}

