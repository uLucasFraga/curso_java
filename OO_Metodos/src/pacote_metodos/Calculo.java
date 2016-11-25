//-----02
package pacote_metodos;

import javax.swing.JOptionPane;
public class Calculo {

	public double some(double valor1, double valor2)
	{
		return valor1+valor2;
	}
	
	public double subtraia(double valor1, double valor2)
	{
		return valor1-valor2;
	}
	
	public double multiplique(double valor1, double valor2)
	{
		return valor1*valor2;
	}
	
	public double divida(double divisor, double dividendo)
	{
		return divisor/dividendo;
	}
	
	public double fatorial(double valor)
	{
		double i=valor-1;
		while(i>0)valor=valor*i--;
		return valor;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st;
		double n1=0, n2=0;
		
		try
		{
			
			st= new String("Informe um n�mero");
			st=JOptionPane.showInputDialog(null,st);
			
			if(st==null)System.exit(0);
			n1=Double.parseDouble(st);
			
			st= new String("Informe outro n�mero");
			st=JOptionPane.showInputDialog(null,st);

			if(st==null)System.exit(0);
			n2=Double.parseDouble(st);
					
		}catch(NumberFormatException nfe)
		{
			st=new String("Numero inv�lido!");
			JOptionPane.showMessageDialog(null,st,"Erro",0);
			System.exit(0);
		}
		
		
		Calculo ca=new Calculo();
		
		st="Valores informados: "+n1+" e "+n2+"\n\n"+"Resultados:\n"+"Soma:\t" +ca.some(n1, n2)+ "\n"+
		"Subtra��o: "  +ca.subtraia(n1,n2)+ "\n" + "Multiplica��o: "+ ca.multiplique(n1,n2)+ "\n"+
		"Fatorial de " +n1+ "=" +ca.fatorial(n1)+ "\n" + "Fatorial de " +n2+ "="+ca.fatorial(n2);
		
		JOptionPane.showMessageDialog(null,st,"Mensagem",1);
		System.exit(0);
	}

}
