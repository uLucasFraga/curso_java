package pacote_logica_programacao;

import java.io.*;
public class LPJ05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entrada;
		entrada=new BufferedReader(new InputStreamReader(System.in));
		// Cria��o da vari�vel que ser� utilizada para a leitura a partir do teclado
		int codigo=0;
		
		try {
			System.out.println("Digite o c�digo: ");
			codigo=Integer.parseInt(entrada.readLine());
			
			switch(codigo){
			case 001: System.out.println("O produto � Caderno");
			break;
			case 002: System.out.println("O produto � Lap�s");
			break;
			case 003: System.out.println("O produto � Borracha");
			break;
			default: System.out.println("Diversos");
			}
			
		} catch (Exception e){
			System.out.println("Ocorreu um erro durante a leitura!");
		}
		
	}

}
