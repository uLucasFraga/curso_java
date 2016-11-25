package pacote_logica_programacao_02;

import java.util.Scanner;

public class C11 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
/*
Um quiosque de sorvete vende casquinhas somente nos sabores Chocolate - "C" e morango - "M".
Fa�a um algoritimo para imprimir uma mensagem nas seguintes situa��es:
-- Sorvete de chocolate com mais de tr�s bolas: desconto 10%
-- Sorvete de chocolate com qualquer quantidade de bolas: desconto 5%
-- Sorvete de morango: desconto 0
** Calcule tamb�m o total a ser pago pelo cliente
*/
		

		double pre�o=4;
		double ptotal=0;
		String sabor;
		double bolas=0;
		
		System.out.println("Qual o sabor do sorvete?");
		sabor=entrada.nextLine();

		if(sabor.equals("C") || sabor.equals("c"))
		{
			System.out.println("Qual a quantidade de bolas?");
			bolas=entrada.nextDouble();
			
			if(bolas>3)
			{
			System.out.println("O desconto ser� de 10%!");
			ptotal=(bolas*pre�o)*0.9;
			System.out.println("O pre�o a ser pago pelo cliente � de:"+" "+ptotal+" "+"reais");
			}
			else
			{
			System.out.println("O desconto ser� de 5%!");
			ptotal=(bolas*pre�o)*0.95;
			System.out.println("O pre�o a ser pago pelo cliente � de:"+" "+ptotal+" "+"reais");
			}
		}
		if(sabor.equals("M") || sabor.equals("m"))
		{
		System.out.println("Qual a quantidade de bolas?");
		bolas=entrada.nextDouble();
		System.out.println("N�o haver� desconto!");
		ptotal=(bolas*pre�o);
		System.out.println("O pre�o a ser pago pelo cliente � de:"+" "+ptotal+" "+"reais");
		}

		if(!sabor.equals("C") && !sabor.equals("c") && !sabor.equals("M") && !sabor.equals("m"))
		{
			System.out.println("Op��o inv�lida! - Favor escolher entre: chocolate ou morango!");
		}

	}

}
