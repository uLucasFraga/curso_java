package pacote_heranca;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc=new ContaCorrente();
		ContaPoupança cp=new ContaPoupança();
		ContaEspecial ce=new ContaEspecial();
		
		cc. setNome (" Rafael Cosentino ");
		cc.setBanco(001);
		cc.setAgencia("1222.34");
		cc.setNumero("23.456.78-9");
		cc.setSaldo(50000);
		cc.saca(2000);
		cc.deposita(5000);
		
	System .out . println ("");
	System .out . println (" CONTA CORRENTE ");
	System .out . println ("");
	System .out . println (" Nome : " + cc. getNome ());
	System .out . println (" Banco : " + cc. getBanco ());
	System .out . println (" Agência : " + cc. getAgencia ());
	System .out . println (" Número da Conta : " + cc. getNumero ());
	System .out . println (" Saldo da conta : " + cc.getSaldo());
		 
	// Todos os atributos foram herdados	 
		 	cp. setNome (" Elaine Dias ");
		 	cp.setBanco(002);
			cp.setAgencia("1452.45");
			cp.setNumero("23.432.67-9");
			cp.setSaldo(20000);
			cp.saca(4000);
			cp.deposita(1000);
			
					
System .out . println ("");
System .out . println (" CONTA POUPANÇA ");
System .out . println ("");
System .out . println (" Nome : " + cp. getNome ());
System .out . println (" Banco : " + cp. getBanco ());
System .out . println (" Agência : " + cp. getAgencia ());
System .out . println (" Número da Conta : " + cp. getNumero ());
System .out . println (" Saldo da conta : " + cp.getSaldo());
				
				ce. setNome (" Ricardo Alvarez ");
			 	ce.setBanco(003);
				ce.setAgencia("1342.45");
				ce.setNumero("23.456.67-9");
				ce.setSaldo(30000);
				ce.saca(2000);
				ce.deposita(1000);
				
	System .out . println ("");
	System .out . println (" CONTA ESPECIAL ");
	System .out . println ("");
	System .out . println (" Nome : " + ce. getNome ());
	System .out . println (" Banco : " + ce. getBanco ());
	System .out . println (" Agência : " + ce. getAgencia ());
	System .out . println (" Número da Conta : " + ce. getNumero ());
	System .out . println (" Saldo da conta : " + ce.getSaldo());
	System .out . println (" Saldo com o limite : " + ce.calculaLimite());
		}
		
	}


