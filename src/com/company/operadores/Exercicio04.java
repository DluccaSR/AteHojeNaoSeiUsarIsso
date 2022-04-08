package com.company.operadores;

import java.util.Scanner;

public class Exercicio04 {
    static final Integer IDADE_PARA_APOSENTAR = 55;
    static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua sua Idade: ");
        byte suaIdade = scanner.nextByte();
        System.out.print("Digite quanto tempo contribuiu: ");
        byte tempoDeContribuicao = scanner.nextByte();
        int oqueFaltaParaAposentar = IDADE_PARA_APOSENTAR - suaIdade;
        int contribuirMais = TEMPO_MINIMO_DE_CONTRIBUICAO - tempoDeContribuicao;
        Boolean podeAposentar = suaIdade > IDADE_PARA_APOSENTAR && tempoDeContribuicao > TEMPO_MINIMO_DE_CONTRIBUICAO;
        Boolean naoPodeAposentar = suaIdade <= IDADE_PARA_APOSENTAR && tempoDeContribuicao <= TEMPO_MINIMO_DE_CONTRIBUICAO;
        Boolean naoAposentaPelaIdade = suaIdade <= IDADE_PARA_APOSENTAR && tempoDeContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
        Boolean naoAposentaPeloTempo = suaIdade >= IDADE_PARA_APOSENTAR && tempoDeContribuicao <= TEMPO_MINIMO_DE_CONTRIBUICAO;
        if (podeAposentar) {
            System.out.println("Viva, voce pode aposentar.");
        } else if (naoPodeAposentar) {
            System.out.println("Voce nao pode aposentar ainda.");
        } else if (naoAposentaPelaIdade) {
            System.out.print("Voce nao pode aposentar ainda, trabalhe mais: " + oqueFaltaParaAposentar + " anos");
        } else if (naoAposentaPeloTempo) {
            System.out.print("Voce precisa contribuir mais um pouco, trabalhe mais: " + contribuirMais + " anos");
        }
    }
}

