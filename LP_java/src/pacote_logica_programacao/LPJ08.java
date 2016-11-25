package pacote_logica_programacao;

import java.io.*;
public class LPJ08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entrada;
		entrada=new BufferedReader(new InputStreamReader(System.in));
		// Criação da variável que será utilizada para a leitura a partir do teclado
		
		float numero=0, media=0, soma=0f;
		int cont=0;
		
		
		try{
		for(cont=0;cont<5;cont++)
		{
			
			System.out.print("Digite o numero: ");
			numero=Float.parseFloat(entrada.readLine());
			soma=soma+numero;
		}
		media=soma/cont;
		System.out.println("Média= "+media);
		System.out.println("soma= "+soma);
	}catch (Exception e){
		System.out.println("Ocorreu um erro durante a leitura!");
					}

	}


}
