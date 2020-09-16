import java.util.Scanner;

public class URI1046{
    public static void main(String args[]){
        // entrada(s): horaInicial e horaFinal
        // saida(s):   duracaoJogo

        Scanner teclado = new Scanner(System.in);

        int horaIni = teclado.nextInt();
        int horaFin = teclado.nextInt();

        int duracaoJogo = 0;
        if (horaIni < horaFin) {
            duracaoJogo = horaFin - horaIni;
        } else {
            duracaoJogo = (24 - horaIni) + horaFin;
        }

        System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
    }
}