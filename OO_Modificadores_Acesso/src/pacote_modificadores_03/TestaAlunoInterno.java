// -----07
package pacote_modificadores_03;
// A classe TestaAlunoInterno esta dentro do mesmo pacote da classe Aluno
public class TestaAlunoInterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno a1=new Aluno();
		
		a1.nome="Ricardo Dias";
		a1.matricula=001;
		a1.seguimento="M�dio";
		a1.ano="3� ano";
		
		
		System.out.println("O nome do funcion�rio �: "+a1.nome);
		System.out.println("A matricula do funcion�rio �: "+a1.matricula);
		System.out.println("O cpf do funcion�rio �: "+a1.seguimento);
		System.out.println("A identidade do funcion�rio �: "+a1.ano);
		
		
		
	}

}
