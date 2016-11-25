package pacote_metodos_data_hora;

import java.util.*;
import java.text.*;

import javax.swing.*;

public class MJDH07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Date hora=new Date();
		SimpleDateFormat fmtHora=new SimpleDateFormat("HH:mm");
		fmtHora.setLenient(false);
		
		while(true)
			try
		{
				String st="Informe umv horário(Exemplo: 23:30)";
				st=JOptionPane.showInputDialog(null,st);
				
				if(st==null)break;
				
				hora=fmtHora.parse(st);
				st="Horário formatado: "+fmtHora.format(hora);
				JOptionPane.showMessageDialog(null,st,"Mensagem",1);
				
		} catch(ParseException ex)
		{
			String st="Horário inválido!";
			JOptionPane.showMessageDialog(null,st,"Erro",0);
		}
			System.exit(0);
		}

	

	}