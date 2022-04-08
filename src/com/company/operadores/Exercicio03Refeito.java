package com.company.operadores;

import java.util.Scanner;

public class Exercicio03Refeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        System.out.print("Luz: ");
        total += scanner.nextDouble();
        System.out.print("Telefone: ");
        total += scanner.nextDouble();
        System.out.print("Agua: ");
        total += scanner.nextDouble();
        System.out.print("Cartao: ");
        total += scanner.nextDouble();
        System.out.print("Escola: ");
        total += scanner.nextDouble();
        System.out.print("Mercado: ");
        System.out.print("O valor total e de: R$" + total );
    }
}
