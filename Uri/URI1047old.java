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

        int duracaoHora = 0;
        if (horaIni < horaFin) {
            duracaoHora = horaFin - horaIni;
        } else {
            duracaoHora = (24 - horaIni) + horaFin;
        }
        System.out.println("horaIni =     " + horaIni);
        System.out.println("horaFin =     " + horaFin);
        System.out.println("duracaoHora = " + duracaoHora);

        int duracaoMinuto = 0;
        if (horaIni == horaFin) {
            if (minutoIni == minutoFin) {
                duracaoMinuto = 0;
            }
            else if (minutoIni < minutoFin) {
                duracaoMinuto = minutoFin - minutoIni;
            } else {
                duracaoMinuto = (60 - minutoIni) + minutoFin;
            }
        } else {
            if (minutoIni < minutoFin) {
                duracaoMinuto = minutoFin - minutoIni;
            } else {
                duracaoMinuto = (60 - minutoIni) + minutoFin;
            }
        }

        System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " 
                                           + duracaoMinuto + " MINUTO(S)");

    }
}