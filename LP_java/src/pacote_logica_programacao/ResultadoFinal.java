package pacote_logica_programacao;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ResultadoFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String nome;
		
		double nota1=0, nota2=0, nota3=0, nota4=0, media=0;
	
		
		try {
		
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null,"O nome digitado foi: "+nome);
		System.out.println("Seja bem vindo "+nome+" !");
		
		nota1=Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
		JOptionPane.showMessageDialog(null,"A Nota informada foi: "+nota1);
		System.out.println("A Nota informada foi: "+nota1+" !");
		
		nota2=Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
		JOptionPane.showMessageDialog(null,"A Nota informada foi: "+nota2);
		System.out.println("A Nota informada foi: "+nota2+" !");
		
		nota3=Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
		JOptionPane.showMessageDialog(null,"A Nota informada foi: "+nota3);
		System.out.println("A Nota informada foi: "+nota3+" !");
		
		nota4=Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
		JOptionPane.showMessageDialog(null,"A Nota informada foi: "+nota4);
		System.out.println("A Nota informada foi: "+nota1+" !");
		
		media=((nota1+nota2+nota3+nota4)/4);
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		df.setMaximumFractionDigits(2);
		String valorFormatado = df.format(media);
		JOptionPane.showMessageDialog(null,"O imc calculado é: "+valorFormatado);
		System.out.println("O  imc calculado é: "+valorFormatado+" !");
	
		
		if(media<50)
		{
			JOptionPane.showMessageDialog(null,"Você esta reprovado!");
			System.out.println("Você esta reprovado!");
		}
		
	if(media>=50 && media<70)
		{
		JOptionPane.showMessageDialog(null,"Você esta em recuperação!");
		System.out.println("Você esta em recuperação!");
		}
		
	if(media>=70 && media<=100)
		{
		JOptionPane.showMessageDialog(null,"Você esta aprovado!");
		System.out.println("Você esta aprovado!");
		}
	if(media>100 || media<0)
		{
		JOptionPane.showMessageDialog(null,"Houve a inserção de notas inválidas!");
		System.out.println("Houve a inserção de notas inválidas!");
		}
	 

}catch (Exception e){
	System.out.println("Ocorreu um erro durante a leitura!");
}

	}
}
