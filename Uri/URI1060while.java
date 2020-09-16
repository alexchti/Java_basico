import java.util.Scanner;

public class URI1060while{
    public static void main(String args[]){
        int cont = 1;
        int qtdePositivos = 0;
        double valor;

        Scanner teclado = new Scanner(System.in);

        while (cont<=6){
            valor = teclado.nextDouble();
            if (valor > 0) {
                qtdePositivos = qtdePositivos + 1;
            }
            cont = cont + 1;
        }

        System.out.println(qtdePositivos + " valores positivos");
    }
}