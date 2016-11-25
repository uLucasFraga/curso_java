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
            System.out.println("Número 1: ");
            num1 = tec.nextDouble();
            System.out.println("Número 2: ");
            num2 = tec.nextDouble();
            switch (opc) {
                case 1:
                    Soma soma = new Soma();
 System.out.println("O resultado da soma é: " + soma.calcular(num1, num2));
                    break;
                case 2:
                    Subtracao sub = new Subtracao();
 System.out.println("O resultado da subtração é: " + sub.calcular(num1, num2));
                    break;
                case 3:
                    Multiplicacao mult = new Multiplicacao();
 System.out.println("O resultado da multiplicação é: " + mult.calcular(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        Divisao div = new Divisao();
 System.out.println("O resultado da divisão é: " + div.calcular(num1, num2));
                       break;
                       
                       
                    } else {
                        System.out.println("Impossível divisão por zero!");
                    }
                    break;
            }
        }
    }
}