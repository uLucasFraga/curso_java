package pacote_sobrecarga;
import java.util.Scanner;
class TestaGerente {
public static void main ( String [] args ){

	
@SuppressWarnings("resource")
Scanner entrada = new Scanner (System.in);Gerente g = new Gerente ();

System.out.print("Insira o salario: ");
g.salario = entrada.nextDouble();



System . out. println (" Sal�rio : " + g. salario );

System . out. println (" Aumentando o sal�rio em 10% ");
g.aumentaSalario ();

System .out . println (" Sal�rio : " + g. salario );
System .out . println (" Aumentando o sal�rio em 30% ");
g.aumentaSalario (0.3) ;

System .out . println (" Sal�rio : " + g. salario );
 }
}
