package pacote_construtores;

public class Carro {
	String modelo;
	String velocidadeMaxima;
	String segundosZeroACem;
	
	
	String modeloa;
	double velocidadeMaximaa;
	double segundosZeroACema;
	
// Construtor padr�o: Todas as vezes que se � criado um objeto um construtor padr�o � inicializado

		public Carro()
		{
	
		}
	
	
// Um construtor tem por finalidade inicializar as vari�veis do nosso objeto
// Inicializando dentro do construtor
		
		public Carro(String modeloa, double velocidadeMaximaa, double segundosZeroACema )
		{
			this.modeloa=modeloa;
			this.velocidadeMaximaa=velocidadeMaximaa;
			this.segundosZeroACema=segundosZeroACema;
		}	
// A partir desse momento o nosso carro tem dois construtores para inicialir um objeto do tipo carro
}
