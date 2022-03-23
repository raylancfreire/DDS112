package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        Double altura = scanner.nextDouble();

        Double pesoIdealHomem = (72.7 * altura) - 58;
        Double pesoIdealMulher = (62.1 * altura) - 44.7;

        System.out.println("HOMEM - Seu peso ideal é de: " + pesoIdealHomem);
        System.out.print("MULHER - Seu peso ideal é de: " + pesoIdealMulher);
        scanner.close();
    }}

