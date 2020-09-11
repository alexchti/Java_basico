import java.util.Scanner;

public class URI1064{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        double valor = 0;
        double mediaPositivo = 0; 
        double totalPositivo = 0;
        int qtdePositivo = 0;

        for (int cont=1; cont<=6; cont++){

            valor = teclado.nextDouble();
            if (valor > 0){
                qtdePositivo = qtdePositivo + 1;
                totalPositivo = totalPositivo + valor;
            }
        }
        mediaPositivo = totalPositivo / qtdePositivo;

        System.out.println(qtdePositivo + " valores positivos");
        System.out.printf("%.1f", mediaPositivo);
    }
}