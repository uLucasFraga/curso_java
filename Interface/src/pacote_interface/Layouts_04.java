package pacote_interface;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Layouts_04 extends JFrame {
	
	public Layouts_04(){
		
		super("Layouts_04");
		// Instanciando o objeto "c" Conteiner
		Container c=getContentPane();
		// Definindo um novo Layout para o container
		c.setLayout(new BorderLayout(5,5));
		// Adicionando elementos - "Botões"
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		c.add(BorderLayout.EAST, new JButton("E"));
		c.add(BorderLayout.WEST, new JButton("W"));
		
		// Definido que ao fechar a janela encerra-se a aplicação
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// Definindo o tamanho da janela
				setSize(300, 300);
				// Definido a visibilidade da janela
				setVisible(true);
				// Definido que ao fechar a janela encerra-se a aplicação
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Layouts_04();

	}

}
