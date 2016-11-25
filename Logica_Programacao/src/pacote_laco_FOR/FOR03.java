package pacote_laco_FOR;

import javax.swing.JOptionPane;

public class FOR03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Algoritimo para calcular a quantidade de números pares e impares 
		double numero=0;
		double contpar=0;
		double contimpar=0;

		for(numero=1;numero<=5;numero++)
		{
		// numero++:Significa número+1 
		double	numerox= Double.parseDouble(JOptionPane.showInputDialog("Informe o salario : ")); 
		System.out.println("Este é o numero digitado:"+" "+numerox);
		
		double resto=(numerox%2);
		// Função mod: verifica o resto de uma divisão
		System.out.println("O resto da divisão é:"+" "+resto);
			
			if(resto==0)
			{
			System.out.println("Este número é par!");
			contpar=contpar+1;
			}
			else
			{
			System.out.println("Este número é impar!"+"<br/>");
			contimpar=contimpar+1;
			} 	
		} 

		
		System.out.println("A quantidade de números pares é:"+" "+contpar);
		

		System.out.println("A quantidade de números ímpares é:"+" "+contimpar);
		

	}

}
