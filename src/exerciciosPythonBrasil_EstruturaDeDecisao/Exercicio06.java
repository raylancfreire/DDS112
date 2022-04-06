package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Digite mais um número: ");
        double terceiroNumero = scanner.nextDouble();
        boolean primeirNumeroMaior = primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero;
        boolean segundoNumeroMaior = segundoNumero > primeiroNumero && segundoNumero > terceiroNumero;
        if (primeirNumeroMaior) {
            System.out.print("O maior número é: " + primeiroNumero);
        }else if(segundoNumeroMaior){
            System.out.print("O maior número é: " + segundoNumero);
        }else{
            System.out.print("O maior número é: " + terceiroNumero);
        }
    }
}