package pacote_polimorfismo_sorveteria;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class TestaSorveteria {

    public static void main(String args[]) {
Chocolate c=new Chocolate();
Morango m=new Morango();
PassasAoRum pa=new PassasAoRum();
Pistache p=new Pistache(); 
		
		String nome_sabor;
		
		try{
		
		nome_sabor = JOptionPane.showInputDialog("Qual o sabor?");
		JOptionPane.showMessageDialog(null,"O sabor é foi: "+nome_sabor);
		System.out.println("O sabor definido foi: "+nome_sabor);
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		df.setMaximumFractionDigits(2);
		
		if(nome_sabor.equals("chocolate") || nome_sabor.equals("Chocolate") || nome_sabor.equals("CHOCOLATE"))
		{
			int bolas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de bolas: "));

			System.out.println("A quantidade de bolas inserida foi: "+bolas);
			String preco_pagar=df.format(c.calcular(bolas));
			System.out.println("O preço a pagar é: "+preco_pagar);
			JOptionPane.showMessageDialog(null,"O total a pagar é: "+preco_pagar);
		}
		
		if(nome_sabor.equals("morango") || nome_sabor.equals("Morango") || nome_sabor.equals("MORANGO"))
		{
			int bolas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de bolas: "));

			System.out.println("A quantidade de bolas inserida foi: "+bolas);
			String preco_pagar=df.format(m.calcular(bolas));
			System.out.println("O preço a pagar é: "+preco_pagar);
			JOptionPane.showMessageDialog(null,"O total a pagar é: "+preco_pagar);
		}
		
		
		if(nome_sabor.equals("passas") || nome_sabor.equals("Passas") || nome_sabor.equals("PASSAS"))
		{
			int bolas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de bolas: "));

			System.out.println("A quantidade de bolas inserida foi: "+bolas);
			String preco_pagar=df.format(pa.calcular(bolas));
			System.out.println("O preço a pagar é: "+preco_pagar);
			JOptionPane.showMessageDialog(null,"O total a pagar é: "+preco_pagar);
		}
		
		if(nome_sabor.equals("pistache") || nome_sabor.equals("Pistache") || nome_sabor.equals("PISTACHE"))
		{
			int bolas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de bolas: "));

			System.out.println("A quantidade de bolas inserida foi: "+bolas);
			String preco_pagar=df.format(p.calcular(bolas));
			System.out.println("O preço a pagar é: "+preco_pagar);
			JOptionPane.showMessageDialog(null,"O total a pagar é: "+preco_pagar);
		}
		
		
	}catch(Exception e){
		System.out.println("Ocorreu um erro durante a leitura!");
		JOptionPane.showMessageDialog(null,"Houve um erro durante a leitura!");
	}
		
	}

}
