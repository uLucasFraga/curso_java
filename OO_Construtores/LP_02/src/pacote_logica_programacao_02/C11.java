package pacote_logica_programacao_02;

import java.util.Scanner;

public class C11 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
/*
Um quiosque de sorvete vende casquinhas somente nos sabores Chocolate - "C" e morango - "M".
Faça um algoritimo para imprimir uma mensagem nas seguintes situações:
-- Sorvete de chocolate com mais de três bolas: desconto 10%
-- Sorvete de chocolate com qualquer quantidade de bolas: desconto 5%
-- Sorvete de morango: desconto 0
** Calcule também o total a ser pago pelo cliente
*/
		

		double preço=4;
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
			System.out.println("O desconto será de 10%!");
			ptotal=(bolas*preço)*0.9;
			System.out.println("O preço a ser pago pelo cliente é de:"+" "+ptotal+" "+"reais");
			}
			else
			{
			System.out.println("O desconto será de 5%!");
			ptotal=(bolas*preço)*0.95;
			System.out.println("O preço a ser pago pelo cliente é de:"+" "+ptotal+" "+"reais");
			}
		}
		if(sabor.equals("M") || sabor.equals("m"))
		{
		System.out.println("Qual a quantidade de bolas?");
		bolas=entrada.nextDouble();
		System.out.println("Não haverá desconto!");
		ptotal=(bolas*preço);
		System.out.println("O preço a ser pago pelo cliente é de:"+" "+ptotal+" "+"reais");
		}

		if(!sabor.equals("C") && !sabor.equals("c") && !sabor.equals("M") && !sabor.equals("m"))
		{
			System.out.println("Opção inválida! - Favor escolher entre: chocolate ou morango!");
		}

	}

}
