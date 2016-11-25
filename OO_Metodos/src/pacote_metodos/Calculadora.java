// ----- 03
package pacote_metodos;
import java.text.DecimalFormat;
import java.util.Scanner;
class Calculadora {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Na verdade ele chama fun��es(metodos)

	//	O modificador public deixar� vis�vel a classe para todas as outras classes, subclasses e pacotes do projeto Java.
	//  O m�todo main �, por defini��o dos idealizadores da linguagem, o ponto em que ser� iniciada a execu��o de seu programa.	
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
				System.out.println("[1].........................:Adi��o");
				System.out.println("[2]......................:Subtra��o");
				System.out.println("[3]..................:Multiplica��o");
				System.out.println("[4]........................:Divis�o");
				System.out.println("[5]....................:Potencia��o");
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
	 * public static � Permite criar um m�todo que pode ser executado por agentes externos, 
	 * inclusive independente de instancia��o.
	 * 
	 * static: o m�todo � compartilhado por todos os objetos instanciados a partir da mesma classe.	
	 */
	public static void rotadicao() {
		// void: Indica que um m�todo n�o tem retorno
		
		
		double R, A, B;
		
		
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Rotina de adi��o:");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Entre com o valor da vari�vel [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da vari�vel [B]:");
		B=s.nextDouble();
		R=A+B;
		System.out.println();
		
		
		System.out.println("O resultado da adi��o �:"+R);
		System.exit(0);
		
		
	}

	public static void rotsubtracao() {
	double R, A, B;
		
		
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Rotina da subtra��o:");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Entre com o valor da vari�vel [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da vari�vel [B]:");
		B=s.nextDouble();
		R=A-B;
		System.out.println();
		
		
		System.out.println("O resultado da subtra��o �:"+R);
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
		System.out.println("Entre com o valor da vari�vel [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da vari�vel [B]:");
		B=s.nextDouble();
		R=A*B;
		System.out.println();
		
		
		System.out.println("O resultado da multiplica��o �:"+R);
		System.exit(0);
	}

	public static void rotdivisao() {
	double R, A, B;
		
		
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Rotina da divs�o:");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Entre com o valor da vari�vel [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da vari�vel [B]:");
		B=s.nextDouble();
		R=A/B;
		System.out.println();
		
		
		System.out.println("O resultado da divis�o �:"+R);
		System.exit(0);
	}

	public static void rotpotenciacao() {
	double R, A, B;
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Rotina da divs�o:");
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Entre com o valor da vari�vel [A]:");
		A=s.nextDouble();
		System.out.println("Entre com o valor da vari�vel [B]:");
		B=s.nextDouble();
		R=(Math.pow(A,B));
		DecimalFormat fmt = new DecimalFormat("0.00");        
	    String casas_decimais = fmt.format(R);  
		System.out.println();
		System.out.println("O resultado da divis�o �:"+casas_decimais);
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

