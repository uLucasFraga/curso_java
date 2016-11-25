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
Normalmente, os métodos acessam ou alteram os valores armazenados nos atributos dos objetos.
Por exemplo, na execução do método deposita(), é necessário alterar o valor do atributo saldo
do objeto que foi escolhido para realizar a operação.
Dentro de um método, para acessar os atributos do objeto que está processando o método, devemos
utilizar a palavra reservada this.
  
 */

// ADICIONE OS MÉTODOS ABAIXO
// void método sem retorno
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