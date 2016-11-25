package pacote_interface;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;

@SuppressWarnings("serial")
public class Layouts_02 extends JFrame {
	
	public Layouts_02(){
		// Disponibilizando todos os métodos da classe "mãe" JFrame para a classe atual
		super("Layouts_02");
		// Criando o Container
		Container c=getContentPane();
		// Adicionando elementos - "Botões"
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.EAST, new JButton("4"));
		c.add(BorderLayout.WEST, new JButton("5"));
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
		
		new Layouts_02();

	}

}
