package pacote_interface;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Layouts_06 extends JFrame {
	
	public Layouts_06(){
		
		super("Layouts_06");
		// Instanciando o objeto "c" Conteiner
		Container c=getContentPane();
		// Definindo o primeiro  Layout dentro do container
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		// Definindo o segundo Layout dentro do Container
		Container c2=new JPanel();
		c2.setLayout(new GridLayout(4,1));
		// Adicionando elementos - "Botões"
		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup..."));
		c2.add(new JButton("Help"));
		// Adicionando o JPanel ao canto esquerdo
		c.add(BorderLayout.EAST,c2);
		
		
		
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
		
		new Layouts_06();

	}

}
