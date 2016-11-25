package pacote_logica_programacao_02;
import java.util.Scanner;
public class C10 {
	private static Scanner entrada;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entrada = new Scanner(System.in);
		
		double numero1, numero2, numero3;
		@SuppressWarnings("unused")
		double menor=0, meio=0, maior=0;
		
		System.out.println("Digite o primeiro número: ");
		 numero1=entrada.nextDouble();
		 
		 System.out.println("Digite o segundo número: ");
		 numero2=entrada.nextDouble();
		 
		 System.out.println("Digite o terceiro número: ");
		 numero3=entrada.nextDouble();
		 
		 if(numero1!=numero2 && numero2!=numero3 && numero1!=numero3)
		 {
		 	if(numero1<numero2 && numero1<numero3)
		 	{
		 	System.out.println("O menor número é: "+numero1);
		 	}

		 	if(numero2<numero1 && numero2<numero3)
		 	{
		 		System.out.println("O menor número é: "+numero2);
		 	}

		 	if(numero3<numero2 && numero3<numero1)
		 	{
		 		System.out.println("O menor número é: "+numero3);
		 	}
		 }
		 else
		 {
			 System.out.println("Você digitou números iguais!");
		 }
		
		
	}

}
