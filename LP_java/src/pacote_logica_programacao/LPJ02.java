package pacote_logica_programacao;

import java.io.*;
public class LPJ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entrada;
		entrada=new BufferedReader(new InputStreamReader(System.in));
		// Cria��o da vari�vel que ser� utilizada para a leitura a partir do teclado
		double valor1=0, valor2 = 0, valor3=0, soma=0, media=0;
		double elevado;
		// Declara��o das vari�veis do tipo inteiro
		try{
			// Define o bloco de tratamento de erros da linguagem java 	
		System.out.println("Qual o primeiro valor?");
		valor1=Double.parseDouble(entrada.readLine());
		/*
		 *  valor1 recebe o valor que foi digitado no teclado e esta armazenado 
		 *  na vari�vel com o nome de "entrada"
		 */
		System.out.println("Qual o segundo valor?");
		valor2=Double.parseDouble(entrada.readLine());
		System.out.println("Qual o terceiro valor?");
		valor3=Double.parseDouble(entrada.readLine());
		
		soma=valor1+valor2+valor3;
		media=(valor1+valor2+valor3)/3;
		// Math.pow: M�todo para elevar um numero a um expoente
		elevado=Math.pow(soma,2);
		
		System.out.println("O resultado da soma �:"+soma);
		System.out.println("O resultado da media �:"+media);
		System.out.println("O resultado da soma elevado a 2 �:"+elevado);
		
		
		}catch (Exception e){
			System.out.println("Ocorreu um erro durante a leitura!");
			
		}
		
	}
}