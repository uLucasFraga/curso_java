// -----01

package pacote_logica_programacao_02;
import java.util.Scanner;
public class C3 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		entrada = new Scanner(System.in);
	
		double a, b;
	
	System.out.println("Digite o pprimeiro n�mero: ");
	 a=entrada.nextDouble();
	 
	 System.out.println("Digite o pprimeiro n�mero: ");
	 b=entrada.nextDouble();
	 
	 if(a>b){
		 System.out.println("O maior n�mero �: "+a);
	 }
	 else if(b>a){
		 System.out.println("O maior n�mero �: "+b);
	 }
	 else{
		 System.out.println("Os dois numeros s�o iguais!");
	 }
		

	}

}
