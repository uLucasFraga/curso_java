/*Polimorfismo Est�tico ou Sobrecarga */

/*
O Polimorfismo Est�tico se d� quando temos a mesma opera��o implementada v�rias 
vezes na mesma classe. 
A escolha de qual opera��o ser� chamada depende da assinatura 
dos m�todos sobrecarregados.
*/
package polimorfismo_sobrecarga;

public class CalculoArea {

public  double Area(int x){
	double calculo=x*x;
	return (calculo);
			}

public  double Area(float r, float h){
	double calculo=r*r*3.14159*h;
	return (calculo);
			}

public  double Area(float x, float y, float z){
	double calculo=x*y*z;
	return (calculo);
			}

}
