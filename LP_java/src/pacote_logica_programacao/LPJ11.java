package pacote_logica_programacao;

public class LPJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int diasSemana=7;
float temperatura[]=new float[diasSemana];
temperatura[0]=19.0f;
temperatura[2]=22.0f;
temperatura[3]=23.0f;
temperatura[4]=24.0f;
temperatura[5]=20.0f;
temperatura[6]=23.0f;

float soma=0f;
float media = 0f;

for(int i=0;i<diasSemana;i++){
	soma=soma+temperatura[i];
}

media=soma/diasSemana;
System.out.println("Média da semana: ");
// Quatro digitos ates do ponto decimal e dois após ele
System.out.printf("%4.2f", media);

	}

}
