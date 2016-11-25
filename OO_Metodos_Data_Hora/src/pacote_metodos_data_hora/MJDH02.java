package pacote_metodos_data_hora;

import java.io.*;
import java.util.Calendar;
@SuppressWarnings("unused")
public class MJDH02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Calendar hora=Calendar.getInstance();
int hor=hora.get(Calendar.HOUR);
int min=hora.get(Calendar.MINUTE);
int seg=hora.get(Calendar.SECOND);
int mil=hora.get(Calendar.MILLISECOND);

System.out.println();

System.out.println("Hora......:"+hor);
System.out.println("Minutos......:"+min);
System.out.println("Segundos......:"+seg);
System.out.println("Milisegundos......:"+mil);

	}

}
