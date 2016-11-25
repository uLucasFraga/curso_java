package pacote_encapsulamento;

public class Aluno {
	private int matricula;
	private String nome;
	private String identidade;
	private String cpf;
	private String segmento;
	private String ano;
	
	public int getMatricula(){
		
		return matricula;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getIdentidade(){
		return identidade;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public String getSegmento(){
		return segmento;
	}
	
	public String getAno(){
		return ano;
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
	
	public void setSegmento(String segmento){
		this.segmento=segmento;
	}
	
	public void setAno(String ano){
		this.ano=ano;
	}
	
}
