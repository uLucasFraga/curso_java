// ----- 08

package pacote_componentes;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.FlowLayout;


public class UsaJComboBox {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame janela= new JFrame();
		janela.setTitle("JTextArea");
		janela.setSize(350,150);
		janela.setLocation(50,50);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * Por predefinição a janela (JFrame) só aceita um componente de cada vez, como tal é necessário aplicar um gestor de layout
		 * para conseguirmos adicionar o rótulo e a área de texto.
		 */
		
		janela.setLayout(new FlowLayout());
		JLabel rotulo=new JLabel("Seleciona uma cor ");
		
		@SuppressWarnings("rawtypes")
		JComboBox caixaCombinacao=new JComboBox();
		janela.add(rotulo);
		
		caixaCombinacao.addItem("Branco");
		caixaCombinacao.addItem("Preto");
		caixaCombinacao.addItem("Amarelo");
		
		janela.add(caixaCombinacao);
		janela.setVisible(true);
		
		

	}

}
