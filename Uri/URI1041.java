import java.util.Scanner;

public class URI1041{
    public static void main(String args[]){
        // extrada(s): x e y
        // saida(s):   quadrante, Origem ou Eixo X ou Y

        Scanner teclado = new Scanner(System.in);

        float x = teclado.nextFloat();
        float y = teclado.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } 
        else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        }
        else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
    }
}