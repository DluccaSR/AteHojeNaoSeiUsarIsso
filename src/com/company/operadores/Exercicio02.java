package com.company.operadores;

import java.util.Scanner;

public class Exercicio02 {
    final static Integer FRETE = 15;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preco do produto: ");
        double precoDoProduto = scanner.nextDouble();
        boolean comFrete = precoDoProduto < 100 && precoDoProduto > 99.98;
        boolean semFrete = precoDoProduto >= 100;
        if (comFrete) {
           double precoTotal = precoDoProduto + FRETE;
            System.out.print("O preco total a pagar e de: \n R$" + precoTotal );
        } if (semFrete){
            System.out.print("Voce nao paga frete! O valor total e de: \n R$" + precoDoProduto);
        }
    }
}
