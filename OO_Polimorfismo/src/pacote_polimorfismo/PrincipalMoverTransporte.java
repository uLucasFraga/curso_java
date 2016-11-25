// -----04
package pacote_polimorfismo;

public class PrincipalMoverTransporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transporte t= new Transporte();
		Veiculo v= new Veiculo();
		Carro c=new Carro();
		
		// Tr�s chamadas ao mesmo m�todo
		
		System.out.println("Passando transporte:");
		moverTransporte(t);
		System.out.println("Passando veiculo:");
		moverTransporte(v);
		System.out.println("Passando carro:");
		moverTransporte(c);
		
	}
	// Em tempo de execu��o o m�todo executa o objeto que esta em mem�ria
	// Cria��o do m�todo moverTrasporte
	static void moverTransporte(Transporte trans){
		System.out.println(trans.mover());
	}
	
}
