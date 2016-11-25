package pacote_logica_programacao;
import java.util.Scanner;
public class OrdenarTresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c, Maior, Medio, Menor;

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ornenar três numeros em ordem crescente!");
		System.out.println("Insira o primeiro numero: ");
		a=teclado.nextInt();
		System.out.println("Insira o segundo numero: ");
		b=teclado.nextInt();
		System.out.println("Insira o terceiro numero: ");
		c=teclado.nextInt();

		if(a>b && a>c)
		Maior=a;
		else
		if(b>a&&b>c)
		Maior=b;
		else
		Maior=c;

		if(a<b&&a<c)
		Menor=a;
		else
		if(b<a&&b<c)
		Menor=b;
		else
		Menor=c;
		
		Medio=(a+b+c)-(Maior+Menor);
		System.out.println("");
		System.out.println("eln ascendente de los numeros ingresados es: ");
		System.out.println(Menor+" "+Medio+" "+Maior);
		}
		
	}

