package pacote_logica_programacao_02;
import java.util.Scanner;
public class C6 {
	private static Scanner entrada;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);	
		int saldo;
	System.out.println("Digite o pprimeiro n�mero: ");
	 saldo=entrada.nextInt();
	 
	 System.out.println(saldo>100 ? "Parab�ns saldo atingido":"Reinsira o saldo!");
	 
	}

}
