package ContaBancária.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a meta de faturamento anual da empresa: ");
        double metaDeFaturamentoAnual = scanner.nextDouble();
        System.out.print("Informe o faturamento real da empresa no último ano: ");
        double faturamentoReal = scanner.nextDouble();
        System.out.print("Informe a média salarial do funcionário: ");
        double mediaSalarialDoFuncionario = scanner.nextDouble();
        boolean bonusIgualAMediaSalarial = faturamentoReal >= metaDeFaturamentoAnual;
        double oitentaPorCento = 0.8;
        double oitentaPorCentoDaMetaDeFaturamentoAnual = metaDeFaturamentoAnual * oitentaPorCento;
        boolean vaiReceberBonusDeOitentaPorCentoDaMediaSalarial = faturamentoReal < metaDeFaturamentoAnual && faturamentoReal >= oitentaPorCentoDaMetaDeFaturamentoAnual;
        if (bonusIgualAMediaSalarial) {
            System.out.print("Você irá receber um bônus de (100%) no valor de R$" + mediaSalarialDoFuncionario);
        } else if (vaiReceberBonusDeOitentaPorCentoDaMediaSalarial) {
            System.out.print("Você irá receber um bônus de (80%) no valor de R$" + oitentaPorCentoDaMetaDeFaturamentoAnual);
        }
        else
            System.out.print("Não irá receber bônus.");
        scanner.close();
    }
}