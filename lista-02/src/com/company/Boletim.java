package com.company;
import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        Double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        Double nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        Double nota3 = input.nextDouble();

        Double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Passou direto");
        }
        else if (media >= 5) {
            System.out.println("Tem direito a fazer uma prova de recuperação");
        }
        else {
            System.out.println("Reprovado direto");
        }
    }
}
