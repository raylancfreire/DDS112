package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu sexo: F - Feminino , M - Masculino: ");
        String sexo = teclado.next();
        if ("F".equalsIgnoreCase(sexo)){
            System.out.println("Sexo Feminino");
        }else if("M".equalsIgnoreCase(sexo)){
            System.out.println("Sexo Masculino");
        }else{
            System.out.println("Sexo Invalido");
        }
    }
}