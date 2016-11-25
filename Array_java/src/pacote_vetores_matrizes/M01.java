package pacote_vetores_matrizes;
import java.util.Scanner;
public class M01 {

	private static Scanner lerS;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int n;
	
	lerS = new Scanner(System.in);
	
	System.out.println("Quantos elementos tem o vetor? ");
	n=lerS.nextInt();
	
	
	int [] A=new int[n];
	
	for(int i=0;i<=n-1;i++){
		System.out.println("Innsira um elemento: ");
		A[i]=lerS.nextInt();
	}
		
	for(int i=0;i<n;i++){
		
		System.out.println(A[i]);
		System.out.println("");
	}
	
	}
}
