package pacote_encapsulamento;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c  = new Cliente ();
		
		c.setMatricula(001);
		c.setNome("Pedro Dias");
		c.setIdentidade("20026205-9");
		c.setCpf("098890797-0");
		
		System . out . println ("A matricula �: "+c.getMatricula());
		System . out . println ("O nome �: "+c.getNome());
		System . out . println ("A identidade �: "+c.getIdentidade());
		System . out . println ("O cpf � :"+c.getCpf());
		
		}
		
	}


