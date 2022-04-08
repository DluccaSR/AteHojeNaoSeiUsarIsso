package com.company.operadores;

import java.util.Scanner;

public class Exercicio01 {
    final static Integer ADICAO = 1;
    final static Integer SUBTRACAO = 2;
    final static Integer MULPLICACAO = 3;
    final static Integer DIVISOR = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu primeiro numero: ");
        double numeroUm = scanner.nextDouble();
        System.out.println("Digite a operaçao que sera feita: " + "\n [1 - Adiçao] \n [2 - Subtraçao]" + "\n [3 - Multiplicaçao] \n [4 - Divisao]");
        Integer operador = scanner.nextInt();
        System.out.print("Digite seu segundo numero: ");
        double numeroDois = scanner.nextDouble();
        Boolean eAdicao = operador.equals(ADICAO);
        Boolean eSubtracao = operador.equals(SUBTRACAO);
        Boolean eMultiplicacao = operador.equals(MULPLICACAO);
        Boolean eDivisao = operador.equals(DIVISOR);

        if (operador != 1 && operador != 2 && operador != 3 && operador != 4) {
            System.out.print("Operador Aritimetico invalido");
        }
        if (eAdicao) {
            double adicao = numeroUm + numeroDois;
            System.out.print("O resultado é: " + adicao);
        } else if (eSubtracao) {
            double subtracao = numeroUm - numeroDois;
            System.out.print("O resultado é: " + subtracao);
        } else if (eMultiplicacao) {
            double multiplicacao = numeroUm * numeroDois;
            System.out.print("O resultado é: " + multiplicacao);
        } else if (eDivisao) {
            double divisao = numeroUm / numeroDois;
            System.out.print("O resultado é: " + divisao);
        }
        scanner.close();
    }
}