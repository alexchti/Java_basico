import java.util.Scanner;

// 2.Faça programas Java para calcular:
//
// d. area de um losango, dadas suas diagonais
//    Area = diagonal1 * diagonal2 

public class Exercicio2d{
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        // entradas: diagonal1 e diagonal2
        // saida:    area
        int diagonal1, diagonal2, area;

        System.out.print("Digite as diagonais do losango...: ");
        diagonal1 = teclado.nextInt();
        diagonal2 = teclado.nextInt();

        area = diagonal1 * diagonal2;
        System.out.println("A area do losango eh....................: " + area);
    }
}