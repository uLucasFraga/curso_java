package pacote_agregacaoex;

public class TestaTurmaEAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a=new Aluno();
		Turma t=new Turma();
		
		// Carregando alguns dados
		a. nome = " Rafael Cosentino ";
		a.rg="200.48.309-2";
		a.dataDeNascimento="14/09/2000";
		
		t.periodo="tarde";
		t.serie="5ª";
		t.sigla="Fundamental";
		
		
		t.aluno=a;
		
		System .out . println (t.periodo );
		System .out . println (t.serie );
		System .out . println (t.sigla );
		
		System .out . println ( t.aluno.dataDeNascimento );
		System .out . println ( t.aluno.rg );
		System .out . println ( t.aluno.dataDeNascimento );
		

	}
	
	}


