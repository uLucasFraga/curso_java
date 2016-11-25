//----- 02
package pacote_instanciacaoex;



class TestaAluno {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciação - Criar objetos a partir que utilizem os atributos de uma "classe"
		// Instanciando dois objetos a1 e a2
		/* Note que os dis objetos instanciados passam a ter acesso aos atributos da classe Aluno */
			
			Aluno a1 = new Aluno ();
			a1. nome = " Ricardo Dias ";
			a1. rg = "10026208-8";
			a1.dataDeNascimento="22/01/1990";
			
			Aluno a2 = new Aluno ();
			a2. nome = " Fernando Mercato ";
			a2. rg = "20526208-8";
			a2.dataDeNascimento="22/01/1990";
			
			System .out . println (a1. nome );
			System .out . println (a1. rg );
			System .out . println (a1.dataDeNascimento);
			
			System .out . println (a2. nome );
			System .out . println (a2. rg );
			System .out . println (a2.dataDeNascimento);
			

		}

	}



