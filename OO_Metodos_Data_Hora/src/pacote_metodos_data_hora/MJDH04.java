package pacote_metodos_data_hora;

import java.io.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Scanner;
@SuppressWarnings("unused")
public class MJDH04 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Calendar data1=Calendar.getInstance();
	Calendar data2=Calendar.getInstance();

	int dia1, mes1, ano1;
	int dia2, mes2, ano2;
	
	long dt1=0;
	long dt2=0;
	long diferenca=0;
	
	String edata1;
	String edata2;
	s = new Scanner(System.in);
	
	System.out.println();
	
	System.out.println("Entre com a primeira data no formato DD/MM/AAAA: ");
	edata1=s.nextLine();
	
	System.out.println("Entre com a segunda data  no formato DD/MM/AAAA: ");
	edata2=s.nextLine();
	
	System.out.println();
	
	dia1=Integer.parseInt(edata1.substring(0,2));
	mes1=Integer.parseInt(edata1.substring(3,5))-1;
	ano1=Integer.parseInt(edata1.substring(6,10));
	
	data1.set(ano1, mes1, dia1);
	
	dia2=Integer.parseInt(edata2.substring(0,2));
	mes2=Integer.parseInt(edata2.substring(3,5))-1;
	ano2=Integer.parseInt(edata2.substring(6,10));
	
	data2.set(ano2, mes2, dia2);
	
	dt1=data1.getTimeInMillis();
	dt2=data2.getTimeInMillis();
	
	if(data1.compareTo(data2)>0)
	{
		diferenca=(dt1-dt2)/86400000;
	}
	else{
		diferenca=(dt2-dt1)/86400000;
	}
	
	System.out.println("Diferença de dias= "+diferenca);
	
	}

}
