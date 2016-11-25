package pacote_interface;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class Layouts_03 extends JFrame {
	
	public Layouts_03(){
		// Disponibilizando todos os métodos da classe "mãe" JFrame para a classe atual
		super("Layouts_03");
		
		// Criando o Container
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
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
		
		new Layouts_03();

	}

}
