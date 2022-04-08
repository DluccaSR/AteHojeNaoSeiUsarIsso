package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class TresLadosDeUmTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho de um lado do triangulo: ");
        double primeiroLado = scanner.nextDouble();
        System.out.print("Digite o tamanho do segundo lado do triangulo: ");
        double segundoLado = scanner.nextDouble();
        System.out.print("Digite o tamanho do terceiro lado do triangulo: ");
        double terceiroLado = scanner.nextDouble();

        Boolean equilatero = primeiroLado == segundoLado && primeiroLado == terceiroLado && segundoLado == terceiroLado;
        Boolean isoseles = (primeiroLado == segundoLado) || primeiroLado == terceiroLado;
        Boolean escaleno = primeiroLado != segundoLado && primeiroLado != terceiroLado && segundoLado != terceiroLado;

        if (equilatero){
            System.out.print("seu triangulo é equilatero"); // TrêS LADOS IGUAIs
        } else if (escaleno){
            System.out.print("seu triangulo é escaleno"); // Dois LADOS IGUAIS
        } else if (isoseles){
            System.out.print("seu triangulo é isoseles"); // Todos LADOS DIFERENTES
        }
    }
}
