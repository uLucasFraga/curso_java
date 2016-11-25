package pacote_encapsulamento;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TestaFuncionario {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		
		String nomex;
		int	matriculax;
		String identidadex;
		String cpfx;
		String sexox;
		double salariox;
	
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		df.setMaximumFractionDigits(2);
		
		Funcionario f=new Funcionario();
		
		matriculax = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua matricula: "));
		f.setMatricula(matriculax);
		System . out . println ("O número da sua matricula é: "+f.getMatricula());
		
		
		
		nomex = JOptionPane.showInputDialog("Informe o seu nome: ");
		f.setNome(nomex);
		System . out . println ("O nome é: "+f.getNome());
		
		identidadex = JOptionPane.showInputDialog("Informe o numero da sua identidade: ");
		f.setIdentidade(identidadex);
		System . out . println ("O número da sua identidade é: "+f.getIdentidade());
		
		cpfx = JOptionPane.showInputDialog("Informe o numero do seu cpf: ");
		f.setCpf(cpfx);
		System . out . println ("O número do seu cpf é: "+f.getCpf());
		
		sexox =JOptionPane.showInputDialog("Informe o seu gênero: ");
		f.setSexo(sexox);
		System . out . println ("O seu gênero é: "+f.getSexo());
		
		salariox = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));
		f.setSalario(salariox);
		String valor_salario= df.format(f.getSalario());
		System . out . println ("O salário é: "+valor_salario);
		
		
		}
		
		
		
		
	}

	


