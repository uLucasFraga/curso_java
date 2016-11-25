package pacote_logica_programacao_02;
import java.util.Scanner;
public class C12 {
	private static Scanner entrada;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entrada = new Scanner(System.in);
		
		/* 
		Enquanto o usuário não digitar "-1" 
		o programa continua solicitando números para serem somados.
		*/
		
		double numerox=0;
		double numeroy=0;
		double somatorio=0;
		
		System.out.println("Digite o primeiro número: ");
		 numerox=entrada.nextDouble();
		 
		 System.out.println("Este é o número digitado: "+numerox);

		

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
			System.out.println("Este é o número digitado: "+numeroy);
			// +=:Operador de atribuição
			somatorio+=numeroy;
			// somatorio=somatorio+numeroy
			
			System.out.println("Este é o valor do somatorio: "+somatorio);
			}
		}
	}

}
