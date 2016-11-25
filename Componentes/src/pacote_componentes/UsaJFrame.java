// ----- 01

package pacote_componentes;

import javax.swing.JFrame;
public class UsaJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JFrame() constr�i uma janela sem t�tulo
		// Ir� funcionar como container para o objeto "JPanel", onde ser�o adicionados os componentes
		JFrame janela=new JFrame();
		// Definindo o t�tulo da janela
		janela.setTitle("JFrame");
		// Define o tamanho da janela
		janela.setSize(350,150);
		// Coordenada do ponto onde a janela come�a a ser desenhada
		janela.setLocation(50,50);
		// Define que quando a janela � fechada a aplica��o tamb�m ser�
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// O m�todo setVisible define o objeto janela como vis�vel
		janela.setVisible(true);
		
	}

}