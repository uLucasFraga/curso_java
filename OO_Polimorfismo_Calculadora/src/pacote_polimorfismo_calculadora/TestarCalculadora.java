package pacote_polimorfismo_calculadora;

import java.util.Scanner;

public class TestarCalculadora {

    @SuppressWarnings("resource")
	public static void main(String args[]) {
        int opc = 0;
        double num1, num2;
        
        Scanner tec = new Scanner(System.in);
        while (opc != 5) {
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Encerrar");
            do {
                opc = tec.nextInt();
            } while (opc < 1 || opc > 5);
            if (opc == 5) {
                break;
            }
            System.out.println("N�mero 1: ");
            num1 = tec.nextDouble();
            System.out.println("N�mero 2: ");
            num2 = tec.nextDouble();
            switch (opc) {
                case 1:
                    Soma soma = new Soma();
 System.out.println("O resultado da soma �: " + soma.calcular(num1, num2));
                    break;
                case 2:
                    Subtracao sub = new Subtracao();
 System.out.println("O resultado da subtra��o �: " + sub.calcular(num1, num2));
                    break;
                case 3:
                    Multiplicacao mult = new Multiplicacao();
 System.out.println("O resultado da multiplica��o �: " + mult.calcular(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        Divisao div = new Divisao();
 System.out.println("O resultado da divis�o �: " + div.calcular(num1, num2));
                       break;
                       
                       
                    } else {
                        System.out.println("Imposs�vel divis�o por zero!");
                    }
                    break;
            }
        }
    }
}