package pacote_metodos;

class Resultado {
	String nome;
	String situacao;
	double media;

	
	void verificaMedia (double nota1, double nota2) {
		this.media =(nota1+nota2)/2 ;
		System.out.println("A media é:"+this.media);
		
		if(media<50){
		
		this.situacao="Reprovado";
		System.out.println("A situação é:"+this.situacao);
		}
		
		if(media<70){
			
			this.situacao="Recuperacao";
			System.out.println("A situação é:"+this.situacao);
			}
			else{
				this.situacao="Aprovado";
				System.out.println("A situação é:"+this.situacao);
			}
		
	}
}
