import java.util.Scanner;

public class URI1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int qtdLinha;
        qtdLinha = teclado.nextInt();

        int contLinha, contNum;
        int numero = 1;

        String linha;

        for(contLinha=1; contLinha<=qtdLinha; contLinha++) {
            linha = "";
            numero = contLinha;
            for(contNum=1; contNum<=3; contNum++) {      
                linha = linha + numero + " ";
                numero = numero * contLinha;  
            }
            System.out.println(linha);
        }
    }
}