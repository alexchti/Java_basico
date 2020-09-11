import java.util.Scanner;

// 2.Faça programas Java para calcular:
//
// b. area de um retangulo, dados sua base e sua altura
//    Area = base * altura 

public class Exercicio2b{
    public static void main(String args[]){
        
        Scanner teclado;
        teclado = new Scanner(System.in);

        int base, altura, area;
        
        System.out.print("Digite a base do retangulo...: ");
        base = teclado.nextInt(); 
        
        System.out.print("Digite a altura do retangulo.: ");
        altura = teclado.nextInt();

        area = base * altura;
        System.out.println("A area do retangulo eh.........: " + area);
    }
}