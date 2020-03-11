package com.mycompany.projeto.cofrinho;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aluno
 */
public class Cofrinho {
    
    Double saldo = 0.0;
    
    void sacar() {
        if ((saldo - 50) >= 0 ){
            saldo -= 50;
        }
    }
    
    void depositar() {
        saldo += 50;
    }
    
    void quebrarCofrinho() {
        saldo = 0.0;
    }
}
