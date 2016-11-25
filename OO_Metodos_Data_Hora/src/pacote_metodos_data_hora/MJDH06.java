package pacote_metodos_data_hora;

import java.util.*;
import java.text.*;
import javax.swing.*;

public class MJDH06 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	Date data=new Date();
	SimpleDateFormat fmtData=new SimpleDateFormat("dd/MM/yyyy");
	fmtData.setLenient(false);
	
	while(true)
		try
	{
			String st="Informw uma data(dd/mm/aaaa)";
			st=JOptionPane.showInputDialog(null,st);
			
			if(st==null)break;
			
			data=fmtData.parse(st);
			st="Data formatada: "+fmtData.format(data);
			JOptionPane.showMessageDialog(null,st,"Mensagem",1);
			
	} catch(ParseException ex)
	{
		String st="Data inválida!";
		JOptionPane.showMessageDialog(null,st,"Erro",0);
	}
		System.exit(0);
	}

}

