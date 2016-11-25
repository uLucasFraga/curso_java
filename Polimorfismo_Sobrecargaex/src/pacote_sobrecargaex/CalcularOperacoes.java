package pacote_sobrecargaex;

public class CalcularOperacoes {
	
	// Operação01
	public  double Operacoes(double x){
		double calculo=Math.pow(x,2);
		return (calculo);
				}
	// Operação02
	public  double Operacoes(double x, double y){
		double calculo=Math.pow((x+y),2);
		return (calculo);
				}
	// Operação03
	public  double Operacoes(double x, double y, double z){
		double calculo=Math.sqrt((x*y+z));
		return (calculo);
				}

}
