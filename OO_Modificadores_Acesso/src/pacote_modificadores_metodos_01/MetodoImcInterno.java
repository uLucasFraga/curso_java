package pacote_modificadores_metodos_01;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/* Note que MetodoImcInterno esta no mesmo pacote que M�todoImc por�m 
 * como o m�todo � privado  n�o � poss�vel acess�lo 
 * */


public class MetodoImcInterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		double peso, altura;
		
		@SuppressWarnings("unused")
		MetodoImc p2=new MetodoImc();
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		System.out.println("O nome do cliente �: "+nome);
		
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
System.out.println("O seu peso � :"+valor_pesox);
System.out.println("A sua altura � :"+valor_alturax);
  
  double resultado_imc=p2.imc(peso,altura);
  String valor_resultado_imcx = df.format(resultado_imc);
  System.out.println("O resultado do seu imc � :"+valor_resultado_imcx); 
        	
   */     
}
	}


