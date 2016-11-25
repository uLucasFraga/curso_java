package pacote_vetores_matrizes;

/*
L� 5 nomes e notas de uma turma, 
calcula e exibe a m�dia das notas da turma e em seguida
exibe a rela��o de nomes cuja nota � superior a esta m�dia
 */
import java.util.Scanner;
 
public class M02 { 
    public static void main(String[] args) {
        String[] nomes;
        nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0, media;
        for (int i = 0 ; i <= 4 ; i++){
            System.out.println("Entre com o nome do aluno n� "+(i+1));
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Entre com a nota do aluno n� "+(i+1));
            notas[i] = new Scanner(System.in).nextDouble();
            soma = soma + notas[i];
        }
        media = soma / 5;
        System.out.println("A m�dia dos alunos �: "+ media);
        System.out.println();
        System.out.println("Lista dos alunos cuja nota � superior a m�dia da turma");
        for(int i = 0; i <= 4; i++) {
            if(notas[i] > media)
                System.out.println(nomes[i]);    
        }
    }
}
