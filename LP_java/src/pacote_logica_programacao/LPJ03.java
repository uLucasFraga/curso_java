package pacote_logica_programacao;

import java.io.*;

public class LPJ03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entrada;
		entrada=new BufferedReader(new InputStreamReader(System.in));
		// Cria��o da vari�vel que ser� utilizada para a leitura a partir do teclado
		int numero=0;
		
		try{
			System.out.println("Qual o valor?");
			numero=Integer.parseInt(entrada.readLine());
				if(numero%2==1)
					// ==: Significa o s�mbolo de "igual" no java
					// % Mod: Retorna o resto da divisao por 2
				{
				System.out.println("O n�mero informado � impar!");
				}
				else
				{
					System.out.println("O n�mero informado � par!");	
					
				}
			}catch (Exception e){
				System.out.println("Ocorreu um erro durante a leitura!");
								}
	}
}

