package pacote_sobrecargaex;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TestaCalcularOperacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

CalcularOperacoes co=new CalcularOperacoes();
		
		String nome_calculo;
		
		nome_calculo = JOptionPane.showInputDialog("Qual a operação?");
		JOptionPane.showMessageDialog(null,"A operação definida foi: "+nome_calculo);
		System.out.println("A operação definida foi: "+nome_calculo);
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		df.setMaximumFractionDigits(2);
		
		if(nome_calculo.equals("OP01"))
		{
			double x_op01 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

			System.out.println("O numero inserido foi: "+x_op01);
			String stx=df.format(co.Operacoes(x_op01));
			System.out.println("O resultado da primeira operação é: "+stx);	
		}
		
		if(nome_calculo.equals("OP02"))
		{
			double x_op02 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de x: "));
			System.out.println("O numero inserido foi: "+x_op02);
			
			float y_op02 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de Y: "));
			System.out.println("O numero inserido foi: "+y_op02);
			
			String stxy=df.format(co.Operacoes(x_op02, y_op02));
			System.out.println("O resutado da segunda operação é: "+stxy);

		}
		
		if(nome_calculo.equals("OP03"))
		{
			double x_op03 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de x: "));
			System.out.println("O valor de x é: "+x_op03);
			
			double y_op03 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de y: "));
			System.out.println("O valor de y é: "+y_op03);
			
			float z_op03 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de z: "));
			System.out.println("O valor de z é: "+z_op03);
			
			String stxz=df.format(co.Operacoes(x_op03, y_op03, z_op03));
			System.out.println("o Resultado da terceira operação é: "+stxz);

		}
	}


}


