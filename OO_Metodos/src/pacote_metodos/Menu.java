//----- 01
package pacote_metodos;
import java.util.Scanner;
public class Menu {

	/*
	 * public static – Permite criar um método que pode ser executado por agentes externos, 
	 * inclusive independente de instanciação.
	 * 
	 * static: o método é compartilhado por todos os objetos instanciados a partir da mesma classe.
	 void: Indica que um método não tem retorno
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
	        System.out.println("Você entrou no método Inclui.");
	        System.exit(0);
	    }
	    
	    public static void altera(){
	        System.out.println("Você entrou no método Altera.");
	        System.exit(0);
	    }
	    
	    public static void exclui(){
	        System.out.println("Você entrou no método Exclui.");
	        System.exit(0);
	    }
	    
	    public static void consulta(){
	        System.out.println("Você entrou no método Consulta.");
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
	                System.out.println("Opção inválida.");
	            }
	        } while(opcao != 0);
	    }
	

}