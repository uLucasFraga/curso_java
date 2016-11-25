// ----- 03

package pacote_componentes;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class UsaJLabel {

	public static void main(String[] args) {
	
		/*
		 * JLabel: Componente que constroi um rótulo de texto pode ser adicionado a um conteiner(JFrame ou JPanel).
		 */
		// TODO Auto-generated method stub
		// JFrame() constrói uma janela sem título
		JFrame janela=new JFrame();
		// Define o título da janela
		janela.setTitle("JLabel");
		// Define o tamanho da janela
		janela.setSize(350,150);
		// Coordenada do ponto onde a janela começa a ser desenhada
		janela.setLocation(50,50);
		// Define que quando a janela é fechada a aplicação também será
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Constroi o rótulo do texto
		JLabel rotulo=new JLabel("Escreva seu nome: ");
		// Adiciona o rótulo a janela
		janela.add(rotulo);
		// O método setVisible define o objeto janela como visível
		janela.setVisible(true);
	}

}
