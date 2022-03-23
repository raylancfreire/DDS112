package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota bimestral: ");
        Double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota bimestral: ");
        Double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota bimestral: ");
        Double nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota bimestral: ");
        Double nota4 = scanner.nextDouble();
        Double somaDeNotas = nota1 + nota2 + nota3 + nota4;
        int quantidadeDeNotas = 4;
        Double media = somaDeNotas / quantidadeDeNotas;
        System.out.print("A média é: " + media);
        scanner.close();
    }}
