package pacote_metodos_ii;

import java . util . Scanner ;
 class TestaConta {
 public static void main ( String [] args ) {
 Conta c1 = new Conta (); // Criando uma conta
 @SuppressWarnings("resource")
Scanner scanner = new Scanner ( System .in);

System . out. println (" --------------- Criando Conta ---------------\n\n");

System . out. println (" Digite o numero da conta : ");

 // Recebendo o valor digitado
 String entrada = scanner . nextLine ();

 // Convertendo para int
 int numero = Integer . parseInt ( entrada );

 // Armazenando o valor recebido da tela no atributo do objeto conta
 c1. numero = numero ;

 System .out . println (" Digite o limite da conta : ");

entrada = scanner . nextLine ();
 double limite = Double . parseDouble ( entrada );
 c1. limite = limite ;

 System .out . println (" Digite o saldo inicial da conta : ");
 entrada = scanner . nextLine ();
 int saldo = Integer . parseInt ( entrada );
 c1. saldo = saldo ;

 int opc = 1;
while (opc != 0) {

System .out . println ("\n\n");
System .out . println (" Opera��es banc�rias ");
System .out . println (" Escolha a op��o desejada :");
System .out . println ("0 - Sair ");
System .out . println ("1 - Depositar ");
System .out . println ("2 - Sacar ");
System .out . println ("3 - Extrato ");
System .out . println ("\n\n");

entrada = scanner . nextLine ();
opc = Integer . parseInt ( entrada );

if ( opc == 1) {
 System . out. println (" Digite o valor para depositar : ");
entrada = scanner . nextLine ();
int deposito = Integer . parseInt ( entrada );

// Se o valor for menor que zero vai dar erro
 if( deposito <= 0) {
 System . out. println (" ERRO ");
 } else {
 c1. saldo += deposito ;
 System . out. println (" Deposito efetuado com sucesso ");
 }
 } else if ( opc == 2) {
 System . out. println (" Digite o valor para saque : ");
 entrada = scanner . nextLine ();
 int saque = Integer . parseInt ( entrada );

 // Se o valor for maior do que o saldo mais o limite ou menor que zero vai dar  erro
 if ( saque > (c1. saldo + c1. limite ) || ( saque <= 0)){
 System . out. println (" ERRO ");
 } else {
 c1. saldo -= saque ;
 System . out. println (" Saque efetuado com sucesso ");
 }
 } else if ( opc == 3) {
 System . out. println (" Numero : " + c1. numero );
 System . out. println (" Limite : " + c1. limite );
 System . out. println (" Saldo : " + c1. saldo );
 }
 }
 }
 }
