package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de um lado do triângulo: ");
        double primeiroLado = scanner.nextDouble();
        System.out.print("Informe o valor de outro lado do triângulo: ");
        double segundoLado = scanner.nextDouble();
        System.out.print("Informe o valor do outro lado do triângulo: ");
        double terceiroLado = scanner.nextDouble();

        if (primeiroLado == segundoLado && primeiroLado == terceiroLado && segundoLado == terceiroLado) {
            System.out.print("O triângulo informado é Equilátero");
        } else if (primeiroLado == segundoLado) {
            System.out.print("O triângulo informado é Isósceles");
        } else if (primeiroLado == terceiroLado) {
            System.out.print("O triângulo informado é Isósceles");
        } else if (segundoLado == terceiroLado) {
            System.out.print("O triângulo informado é Isósceles");
        } else {
            System.out.print("O triângulo informado é Escaleno");
        }
    }
}