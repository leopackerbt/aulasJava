package com.mycompany.lista;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String nome;
	Integer nasc;

	Scanner input = new Scanner(System.in);
    System.out.println("Qual seu nome? ");
    nome = input.next();
    System.out.println("Qual sua data de nascimento? ");
    nasc = input.nextInt();
    System.out.println("Em 2030 você terá " + (2030 - nasc) + " anos");

    }
}
