package pacote_logica_programacao;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class LPJ03e3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		
		double peso=0, altura=0, imc=0;
	
		
		try {
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null,"O nome digitado foi: "+nome);
		System.out.println("Seja bem vindo "+nome+" !");
		
		peso=Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
		JOptionPane.showMessageDialog(null,"O peso informado foi: "+peso);
		System.out.println("O peso informado foi: "+peso+" !");
		
		
		
		altura=Double.parseDouble(JOptionPane.showInputDialog("Informe sua altira: "));
		JOptionPane.showMessageDialog(null,"A altura informada foi: "+altura);
		System.out.println("O peso informado foi: "+peso+" !");
		
		imc=((peso/Math.pow(altura,2)));
		
	
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		df.setMaximumFractionDigits(2);
		String valorFormatado = df.format(imc);
		JOptionPane.showMessageDialog(null,"O imc calculado é: "+valorFormatado);
		System.out.println("O  imc calculado é: "+valorFormatado+" !");
		
		
		if(imc<18.5)
		{
			JOptionPane.showMessageDialog(null,"Você esta abaixo do peso!");
			System.out.println("Você esta abaixo do peso!");
		}

		if(imc>=18.5 && imc<25)
		{
			JOptionPane.showMessageDialog(null,"Você esta no seu peso ideal!");
			System.out.println("Você esta no seu peso ideal!");
		}

		if(imc>=25 && imc<30)
		{
			JOptionPane.showMessageDialog(null,"Você esta acima do seu peso ideal!");
			System.out.println("Você esta do seu peso ideal!");
		}

		if(imc>=30 && imc<35)
		{
			JOptionPane.showMessageDialog(null,"Obsidade grau1!");
			System.out.println("Obsidade grau1!");
		}
		if(imc>=35 && imc<40)
		{
			JOptionPane.showMessageDialog(null,"Obsidade grau2");
			System.out.println("Obsidade grau2!");
		}
		if(imc>=40)
		{
			JOptionPane.showMessageDialog(null,"Obsidade grau3");
			System.out.println("Obsidade grau3!");
		}
	}
		catch (Exception e){
			System.out.println("Ocorreu um erro durante a leitura!");
				}
	}
}


		
	


