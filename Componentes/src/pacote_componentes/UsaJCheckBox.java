package pacote_componentes;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

// ----- 07
public class UsaJCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame janela= new JFrame();
		janela.setTitle("JCheckBox");
		janela.setSize(350,150);
		janela.setLocation(50,50);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setLayout(new FlowLayout());
		
		JCheckBox CaixaVerificacao1=new JCheckBox("Branco");
		JCheckBox CaixaVerificacao2=new JCheckBox("Preto");
		JCheckBox CaixaVerificacao3=new JCheckBox("Amarelo");
	
		janela.add(CaixaVerificacao1);
		janela.add(CaixaVerificacao2);
		janela.add(CaixaVerificacao3);
		
		janela.setVisible(true);
		
	}

}
