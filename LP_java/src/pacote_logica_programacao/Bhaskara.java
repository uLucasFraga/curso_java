package pacote_logica_programacao;
import java.util.Scanner;
public class Bhaskara {
    public static void main(String[] args) {
        float a, b, c,      //coeficientes
              delta,        //delta
              sqrtdelta,    //raiz quadrada de delta
              raiz1,raiz2;  //ra�zes
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
        //Passo 1: Recebendo os coeficientes
        System.out.println("Equa��o do 2o grau: ax� + bx + cx = 0");
        System.out.print("Entre com o valor de a: ");
        a = entrada.nextFloat();
        System.out.print("Entre com o valor de b: ");
        b = entrada.nextFloat();
        System.out.print("Entre com o valor de c: ");
        c = entrada.nextFloat();
        
        //Passo 2: Checando se a equa��o � v�lida
        if(a != 0){
        
        //Passo 3: recebendo o valor de delta e calculando sua raiz quadrada
            delta = (b*b) - (4*a*c);
            sqrtdelta = (float)Math.sqrt(delta);
        
        //Passo 4: se a raiz de delta for maior que 0, as ra�zes s�o reais    
            if(delta >=0){
                raiz1 = ((-1)*b + sqrtdelta)/(2*a);
                raiz2 = ((-1)*b - sqrtdelta)/(2*a);
                System.out.printf("Ra�zes: %.2f e %.2f", raiz1, raiz2);
            }
        //Passo 5: se delta for menor que 0, as ra�zes ser�o complexas
            else{
                delta = -delta;
                sqrtdelta = (float)Math.sqrt(delta);
                System.out.printf("Ra�z 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                System.out.printf("Ra�z 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                
            }
            
        }
        else{
            System.out.println("Coeficiente 'a' inv�lido. N�o � uma equa��o do 2o grau");
        }
    }

}
