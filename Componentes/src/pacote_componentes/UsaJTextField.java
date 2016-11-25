// ----- 04
package pacote_componentes;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;


public class UsaJTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame janela=new JFrame();
		// Define o texto da janela
		janela.setTitle("JTextField");
		// Define o tamanho da janela
		janela.setSize(350,150);
		// Define a coordenada inicial onde a janela começa a ser desenhada
		janela.setLocation(50,50);
		// Define que quando a janela é fechada a aplicação também será
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Por predefinição a janela (JFrame) só aceita um componente de cada vez, como tal é necessário aplicar um
		 * gestor de layout para conseguirmos adicionar o rótulo e a caixa de texto
		 */
		
		janela.setLayout(new FlowLayout());
		// Constrói o rótulo do texto
		JLabel rotulo=new JLabel("Escreva o seu nome: ");
		// Cria um campo de texto editável
		JTextField caixaTexto=new JTextField(10);
		// Adiciona o rótulo de texto a janela
		janela.add(rotulo);
		// Adiciona o campo editável a janela
		janela.add(caixaTexto);
		// O método setVisible define o objeto janela como visível
		janela.setVisible(true);
		
		
	}

}
