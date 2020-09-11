import java.util.Scanner;

public class URI1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int qtdPar = 0;
        
        for (int cont = 1; cont <= 5; cont++) {       
            valor = teclado.nextInt();
            if (valor % 2 == 0) {
                qtdPar++;
            }
        }

        System.out.println(qtdPar + " valores pares");
    }
}