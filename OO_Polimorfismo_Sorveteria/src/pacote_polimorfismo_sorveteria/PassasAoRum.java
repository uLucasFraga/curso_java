package pacote_polimorfismo_sorveteria;

public class PassasAoRum extends ControleFinanceiroSorveteria {

	@Override
	public double calcular(int bolas) {
		// TODO Auto-generated method stub
	double	preco=4.00;
		
		if(bolas>3){
		double preco_final=(preco*bolas)*0.5;
		return preco_final;
			
		}
		else{
			double preco_final=(preco*bolas);
			return preco_final;
			
		}
	}
	
}

