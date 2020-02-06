/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    public static void main (String[] args) {
    Double num1;
    Double num2;
    
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um numero");
    num1 = leitor.nextDouble();
    System.out.println("Digite outro numero");
    num2 = leitor.nextDouble();
    
    System.out.println("Resultado da soma: " + (num1 + num2));
    System.out.println("Resultado da subtração: " + (num1 - num2));
    System.out.println("Resultado da multiplicação: " + (num1 * num2));
    System.out.println("Resultado da divisão: " + (num1 / num2));    
    }
}