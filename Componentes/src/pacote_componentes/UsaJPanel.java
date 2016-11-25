// ----- 02
package pacote_componentes;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UsaJPanel {
/*
 * O objeto JPanel consiste em um painel ao qual podem ser adicionados outros componentes.
 * Este por sua vez, � adicionado a uma janela.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constroi uma janela sem t�tulo
		JFrame janela=new JFrame();
		// Define o t�tulo da janela
		janela.setTitle("JPanel");
		// Define o tamanho da janela
		janela.setSize(350,150);
		// Coordenada do ponto onde a janela come�a a ser desenhada
		janela.setLocation(50,50);
		// Define que quando a janela � fechada a aplica��o tamb�m ser�
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel painel=new JPanel();
		janela.add(painel);
		// O m�todo setVisible define o objeto janela como vis�vel
		janela.setVisible(true);
		
	}

}