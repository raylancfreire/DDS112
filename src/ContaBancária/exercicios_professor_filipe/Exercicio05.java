package ContaBancária.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Informe a quantidade de tempo que você contribuiu com a previdência: ");
        int tempoContribuido = scanner.nextInt();
        boolean podeAposentar = idade >= 55 && tempoContribuido >= 25;
        if (podeAposentar)
            System.out.print("Você pode se aposentar!");
        else
            System.out.print("Você não pode se aposentar!");
        scanner.close();
    }
}