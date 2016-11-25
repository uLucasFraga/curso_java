// ----- 09

package pacote_modificadores_metodos_01;
import javax.swing.JOptionPane;
//O m�todo privado esta declarado na pr�pria classe
import java.text.DecimalFormat;
public class MetodoImc {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome;
		double peso, altura;
		
		MetodoImc p=new MetodoImc();
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		System.out.println("O nome do cliente �: "+nome);
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		df.setMaximumFractionDigits(2);
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "));
		String valor_pesox = df.format(peso);
        altura= Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: "));
        String valor_alturax = df.format(altura);
        
       
       
        System.out.println("O seu peso � :"+valor_pesox);
        System.out.println("A sua altura � :"+valor_alturax);
        
       
        double resultado_imc=p.imc(peso, altura);
        String valor_resultado_imcx = df.format(resultado_imc);
        
        System.out.println("O resultado do seu imc � :"+valor_resultado_imcx);
}
	
	//------------------------------------------
	// O m�todo privado esta declarado na pr�pria classe
	/* Note que o m�todo IMC esta identifica por um quadrado na cor
	 * vermelha podendo ser acessado por todos os elementos 
	 * dentro da mesma
	 */
	private double imc(double altura, double peso){
			double calculo=(altura/Math.pow(peso, 2));
			
			
			if(calculo<18.5)
			{
			System.out.println("Voc� esta abaixo do peso ideal!");
			}

			if(calculo>=18.5 && calculo<25)
			{
			System.out.println("Parab�ns - voc� esta no seu peso ideal!");
			
			
			}

			if(calculo>=25 && calculo<30)
			{

				System.out.println("Voc� esta acima do peso!");
			}

			if(calculo>=30 && calculo<35)
			{

				System.out.println("Obesidade gau I !");
			}


			if(calculo>=35 && calculo<40)
			{

				System.out.println("Obesidade gau II !");
			}


			if(calculo>=40)
			{
				System.out.println("Obesidade gau III !");		
			}
			return calculo;
			//-----------------------
		}
		

}
