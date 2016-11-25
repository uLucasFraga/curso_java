package pacote_fundamentos;

import javax.swing.JOptionPane;

public class EntradaJOptionPane {
	// Conversão para váriáveis locais
	// private so pode ser refenciado diretamente de dentro da própria classe
	// static: Armazenam dados que são compartilhados por todos os objetos de uma mesma classe
	private static String nome;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st;
		double n1=0, n2=0, soma=0;
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null,"O nome digitado foi: "+nome);
		System.out.println("Seja bem vindo "+nome+" !");
		
		st= new String("Informe um número:");
		st=JOptionPane.showInputDialog(null,st);
		
		n1=Double.parseDouble(st);
		
		st= new String("Informe outro número");
		st=JOptionPane.showInputDialog(null,st);
		
		n2=Double.parseDouble(st);
		
		soma=n1+n2;
		
		JOptionPane.showMessageDialog(null,"O valor da soma é: "+soma);
		System.out.println("O valor da soma é: "+soma+" !");
		System.exit(0);

	}

}
