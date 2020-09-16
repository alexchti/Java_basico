import java.util.Scanner;

public class URI1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        
        String resultado;

        int valor;
        valor = teclado.nextInt();

        for (int cont=1; cont<=valor; cont++) {
            valor = teclado.nextInt();
            
            resultado = "";
            // NULL
            if (valor == 0) {
                resultado = "NULL";
            } else {
                // ODD/EVEN
                if (valor % 2 == 0) {
                    resultado = "ODD";
                } else {
                    resultado = "EVEN";
                }

                // POSITIVE/NEGATIVE
                if (valor > 0) {
                    resultado = resultado + " POSITIVE";
                } else {
                    resultado = resultado + " NEGATIVE";
                }
            }
            System.out.println(resultado);
        }
    }
}