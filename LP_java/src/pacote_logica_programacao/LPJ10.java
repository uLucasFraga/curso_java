package pacote_logica_programacao;

import java.io.*;
public class LPJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int teste1[]=new int[10];
		int teste2[]=new int[10];
		
		BufferedReader entrada;
		entrada=new BufferedReader(new InputStreamReader(System.in));
		
		
		try{
			
		for(int i=0; i<10;i++)
		{
			System.out.println("Qual o valor?");
			teste1[i]=Integer.parseInt(entrada.readLine());
		}
		
		for(int i=0; i<10;i++)
		{
			if(i%2==0)
			{
				teste2[i]=teste1[i]*5;
			}
			else
			{
				teste2[i]=teste1[i]+5;
			}
			
		}
		
		System.out.println();
		System.out.println("resultado: ");
		
		for(int i=0;i<10;i++)
		{
		System.out.print("teste1[" + i + "]="+teste1[i]+"\t");
		System.out.print("teste2[" + i + "]="+teste2[i]+"\t");
		
		}
}catch (Exception e){
	System.out.println("Ocorreu um erro durante a leitura!");

	}

	}
	
}
