package pacote_heranca_ex;

import javax.swing.JOptionPane;

public class UsaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f=new Funcionario();
		
		String nomex;
		String rgx;
		String cartaox;
		
		nomex = JOptionPane.showInputDialog("Informe o seu nome: ");
		f.setNome(nomex);
		System . out . println ("O nome é: "+f.getNome());
		
		rgx = JOptionPane.showInputDialog("Informe o sua identidade: ");
		f.setRg(rgx);
		System . out . println ("O número da identidade é: "+f.getRg());
		
		cartaox = JOptionPane.showInputDialog("Informe o sua identidade: ");
		f.setRg(cartaox);
		System . out . println ("O número da identidade é: "+f.getCartao());
	}

}
