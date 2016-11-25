package pacote_logica_programacao;

import java.io.*;
public class LPJ09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entrada;
		entrada=new BufferedReader(new InputStreamReader(System.in));
		// Criação da variável que será utilizada para a leitura a partir do teclado
		
		
		try{
			
		float soma=0;
		float []vetor=new float[10];
		
		for(int i=0; i<vetor.length;i++)
		{
			System.out.println("Qual o valor?");
			vetor [i]=Float.parseFloat(entrada.readLine());
			soma=soma+vetor[i];
		}
		
		float media=soma/vetor.length;
		System.out.println("A Média é: "+media);
		System.out.println("A soma é: "+soma);
		
		}catch (Exception e){
			System.out.println("Ocorreu um erro durante a leitura!");
		}

	}

}
