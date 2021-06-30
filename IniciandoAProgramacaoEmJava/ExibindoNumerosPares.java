package IniciandoAProgramacaoEmJava;

import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= valor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }

        scanner.close();
    }
}
