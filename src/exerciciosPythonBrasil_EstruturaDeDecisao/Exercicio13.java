package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7 e veja seu correspondente nos dias da semana: ");
        double numero = scanner.nextDouble();
        if (numero == 1) {
            System.out.print("1 - Domingo");
        } else if  (numero == 2) {
            System.out.print("2 - Segunda-feira");
        } else if (numero == 3) {
            System.out.print("3 - Terça-feira");
        } else if  (numero == 4) {
            System.out.print("4 - Quarta-feira");
        } else if (numero == 5) {
            System.out.print("5 - Quinta-feira");
        } else if  (numero == 6) {
            System.out.print("6 - Sexta-feira");
        } else if (numero == 7) {
            System.out.print("7 - Sábado");
        } else {
            System.out.print("Valor Inválido!");
        }
    }
}