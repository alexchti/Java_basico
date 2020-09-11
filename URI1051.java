import java.util.Scanner;

public class URI1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;

        salario = teclado.nextDouble();
        double impostoF1 = (1000 * 1.08);
        double impostoF2 = (1500 * 1.18);
        double impostoF3 = 0;

        // de R$ 0,00 à R$ 2.000,00     => isento 
        if (salario <= 2000.0) {
            System.out.println("Isento");
        }
        // de R$ 2.000,01 à R$ 3.000,00 => 8%
        else if (salario > 2000.0 && salario <= 3000.0) {
            imposto = (salario - 2000 * 0.08);
            System.out.printf("R$ %.2f\n", imposto);
        }
        // de R$ 3.000,01 à R$ 4.500,00 => 18%
        else if (salario > 3000.0 && salario <= 4500.0) {
            impostoF2 = (salario - 3000 * 0.18);
            imposto = impostoF1 + impostoF2;
            System.out.printf("R$ %.2f\n", imposto);
        }
        // acima de R$ 4.500,01  => 28%
        else {
            impostoF3 = (salario - 4500 * 0.28);
            imposto = impostoF1 + impostoF2 + impostoF3;
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}