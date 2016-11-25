package pacote_polimorfismo_calculadora;

/* *
 * POLIMORFISMO: Propriedade que permite a uma referência mudar ocomportamento de acordo com o que 
 * o objeto está esperando. 
 * Habilita múltiplos objetos de diferentes subclasses a serem tratados como objetos de uma única 
 * superclasse enquanto seleciona automaticamente os métodos 
 * adequados para aplicar em um objeto particular baseado em subclasses às quais pertence.
 */


/*As classes abstratas são as que não permitem realizar qualquer tipo de instância. São classes feitas especialmente 
 * para serem modelos para suas classes derivadas. As classes derivadas, via de regra, deverão 
 * sobrescrever os métodos para realizar a implementação dos mesmos. 
 * As classes derivadas das classes abstratas são conhecidas como classes concretas.
 */



public abstract class OperacaoMatematica{
	public abstract double calcular(double x, double y);
		
	}
