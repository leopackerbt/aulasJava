
package com.mycompany.calculadorajava;


public class ProgramaCalculo {
    public static void main(String[] args) {
       
        Calculadora calculo = new Calculadora();
        
        calculo.a = 4.0;
        calculo.b = 2.0;
        calculo.sum();
        calculo.minus();
        calculo.dividir();
        calculo.multi();
        calculo.status();
        
        
    }
    }

