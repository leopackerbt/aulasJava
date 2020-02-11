package com.company;

import java.util.Random;
import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {

        Integer idade, numero, valorDado, chute, diaSemana, lugar;
        String nomeFacul;
        Random numeroAleatorio = new Random();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Já pode dar grau de moto");
        }
        else {
            System.out.println("Só pode dar grau de bicicleta");
        }
        System.out.println("Digite um numero inteiro");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par");
        }
        else {
            System.out.println("O numero " + numero + " é impar");
        }
        System.out.println("Digite o nome da sua faculdade");
        nomeFacul = input.next();

        if (nomeFacul.equals("Bandtec")) {
            System.out.println("teste");
        }
        else {
            System.out.println("errado");
        }

        // simulação de um jogo de dados
        valorDado = numeroAleatorio.nextInt(6) + 1;
        System.out.println("Tente acertar o valor do dado");
        chute = input.nextInt();
        if (valorDado.equals(chute)) {
            System.out.println("Parabéns! Você acertou!");
        }
        else {
            System.out.println("Não foi dessa vez!");
        }

        System.out.println("O valor do dado é " + valorDado);

        System.out.println("\nDigite um numero de 1 a 7");
        diaSemana = input.nextInt();

        switch (diaSemana) {
            case 1: System.out.println("Domingo");
                    break;
            case 2: System.out.println("Segunda-feira");
                    break;
            case 3: System.out.println("Terça-feira");
                    break;
            case 4: System.out.println("Quarta-feira");
                    break;
            case 5: System.out.println("Quinta-feira");
                    break;
            case 6: System.out.println("Sexta-feira");
                    break;
            case 7: System.out.println("Sábado");
                    break;
            default: System.out.println("Numero invalido");
                    break;
        }

        System.out.println("Digite o lugar da posição: " +
                           "\n1o lugar: iPhone, iPad e iPod" +
                           "\n2o lugar: iPad e iPod" +
                           "\n3o lugar: iPod");

        lugar = input.nextInt();

        System.out.print("Você ganhou");
        switch (lugar) {
            case 1: System.out.print(" um iPhone,");
            case 2: System.out.print(" um iPad e");
            case 3: System.out.println(" um iPod.");
                break;
            default: System.out.println(" nada.");
                break;
        }
    }
}
