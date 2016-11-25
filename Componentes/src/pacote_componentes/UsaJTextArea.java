// ----- 09


package pacote_componentes;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.FlowLayout;


public class UsaJTextArea {

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
		JLabel rotulo=new JLabel("Observações: ");
		
		JTextArea areaTexto=new JTextArea();
		/*
		 * Se o texto atingir a margem direita é quebrado e passa para a linha seguinte
		 */
		
		areaTexto.setLineWrap(true);
		
		/*
		 * Se o texto for maior que a área de texto aparecerão as barras de rolagem. Neste caso, só aparecerá a barra de rolagem
		 * vertical uma vez que se utilizou  o método setLineWrap(true)
		 */
		
		JScrollPane areaRolamento=new JScrollPane(areaTexto);
		areaRolamento.setPreferredSize(new Dimension(325,80));
		
		janela.add(rotulo);
		janela.add(areaRolamento);
		janela.setVisible(true);
	}

}

