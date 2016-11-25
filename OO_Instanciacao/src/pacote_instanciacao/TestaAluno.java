package pacote_instanciacao;
import java.util.Scanner;
public class TestaAluno {
	// ----11
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno01 = new Aluno();
	        @SuppressWarnings("resource")
			Scanner entrada = new Scanner (System.in);
	        
	        System.out.print("Nome do aluno: ");
	        aluno01.nome = entrada.nextLine();
	        
	        System.out.print("Primeira nota: ");
	        aluno01.nota01 = entrada.nextDouble();
	        
	        System.out.print("Segunda nota: ");
	        aluno01.nota02 = entrada.nextDouble();
	        
	        //Calculando a média
	        
	  double media=((aluno01.nota01+aluno01.nota02)/2);
	        
	        System.out.println("O nome do aluno é: "+aluno01.nome);
	        System.out.println("A primeira nota é: "+aluno01.nota01);
	        System.out.println("A segunda nota é: "+aluno01.nota02);
	        System.out.println("A média do "+aluno01.nome+" é: "+media);
	        
	}

}
