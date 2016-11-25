package pacote_metodos;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TestaMetodosFolhaPgto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String setor;
		String nome;
		double xsalario;
		int xqhed;
		int xqhen;
		int xfaltas;
		int xdependentes;
		
		
		MetodosFolhaPgto f=new MetodosFolhaPgto();
		
		try{
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		
		if(nome.equals("")){
			JOptionPane.showMessageDialog(null,"O campo esta vazio!");
			System.exit(0);	
		}
		
		JOptionPane.showMessageDialog(null,"O nome do funcion�rio �: "+nome);
		System.out.println("O nome do funcion�rio �: "+nome);
		
		setor = JOptionPane.showInputDialog(null,"Informe o setor - somente A B ou C !");
		System.out.println("O setor do funcion�rio �: "+setor);
		
		
		
		xsalario= Double.parseDouble(JOptionPane.showInputDialog("Informe o salario : "));  
        xqhed= Integer.parseInt(JOptionPane.showInputDialog("Informe  a quantidade de he dia: "));
        xqhen= Integer.parseInt(JOptionPane.showInputDialog("Informe  a quantidade de he noite: "));
        xfaltas= Integer.parseInt(JOptionPane.showInputDialog("Informe  a quantidade de faltas: "));
        xdependentes= Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes: "));
    	
    	
	DecimalFormat df = new DecimalFormat("###,###,##0.00");
	df.setMaximumFractionDigits(2);
	 
        double valor_qhed=f.vqhed(xsalario, xqhed);
        String valor_qhedx = df.format(valor_qhed);
        double valor_qhen=f.vqhen(xsalario, xqhen);
        String valor_qhenx = df.format(valor_qhen);
        double valor_qhet=valor_qhed+valor_qhen;
        String valor_qhetx = df.format(valor_qhet);
        double valor_faltas=f.vfaltas(xsalario,xfaltas);
        String valor_faltasx = df.format(valor_faltas);
        double valor_sfamilia=f.sfamilia(setor, xdependentes);
        String valor_sfamiliax = df.format(valor_sfamilia);
        double valor_fgts=(xsalario+valor_qhet-valor_faltas);
        String valor_fgtsx = df.format(valor_fgts);
        double valor_vvt=f.vvt(xsalario);
        String valor_vvtx = df.format(valor_vvt);
        double valor_premio=f.premio(setor, xsalario);
        String valor_premiox = df.format(valor_premio);
        double valor_abono=f.abono(setor, xsalario);
        String valor_abonox = df.format(valor_abono);
        double valor_inss=f.inss(xsalario);
        String valor_inssx = df.format(valor_inss);
        double valor_irrf=f.irrf(xsalario);
        String valor_irrfx = df.format(valor_irrf);
        double valor_total_descontos=(valor_faltas+valor_vvt+valor_inss+valor_irrf);
        String valor_total_descontosx = df.format(valor_total_descontos);
        double valor_total_acrescimos=(valor_qhet+valor_sfamilia+valor_premio+valor_abono);
        String valor_total_acrescimosx = df.format(valor_total_acrescimos);
        double valor_salario_liquido=(xsalario+valor_total_acrescimos-valor_total_descontos);
        String valor_salario_liquidox = df.format(valor_salario_liquido);
        
        
        System.out.println("O valor da hora extra diurna � :"+valor_qhedx);
        System.out.println("O valor da hora extra noturna � :"+valor_qhenx);
        System.out.println("O valor total da hora extra �: "+valor_qhetx);
        System.out.println("O desconto total com as faltas ser� de: "+valor_faltasx);
        System.out.println("O valor do fgts � de: "+valor_fgtsx);
        System.out.println("O sal�rio fam�lia ser� de: "+valor_sfamiliax);
        System.out.println("O valor do vale transporte ser� de: "+valor_vvtx);
        System.out.println("O valor do premio ser� de: "+valor_premiox);
        System.out.println("O valor do abono ser� de: "+valor_abonox);
        System.out.println("O valor do inss ser� de: "+valor_inssx);
        System.out.println("O valor do irrf ser� de: "+valor_irrfx);
        System.out.println("O valor dos descontos ser� de: "+valor_total_descontosx);
        System.out.println("O valor de acr�scimos ser� de: "+valor_total_acrescimosx);
        System.out.println("O valor do salario l�quido ser� de: "+ valor_salario_liquidox);
        
        
	}catch(Exception e){
		System.out.println("Ocorreu um erro durante a leitura!");	
	}

}
}