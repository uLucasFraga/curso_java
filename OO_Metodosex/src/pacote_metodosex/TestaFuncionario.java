package pacote_metodosex;

import javax.swing.JOptionPane;

class TestaFuncionario {
	
	
public static void main ( String [] args ) {
Funcionario f1= new Funcionario ();

// Cadastrando Funcionário

f1.nome=JOptionPane.showInputDialog("Informe o nome do Funcionário: ");
double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário: "));

double percentual= Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de aumento do funcionário: "));
 
f1.valorAumento(percentual, salario);
f1.novoSalario(salario, percentual);
 
System .out . println (f1. consultaDados ());
 }
}