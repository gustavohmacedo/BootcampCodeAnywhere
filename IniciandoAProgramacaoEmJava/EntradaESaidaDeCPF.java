package IniciandoAProgramacaoEmJava;

import java.util.Locale;
import java.util.Scanner;

public class EntradaESaidaDeCPF {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner entrada = new Scanner(System.in);
        String[] cpf = new String[4];
        cpf = entrada.nextLine().split("\\.|-");
        System.out.println();

        for (int i = 0; i < cpf.length; i++) {

            System.out.printf("%s\n", cpf[i]);
        }

        entrada.close();
    }
}
