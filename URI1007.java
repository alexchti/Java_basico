// https://www.urionlinejudge.com.br/judge/pt/problems/view/1007  => na submissao mudar o nome da classe para Main
import java.util.Scanner;


public class URI1007{
    public static void main(String args[]){
        // entrada(s): a, b, c e d 
        // saida(s):   diferenca

        Scanner teclado = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        //DIFERENCA = (A * B - C * D)
        diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca);
    }
}