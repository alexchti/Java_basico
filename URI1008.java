// https://www.urionlinejudge.com.br/judge/pt/problems/view/1008 => na submissao mudar o nome da classe para Main
import java.util.Scanner;


public class URI1008{
    public static void main(String args[]){
        // entrada(s):  horasTrabalhadas e valorHora 
        // saida(s):    salario
       
        Scanner teclado = new Scanner(System.in);
        
        int numeroFuncionario, horasTrabalhadas; 
        double valorHora, salario;

        numeroFuncionario = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorHora = teclado.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}