package pacote_logica_programacao;

import javax.swing.JOptionPane;
public class LPJ15 {

	public static void main(String[] args) {
String aux="";


float nota1=0, nota2=0, trabalho=0, media=0;

try{
	aux=JOptionPane.showInputDialog("Entre com a nota1: ");
	nota1=Float.parseFloat(aux);
	
	aux=JOptionPane.showInputDialog("Entre com a nota2: ");
	nota2=Float.parseFloat(aux);
	
	aux=JOptionPane.showInputDialog("Entre com a nota do trabalho: ");
	trabalho=Float.parseFloat(aux);
	
	media=(nota1+nota2+trabalho)/3;
	
	String msg=String.format("Esta é a sua nota: %.2f",media);
	JOptionPane.showMessageDialog(null,msg);
	
	
	if(media<50)
	{
		JOptionPane.showMessageDialog(null,"O aluno esta reprovado!");
	}
	
	if(media>=50 && media<70)
	{
		JOptionPane.showMessageDialog(null,"O aluno esta em recuperação!");
	}
	
	if(media>=70 && media<=100)
	{
		JOptionPane.showMessageDialog(null,"O aluno esta aprovado!");
	}
	
	if(media>100)
	{
		JOptionPane.showMessageDialog(null,"Houve a inserção de notas inválidas!");
	}
	
	
}catch (Exception e){
	System.out.println("Ocorreu um erro durante a leitura!");


	}

}

	
}