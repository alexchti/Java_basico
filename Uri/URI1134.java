import java.util.Scanner;

public class URI1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int opcao;
        int qtdAlcool = 0;
        int qtdGas = 0;
        int qtdDiesel = 0;

        do {
            opcao = teclado.nextInt();
            switch(opcao){
                case 1:
                    qtdAlcool++;
                    break;
                case 2:
                    qtdGas++;
                    break;
                case 3:
                    qtdDiesel++;
                    break;
                default:
                    break;
            }
        } while (opcao != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + qtdAlcool);
        System.out.println("Gasolina: " + qtdGas);
        System.out.println("Diesel: " + qtdDiesel);
    }
}