package pacote_laco_FOR;

import javax.swing.JOptionPane;

public class FOR03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Algoritimo para calcular a quantidade de n�meros pares e impares 
		double numero=0;
		double contpar=0;
		double contimpar=0;

		for(numero=1;numero<=5;numero++)
		{
		// numero++:Significa n�mero+1 
		double	numerox= Double.parseDouble(JOptionPane.showInputDialog("Informe o salario : ")); 
		System.out.println("Este � o numero digitado:"+" "+numerox);
		
		double resto=(numerox%2);
		// Fun��o mod: verifica o resto de uma divis�o
		System.out.println("O resto da divis�o �:"+" "+resto);
			
			if(resto==0)
			{
			System.out.println("Este n�mero � par!");
			contpar=contpar+1;
			}
			else
			{
			System.out.println("Este n�mero � impar!"+"<br/>");
			contimpar=contimpar+1;
			} 	
		} 

		
		System.out.println("A quantidade de n�meros pares �:"+" "+contpar);
		

		System.out.println("A quantidade de n�meros �mpares �:"+" "+contimpar);
		

	}

}
