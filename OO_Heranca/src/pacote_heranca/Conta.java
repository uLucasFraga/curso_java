// -----01

package pacote_heranca;

public class Conta {
	private int banco;
	private String agencia;
	private String numero;
	
	public int getBanco(){
		return banco;
	}

	public void setBanco(int banco){
		this.banco=banco;
	}
	
	public String getAgencia(){
		return agencia;
	}

	public void setAgencia(String agencia){
		this.agencia=agencia;
	}

	public String getNumero(){
		return numero;
	}

	public void setNumero(String numero){
		this.numero=numero;
	}
}
