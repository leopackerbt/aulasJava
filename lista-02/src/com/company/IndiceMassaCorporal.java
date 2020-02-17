package com.company;
import java.util.Scanner;

public class IndiceMassaCorporal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        Double altura = input.nextDouble();

        System.out.println("Digite seu peso: ");
        Double peso = input.nextDouble();

        Double imc = (peso / (altura * altura));

        System.out.println("Seu sexo: ");
        String sexo = input.next();

        if (sexo.equals("homem")) {
            if (imc >= 31.1) {
                System.out.println("Obeso");
            }
            else if (imc >= 27.8) {
                System.out.println("Acima do peso ideal");
            }
            else if (imc >= 26.4) {
                System.out.println("Marginalmente acima do peso");
            }
            else if (imc >= 20.7) {
                System.out.println("No peso normal");
            }
            else {
                System.out.println("Abaixo do peso");
            }
        }
        else if (sexo.equals("mulher")) {
            if (imc >= 32.3) {
                System.out.println("Obesa");
            }
            else if (imc >= 27.3) {
                System.out.println("Acima do peso ideal");
            }
            else if (imc >= 25.8) {
                System.out.println("Marginalmente acima do peso");
            }
            else if (imc >= 19.1) {
                System.out.println("No peso normal");
            }
            else {
                System.out.println("Abaixo do peso");
            }
        }
    }
}
