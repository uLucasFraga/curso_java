//----- 01
package pacote_metodos;
import java.util.Scanner;
public class Menu {

	/*
	 * public static � Permite criar um m�todo que pode ser executado por agentes externos, 
	 * inclusive independente de instancia��o.
	 * 
	 * static: o m�todo � compartilhado por todos os objetos instanciados a partir da mesma classe.
	 void: Indica que um m�todo n�o tem retorno
	 */
	 public static void menu(){
	        System.out.println("\tCadastro de clientes");
	        System.out.println("0. Fim");
	        System.out.println("1. Inclui");
	        System.out.println("2. Altera");
	        System.out.println("3. Exclui");
	        System.out.println("4. Consulta");
	        System.out.println("Opcao:");
	    }

	    public static void inclui(){
	        System.out.println("Voc� entrou no m�todo Inclui.");
	        System.exit(0);
	    }
	    
	    public static void altera(){
	        System.out.println("Voc� entrou no m�todo Altera.");
	        System.exit(0);
	    }
	    
	    public static void exclui(){
	        System.out.println("Voc� entrou no m�todo Exclui.");
	        System.exit(0);
	    }
	    
	    public static void consulta(){
	        System.out.println("Voc� entrou no m�todo Consulta.");
	        System.exit(0);
	    }
	    
	    public static void main(String[] args) {
	        int opcao;
	        @SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
	        
	        do{
	            menu();
	            opcao = entrada.nextInt();
	            
	            switch(opcao){
	            case 1:
	                inclui();
	                break;
	                
	            case 2:
	                altera();
	                break;
	                
	            case 3:
	                exclui();
	                break;
	                
	            case 4:
	                consulta();
	                break;
	            
	            default:
	                System.out.println("Op��o inv�lida.");
	            }
	        } while(opcao != 0);
	    }
	

}