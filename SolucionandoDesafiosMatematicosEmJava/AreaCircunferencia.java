package Solucionando-Desafios-matematicos-em-Java;

import java.util.Locale;
import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();

        double area = 3.14159 * (Math.pow(raio, 2));

        System.out.printf("A=%.4f\n", area);

        scan.close();
    }
}
// OK