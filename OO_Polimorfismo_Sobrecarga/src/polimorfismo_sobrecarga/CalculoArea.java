/*Polimorfismo Estático ou Sobrecarga */

/*
O Polimorfismo Estático se dá quando temos a mesma operação implementada várias 
vezes na mesma classe. 
A escolha de qual operação será chamada depende da assinatura 
dos métodos sobrecarregados.
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
