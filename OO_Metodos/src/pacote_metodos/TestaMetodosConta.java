//----- 06
package pacote_metodos;
import java.util.Scanner;
class TestaMetodosConta {
public static void main ( String [] args ) {

Conta c = new Conta ();
Agencia a=new Agencia();

@SuppressWarnings("resource")
Scanner entrada = new Scanner (System.in);

System.out.print("Insira o numero da agencia: ");
a.numero=entrada.nextInt();

System.out.print("Insira o numero da conta: ");
c.numero = entrada.nextInt();



System.out.println("Insira um deposito: ");
double deposito = entrada.nextDouble();

System.out.println("Insira um saque: ");
double saque = entrada.nextDouble();

// M�todo deposita recebendo um deposito
c. deposita(deposito) ;
// Metodo saca efetuando um saque
c. saca (saque) ;
c. imprimeExtrato ();

System.out.println("Este � o numero da agencia: "+a.numero);
//Armazenando a resposta de um m�todo em uma vari�vel
double saldoDisponivel = c. consultaSaldoDisponivel ();
System .out . println (" SALDO DISPON�VEL - COM O LIMITE : " + saldoDisponivel );
}
}