package com.company;
import java.util.Scanner;

public class CalculadoraPizza {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da pizza: ");
        Double valor = input.nextDouble();

        System.out.println("Digite o sabor da pizza: ");
        String sabor = input.next();

        System.out.println("Quantidade maxima de pessoas que irão rachar: ");
        Integer quantidadePessoas = input.nextInt();

        System.out.println("Digite o valor maximo que as pessoas pagarão: ");
        Double valorMaximo = input.nextDouble();
        Double valorDividido = (valor / quantidadePessoas);

        if (valor > valorMaximo) {
            System.out.println(String.format("Deu ruim no racha. A pizza deveria custar no máximo %.2f", valorMaximo));
        }
        else {
            System.out.println(String.format("A pizza de sabor %s será dividida entre %d pessoas. R$%.2f p/ cada.",
                    sabor, quantidadePessoas, valorDividido));
        }

    }
}
