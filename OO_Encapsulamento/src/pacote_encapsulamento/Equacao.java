package pacote_encapsulamento;

public class Equacao {

private	float 	a, b, c;	//coeficientes
private	float  	delta;		//delta
private	float  	raiz_delta;	//raiz quadrada de delta
private	float  	x1,x2;		//raízes

public float getA(){
	
	return a;
		}

public float getB(){
	
	return b;
		}

public float getC(){
	
	return c;
		}

public float getDelta(){
	
	return delta;
		}

public float getRaizDelta(){
	
	return raiz_delta;
		}

public float getX1(){
	
	return x1;
		}

public float getX2(){
	
	return x2;
		}

//----------------------------------------------

public void setA(float a){
	this.a=a;
		}

public void setB(float b){
	this.b=b;
		}

public void setC(float c){
	this.c=c;
		}

public void setDelta(float delta){
	this.delta=delta;
		}

public void setRaizDelta(float raiz_delta){
	this.raiz_delta=raiz_delta;
		}

public void setX1(float x1){
	this.x1=x1;
		}

public void setX2(float x2){
	this.x2=x2;
		}


}
