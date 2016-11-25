// ----- 01

package pacote_componentes;

import javax.swing.JFrame;
public class UsaJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JFrame() constrói uma janela sem título
		// Irá funcionar como container para o objeto "JPanel", onde serão adicionados os componentes
		JFrame janela=new JFrame();
		// Definindo o título da janela
		janela.setTitle("JFrame");
		// Define o tamanho da janela
		janela.setSize(350,150);
		// Coordenada do ponto onde a janela começa a ser desenhada
		janela.setLocation(50,50);
		// Define que quando a janela é fechada a aplicação também será
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// O método setVisible define o objeto janela como visível
		janela.setVisible(true);
		
	}

}