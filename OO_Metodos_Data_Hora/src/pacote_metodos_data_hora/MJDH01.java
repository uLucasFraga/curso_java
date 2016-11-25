package pacote_metodos_data_hora;

import java.io.*;
import java.util.Calendar;
@SuppressWarnings("unused")
public class MJDH01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar data=Calendar.getInstance();
		int dds=data.get(Calendar.DAY_OF_WEEK);
		int ddm=data.get(Calendar.DAY_OF_MONTH);
		int mes=data.get(Calendar.MONTH);
		int ano=data.get(Calendar.YEAR);

		System.out.println();
		System.out.println("Data do sistema:..."+data.getTime());
		System.out.println("Dia da semana:.....:"+dds);
		System.out.println("Nome do dia:.....:"+ddm);
		
		switch(dds){
		case 1: System.out.println("Domingo"); 			break;
		case 2: System.out.println("Segunda-feira"); 	break;
		case 3: System.out.println("terça-feira"); 		break;
		case 4: System.out.println("quarta-feira"); 	break;
		case 5: System.out.println("quinta-feira"); 	break;
		case 6: System.out.println("sexta-feira"); 		break;
		case 7: System.out.println("sábado"); 			break;
		
		}
		
		System.out.println(dds);

		
		System.out.println("Dia do mês:.....: "+ddm);
		System.out.println("Mês:.....: "+mes);
		System.out.println("Nome do mes:.....:");
		
		switch(mes){
		case 0: System.out.println("Janeiro"); 			break;
		case 1: System.out.println("Fevereiro"); 		break;
		case 2: System.out.println("Março"); 			break;
		case 3: System.out.println("Abril"); 			break;
		case 4: System.out.println("Maio"); 			break;
		case 5: System.out.println("Junho"); 			break;
		case 6: System.out.println("Julho"); 			break;
		case 7: System.out.println("Agosto"); 			break;
		case 8: System.out.println("Setembro"); 		break;
		case 9: System.out.println("Outubro"); 			break;
		case 10: System.out.println("Novembro"); 		break;
		case 11: System.out.println("Dezembro"); 		break;
	
		}
		System.out.println("Número do mes:.....: "+mes);
		
		System.out.println("Ano............: "+ano);

	}

}

