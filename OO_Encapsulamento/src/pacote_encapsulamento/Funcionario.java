package pacote_encapsulamento;

class Funcionario {
	
	private int matricula;
	private String nome;
	private String identidade;
	private String cpf;
	private String sexo;
	private double salario;
	

	public int getMatricula(){
		
		return matricula;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getIdentidade (){
		return identidade;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public String getSexo(){
		return sexo;
	}
	
	public double getSalario(){
		return salario;
	}

	//---------------------------------------------------
	
	public void setMatricula(int matricula){
		this.matricula=matricula;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public void setIdentidade(String identidade){
		this.identidade=identidade;
	}
	
	public void setCpf(String cpf){
		this.cpf=cpf;
	}
	
	public void setSexo(String sexox){
		this.sexo=sexox;
	}
	
	public void setSalario(double salario){
		this.salario=salario;
	}

}
