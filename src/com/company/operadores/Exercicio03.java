package com.company.operadores;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a conta de luz: ");
         double contasDeLuz = scanner.nextDouble();
        System.out.print("Digite a conta de agua: ");
        double contaDeAgua = scanner.nextDouble();
        System.out.print("Digite a conta de telfone: ");
        double contaDeTelelfone = scanner.nextDouble();
        System.out.print("Digite a conta da escola: ");
        double escolaDoFilho = scanner.nextDouble();
        System.out.print("Digite os gastos com mercado: ");
        double gastosDeMercado = scanner.nextDouble();
        double resultado = contaDeAgua += contaDeTelelfone;
        double resultado1 = contaDeAgua += contasDeLuz;
        double resultado2 = contaDeAgua += escolaDoFilho;
        double resultado3 = contaDeAgua += gastosDeMercado;
        System.out.println("Seu gasto e de: R$" + resultado3 );
    }
}
