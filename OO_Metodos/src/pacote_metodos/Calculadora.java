// ----- 03
package pacote_metodos;
import java.text.DecimalFormat;
import java.util.Scanner;
class Calculadora {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Na verdade ele chama funções(metodos)

	//	O modificador public deixará visível a classe para todas as outras classes, subclasses e pacotes do projeto Java.
	//  O método main é, por definição dos idealizadores da linguagem, o ponto em que será iniciada a execução de seu programa.	
			byte OPCAO=0;
			
			@SuppressWarnings("resource")
			Scanner opcao=new Scanner(System.in);
			
			while(OPCAO!=5)
			{
				System.out.println();
				System.out.println();
				System.out.println("--------------------");
				System.out.println("PROGRAMA CALCULADORA");
				System.out.println("   MENU PRINCIPAL   ");
				System.out.println();
				System.out.println("[1].........................:Adição");
				System.out.println("[2]......................:Subtração");
				System.out.println("[3]..................:Multiplicação");
				System.out.println("[4]........................:Divisão");
				System.out.println("[5]....................:Potenciação");
				System.out.println("[6]................:Fim do programa");
				
				OPCAO=opcao.nextByte();
				
				if(OPCAO!=5 || OPCAO!=0){
					
					switch(OPCAO){
					case 1: rotadicao(); 			break;
					case 2: rotsubtracao(); 		break;
					case 3: rotmultiplicacao(); 	break;
					case 4: rotdivisao(); 			break;
					case 5: rotpotenciacao(); 		break;
					case 6: saida(); 				break;
					}
				}
				
				
			}
		}


	/*
	 * public static – Permite criar um método que pode ser executado por agentes externos, 
	 * inclusive independente de instanciação.
	 * 
	 * static: o método é compartilhado por todos os objetos instanciados a partir da mesma classe.	
	 */
	public static void rotadicao() {
		// void: Indica que um método não tem retorno
		
		
		double R, A, B;
		
		
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Rotina de adição:");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Entre com o valor da variável [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da variável [B]:");
		B=s.nextDouble();
		R=A+B;
		System.out.println();
		
		
		System.out.println("O resultado da adição é:"+R);
		System.exit(0);
		
		
	}

	public static void rotsubtracao() {
	double R, A, B;
		
		
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Rotina da subtração:");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Entre com o valor da variável [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da variável [B]:");
		B=s.nextDouble();
		R=A-B;
		System.out.println();
		
		
		System.out.println("O resultado da subtração é:"+R);
		System.exit(0);
	}

	public static void rotmultiplicacao() {
	double R, A, B;
		
		
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Rotina de multiplicacao:");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Entre com o valor da variável [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da variável [B]:");
		B=s.nextDouble();
		R=A*B;
		System.out.println();
		
		
		System.out.println("O resultado da multiplicação é:"+R);
		System.exit(0);
	}

	public static void rotdivisao() {
	double R, A, B;
		
		
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Rotina da divsão:");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Entre com o valor da variável [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da variável [B]:");
		B=s.nextDouble();
		R=A/B;
		System.out.println();
		
		
		System.out.println("O resultado da divisão é:"+R);
		System.exit(0);
	}

	public static void rotpotenciacao() {
	double R, A, B;
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Rotina da divsão:");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Entre com o valor da variável [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da variável [B]:");
		B=s.nextDouble();
		R=(Math.pow(A,B));
		DecimalFormat fmt = new DecimalFormat("0.00");        
	    String casas_decimais = fmt.format(R);  
		System.out.println();
		System.out.println("O resultado da divisão é:"+casas_decimais);
		System.exit(0);
	}


	public static void saida() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.exit(0);	
	}
	}

