// ----- 07

package pacote_heranca;

import javax.swing.JOptionPane;

public class FornecedorPessoaFisica extends Fornecedor {
	
	private String rg;
	private String cpf;
	
	public String getRg(){
		return rg;
	}

	public String getCpf(){
		return cpf;
	}

	public void setRg(String rg){
		this.rg=rg;
	}

	public void setCpf(String cpf){
		this.cpf=cpf;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FornecedorPessoaFisica fpf = new FornecedorPessoaFisica ();
		
		String nomex;
		String telefonex;
		String rgx;
		String cpfx;
		
		
		nomex = JOptionPane.showInputDialog("Informe o seu nome: ");
		fpf.setNome(nomex);
		System . out . println ("O nome é: "+fpf.getNome());
		
		telefonex = JOptionPane.showInputDialog("Informe o seu telefone: ");
		fpf.setTelefone(telefonex);
		System . out . println ("O telefone é: "+fpf.getTelefone());
		
		rgx = JOptionPane.showInputDialog("Informe o sua identidade: ");
		fpf.setRg(rgx);
		System . out . println ("O número da identidade é: "+fpf.getRg());
		
		cpfx = JOptionPane.showInputDialog("Informe o seu cpf: ");
		fpf.setCpf(cpfx);
		System . out . println ("O número do cpf é: "+fpf.getCpf());
		
	}

}
