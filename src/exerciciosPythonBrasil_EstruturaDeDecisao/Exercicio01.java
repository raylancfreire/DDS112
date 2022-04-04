package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double segundoNumero = scanner.nextDouble();
        boolean maiorNumero = primeiroNumero > segundoNumero;

        if (maiorNumero) {
            System.out.println("O maior número é: " + primeiroNumero);
        } else {
            System.out.println("O maior número é: " + segundoNumero);
        }
        scanner.close();
    }
}