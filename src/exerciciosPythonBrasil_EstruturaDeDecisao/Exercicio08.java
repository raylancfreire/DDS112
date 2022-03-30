package exerciciosPythonBrasil_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o preço de um produto: ");
        double primeiroProduto = scanner.nextDouble();
        System.out.print("Informe o preço de outro produto: ");
        double segundoProduto = scanner.nextDouble();
        System.out.print("Informe o preço de mais um produto: ");
        double terceiroProduto = scanner.nextDouble();
        if (primeiroProduto < segundoProduto && primeiroProduto < terceiroProduto) {
            System.out.print("O menor número é: " + primeiroProduto);
        }else if(segundoProduto < primeiroProduto && segundoProduto < terceiroProduto){
            System.out.print("O menor número é: " + segundoProduto);
        }else{
            System.out.print("O menor número é: " + terceiroProduto);
        }
    }
}