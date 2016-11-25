package pacote_acesso_arquivos;

public class regAgenda02 {
	private String nome;
	private String end;
	private String tel;
	
	public regAgenda02(String nom, String ender, String telef){
		nome=nom;
		end=ender;
		tel=telef;
		
	}
	
	public String mostraNome(){
		return nome;
	}

	public String mostraEnd(){
		return end;
	}
	
	public String mostraTel(){
		return tel;
	}
	
	public void AlteraEnd(String novoEnd){
		end=novoEnd;
	}
	
	public void alteraTel(String novoTel){
		tel=novoTel;
	}
}
