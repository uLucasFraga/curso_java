// ----09

package pacote_instanciacao;

class ClienteFinal {
	String Nome;
	String Email;
	final double CreditoBase=300;
	double CreditoAdicional;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaração e instanciação dos objetos
		double total=0;
		ClienteFinal  cliente1= new ClienteFinal();
		ClienteFinal  cliente2= new ClienteFinal();
		
		cliente1.Nome=new String("Rui");
		cliente1.Email=new String("rui@wbr.com.br");
		
		cliente2.Nome=new String("Adriana");
		cliente2.Email=new String("adriana@wbr.com.br");
		cliente2.CreditoAdicional=2200;
		// A opção "\t" tem por finalidade inserir uma parada de tabulação no código
		System.out.println("Dados do cliente1:");
		System.out.println("____________________");
		System.out.println("Nome:\t\t"+cliente1.Nome);
		System.out.println("Email:\t\t"+cliente1.Email);
		System.out.println("Credito:\t\t"+cliente1.CreditoBase+cliente1.CreditoAdicional);
		
		System.out.println("");
		
		
		System.out.println("Dados do cliente2:");
		System.out.println("____________________");
		System.out.println("Nome:\t\t"+cliente2.Nome);
		System.out.println("Email:\t\t"+cliente2.Email);
		total=cliente2.CreditoBase+cliente2.CreditoAdicional;
		System.out.println("Credito:\t\t"+total);
	}



}

