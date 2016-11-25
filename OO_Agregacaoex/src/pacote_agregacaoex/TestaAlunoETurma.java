//----- 03
package pacote_agregacaoex;

class TestaAlunoETurma {
	
	public static void main ( String [] args ) {
	Aluno a=new Aluno();
	Turma t=new Turma();
	
	// Carregando alguns dados
	a. nome = " Rafael Cosentino ";
	a.rg="200.48.309-2";
	a.dataDeNascimento="14/09/2000";
	
	t.periodo="tarde";
	t.serie="5ª";
	t.sigla="Fundamental";
	
	
	a.turma=t;
	
	System .out . println (a. nome );
	System .out . println (a.rg );
	System .out . println (a.dataDeNascimento );
	
	System .out . println ( a.turma.periodo );
	System .out . println ( a.turma.serie );
	System .out . println ( a.turma.sigla );
	

}
}