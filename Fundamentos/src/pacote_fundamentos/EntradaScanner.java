package pacote_fundamentos;
//Importando a classe Scanner dentro do pacote java.util
import java.util.Scanner;

public class EntradaScanner {
// Convers�o para v�ri�veis locais
// private so pode ser refenciado diretamente de dentro da pr�pria classe
// static: Armazenam dados que s�o compartilhados por todos os objetos de uma mesma classe
 private static Scanner t;
 private static Scanner n1;
 private static Scanner n2;

	public static void main(String[] args) {
		// Objeto Scanner
		t = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome=t.nextLine();
		System.out.println("Seja bem vindo "+nome+" !");
		
		n1 = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		double numero1=n1.nextDouble();
		System.out.println("O primeiro numero inserido �: "+numero1);
		
		n2 = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		double numero2=n2.nextDouble();
		System.out.println("O segundo numero inserido �: "+numero2);
		
		double somatorio=numero1+numero2;
		
		System.out.println("O somatorio de num1 + num2 �: "+somatorio);
	}

}
