package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o raio do circulo: ");
        Double raio = scanner.nextDouble();

        Double pi = 3.14;
        Double area = pi * (raio * raio);

        System.out.print("A area do circulo é: " + area);
        scanner.close();
    }}
