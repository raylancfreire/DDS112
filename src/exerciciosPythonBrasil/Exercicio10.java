package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        Double grausCelsius = scanner.nextDouble();

        Double formulaFahrenheitParaCelsius = (grausCelsius * 1.8) + 32;

        System.out.print("A temperatura em Fahrenheit é de: " + formulaFahrenheitParaCelsius + "°F");
        scanner.close();
    }
}