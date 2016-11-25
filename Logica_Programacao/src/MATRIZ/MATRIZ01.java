package MATRIZ;

import java.util.Calendar;
public class MATRIZ01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar Hoje=Calendar.getInstance();
		
		int xDia=Hoje.get(Calendar.DAY_OF_WEEK)-1;
		
		String[] diaSemana = new String[7];
		diaSemana[0]="Domingo";
		diaSemana[1]="Segunda";
		diaSemana[2]="Terça";
		diaSemana[3]="Quarta";
		diaSemana[4]="Quinta";
		diaSemana[5]="Sexta";
		diaSemana[6]="Sábado";

		System.out.println("A variável xDia contém o número: "+xDia);
		System.out.println("Hoje é: "+diaSemana[xDia]);
	}
}

