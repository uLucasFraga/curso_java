package pacote_interface;
import javax.swing.*;

public class Janela_01{


	public Janela_01(){

		
		JFrame janela=new JFrame();
		// Definindo o tamanho da janela
		janela.setSize(300, 300);
		// Definido a visibilidade da janela
		janela.setVisible(true);
		// Definido que ao fechar a janela encerra-se a aplica��o
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2- Criando um controle
		JButton botao=new JButton("Click");
		// 1- Criando um container
		janela.getContentPane().add(botao);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Chamando o m�todo para execu��o
		new Janela_01();
	}

}
