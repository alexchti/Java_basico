// http://www.urionlinejudge.com.br/  => na submissao mudar o nome da classe para Main
import java.util.Scanner;


public class URI1003{
    public static void main(String args[]){
        //entrada(s): a e b
        //saida(s):   soma

        Scanner teclado = new Scanner(System.in);

        int a, b, soma;

        a = teclado.nextInt();
        b = teclado.nextInt();

        soma = a + b;
        System.out.println("SOMA = " + soma);
    }
}