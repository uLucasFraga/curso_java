// -----01
package pacote_modificadores_01;

public class Funcionario {
// Teste dentro da própria classe
	private String nome;
	private double matricula;
	private String cpf;
	private String identidade;
	private double salario;
	/*
Modificador private: Restringe o acesso "apenas" aos elementos que estão 
dentro da  própria classe
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f=new Funcionario();
		
		f.nome="Ricardo Dias";
		f.matricula=001;
		f.cpf="071671797-28";
		f.identidade="10026208-8";
		f.salario=3000;
		
		System.out.println("O nome do funcionário é: "+f.nome);
		System.out.println("A matricula do funcionário é: "+f.matricula);
		System.out.println("O cpf do funcionário é: "+f.cpf);
		System.out.println("A identidade do funcionário é: "+f.identidade);
		System.out.println("O salario do funcionário é: "+f.salario);
		
		/* Importante!! As variáveis ou métodos com modificador private são representadas
		 * por um ícone quadrado e vermelho para indicar essa restrição
		 */
	}

}


