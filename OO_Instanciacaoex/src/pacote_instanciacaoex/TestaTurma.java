// -----06
package pacote_instanciacaoex;

class TestaTurma {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instancia��o - Criar objetos a partir que utilizem os atributos de uma "classe"
		// Instanciando dois objetos a1 e a2
		/* Note que os dis objetos instanciados passam a ter acesso aos atributos da classe Aluno */
			
			Turma t1 = new Turma ();
			t1. periodo = " Manh� ";
			t1. serie = "9� ano";
			t1.sigla="Fund.";
			
			Turma t2 = new Turma ();
			t2. periodo = " Tarde ";
			t2. serie = "2� ano";
			t2.sigla="Medio";
			
			System .out . println (t1. periodo );
			System .out . println (t1. serie );
			System .out . println (t1. sigla);
			
			System .out . println (t2. periodo );
			System .out . println (t2. serie );
			System .out . println (t2. sigla );
			

		}

}
