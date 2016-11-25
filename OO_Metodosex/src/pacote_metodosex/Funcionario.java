package pacote_metodosex;



class Funcionario {
String nome;
double salario ;
double percentual;
double aumento;



void valorAumento (double percentual, double salario ){
	
	this.aumento=(salario*percentual);
}

void novoSalario ( double salario, double percentual){
this . salario=(salario*percentual)+salario ;

}

String consultaDados (){
return " Nome : " + this . nome +" \n Valor aumento:"+this.aumento+" \n Salário : " + this . salario ;
}
}
