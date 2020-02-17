package com.company;
import java.util.Scanner;

public class Sorveteria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Você deseja Casquinha, Sundae ou Milkshake? ");
        String produto = input.next();

        switch(produto) {
            case "Casquinha":
                System.out.println("Valor: R$2,00");
                break;
            case "Sundae":
                System.out.println("Valor: R$5,00");
                break;
            case "Milkshake":
                System.out.println("Valor: R$7,00");
                break;
        }
    }
}
