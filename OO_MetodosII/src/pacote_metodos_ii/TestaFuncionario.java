package pacote_metodos_ii;

import java . util . Scanner ;

 class TestaFuncionario {
 @SuppressWarnings("resource")
public static void main ( String [] args ) {
 Funcionario f = new Funcionario (200) ;

 System . out. println (" Digite o nome do funcion�rio : ");
String nome = new Scanner ( System .in) . nextLine ();
 f. nome = nome ;

int opc = 1;
 while (opc != 0) {
 System .out . println ("\n\n");
 System .out . println (" Escolha a op��o desejada :");
 System .out . println ("0 - Sair ");
 System .out . println ("1 - Aumentar sal�rio ");
 System .out . println ("2 - Corrigir nome do funcion�rio ");
 System .out . println ("3 - Imprimir dados ");
 System .out . println ("\n\n");

 String entrada = new Scanner ( System .in) . nextLine ();
 opc = Integer . parseInt ( entrada );

 if ( opc == 1) {
 System . out. println (" Digite o quanto voc� deseja aumentar : ");
 entrada = new Scanner ( System .in) . nextLine ();
 int aumentar = Integer . parseInt ( entrada );

 if ( aumentar < 0) {
 System . out. println (" ERRO ");
 } else {
 f. salario += aumentar ;
 System . out. println (" Aumento efetuado com sucesso ");
 }
 } else if ( opc == 2) {
 System . out. println (" Nome atual : " + f. nome );

 System . out. println (" Digite o novo nome .");
 entrada = new Scanner ( System .in) . nextLine ();
 f. nome = entrada ;

 System . out. println (" Substitui��o feita com sucesso .");
} else if ( opc == 3) {
 System . out. println (" Dados atuais ");
 System . out. println (" Nome : " + f. nome );
 System . out. println (" Sal�rio : " + f. salario );
}
}
}
}