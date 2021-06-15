package Solucionando-Desafios-matematicos-em-Java;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        /*
          Desafio Análise de Números: 

          Você deve fazer a leitura de 5 valores inteiros.
          Em seguida mostre quantos valores informados são pares, quantos valores
          informados são ímpares, quantos valores informados são positivos e quantos
          valores informados são negativos.
         */
        Scanner leitor = new Scanner(System.in);

        int valores[] = new int[5];
        int valorePares = 0;
        int valoresImpares = 0;
        int valoresPositivos = 0;
        int valoresNegativos = 0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = leitor.nextInt();

            if (valores[i] >= 1) {
                valoresPositivos++;
            }

            if (valores[i] < 0) {
                valoresNegativos++;

            }

            if (valores[i] % 2 == 0) {
                valorePares++;

            } else if (valores[i] % 2 != 0) {
                valoresImpares++;

            }

        }

        System.out.println(valorePares + " valor(es) par(es)");
        System.out.println(valoresImpares + " valor(es) impar(es)");
        System.out.println(valoresPositivos + " valor(es) positivo(s)");
        System.out.println(valoresNegativos + " valor(es) negativo(s)");

        leitor.close();
    }

}
