package pacote_logica_programacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LPJ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int G[][]=new int [6][2];
double prod=0;

BufferedReader entrada;
entrada=new BufferedReader(new InputStreamReader(System.in));

try
{
	for(int i=0;i<6;i++)
	{
		prod=1;
		for(int j=0;j<2;j++){
			System.out.println("Entre com os valores de G: "+i+","+j);
			G[i][j]=Integer.parseInt(entrada.readLine());
			prod=prod*G[i][j];
		}
		System.out.println("Linha-"+i+":"+Math.sqrt(prod));
	}
	

	}catch (Exception e){
		System.out.println("Ocorreu um erro durante a leitura!");

}
	
	}
	
}
