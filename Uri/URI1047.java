import java.util.Scanner;

public class URI1047{
    public static void main(String args[]){
        // entrada(s): horaInicial, minutoInicial, horaFinal, minutoFinal 
        // saida(s):   duracaoJogo

        Scanner teclado = new Scanner(System.in);

        int horaIni = teclado.nextInt();
        int minutoIni = teclado.nextInt();
        int horaFin = teclado.nextInt();
        int minutoFin = teclado.nextInt();

        System.out.println("horaIni =   " + horaIni);
        System.out.println("minutoIni = " + minutoIni);
        System.out.println("horaFin =   " + horaFin);
        System.out.println("minutoFin = " + minutoFin);
        System.out.println("");

        int totalIni = horaIni * 60 + minutoIni;
        int totalFin = horaFin * 60 + minutoFin;

        int total = totalFin - totalIni;
        if (total <= 0) {
            total = total + (60 * 24);
        }
        
        int duracaoHora = total / 60;
        int duracaoMinuto = total % 60;
        
        System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " 
                                           + duracaoMinuto + " MINUTO(S)");
    }
}