package pacote_logica_programacao_02;
import java.util.Scanner;
public class C12 {
	private static Scanner entrada;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entrada = new Scanner(System.in);
		
		/* 
		Enquanto o usu�rio n�o digitar "-1" 
		o programa continua solicitando n�meros para serem somados.
		*/
		
		double numerox=0;
		double numeroy=0;
		double somatorio=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		 numerox=entrada.nextDouble();
		 
		 System.out.println("Este � o n�mero digitado: "+numerox);

		

		if(numerox==-1)
		{
			 System.out.println("O numero digitado foi "+numerox+" - finalizou: ");
		}
		else
		{
		somatorio=numerox;

			while(numeroy!=-1)
			{ 
			System.out.println("Digite um numero: ");
			numeroy=entrada.nextDouble();
			System.out.println("Este � o n�mero digitado: "+numeroy);
			// +=:Operador de atribui��o
			somatorio+=numeroy;
			// somatorio=somatorio+numeroy
			
			System.out.println("Este � o valor do somatorio: "+somatorio);
			}
		}
	}

}
