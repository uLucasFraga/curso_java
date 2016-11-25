// -----04
package pacote_polimorfismo;

public class PrincipalMoverTransporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transporte t= new Transporte();
		Veiculo v= new Veiculo();
		Carro c=new Carro();
		
		// Três chamadas ao mesmo método
		
		System.out.println("Passando transporte:");
		moverTransporte(t);
		System.out.println("Passando veiculo:");
		moverTransporte(v);
		System.out.println("Passando carro:");
		moverTransporte(c);
		
	}
	// Em tempo de execução o método executa o objeto que esta em memória
	// Criação do método moverTrasporte
	static void moverTransporte(Transporte trans){
		System.out.println(trans.mover());
	}
	
}
