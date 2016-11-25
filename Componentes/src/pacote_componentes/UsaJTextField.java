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
		// Define a coordenada inicial onde a janela come�a a ser desenhada
		janela.setLocation(50,50);
		// Define que quando a janela � fechada a aplica��o tamb�m ser�
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Por predefini��o a janela (JFrame) s� aceita um componente de cada vez, como tal � necess�rio aplicar um
		 * gestor de layout para conseguirmos adicionar o r�tulo e a caixa de texto
		 */
		
		janela.setLayout(new FlowLayout());
		// Constr�i o r�tulo do texto
		JLabel rotulo=new JLabel("Escreva o seu nome: ");
		// Cria um campo de texto edit�vel
		JTextField caixaTexto=new JTextField(10);
		// Adiciona o r�tulo de texto a janela
		janela.add(rotulo);
		// Adiciona o campo edit�vel a janela
		janela.add(caixaTexto);
		// O m�todo setVisible define o objeto janela como vis�vel
		janela.setVisible(true);
		
		
	}

}
