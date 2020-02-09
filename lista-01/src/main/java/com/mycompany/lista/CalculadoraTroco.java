package com.mycompany.lista;
import java.util.Scanner;

public class CalculadoraTroco {

    public static void main(String[] args) {
        Double valorUnit, qtd, valorPago;

        Scanner input = new Scanner(System.in);
        System.out.println("Valor unitário do produto: ");
        valorUnit = input.nextDouble();
        System.out.println("Quantidade vendida: ");
        qtd = input.nextDouble();
        System.out.println("Valor pago pelo cliente: ");
        valorPago = input.nextDouble();
        Double preco = valorUnit * qtd;
        System.out.println("Seu troco será de R$ " + (valorPago - preco));
    }
}
