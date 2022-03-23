package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        Double grausFahrenheit = scanner.nextDouble();

        Double formulaCelsiusParaFahrenheit = 5 * ((grausFahrenheit - 32) / 9);

        System.out.print("A temperatura em Celsius é de: " + formulaCelsiusParaFahrenheit + "°C");
        scanner.close();
    }
}