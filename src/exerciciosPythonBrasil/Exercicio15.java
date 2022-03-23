package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora: ");
        Double GanhoPorHora = scanner.nextDouble();

        System.out.print("Quantas horas você trabalhou no mes? ");
        Double HorasTrabalhadas = scanner.nextDouble();

        Double onzePorCento = 0.11;
        Double oitoPorCento = 0.08;
        Double cincoPorCento = 0.05;

        Double salarioBruto = GanhoPorHora * HorasTrabalhadas;
        Double impostoDeRenda = salarioBruto * onzePorCento;
        Double inss = salarioBruto * oitoPorCento;
        Double sindicato = salarioBruto * cincoPorCento;
        Double descontos = impostoDeRenda - inss -sindicato;
        Double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salário Bruto: R$"+salarioBruto);
        System.out.println("Imposto de Renda (11%) : R$"+impostoDeRenda);
        System.out.println("INSS (8%) : R$" +inss);
        System.out.println("Sindicato (5%) : R$"+sindicato);
        System.out.print("Salário Líquido: R$"+salarioLiquido);
        scanner.close();
    }}

