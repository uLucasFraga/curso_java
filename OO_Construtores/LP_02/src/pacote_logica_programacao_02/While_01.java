package pacote_logica_programacao_02;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class While_01 {

/*
 * Criar um algoritimo onde o usuário entre com  5
 * números e os mesmos sejam elevados ao quadrado
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int	contador=0;
	int numero=0;
	double elevado=0;
	
	DecimalFormat df = new DecimalFormat("###,###,##0.00");
	df.setMaximumFractionDigits(2);
	
		while(contador<5)
		{
numero= Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

		elevado=Math.pow(numero,2);
		String elevadox = df.format(elevado);
		
		System.out.println("O numero "+numero+" elevado ao quadrado é: "+elevadox);
		
		
		contador++;
		}
		 
	}

}
