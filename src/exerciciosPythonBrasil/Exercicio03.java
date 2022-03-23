package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        Double numero2 = scanner.nextDouble();
        Double somaDosNumeros = numero1 + numero2;

        System.out.print("A soma dos números é: " + somaDosNumeros);
        scanner.close();
    }}
