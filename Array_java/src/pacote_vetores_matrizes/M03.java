/* Leia um conjunto de notas, cuja quantidade seja determinada pelo usu�rio. 
 * Calcule a m�dia de todas elas. Exiba o conjunto das notas maiores do 
 * que a m�dia calculada. Em seguida, de forma agrupada, exiba o outro 
 * conjunto de notas (menores do que a m�dia).
 */

package pacote_vetores_matrizes;

import java.util.Scanner;

public class M03 {

	    @SuppressWarnings("resource")
		public static void main(String[] args) {
	        int quantidade;
	        double media = 0;
	        System.out.println("Informe a quantidade de notas:");
	        quantidade = new Scanner(System.in).nextInt();
	        double vetor[];
	        vetor=new double[quantidade];
	        for(int i=0 ; i <quantidade ; i++){
	            System.out.println("Informe a " +(i+1)+ "� nota");
	            vetor[i]=new Scanner(System.in).nextInt();
	        }
	        for(int i=0 ; i <quantidade ; i++){
	            media = media + vetor[i];
	        }
	        media = media / quantidade;
	        System.out.println ("A m�dia �              : " +media);
	        String maior= "Nota(s) acima m�dia    : ", menor= "Nota(s) abaixo da m�dia: ";
	        for(int i=0 ; i<quantidade ;i++){
	            if(vetor[i]> media){
	                maior = maior + vetor[i]+"    ";
	            }else{
	 
	                menor = menor + vetor[i]+"    ";
	            }
	        }
	        System.out.println(maior);
	        System.out.println(menor);
	    }
	}