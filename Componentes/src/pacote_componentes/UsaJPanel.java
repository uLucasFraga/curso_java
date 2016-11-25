// ----- 02
package pacote_componentes;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UsaJPanel {
/*
 * O objeto JPanel consiste em um painel ao qual podem ser adicionados outros componentes.
 * Este por sua vez, é adicionado a uma janela.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constroi uma janela sem título
		JFrame janela=new JFrame();
		// Define o título da janela
		janela.setTitle("JPanel");
		// Define o tamanho da janela
		janela.setSize(350,150);
		// Coordenada do ponto onde a janela começa a ser desenhada
		janela.setLocation(50,50);
		// Define que quando a janela é fechada a aplicação também será
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel painel=new JPanel();
		janela.add(painel);
		// O método setVisible define o objeto janela como visível
		janela.setVisible(true);
		
	}

}