package exerciciosPythonBrasil_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do arquivo em MB: ");
        double tamanhoArquivo = scanner.nextDouble();
        System.out.print("Informe a velocidade de download em Mbps: ");
        double velocidadeDeDowload = scanner.nextDouble();
        int transformarSegundosEmMinutos = 60;
        int formulaTempoDeDownload = 8;
        double tempoAproxDeDownloadEmSegundos = tamanhoArquivo / (velocidadeDeDowload / formulaTempoDeDownload);
        double tempoAproxDeDownloadEmMinutos = tempoAproxDeDownloadEmSegundos / transformarSegundosEmMinutos;
        System.out.print("O tempo aproximado de Download é de: " + tempoAproxDeDownloadEmMinutos + " " + "minutos.");
        scanner.close();
    }
}