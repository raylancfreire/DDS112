package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double segundaNota = scanner.nextDouble();
        byte quantidadeDeNotas = 2;
        double somaDasNotas = primeiraNota + segundaNota;
        double media = somaDasNotas / quantidadeDeNotas;
        if (media >= 7 && media < 10) {
            System.out.print("Aprovado");
        }else if(media >= 10){
            System.out.print("Aprovado com Distinção.");
        }else{
            System.out.print("Reprovado.");
        }
    }
}