package pacote_logica_programacao;

import java.io.*;
public class LPJ07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entrada;
		entrada=new BufferedReader(new InputStreamReader(System.in));
		// Cria��o da vari�vel que ser� utilizada para a leitura a partir do teclado
		
		float  numero=0, media=0, soma=0f;
		int cont=0;
		
		try{
			do{
				System.out.println("Digite um n�mero: ");
				numero=Float.parseFloat(entrada.readLine());
				soma=soma+numero;
				cont=cont+1;
			} 
			while(cont<5);
			media=soma/cont;
			System.out.println("O valor da soma: "+soma);
			media=soma/cont;
			System.out.println("A m�dia �: "+media);
			
		}catch (Exception e){
			System.out.println("Ocorreu um erro durante a leitura!");
	}
	}

}
