package com.company.operadores;

import java.util.Scanner;

public class Exercicio05 {
    static final Integer NOTA_MEDIA_DAS_DUAS = 60;
    static final Integer NOTA_MEDIA_PARA_PASSAR = 75;
    static final Integer NOTA_MAXIMA_DE_CADA_MATERIA = 100;
    static final Integer NOTA_MINIMA = 150;
    static final Integer NOTA_MAXIMA_DAS_DUAS = 200;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua nota em Portugues: ");
        double notaPortugues = scanner.nextDouble();
        System.out.print("Digite sua nota em Matematica: ");
        double notaMatematica = scanner.nextDouble();
        Double resultado = notaMatematica + notaPortugues;
        Boolean vocePassouNoLimite = notaMatematica == NOTA_MEDIA_PARA_PASSAR && notaPortugues == NOTA_MEDIA_PARA_PASSAR && resultado <= NOTA_MINIMA;
        Boolean vocePassou = notaMatematica >= NOTA_MEDIA_PARA_PASSAR && notaPortugues >= NOTA_MEDIA_PARA_PASSAR && resultado >= NOTA_MINIMA;
        Boolean voceNaoPassouEmMatematica = notaMatematica < NOTA_MEDIA_DAS_DUAS && notaPortugues > NOTA_MEDIA_DAS_DUAS && resultado <= NOTA_MINIMA;
        Boolean voceNaoPassouEmPortugues = notaMatematica > NOTA_MEDIA_DAS_DUAS && notaPortugues < NOTA_MEDIA_DAS_DUAS && resultado <= NOTA_MINIMA;
        Boolean voceAlcancouOMaximo = notaMatematica == NOTA_MAXIMA_DE_CADA_MATERIA && notaPortugues == NOTA_MAXIMA_DE_CADA_MATERIA && resultado >= NOTA_MAXIMA_DAS_DUAS;
        Boolean voceNaoPassou = notaMatematica < NOTA_MEDIA_PARA_PASSAR && notaPortugues < NOTA_MEDIA_PARA_PASSAR && resultado < NOTA_MINIMA;
        System.out.println("Seu resultado total foi de: " + resultado );
        if (voceNaoPassou){
            System.out.print("Nao foi dessa vez, Voce nao passou!");
        } else if (vocePassouNoLimite){
            System.out.print("Voce passou no limite, Parabens!");
        } else if (voceAlcancouOMaximo) {
            System.out.print("Voce atingiu a nota maxima, Meus Parabens!");
        } else if (voceNaoPassouEmMatematica) {
            System.out.print("Voce passou em Portugues mas reprovou em Matematica, tente novamente!");
        } else if (voceNaoPassouEmPortugues){
            System.out.print("Voce passou em Matematica mas reprovou em Portugues, tente novamente!");
        }else if (vocePassou){
            System.out.print("Voce passou com folga, Parabens!");
        }
        scanner.close();
    }
}
