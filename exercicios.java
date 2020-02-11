package com.company;

import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Double nota1, nota2, nota3;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota 1");
        nota1 = input.nextDouble();
        System.out.println("Digite a nota 2");
        nota2 = input.nextDouble();
        System.out.println("Digite a nota 3");
        nota3 = input.nextDouble();
        Double media = (nota1 + nota2 + nota3) / 3;

        // String format
        if (media >= 5) {
            System.out.println(String.format("Você foi aprovado, sua média final foi %.2f", media));
        }
        else {
            System.out.println(String.format("Você foi reprovado, sua média final foi %.2f", media));
        }
    }
}
