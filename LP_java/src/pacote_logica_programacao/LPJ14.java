package pacote_logica_programacao;

import javax.swing.JOptionPane;


/*
 * Calcular o índice de massa corporal
 * IMC=peso/altura^2
 */
public class LPJ14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String peso=JOptionPane.showInputDialog("Qual o seu peso?");
		String altura=JOptionPane.showInputDialog("Qual o sua altura?");
		
		
		double peso_kg=Double.parseDouble(peso);
		double altura_metros=Double.parseDouble(altura);
		double imc=peso_kg/Math.pow(altura_metros, 2);
		
		String msg=String.format("O seu IMC é=%.2f",imc);
		JOptionPane.showMessageDialog(null,msg);
		
		
			if(imc<18.5)
			{
				JOptionPane.showMessageDialog(null,"Você esta abaixo do peso!");
			}
			
			if(imc>18.5 && imc<24.9)
			{
				JOptionPane.showMessageDialog(null,"Você esta no peso ideal!");
			}
			
			if(imc>24.9 && imc<=29.9)
			{
				JOptionPane.showMessageDialog(null,"Você esta com sobrepeso!");
			}
			
			if(imc>29.9 && imc<=34.9)
			{
				JOptionPane.showMessageDialog(null,"Você esta com obsidade grau1!");
			}
			
			if(imc>34.9 && imc<=39.9)
			{
				JOptionPane.showMessageDialog(null,"Você esta com obsidade grau2!");
			}
			
			if(imc>39.9)
			{
				JOptionPane.showMessageDialog(null,"Você esta com obsidade grau3!");
			}
			
			
		}
		

	}
