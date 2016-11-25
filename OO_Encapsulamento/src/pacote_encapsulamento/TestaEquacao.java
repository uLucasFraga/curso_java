package pacote_encapsulamento;
import java.util.Scanner;

public class TestaEquacao {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float ax;
		float bx;
		float cx;
		float deltax;
		float raiz_deltax;
		float x1x;
		float x2x;
		
		Equacao e=new Equacao();
		entrada = new Scanner(System.in);
        
        //Passo 1: Recebendo os coeficientes
        System.out.println("Equação do 2o grau: ax² + bx + cx = 0");
        System.out.print("Entre com o valor de a: ");
        ax = entrada.nextFloat();
        e.setA(ax);
        System.out.print("Entre com o valor de b: ");
        bx = entrada.nextFloat();
        e.setB(bx);
        System.out.print("Entre com o valor de c: ");
        cx = entrada.nextFloat();
        e.setB(cx);
        
      //Passo 2: Checando se a equação é válida
        if(ax != 0){
        
        //Passo 3: recebendo o valor de delta e calculando sua raiz quadrada
             deltax= (bx*bx) - (4*ax*cx);
             e.setDelta(deltax);
       // Imprimindo o valor de delta
       System.out.println("O valor de delta é: "+e.getDelta());
             
       // Calculando a raiz de delta
            raiz_deltax = (float)Math.sqrt(deltax);
            e.setRaizDelta(raiz_deltax);
      // Imprimindo o valor da raiz de delta
            System.out.println("O valor da raiz quadrada de delta: "+e.getRaizDelta());    
        //Passo 4: se a raiz de delta for maior que 0, as raízes são reais    
            
            if(deltax>=0){
                x1x = ((-1)*bx +raiz_deltax )/(2*ax);
                e.setX1(x1x);
                x2x = ((-1)*bx - raiz_deltax)/(2*ax);
                e.setX2(x2x);
                System.out.println("O valor de x1 é:"+e.getX1());
                System.out.println("O valor de x1 é:"+e.getX2());
            }
        //Passo 5: se delta for menor que 0, as raízes serão complexas
            else{
            	(deltax)= -(deltax);
            	 System.out.println("O valor de delta é:"+e.getDelta());    	
            	raiz_deltax = (float)Math.sqrt(deltax);
            	e.setRaizDelta(raiz_deltax);
            	System.out.println("O valor da raiz quadrada de delta: "+e.getRaizDelta());     	
                
            	 x1x = ((-1)*bx +raiz_deltax )/(2*ax);
                 e.setX1(x1x);
                 x2x = ((-1)*bx - raiz_deltax)/(2*ax);
                 e.setX2(x2x);
                 
                 System.out.println("O valor de x1 é:"+e.getX1());
                 System.out.println("O valor de x1 é:"+e.getX2());
            	
                
            }
            
        }
        else{
            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
        }
    }

}


