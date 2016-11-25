// ----- 05
package pacote_componentes;

import javax.swing.JFrame;
import javax.swing.JButton;

public class UsaJButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame janela=new JFrame();
		
		janela.setTitle("JButton");
		janela.setSize(350,150);
		janela.setLocation(50,50);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton botao=new JButton("OK");
		janela.add(botao);
		janela.setVisible(true);
		
	}

}

