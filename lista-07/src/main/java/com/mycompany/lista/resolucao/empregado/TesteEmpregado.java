/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao.empregado;

/**
 *
 * @author Packer
 */
public class TesteEmpregado {
    
    public static void main(String[] args) {
        Empregado e1 = new Empregado("João", "Analista de Sistemas", 5400.00);
        
        e1.reajustarSalario(15);
        e1.getDados();
        
        Empregado e2 = new Empregado("Leonardo", "Desenvolvedor Mobile", 5000.00);
        
        e2.reajustarSalario(10);
        e2.getDados();
        
    }
    
}
