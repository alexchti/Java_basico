import java.util.Scanner;

public class URI1043{
    public static void main(String args[]){
        // entrada(s): A, B e C 
        // saida(s):   "Perimetro = XX.X" (SE TRIANGULO)
        //             "Area = XX.X"      (TRAPEZIO)

        Scanner teclado = new Scanner(System.in);

        Double A = teclado.nextDouble();
        Double B = teclado.nextDouble();
        Double C = teclado.nextDouble();
        
        // DICA do 1043 - para saber se é triangulo ou não, teste todas as 
        // possibilidades de:
        // A soma de 2 lados obrigatoriamente tem que ser maior que o terceiro lado
        if  (((A + B) > C) && 
             ((B + C) > A) &&
             ((C + A) > B)) {
            // SE TRIANGULO
            // calcule o perímetro do triângulo e apresente a mensagem: "Perimetro = XX.X"
            Double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);    
        } else {
            // calcule a área do trapézio que tem A e B como base e C como altura, 
            // mostrando a mensagem: "Area = XX.X"
            Double area = ((A + B) * C)/2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}