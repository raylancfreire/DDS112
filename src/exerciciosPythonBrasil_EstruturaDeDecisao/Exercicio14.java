package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota parcial (0 a 10): ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("Digite a segunda nota parcial (0 a 10): ");
        double segundaNota = scanner.nextDouble();
        double somaDeNotas = primeiraNota + segundaNota;
        byte quantidadeDeNotas = 2;
        double media = somaDeNotas / quantidadeDeNotas;
        byte mediaQuatro = 4;
        byte mediaSeis = 6;
        double mediaSeteVirgulaCinco = 7.5;
        byte mediaNove = 9;
        if (media >= mediaNove) {
            System.out.println("Primera nota: " + primeiraNota);
            System.out.println("Segunda nota: " + segundaNota);
            System.out.println("Média: " + media);
            System.out.println("Conceito: A");
            System.out.print("APROVADO");
        } else if (media >= mediaSeteVirgulaCinco) {
            System.out.println("Primera nota: " + primeiraNota);
            System.out.println("Segunda nota: " + segundaNota);
            System.out.println("Média: " + media);
            System.out.println("Conceito: B");
            System.out.print("APROVADO");
        } else if (media >= mediaSeis) {
            System.out.println("Primera nota: " + primeiraNota);
            System.out.println("Segunda nota: " + segundaNota);
            System.out.println("Média: " + media);
            System.out.println("Conceito: C");
            System.out.print("APROVADO");
        } else if (media >= mediaQuatro) {
            System.out.println("Primera nota: " + primeiraNota);
            System.out.println("Segunda nota: " + segundaNota);
            System.out.println("Média: " + media);
            System.out.println("Conceito: D");
            System.out.print("REPROVADO");
        } else {
            System.out.println("Primera nota: " + primeiraNota);
            System.out.println("Segunda nota: " + segundaNota);
            System.out.println("Média: " + media);
            System.out.println("Conceito: E");
            System.out.print("REPROVADO");
        }
    }
}
