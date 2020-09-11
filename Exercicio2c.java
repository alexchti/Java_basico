import java.util.Scanner;

// 2.Faça programas Java para calcular:
//
// c. area de um triangulo, dados sua base e sua altura
//    Area = (base * altura)/2

public class Exercicio2c{
    public static void main(String arqs[]){
        
        Scanner teclado;
        teclado = new Scanner(System.in);

        int base, altura;
        float area;

        System.out.print("Digite a base do triangulo.....: ");
        base = teclado.nextInt();

        System.out.print("Digite a altura do triangulo...: ");
        altura = teclado.nextInt();

        area = (base * altura)/2.0f;
        System.out.println("A area do triangulo eh.........: " + area);
    }
}