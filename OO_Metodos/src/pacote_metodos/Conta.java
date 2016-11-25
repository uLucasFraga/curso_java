//----- 05
package pacote_metodos;
// Criando a classe Conta
class Conta {
// Declarando os atributos
int numero ;
double saldo ;
final double limite = 1000;
Agencia agencia ;

/*
Normalmente, os m�todos acessam ou alteram os valores armazenados nos atributos dos objetos.
Por exemplo, na execu��o do m�todo deposita(), � necess�rio alterar o valor do atributo saldo
do objeto que foi escolhido para realizar a opera��o.
Dentro de um m�todo, para acessar os atributos do objeto que est� processando o m�todo, devemos
utilizar a palavra reservada this.
  
 */

// ADICIONE OS M�TODOS ABAIXO
// void m�todo sem retorno
void deposita ( double valor) {
this.saldo += valor ;
 }

void saca ( double valor ) {
this . saldo -= valor ;
}

void imprimeExtrato () {
System .out . println (" SALDO - SEM O LIMITE: " + this . saldo );
}

double consultaSaldoDisponivel () {
return this . saldo + this . limite ;
}
}