//----- 08
package pacote_metodos;
import javax.swing.JOptionPane;
public class TestaMatematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome;
		double num1, num2;
		
		Matematica m=new Matematica();
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null,"O nome do utilizador é: "+nome);
		System.out.println("O nome do utilizador é: "+nome);
		
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero: "));  
        num2= Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero: "));
        
        double maior=m.maior(num1, num2);
        double menor=m.menor(num1, num2);
        double igual=m.igual(num1, num2);
        double soma=m.soma(num1, num2);
        double subtracao=m.subtracao(num1, num2);
        double multiplicacao=m.multiplicacao(num1, num2);
        double divisao=m.divisao(num1, num2);
        double elevado=m.elevado(num1, num2);
        double raiz=m.raiz(num1);
        double operacao=m.operacao(num1, num2);
        
        
        System.out.println("O maior valor é :"+maior);
        System.out.println("O menor valor é :"+menor);
        System.out.println("O resultado quando os valores são iguais :"+igual);
        System.out.println("A soma dos valores é :"+soma);
        System.out.println("A subtração dos valores é :"+subtracao);
        System.out.println("A multiplicação dos valores é :"+multiplicacao);
        System.out.println("O resultado da divisão dos valores é :"+divisao);
        System.out.println("O numero1 elevado ao numero2 é :"+elevado);
        System.out.println("A raiz do numero1 é :"+raiz);
        System.out.println("O resultado da operação do numero1 pelo numero2 é :"+operacao);
        
	}

}
