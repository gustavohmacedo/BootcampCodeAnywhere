package Solucionando-Desafios-matematicos-em-Java;

import java.util.Scanner; //OK

public class CalcMultiplos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        leitor.close();
    }

}
