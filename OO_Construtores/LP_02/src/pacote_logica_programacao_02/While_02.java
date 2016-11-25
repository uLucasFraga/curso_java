package pacote_logica_programacao_02;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class While_02 {

/*
 * Calcular a tabuada de um numero	
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	contador=0;
		int numero=0;
		
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		df.setMaximumFractionDigits(2);
		
numero= Integer.parseInt(JOptionPane.showInputDialog("Informe  um numero: "));
String numerox = df.format(numero);

while(contador<10)
{
contador=contador+1;
double mult=numero*contador;
String multx = df.format(mult);

System.out.println("Os valores da tabuada de "+numerox+" são: "+multx);
	}

}
}