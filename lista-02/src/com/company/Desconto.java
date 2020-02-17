package com.company;
import java.util.Scanner;

public class Desconto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto escolhido: ");
        Double valor = input.nextDouble();

        System.out.println("Digite o código de desconto: ");
        Integer codigo = input.nextInt();

        System.out.println(String.format("Valor do produto sem desconto: %.2f", valor));

        switch (codigo) {
            case 1:
                System.out.println("Valor do produto com desconto: " + (valor * 0.95));
                break;
            case 2:
                System.out.println("Valor do produto com desconto: " + (valor * 0.90));
                break;
            case 3:
                System.out.println("Valor do produto com desconto: " + (valor * 0.80));
                break;
            case 4:
                System.out.println("Valor do produto com desconto: " + (valor * 0.50));
                break;
            default:
                System.out.println("Código inválido");
        }
    }
}
