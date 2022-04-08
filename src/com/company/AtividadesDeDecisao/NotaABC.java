package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class NotaABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();
        double somaDeNotas = nota1 + nota2;
        byte fatorDivisor = 2;
        double resultado = somaDeNotas / fatorDivisor;
        System.out.println("Sua media total foi de: " + resultado );
        Boolean resultadoA = resultado > 9;
        Boolean resultadoB = resultado > 7.5 && resultado < 9;
        Boolean resultadoC = resultado > 6 && resultado < 7.5;
        Boolean resultadoD = resultado > 4 && resultado < 6;
        Boolean resultadoE = resultado < 4;
        if (resultadoA) {
            System.out.print("Voce recebeu um A Parabens!\n APROVADO");
        }
         else if (resultadoB) {
            System.out.print("Voce recebeu um B Parabens! \n APROVADO");
        }
         else if (resultadoC) {
            System.out.print("Voce recebeu um C Reprovado!");
        }
         else if (resultadoD) {
            System.out.print("Voce recebeu um D Reprovado!");
        }
         else if (resultadoE) {
            System.out.print("Voce recebeu um E Reprovado!");
        }
    }
}

