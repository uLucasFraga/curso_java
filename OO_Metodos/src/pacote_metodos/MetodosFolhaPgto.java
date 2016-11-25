package pacote_metodos;

public class MetodosFolhaPgto {
	
//---------------------------------------------------
double vqhed(double salario, int qhe ){
		
	double calculo=((salario/30/8)*1.5)*qhe;
	
	return calculo;
	
					}
//---------------------------------------------------

double vqhen(double salario, int qhe ){
	
	double calculo=((salario/30/8)*2)*qhe;
	
	return calculo;
					}
//---------------------------------------------------

double vfaltas(double salario, int faltas ){
	
	double calculo=(salario/30)*faltas;
	
	return calculo;
					}


//---------------------------------------------------
double sfamilia(String setor, int dependentes ){
	final double SalarioMinimo=880.00;
	if(setor!="C" && dependentes>=3)
	{
		double calculo=SalarioMinimo*0.15*dependentes;
		return calculo;
	}
	else
	{
		double calculo=SalarioMinimo*0.1*dependentes;
		return calculo;
	}
}	

//---------------------------------------------------
double vvt(double salario)
{
		
		if(salario>=5000){
			return 0;	
		}
		else{
		double calculo=(salario*0.06);
		return calculo;
		}
		
}					
	

//---------------------------------------------------

double premio(String setor, double salario){
	
	if(setor=="A" || setor=="a" || setor=="C" || setor=="c")
	{
		double calculo=salario*0.05;
		return calculo;
	}
	else
	{
		double calculo=salario*0.02;
		return calculo;
	}
}

//---------------------------------------------------
double abono(String setor, double salario){
	
	if(setor=="B" || setor=="b" && salario<=4000)
	{
		double calculo=salario*0.06;
		return calculo;
	}
	else
	{
		double calculo=salario*0.03;
		return calculo;
	}
}

//---------------------------------------------------

double inss(double salario){
	
	if(salario<=1280)
	{
		double calculo=salario*0.11;
		return calculo;
	}
	
	if(salario<=5000){
	
		double calculo=salario*0.13;
		return calculo;
	}
	else
	{
		double calculo=salario*0.02;
		return calculo;
	}
}

//---------------------------------------------------
double irrf(double salario){
	
	if(salario<=1280)
	{
		
		return 0;
	}
	
	if(salario<=5000){
	
		double calculo=salario*0.22;
		return calculo;
	}
	else
	{
		double calculo=salario*0.27;
		return calculo;
	}
}
//---------------------------------------------------



}
