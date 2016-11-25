// -----01
package pacote_modificadores_01;

public class Funcionario {
// Teste dentro da pr�pria classe
	private String nome;
	private double matricula;
	private String cpf;
	private String identidade;
	private double salario;
	/*
Modificador private: Restringe o acesso "apenas" aos elementos que est�o 
dentro da  pr�pria classe
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f=new Funcionario();
		
		f.nome="Ricardo Dias";
		f.matricula=001;
		f.cpf="071671797-28";
		f.identidade="10026208-8";
		f.salario=3000;
		
		System.out.println("O nome do funcion�rio �: "+f.nome);
		System.out.println("A matricula do funcion�rio �: "+f.matricula);
		System.out.println("O cpf do funcion�rio �: "+f.cpf);
		System.out.println("A identidade do funcion�rio �: "+f.identidade);
		System.out.println("O salario do funcion�rio �: "+f.salario);
		
		/* Importante!! As vari�veis ou m�todos com modificador private s�o representadas
		 * por um �cone quadrado e vermelho para indicar essa restri��o
		 */
	}

}


