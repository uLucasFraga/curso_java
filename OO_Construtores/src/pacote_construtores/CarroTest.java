package pacote_construtores;
import javax.swing.JOptionPane;
public class CarroTest {

	public static void main ( String [] args ) {	
	Carro ferrari=new Carro();
	// Carro(): � o construtor padr�o
	
	
	
	double v1=0;
	double s1=0;
	
	
	ferrari.modelo = JOptionPane.showInputDialog("Qual o modelo?");
	JOptionPane.showMessageDialog(null,"O nome digitado foi: "+ferrari.modelo);
	System.out.println("Este � modelo informado "+ferrari.modelo+" !");
	
	ferrari.velocidadeMaxima = JOptionPane.showInputDialog("Qual a velocidade atingida?");
	v1=Double.parseDouble(ferrari.velocidadeMaxima);
	JOptionPane.showMessageDialog(null,"A velocdade m�xima � de: "+v1);
	System.out.println("Esta � a velocidade informada "+v1+" !");
	
	ferrari.segundosZeroACem = JOptionPane.showInputDialog("Em quantos segundos de 0 a 100?");
	s1=Double.parseDouble(ferrari.segundosZeroACem);
	JOptionPane.showMessageDialog(null,"A quantidade de segundos informado foi de: "+s1);
	System.out.println("Esta � a quantidade digitada "+s1+" !");
	
	
	System.out.println("---------------------------------------------------");
	System.out.println("");
	System.out.println("---------------------------------------------------");
	
	// Possibilita inicializar um objeto em uma �nica linha
		Carro BMW=new Carro("zxq",100,3.1);
		
		
		
		System.out.println("O modelo da BMW �: "+BMW.modeloa);
		System.out.println("A velocidade da BMW �: "+BMW.velocidadeMaximaa);
		System.out.println("Os segundos de 0 a 100 s�o: "+BMW.segundosZeroACema);
		
		
	
			}
	
	
}