package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor minímo de 10 reais e máximo de 600 reais: ");
        int valor = scanner.nextInt();
        byte operadorMatematico = 100;

        int divididoPorCem = valor / operadorMatematico;
        int restoDaDivisaoPorCem = valor % operadorMatematico;
        int qtdNotasDeCem = divididoPorCem - restoDaDivisaoPorCem;

        byte operadorMatematicoCinquenta = 50;
        int divididoPorCinquenta = restoDaDivisaoPorCem / 50;
        int restoDaDivisaoPorCinquenta = restoDaDivisaoPorCem % operadorMatematicoCinquenta;
        int qtdNotasDeCinquenta = divididoPorCinquenta - restoDaDivisaoPorCinquenta;

        System.out.print(" NOTAS DE CEM " + qtdNotasDeCem + " NOTAS DE CINQUENTA " + qtdNotasDeCinquenta);
    }
}