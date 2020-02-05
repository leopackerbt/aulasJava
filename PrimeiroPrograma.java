
package com.mycompany.primeiro.programa;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */

public class PrimeiroPrograma {
    
    // void = sem retorno
    public static void main (String[] args) {
        String nome, turma;
        Integer num1, num2, soma;
        Double nota, notaCont = 7.5;
        
        System.out.print("Boa noite\n");
        System.out.println("Tudo bem?");
        
        // usamos o new toda vez que criamos um objeto em uma classe
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        nome = leitor.nextLine();
        System.out.println("Como vai, " + nome + "?");
        
        System.out.println("Digite um numero");
        num1 = leitor.nextInt();
        System.out.println("Digite outro numero");
        num2 = leitor.nextInt();
        soma = num1 + num2;
        System.out.println("A soma é " + soma);
        
        System.out.println("A multiplicação é " + (num1*num2));
        // println é uma string, por isso concatena com um int
        //System.out.println("O numero digitado é " + num1);
        
        System.out.println("Digite a sua nota");
        nota = leitor.nextDouble();
        System.out.println("Digite a sua nota da continuada");
        notaCont = leitor.nextDouble();
        System.out.println("Sua média é " + ((nota + notaCont) / 2));
        
        System.out.println("Digite a sua turma");
        turma = leitor.next();
    }
    
}
