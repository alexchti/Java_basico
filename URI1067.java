import java.util.Scanner;

public class URI1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor = 1;
        valor = teclado.nextInt();

        int cont = 1;
        while (cont <= valor) {
            System.out.println(cont);
            cont = cont + 2;
        }
    }
}