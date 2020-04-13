/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao.termometro;

/**
 *
 * @author Packer
 */
public class TesteTermometro {
    
    public static void main(String[] args) {
        
        Termometro t1 = new Termometro(35, 41, 26);
        
        t1.aumentaTemperatura(10);
        
        t1.exibeDados();
        
        t1.diminuiTemperatura(20);
        
        t1.exibeDados();
    }
}
