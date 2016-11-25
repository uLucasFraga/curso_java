// ----- 02
package pacote_heranca;

public class ContaCorrente extends Conta {
	
	private double saldo;
	private String nome;

	
	public double getSaldo(){
		return saldo;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome=nome;
	}

	public void setSaldo(double saldo){
		this.saldo=saldo;
	}

	// Métodos
	
	// ADICIONE OS MÉTODOS ABAIXO
	// void método sem retorno
	void deposita ( double valor) {
	this.saldo += valor ;
	 }

	void saca ( double valor ) {
	this . saldo -= valor ;
	}
}
