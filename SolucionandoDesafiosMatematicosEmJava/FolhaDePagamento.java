package Solucionando-Desafios-matematicos-em-Java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int numeroColaborador = entrada.nextInt();
        int numeroHorasTrabalhadas = entrada.nextInt();
        double valorPorHora = entrada.nextDouble();
        double salarioTotal = valorPorHora * numeroHorasTrabalhadas;

        System.out.println("NUMBER = " + numeroColaborador);
        System.out.printf("SALARY = U$ %.2f", salarioTotal);

        entrada.close();
    }

}
