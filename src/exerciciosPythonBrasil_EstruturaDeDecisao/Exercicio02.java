package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numeroInformado = scanner.nextDouble();
        byte zero = 0;
        boolean oNumeroEPositivo = numeroInformado > zero;

        if (oNumeroEPositivo) {
            System.out.println("O número é " + numeroInformado + " " + "é positivo");
        } else {
            System.out.println("O número é " + numeroInformado + " " + "é negativo");
        }
        scanner.close();
    }
}