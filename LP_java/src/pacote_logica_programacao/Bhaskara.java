package pacote_logica_programacao;
import java.util.Scanner;
public class Bhaskara {
    public static void main(String[] args) {
        float a, b, c,      //coeficientes
              delta,        //delta
              sqrtdelta,    //raiz quadrada de delta
              raiz1,raiz2;  //raízes
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
        //Passo 1: Recebendo os coeficientes
        System.out.println("Equação do 2o grau: ax² + bx + cx = 0");
        System.out.print("Entre com o valor de a: ");
        a = entrada.nextFloat();
        System.out.print("Entre com o valor de b: ");
        b = entrada.nextFloat();
        System.out.print("Entre com o valor de c: ");
        c = entrada.nextFloat();
        
        //Passo 2: Checando se a equação é válida
        if(a != 0){
        
        //Passo 3: recebendo o valor de delta e calculando sua raiz quadrada
            delta = (b*b) - (4*a*c);
            sqrtdelta = (float)Math.sqrt(delta);
        
        //Passo 4: se a raiz de delta for maior que 0, as raízes são reais    
            if(delta >=0){
                raiz1 = ((-1)*b + sqrtdelta)/(2*a);
                raiz2 = ((-1)*b - sqrtdelta)/(2*a);
                System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
            }
        //Passo 5: se delta for menor que 0, as raízes serão complexas
            else{
                delta = -delta;
                sqrtdelta = (float)Math.sqrt(delta);
                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                
            }
            
        }
        else{
            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
        }
    }

}
