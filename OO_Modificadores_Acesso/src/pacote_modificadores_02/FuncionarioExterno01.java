// -----06

package pacote_modificadores_02;


import pacote_modificadores_01.Funcionario01;


//Teste externo (fora do pacote da classe Funcionario01)
public class FuncionarioExterno01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Funcionario01 f1=new Funcionario01();
		
	f1.nome="Viviane Dias";
	f1.matricula=001;
	f1.cpf="071671797-28";
	f1.identidade="10026208-8";
	f1.salario=3000;
	
	System.out.println("O nome do funcionário é: "+f1.nome);
	System.out.println("A matricula do funcionário é: "+f1.matricula);
	System.out.println("O cpf do funcionário é: "+f1.cpf);
	System.out.println("A identidade do funcionário é: "+f1.identidade);
	System.out.println("O salario do funcionário é: "+f1.salario);
			

		}
	}