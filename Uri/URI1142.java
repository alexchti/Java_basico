import java.util.Scanner;

public class URI1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        valor = teclado.nextInt();

        int contLinha, contNum; 
        int numero = 1;
        
        String linha;

        for (contLinha=1; contLinha<=valor; contLinha++) {
            linha = "";
            for (contNum=1; contNum<=3; contNum++) {
                linha = linha + numero + " ";
                numero = numero + 1;
            }   
            System.out.println(linha + "PUM");
            numero = numero + 1;
        }
    }
}