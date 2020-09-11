import java.util.Scanner;

public class URI1154{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idade;
        int idadeTotal = 0;
        int contIdade = 0;
        double idadeMedia;

        do {
            idade = teclado.nextInt();
            if (idade >= 0) {
                idadeTotal = idadeTotal + idade;
                contIdade++; 
            }
        } while (idade >= 0);

        idadeMedia = (double)idadeTotal/contIdade;
        System.out.printf("%.2f\n", idadeMedia);
    }
}