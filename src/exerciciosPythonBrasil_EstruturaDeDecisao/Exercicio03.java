package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INFORME SEU SEXO");
        System.out.print("M para Masculino e F para Feminino, qualquer outra s para indefinido ");
        String letra = scanner.nextLine();
        if (Objects.equals(letra, "M")) {
            System.out.print("Masculino");
        } else if (Objects.equals(letra, "F")) {
            System.out.print("Feminino");
        } else System.out.print("Indefinido");
    }
}