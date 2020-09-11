import java.util.Scanner;

public class URI1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int qtdPar = 0;
        int qtdImpar = 0;
        int qtdPos = 0;
        int qtdNeg = 0;
        int valor, cont;

        cont = 1;
        while (cont <= 5) {     // 5 tentativas
            valor = teclado.nextInt();
            
            // Contabiliza Par/Impar
            if (valor % 2 == 0) {
                qtdPar++;
            } else {
                qtdImpar++;
            }

            //Contabiliza Positivo/Negativo
            if (valor > 0 ) {
                qtdPos++;
            } 
            else if (valor <0) {
                qtdNeg++;
            }

            cont++;
        }

        System.out.println(qtdPar + " valor(es) par(es)");
        System.out.println(qtdImpar + " valor(es) impar(es)");
        System.out.println(qtdPos + " valor(es) positivo(s)");
        System.out.println(qtdNeg + " valor(es) negativo(s)");       
    }
}