package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do lado de um quadrado: ");
        Double lado = scanner.nextDouble();

        Double area = lado * lado;
        int dobro = 2;
        Double dobroDaArea = area * dobro;

        System.out.print("O dobro da área do quadrado é: " + dobroDaArea);
        scanner.close();
    }}