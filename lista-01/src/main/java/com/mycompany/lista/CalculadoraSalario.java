package com.mycompany.lista;
import java.util.Scanner;

public class CalculadoraSalario {

    public static void main(String[] args) {
        Double salario, imposto, salarioLiq;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        salario = input.nextDouble();
        System.out.println("Porcentagem de imposto: ");
        imposto = input.nextDouble();
        salarioLiq = salario - ((salario * imposto) / 100);
        System.out.println("Seu salário líquido é de " + salarioLiq);

    }
}
