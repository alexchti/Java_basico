import java.util.Scanner;

public class URI1038{
    public static void main(String args[]){
        // entrada(s): codItem e qtdItem
        // saida(s):   Valor total

        Scanner teclado = new Scanner(System.in);

        int codItem = teclado.nextInt();
        int qtdItem = teclado.nextInt();
         
        Double valorTotal = 0.00;

        if (codItem == 1) {
            valorTotal = qtdItem * 4.00;
        }
        else if (codItem == 2) {
            valorTotal = qtdItem * 4.50;
        }
        else if (codItem == 3) {
            valorTotal = qtdItem * 5.00;
        }
        else if (codItem == 4) {
            valorTotal = qtdItem * 2.00;
        }
        else if (codItem == 5) {
            valorTotal = qtdItem * 1.50;
        }
        System.out.printf("Total: R$ %.2f\n",valorTotal);
    }
}