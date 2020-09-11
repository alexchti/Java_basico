// https://www.urionlinejudge.com.br/judge/pt/problems/view/1006  => na submissao mudar o nome da classe para Main
import java.util.Scanner;


public class URI1006{
    public static void main(String args[]){
        // entrada(s): a, b e c
        // saida(s):   media

        Scanner teclado = new Scanner(System.in);

        double a, b, c, media;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        // sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
        media = ((a * 2) + (b * 3) + (c * 5))/10f;

        System.out.printf("MEDIA = %.1f \n", media);
    }
}