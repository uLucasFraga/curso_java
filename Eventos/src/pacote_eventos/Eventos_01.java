package pacote_eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Eventos_01  extends JFrame implements ActionListener{
	// Declara o botão como atributo fora do construtor
	JButton botao;
	public Eventos_01(){
		
		super("Eventos_01");
		
		// Criando o botão
		// JButton botao=new JButton("Clique aqui");
		botao=new JButton("Clique aqui");
		// Action Listener - "Adicionando Ações ao botão"
		botao.addActionListener(this);
		getContentPane().add(botao);
		
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
		
		new Eventos_01();

	}

	@Override
	// Implementa o evento ActionPerformed - "Metodo que vai efetivamente executar o botão"
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		// Define o texto do botão quando foi clicado
		botao.setText("Fui clicado!");
		System.out.println("Clicou no botão!");
		
		
		
	}

}
