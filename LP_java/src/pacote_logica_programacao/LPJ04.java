package pacote_logica_programacao;

import java.io.*;
public class LPJ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entrada;
		entrada=new BufferedReader(new InputStreamReader(System.in));
		// Criação da variável que será utilizada para a leitura a partir do teclado
		float salario=0, bonus=0;
		// As variáveis acima foram declaradas como float aceitam números decimais
		int tempo=0;
		//
		try {
			System.out.println("Informe o salário:");
			salario=Float.parseFloat(entrada.readLine());
			System.out.println("Quanto tempo esta na empresa?");
			tempo=Integer.parseInt(entrada.readLine());
				if(tempo>=5){
					bonus=salario*0.20f;
					// O f no final da constante garante que o resultado artmazenado m bonus será do tipo float
				}else{
					bonus=salario*0.10f;
				}
			System.out.println("valor do bonus é: "+bonus );
		}
			catch (Exception e){
			System.out.println("Ocorreu um erro durante a leitura!");
				}
		
		
	}

}
