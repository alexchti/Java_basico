import java.util.Scanner;

public class URI1060for{
    public static void main(String args[]){
        int qtdePositivos = 0;
        double valor;

        Scanner teclado = new Scanner(System.in);

        for (int cont=1; cont<=6; cont = cont + 1){
            valor = teclado.nextDouble();
            if (valor > 0) {
                qtdePositivos = qtdePositivos + 1;
            }
        }

        System.out.println(qtdePositivos + " valores positivos");
    }
}