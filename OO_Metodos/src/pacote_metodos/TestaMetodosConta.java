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

// Método deposita recebendo um deposito
c. deposita(deposito) ;
// Metodo saca efetuando um saque
c. saca (saque) ;
c. imprimeExtrato ();

System.out.println("Este é o numero da agencia: "+a.numero);
//Armazenando a resposta de um método em uma variável
double saldoDisponivel = c. consultaSaldoDisponivel ();
System .out . println (" SALDO DISPONÍVEL - COM O LIMITE : " + saldoDisponivel );
}
}