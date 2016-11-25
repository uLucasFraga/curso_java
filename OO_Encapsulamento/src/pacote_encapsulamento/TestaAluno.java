package pacote_encapsulamento;

public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a=new Aluno();
		
		a.setMatricula(001);
		a.setNome("Pedro Dias");
		a.setIdentidade("205140857-9");
		a.setCpf("302890567-70");
		a.setSegmento("Medio");
		a.setAno("3º ano");
		
		System.out.println("A matricula do aluno é: "+a.getMatricula());
		System.out.println("O nome do aluno é: "+a.getNome());
		System.out.println("A identidade do aluno é: "+a.getIdentidade());
		System.out.println("O seguimento do aluno é: "+a.getSegmento());
		System.out.println("O ano que o aluno esta cursando é: "+a.getAno());
		
		
	}

}
