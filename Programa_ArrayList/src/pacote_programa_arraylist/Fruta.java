package pacote_programa_arraylist;
import java.awt.Color;

public class Fruta {
	private String nome;
	private double pesoAproximado;
	private Color corPredominante;
	private int tamanhoAproximado;


public Fruta(){
this.nome="";
this.pesoAproximado=0;
this.corPredominante=Color.WHITE;
this.tamanhoAproximado=0;
}

public Fruta(String nome, double pesoAproximado, Color corPredominante, int tamanhoAproximado){

this.nome=nome;
this.pesoAproximado=pesoAproximado;
this.corPredominante=corPredominante;
this.tamanhoAproximado=tamanhoAproximado;
	
}

public String getNome(){
	return nome;
}

public void setNome(String nome){
	this.nome=nome;
}

public double getPesoAproximado(){
	return pesoAproximado;
}

public void setpesoAproximado(double pesoAproximado){
	this.pesoAproximado=pesoAproximado;
}

public Color getCorPredominante(){
	return corPredominante;
}

public void setCorPredominante(Color corPredominante ){
	this.corPredominante=corPredominante;
}

public double getTamanhoAproximado(){
	return tamanhoAproximado;
}

public void setTamanhoAproximado(int tamanhoAproximado){
	this.tamanhoAproximado=tamanhoAproximado;
}

public void imprimir(){
	System.out.println("Nome				:"+nome);
	System.out.println("Peso aproximado		:"+pesoAproximado+" Kg. ");
	System.out.println("Cor predominante	:"+nomeDaCor(corPredominante));
	System.out.println("Tamanho aproximado	:"+tamanhoAproximado+" cm. ");
	
System.out.println("--------------------------------------------------- ");
}
	private String nomeDaCor(Color cor){
		String nomeCor="";
		
		if(cor==Color.BLACK){
			nomeCor="Preta";
		}
		
		if(cor==Color.BLUE){
			nomeCor="Azul";
		}
		
		if(cor==Color.WHITE){
			nomeCor="Branca";
		}
		
		if(cor==Color.YELLOW){
			nomeCor="Amarela";
		}
		
		if(cor==Color.GREEN){
			nomeCor="Verde";
			
		if(cor==Color.ORANGE){
			nomeCor="Laranja";
			}
		
		if(cor==Color.GRAY){
			nomeCor="Cinza";
			}
		
		if(cor==Color.RED){
			nomeCor="Vermelha";
			}
			
		}
		
		
		
		return nomeCor;
	}
	
}
