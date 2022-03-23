package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora: ");
        Double ganhoPorHora = scanner.nextDouble();
        System.out.print("Quantas horas você trabalhou no mes? ");
        Double horasTrabalhadas = scanner.nextDouble();

        Double salarioMensal = ganhoPorHora * horasTrabalhadas;

        System.out.print("O seu salario nesse mes foi de: R$" + salarioMensal);
        scanner.close();
    }}