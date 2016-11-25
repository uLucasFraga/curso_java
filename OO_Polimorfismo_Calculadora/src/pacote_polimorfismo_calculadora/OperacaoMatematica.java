package pacote_polimorfismo_calculadora;

/* *
 * POLIMORFISMO: Propriedade que permite a uma refer�ncia mudar ocomportamento de acordo com o que 
 * o objeto est� esperando. 
 * Habilita m�ltiplos objetos de diferentes subclasses a serem tratados como objetos de uma �nica 
 * superclasse enquanto seleciona automaticamente os m�todos 
 * adequados para aplicar em um objeto particular baseado em subclasses �s quais pertence.
 */


/*As classes abstratas s�o as que n�o permitem realizar qualquer tipo de inst�ncia. S�o classes feitas especialmente 
 * para serem modelos para suas classes derivadas. As classes derivadas, via de regra, dever�o 
 * sobrescrever os m�todos para realizar a implementa��o dos mesmos. 
 * As classes derivadas das classes abstratas s�o conhecidas como classes concretas.
 */



public abstract class OperacaoMatematica{
	public abstract double calcular(double x, double y);
		
	}
