// -----10
package pacote_modificadores04;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
/* Método Externo
 * */

import pacote_modificadores_metodos_01.MetodoImc;


public class MetodoImcExterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		double peso, altura;
		
		@SuppressWarnings("unused")
		MetodoImc p3=new MetodoImc();
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		System.out.println("O nome do cliente é: "+nome);
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		df.setMaximumFractionDigits(2);
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "));
		@SuppressWarnings("unused")
		String valor_pesox = df.format(peso);
        altura= Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: "));
        @SuppressWarnings("unused")
		String valor_alturax = df.format(altura);
        
       
        //  Verifique as linhas abaixo
       
       /*
        System.out.println("O seu peso é :"+valor_pesox);
        System.out.println("A sua altura é :"+valor_alturax);
  
        double resultado_imc=p3.(peso,altura);
        String valor_resultado_imcx = df.format(resultado_imc);
        System.out.println("O resultado do seu imc é :"+valor_resultado_imcx); 
        	
      */
}
	}



