package pacote_logica_programacao;

import java.io.*;
public class LPJ01 {
// Indica o nome do programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Indica o bloco de instru��es que ser�o executadas
BufferedReader entrada;
entrada=new BufferedReader(new InputStreamReader(System.in));
// Cria��o da vari�vel que ser� utilizada para a leitura a partir do teclado

String nome;
// Tipo String define a vari�vel como sequ�ncia de caracteres "texto" 
try{
// Define o bloco de tratamento de erros da linguagem java 
	System.out.println("Qual o seu nome?");
	nome=entrada.readLine();
	System.out.println("O nome �:"+nome);

}catch(Exception e){
System.out.println("Ocorreu um erro durante a leitura!");	
}
	}

}
