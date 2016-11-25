// -----06
package pacote_agregacao;

class TestaContaEAgencia {
public static void main ( String [] args ) {
 // Criando alguns objetos
Agencia a = new Agencia ();
Conta c = new Conta ();

// Carregando alguns dados
a. numero = 178;
c. saldo = 1000.0;


/* A referência do objeto da classe Agencia é armazenada no atributo agencia do objeto da 
 * classe Conta
*/
// Ligando os objetos
// Atribuindo o atributo "agencia" da classe "Conta" ao objeto "a" instanciado a classe "Agencia"
c. agencia = a;
/* Devido a este relacionamento o objeto "c" pode  através do atributo agencia da classe  
Conta acessar o atributo numero da classe "Agencia". */
System .out . println (c. agencia . numero );
System .out . println (c. saldo );
}
}