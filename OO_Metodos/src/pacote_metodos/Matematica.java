//----- 07

package pacote_metodos;

public class Matematica {
	//------------------------------------------
	double maior(double um, double dois){
	
		if(um>dois)
		{
			return um;
		} 
		else {
			return dois;
		}
		
	}
	//------------------------------------------
	double menor(double um, double dois ){
		
		if(um<dois)
		{
			return um;
		}
		else{
			return dois;
		}
	}
//------------------------------------------
double igual(double um, double dois){
		
		if(um==dois)
		{
		return 0;	
		}
		return 0;
		
	}
	
//------------------------------------------
	double soma(double um, double dois){
		
		double s=um+dois;
		return s;
	}
	
	//------------------------------------------	
double subtracao(double um, double dois){
		
		double s=um-dois;
		return s;
	}
	
//------------------------------------------

double multiplicacao(double um, double dois){
	
	double s=um*dois;
	return s;
		}

//------------------------------------------
double divisao(double um, double dois){
	
	double s=um/dois;
	return s;
		}
//------------------------------------------
    double elevado(double um, double dois){
	return Math.pow(um, dois);
		}
//------------------------------------------
double raiz(double um){
	return Math.sqrt(um);
		}


//------------------------------------------

double operacao(double um, double dois){
	
	if(um>dois)
	{
		return Math.pow(um, 2)+1;
	} 
	else {
		return Math.pow(dois, 2)+2;
	}
	
}

}