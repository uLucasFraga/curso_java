package pacote_sobrecarga;
import java.util.Scanner;
class TestaGerente {
public static void main ( String [] args ){

	
@SuppressWarnings("resource")
Scanner entrada = new Scanner (System.in);Gerente g = new Gerente ();

System.out.print("Insira o salario: ");
g.salario = entrada.nextDouble();



System . out. println (" Salário : " + g. salario );

System . out. println (" Aumentando o salário em 10% ");
g.aumentaSalario ();

System .out . println (" Salário : " + g. salario );
System .out . println (" Aumentando o salário em 30% ");
g.aumentaSalario (0.3) ;

System .out . println (" Salário : " + g. salario );
 }
}
