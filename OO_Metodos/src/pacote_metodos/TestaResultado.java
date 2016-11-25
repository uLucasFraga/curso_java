package pacote_metodos;

import java.util.Scanner;

public class TestaResultado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Resultado r=new Resultado();


@SuppressWarnings("resource")
Scanner entrada = new Scanner (System.in);

System.out.print("Insira a primeira nota: ");
double nota1=entrada.nextInt();

System.out.print("Insira a segunda nota: ");
double nota2 = entrada.nextInt();


r.verificaMedia(nota1, nota2);


	}

}
