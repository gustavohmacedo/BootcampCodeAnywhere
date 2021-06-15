package Solucionando-Desafios-matematicos-em-Java;

import java.util.Scanner; // OK

public class CalculoDeViagem {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int tempoGastoEmHoras = leitor.nextInt();
        int velocidadeMedia = leitor.nextInt();
        double result = (tempoGastoEmHoras * velocidadeMedia) / 12.0;

        System.out.printf("%.3f\n", result);

        leitor.close();
    }
}
