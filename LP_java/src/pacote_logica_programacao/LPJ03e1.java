package pacote_logica_programacao;

import java.io.*;


public class LPJ03e1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entrada;
		entrada=new BufferedReader(new InputStreamReader(System.in));
		// Cria��o da vari�vel que ser� utilizada para a leitura a partir do teclado
		int numero=0;
		double operacao=0;
		
		try{
			System.out.println("Qual o valor?");
			numero=Integer.parseInt(entrada.readLine());
				if(numero%2==1)
				{
				System.out.println("O n�mero informado � impar!");
				operacao=Math.pow(numero,2);
				System.out.println("O numero "+numero+" elevado a 2 �: "+operacao);
				}
				else
				{
					System.out.println("O n�mero informado � par!");	
					operacao=(numero*2);
					System.out.println("O numero "+numero+" multiplicado por 2 �: "+operacao);
				}
			}catch (Exception e){
				System.out.println("Ocorreu um erro durante a leitura!");
								}
	}
}

