// -----05
package pacote_modificadores_01;

//Teste dentro do mesmo pacote da classe Funcionario01
public class FuncionarioInterno01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Funcionario01 f1=new Funcionario01();
		
	f1.nome="Maria Oliveira";
	f1.matricula=003;
	f1.cpf="091661777-26";
	f1.identidade="10026205-5";
	f1.salario=3000;
	
	System.out.println("O nome do funcionário é: "+f1.nome);
	System.out.println("A matricula do funcionário é: "+f1.matricula);
	System.out.println("O cpf do funcionário é: "+f1.cpf);
	System.out.println("A identidade do funcionário é: "+f1.identidade);
	System.out.println("O salario do funcionário é: "+f1.salario);

	}

}