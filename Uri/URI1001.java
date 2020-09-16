// http://www.urionlinejudge.com.br/  => na submissao mudar o nome da classe para Main
import java.util.Scanner;


public class URI1001{
    public static void main(String arqgs[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, X;

        A = teclado.nextInt();
        B = teclado.nextInt();

        X = A + B;
        System.out.println("X = " + X);
    }
}
