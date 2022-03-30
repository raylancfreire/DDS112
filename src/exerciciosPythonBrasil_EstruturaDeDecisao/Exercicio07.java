package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Digite mais um número: ");
        double terceiroNumero = scanner.nextDouble();
        if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
            System.out.print("O menor número é: " + primeiroNumero);
        }else if(segundoNumero < primeiroNumero && segundoNumero < terceiroNumero){
            System.out.print("O menor número é: " + segundoNumero);
        }else{
            System.out.print("O menor número é: " + terceiroNumero);
        }
    }
}