
package com.mycompany.calculadorajava;

public class Calculadora {
   
       
    public Double a =0.0 ;
    public Double b =0.0 ;
    public Double soma = 0.0;
    private Double subtrai = 0.0;
    private Double divide = 0.0;
    private Double multiplicacao = 0.0;
    
    
    public void status (){
        System.out.println("Iniciando programa calculadora");
        System.out.println("A soma dos números é " + soma);
        System.out.println("A subtração dos números é " + subtrai);
        System.out.println("A divisão entre os números é " + divide);
        System.out.println("A multiplicação entre os números é " + multiplicacao);
    }
    public void sum(){
       
        soma = a +b;
        
        
    }
    public void minus(){
       
        subtrai = a -b;
    }
    public void dividir(){
       
        divide = a /b;
    }
    public void multi(){
       
        multiplicacao = a *b;
    }

    

    public Double getSoma() {
        return soma;
    }

    public Double getSubtrai() {
        return subtrai;
    }

    public Double getDivide() {
        return divide;
    }

    public Double getMultiplicacao() {
        return multiplicacao;
    }

    
    
}
