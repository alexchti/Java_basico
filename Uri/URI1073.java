import java.util.Scanner;

public class URI1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        valor = teclado.nextInt();

        if (valor % 2 != 0) {
            valor = valor - 1;
        }

        int cont = 2;
        while (cont <= valor) {
            System.out.println(cont + "^2 = " + cont*2);

            cont = cont + 2;
        }
    }
}