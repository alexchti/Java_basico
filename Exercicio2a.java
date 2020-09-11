import java.util.Scanner; 

 
public class Exercicio2a{ 
    public static void main(String args[]){ 
        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO) 
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão 

 
        int lado, area; 

 
        System.out.println("Por favor, digite o valor do lado do quadrado"); 
        lado = teclado.nextInt(); 
          
        area = lado * lado; 
 

        System.out.println("A area do quadrado vale " + area); 

    } 
} 
