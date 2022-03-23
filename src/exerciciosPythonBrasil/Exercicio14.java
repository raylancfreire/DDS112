package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o peso de peixes: ");
        Double pesoDePeixes = scanner.nextDouble();

        Double excesso = pesoDePeixes - 50;
        Double multa = excesso * 4;

        System.out.println("Peso de peixes: " + pesoDePeixes + "kg");
        System.out.println("Excesso de peixes: " + excesso + "kg");
        System.out.print("Multa a ser paga: R$"+ multa);
        scanner.close();
    }}
