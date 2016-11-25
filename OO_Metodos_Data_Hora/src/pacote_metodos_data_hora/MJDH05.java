package pacote_metodos_data_hora;

import java.io.*;
import java.util.*;
import java.text.*;
@SuppressWarnings("unused")
public class MJDH05 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Calendar data1=Calendar.getInstance();
Calendar data2=Calendar.getInstance();

int dia1, mes1, ano1, hor1, min1;
int dia2, mes2, ano2, hor2, min2;

long dt1, dt2;
double vlrhr, fracao, vlrtot;

String edata1, ehora1;
String edata2, ehora2;

s = new Scanner(System.in);
DecimalFormat df=new DecimalFormat();

System.out.println();

System.out.println("*** Estacionamento 24 horas ***");
System.out.println();
System.out.println();

System.out.print("Entre com a data de entrada [DD/MM/AAAA]...:");
edata1=s.nextLine();

System.out.print("Entre com a hora de entrada [HH:MM]....:");
ehora1=s.nextLine();

System.out.print("Entre com a data de saida [DD/MM/AAAA]..:");
edata2=s.nextLine();		


System.out.print("Entre com a hora de saída [HH:MM]....:");
ehora2=s.nextLine();

System.out.print("Entre com a o valor da hora em reais ....:");
vlrhr=s.nextDouble();
System.out.println();

dia1=Integer.parseInt(edata1.substring(0,2));
mes1=Integer.parseInt(edata1.substring(3,5))-1;
ano1=Integer.parseInt(edata1.substring(6,10));
hor1=Integer.parseInt(edata1.substring(0,2));
min1=Integer.parseInt(edata1.substring(3,5));

data1.set(ano1, mes1, dia1, hor1, min1);

dia2=Integer.parseInt(edata2.substring(0,2));
mes2=Integer.parseInt(edata2.substring(3,5))-1;
ano2=Integer.parseInt(edata2.substring(6,10));
hor2=Integer.parseInt(edata2.substring(0,2));
min2=Integer.parseInt(edata2.substring(3,5));

data2.set(ano2, mes2, dia2, hor2, min2);

dt1=data1.getTimeInMillis();
dt2=data2.getTimeInMillis();

fracao=vlrhr/60;

if(data1.compareTo(data2)>0)
{
	vlrtot=(dt1-dt2)/60000*fracao;
}
else
{
	vlrtot=(dt2-dt1)/60000*fracao;
	
}

df.applyPattern("0.00");
System.out.println("O valor a ser pago = "+df.format(vlrtot));
	}

}
