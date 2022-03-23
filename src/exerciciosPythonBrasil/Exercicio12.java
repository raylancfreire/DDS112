package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        Double altura = scanner.nextDouble();

        Double pesoIdeal = (72.7 * altura) - 58;

        System.out.print("Seu peso ideal é de: " + pesoIdeal);
        scanner.close();
    }}
