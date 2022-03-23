package exerciciosPythonBrasil;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do arquivo em MB: ");
        Double tamanhoArquivo = scanner.nextDouble();
        System.out.print("Informe a velocidade de dowload em Mbps: ");
        Double velocidadeDeDowload = scanner.nextDouble();

        Double tempoAproxDeDownloadEmSegundos = tamanhoArquivo / (velocidadeDeDowload / 8);
        Double tempoAproxDeDownloadEmMinutos = tempoAproxDeDownloadEmSegundos / 60;

        System.out.print("O tempo aproximado de Download é de: " + tempoAproxDeDownloadEmMinutos + " " + "minutos.");

        scanner.close();//
    }}
