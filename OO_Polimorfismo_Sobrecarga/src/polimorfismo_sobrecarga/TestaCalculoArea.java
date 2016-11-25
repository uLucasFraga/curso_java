package polimorfismo_sobrecarga;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class TestaCalculoArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CalculoArea ca=new CalculoArea();
		
		String nome_calculo;
		
		nome_calculo = JOptionPane.showInputDialog("Qual a operação?");
		JOptionPane.showMessageDialog(null,"A operação definida foi: "+nome_calculo);
		System.out.println("A operação definida foi: "+nome_calculo);
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		df.setMaximumFractionDigits(2);
		
		if(nome_calculo.equals("quadrado"))
		{
			int x = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

			System.out.println("O numero inserido foi: "+x);
			String area_quadrado=df.format(ca.Area(x));
			System.out.println("A área do quadrado é: "+area_quadrado);	
		}
		
		if(nome_calculo.equals("cilindro"))
		{
			float xr = Float.parseFloat(JOptionPane.showInputDialog("Informe o raio: "));
			System.out.println("O numero inserido foi: "+xr);
			
			float xh = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
			System.out.println("O numero inserido foi: "+xh);
			
			String volume=df.format(ca.Area(xr,xh));
			System.out.println("O volume do cilindro é: "+volume);

		}
		
		if(nome_calculo.equals("cubo"))
		{
			float xx = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de x: "));
			System.out.println("O valor de x é: "+xx);
			
			float xy = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de y: "));
			System.out.println("O valor de y é: "+xy);
			
			float xz = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de z: "));
			System.out.println("O valor de z é: "+xz);
			
			String area_cubo=df.format(ca.Area(xx, xy, xz));
			System.out.println("A área do quadrado é: "+area_cubo);

		}
	}

}
