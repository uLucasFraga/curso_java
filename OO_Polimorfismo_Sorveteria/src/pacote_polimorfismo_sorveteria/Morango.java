package pacote_polimorfismo_sorveteria;

public class Morango extends ControleFinanceiroSorveteria {

	@Override
	public double calcular(int bolas) {
		// TODO Auto-generated method stub
	double	preco=4.00;
		
		if(bolas>3){
		double preco_final=(preco*bolas)*0.9;
		return preco_final;
			
		}
		else{
			double preco_final=(preco*bolas)*0.95;
			return preco_final;
			
		}
	}
	
}
