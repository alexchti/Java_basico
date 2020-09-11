import java.util.Scanner;

public class ExemploIfElse{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        Double p1, p2, media;

        System.out.print("Digite a nota da P1: ");
        p1 = teclado.nextDouble();
        System.out.print("Digite a nota da P2: ");
        p2 = teclado.nextDouble();
        
        media = (p1 + p2)/2;

        System.out.println("Sua media eh: " + media);

        if (media >= 6.0){
            System.out.println("Parabens!!! Voce foi aprovado(a)");
        } else{
            System.out.println("Ferrou!!! Estude mais!!!");
        }

        System.out.println("### Fim do Programa ###");
    }
}