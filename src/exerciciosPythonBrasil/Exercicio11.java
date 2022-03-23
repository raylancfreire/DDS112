package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        int primeiroInteiro = scanner.nextInt();

        System.out.print("Informe outro numero inteiro ");
        int segundoInteiro = scanner.nextInt();

        System.out.print("Informe um numero real: ");
        Double numeroReal = scanner.nextDouble();

        Double dobroDoPrimeiro = Double.valueOf(primeiroInteiro * 2);

        Double metadeDoSegundo = Double.valueOf(segundoInteiro / 2);

        Double triploDoPrimeiro = Double.valueOf(primeiroInteiro * 3);

        Double terceiroElevadoAoCubo = numeroReal * numeroReal * numeroReal;

        Double itemA = dobroDoPrimeiro * metadeDoSegundo;

        Double itemB = triploDoPrimeiro + numeroReal;

        Double itemC = terceiroElevadoAoCubo;

        System.out.println("O produto do dobro do primeiro com metade do segundo é de: " + itemA);
        System.out.println("A soma do triplo do primeiro com o terceiro é de: " + itemB);
        System.out.print("O terceiro elevado ao cubo é: " + itemC);

        scanner.close();
    }
}
