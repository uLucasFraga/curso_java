package pacote_metodosex;

import javax.swing.JOptionPane;

class TestaFuncionario {
	
	
public static void main ( String [] args ) {
Funcionario f1= new Funcionario ();

// Cadastrando Funcion�rio

f1.nome=JOptionPane.showInputDialog("Informe o nome do Funcion�rio: ");
double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio do funcion�rio: "));

double percentual= Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de aumento do funcion�rio: "));
 
f1.valorAumento(percentual, salario);
f1.novoSalario(salario, percentual);
 
System .out . println (f1. consultaDados ());
 }
}