package com.mycompany.lista;
import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {
        Double limitePeso, pesoOne, pesoTwo, pesoThree;
        Integer limitePessoas;

        Scanner input = new Scanner(System.in);
        System.out.println("Qual o limite do peso do elevador? ");
        limitePeso = input.nextDouble();
        System.out.println("Qual o limite de pessoas? ");
        limitePessoas = input.nextInt();
        System.out.println("Peso da primeira pessoa no elevador ");
        pesoOne = input.nextDouble();
        System.out.println("Peso da segunda pessoa no elevador ");
        pesoTwo = input.nextDouble();
        System.out.println("Peso da terceira pessoa no elevador ");
        pesoThree = input.nextDouble();

        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas
                           + " pessoas. O peso total no elevador é de " + (pesoOne + pesoTwo + pesoThree)
                           + " , sendo que ele suporta " + limitePeso);

    }
}
