package pacote_interface;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Layouts_05 extends JFrame {
	
	public Layouts_05(){
		
		super("Layouts_05");
		// Instanciando o objeto "c" Conteiner
		Container c=getContentPane();
		// Definindo um novo Layout para o container
		// O GridLayout define a quantidade de linhas e colunas : "2 linhas 3 colunas"
		c.setLayout(new GridLayout(2,3));
		// Adicionando elementos - "Botões"
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		
		
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
		
		new Layouts_05();

	}

}
