package com.company.operadores;

import java.util.Scanner;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double numero = scanner.nextDouble();
        numero = numero + 5;
        System.out.println("numero + 5: " + numero);
        numero += 5;
        System.out.println("numero += 5: " + numero);
        numero += 5;
        System.out.println("numero -= 5: " + numero);
        numero += 5;
        System.out.println("numero *= 5: " + numero);
        numero += 5;
        System.out.println("numero /= 5: " + numero);
        numero += 5;
        System.out.println("numero %= 4: " + numero);
    }

}

