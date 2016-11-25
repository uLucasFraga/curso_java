// -----08

package pacote_heranca;

import javax.swing.JOptionPane;

public class FornecedorPessoaJuridica extends Fornecedor {
	private String IE;
	private String CNPJ;
	
	public String getIE(){
		return IE;
	}

	public String getCNPJ(){
		return CNPJ;
	}

	
	public void setIE(String IE){
		this.IE=IE;
	}

	public void setCNPJ(String CNPJ){
		this.CNPJ=CNPJ;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FornecedorPessoaJuridica fpj = new FornecedorPessoaJuridica ();
		
		String nomex;
		String telefonex;
		String iex;
		String cnpjx;
		
		nomex = JOptionPane.showInputDialog("Informe o seu nome: ");
		fpj.setNome(nomex);
		System . out . println ("O nome é: "+fpj.getNome());
		
		telefonex = JOptionPane.showInputDialog("Informe o seu telefone: ");
		fpj.setTelefone(telefonex);
		System . out . println ("O telefone é: "+fpj.getTelefone());
		
		iex = JOptionPane.showInputDialog("Informe o sua identidade: ");
		fpj.setIE(iex);
		System . out . println ("O número da identidade é: "+fpj.getIE());
		
		cnpjx = JOptionPane.showInputDialog("Informe o seu cpf: ");
		fpj.setCNPJ(cnpjx);
		System . out . println ("O número do cpf é: "+fpj.getCNPJ());	
	}

}
