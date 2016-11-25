// ----- 03

package pacote_componentes;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class UsaJLabel {

	public static void main(String[] args) {
	
		/*
		 * JLabel: Componente que constroi um r�tulo de texto pode ser adicionado a um conteiner(JFrame ou JPanel).
		 */
		// TODO Auto-generated method stub
		// JFrame() constr�i uma janela sem t�tulo
		JFrame janela=new JFrame();
		// Define o t�tulo da janela
		janela.setTitle("JLabel");
		// Define o tamanho da janela
		janela.setSize(350,150);
		// Coordenada do ponto onde a janela come�a a ser desenhada
		janela.setLocation(50,50);
		// Define que quando a janela � fechada a aplica��o tamb�m ser�
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Constroi o r�tulo do texto
		JLabel rotulo=new JLabel("Escreva seu nome: ");
		// Adiciona o r�tulo a janela
		janela.add(rotulo);
		// O m�todo setVisible define o objeto janela como vis�vel
		janela.setVisible(true);
	}

}
