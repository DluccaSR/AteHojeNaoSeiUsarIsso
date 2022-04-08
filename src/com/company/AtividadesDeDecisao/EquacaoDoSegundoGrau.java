package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class EquacaoDoSegundoGrau {
    static final Integer QUATRO_DA_FORMULA = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Delta = b2 - 4*a*c
                                                 // X = -b +- Raiz De Delta sobre 2.a
    System.out.print("Digite o valor A: ");
    double valorDeA = scanner.nextDouble();
    boolean valorDeAPositivo = valorDeA > 0;

    if (valorDeAPositivo){
        System.out.print("Digite o valor de B: ");
        double valorDeB = scanner.nextDouble();
        double valorDeBAoQuadrado = valorDeB * valorDeB;
        System.out.print("Digite o valor de C: ");
        double valorDeC = scanner.nextDouble();
        double quatroVezesAVezesB = QUATRO_DA_FORMULA * valorDeA * valorDeC;
        double delta = valorDeBAoQuadrado - quatroVezesAVezesB;
        double vvv;



    }
    }
}
