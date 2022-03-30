package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = teclado.next();
        if (letra.equalsIgnoreCase("A")){
            System.out.println("A letra é uma vogal.");
        }else if(letra.equalsIgnoreCase("E")){
            System.out.println("A letra é uma vogal.");
        }else if(letra.equalsIgnoreCase("I")){
            System.out.println("A letra é uma vogal.");
        }else if(letra.equalsIgnoreCase("O")){
            System.out.println("A letra é uma vogal.");
        }else if(letra.equalsIgnoreCase("U")){
            System.out.println("A letra é uma vogal.");
        }else{
            System.out.println("A letra é uma consoante.");
        }
    }
}
