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
		JOptionPane.showMessageDialog(null,"O nome do utilizador �: "+nome);
		System.out.println("O nome do utilizador �: "+nome);
		
		
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
        
        
        System.out.println("O maior valor � :"+maior);
        System.out.println("O menor valor � :"+menor);
        System.out.println("O resultado quando os valores s�o iguais :"+igual);
        System.out.println("A soma dos valores � :"+soma);
        System.out.println("A subtra��o dos valores � :"+subtracao);
        System.out.println("A multiplica��o dos valores � :"+multiplicacao);
        System.out.println("O resultado da divis�o dos valores � :"+divisao);
        System.out.println("O numero1 elevado ao numero2 � :"+elevado);
        System.out.println("A raiz do numero1 � :"+raiz);
        System.out.println("O resultado da opera��o do numero1 pelo numero2 � :"+operacao);
        
	}

}
