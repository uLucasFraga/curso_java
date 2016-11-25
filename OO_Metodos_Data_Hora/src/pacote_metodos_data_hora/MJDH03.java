package pacote_metodos_data_hora;

import java.io.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.DecimalFormat;

@SuppressWarnings("unused")
public class MJDH03 {

	public static void main(String[] args) {
	Calendar data=Calendar.getInstance();
	DecimalFormat df=new DecimalFormat();
	
	int dia=data.get(Calendar.DAY_OF_MONTH);
	int mes=data.get(Calendar.MONTH);
	int ano=data.get(Calendar.YEAR);

	String datatexto;
	
	df.applyPattern("00");
	
	datatexto=df.format(dia)+"/"+df.format(mes)+"/"+ano;
	System.out.println("Data de hoje = "+datatexto);
	}
}