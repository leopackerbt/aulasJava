package com.company;

import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Estruturas de repetição

        // While
        Integer cont = 1, numero;

        while (cont <= 6) {
            System.out.println("Boa noite! cont=" + cont);
            cont++;
        }
        System.out.println("cont=" + cont);

        // For
        for (Integer i = 1; i <= 6; i=i+2) {
            System.out.println("i= " + i);
        }

        // Do while
        cont = 5;
        do {
            System.out.println("cont=" + cont);
            cont--;
        } while (cont >= 0);

        // Validação do numero com DO WHILE
        do {
            System.out.println("Digite um valor positivo");
            numero = leitor.nextInt();
        } while (numero < 0);

        // Exemplo de validação só usando WHILE
        System.out.println("Digite um numero positivo: ");
        numero = leitor.nextInt();

        while (numero < 0) {
            System.out.println("Numero invalido!");
            numero = leitor.nextInt();
        }
    }
}
