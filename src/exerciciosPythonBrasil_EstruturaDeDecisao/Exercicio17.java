package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o ano: ");
        int ano = scanner.nextInt();{
        double restoDivisaoPorCem = ano % 100;
        double restoDivisaoPorQuatrocentos = ano % 400;
        double restoDivisaoPorQuatro = ano % 4;
        boolean anoBissexto = restoDivisaoPorCem == 0 && restoDivisaoPorQuatrocentos == 0 && restoDivisaoPorQuatro == 0;
        if (anoBissexto)
            System.out.print("O ano é bissexto");
        else
            System.out.print("O ano não é bissexto");
        }
    }
}