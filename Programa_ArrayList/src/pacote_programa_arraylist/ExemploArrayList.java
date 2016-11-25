package pacote_programa_arraylist;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

public class ExemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int i;
		
			Fruta fruta01=new Fruta("Perâ",0.25,Color.YELLOW,9);
			Fruta fruta02=new Fruta("Maçã",0.25,Color.RED,8);
			Fruta fruta03=new Fruta();
			
			fruta03.setNome("Mamão");
			fruta03.setpesoAproximado(0.6);
			fruta03.setCorPredominante(Color.ORANGE);
			fruta03.setTamanhoAproximado(20);
			
			ArrayList<Fruta> saladaDeFrutas=new ArrayList<>();
			
			saladaDeFrutas.add(new Fruta("Banana",0.15,Color.YELLOW,14));
			saladaDeFrutas.add(fruta01);
			saladaDeFrutas.add(new Fruta());
			saladaDeFrutas.add(fruta02);
			saladaDeFrutas.add(new Fruta("Melancia",3,Color.GREEN,40));
			saladaDeFrutas.add(fruta03);
			
			System.out.println("=== Imprimindo ArrayList pelo índice ==");
			
			for(i=0;i<saladaDeFrutas.size();i++){
			saladaDeFrutas.get(i).imprimir();
	}
			saladaDeFrutas.get(2).setNome("Jambo");
			saladaDeFrutas.get(2).setpesoAproximado(0.02);
			saladaDeFrutas.get(2).setCorPredominante(Color.YELLOW);
			saladaDeFrutas.get(2).setTamanhoAproximado(5);
			
			
			System.out.println("Imprimindo ArrayList após o preenchimento da fruta na posição [2] ");
			
			@SuppressWarnings("rawtypes")
			Iterator it=saladaDeFrutas.iterator();
			
			while(it.hasNext()){
				Fruta fr=(Fruta)it.next();
				fr.imprimir();
				
				if(fr.getNome().equals("Melancia")){
					it.remove();
				}
			}
			
			saladaDeFrutas.remove(1);
			
			saladaDeFrutas.remove(fruta03);
			System.out.println("Imprimindo ArrayList sem Melância e Mamão");
			
			for(i=0;i<saladaDeFrutas.size();i++){
				saladaDeFrutas.get(i).imprimir();
		}
			
			
}
}