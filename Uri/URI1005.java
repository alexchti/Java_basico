// http://www.urionlinejudge.com.br/  => na submissao mudar o nome da classe para Main
import java.util.Scanner;


public class URI1005{
    public static void main(String args[]){
        //entrada(s): a e b
        //saida(s):   media

        Scanner teclado = new Scanner(System.in);

        double a, b, media;
        a = teclado.nextDouble();
        b = teclado.nextDouble();

        // sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). 
        media = ((a * 3.5) + (b * 7.5))/11;
        
        // Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
        System.out.printf("MEDIA = %.5f\n",media);
    }
}