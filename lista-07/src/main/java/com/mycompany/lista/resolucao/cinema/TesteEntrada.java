/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.resolucao.cinema;

/**
 *
 * @author Packer
 */
public class TesteEntrada {
    
    public static void main(String[] args) {
        
        EntradaDeCinema entrada = new EntradaDeCinema(13, 2, 100, "Venom");
        
        entrada.calculaDesconto(16, true);
        
        entrada.calculaDescontoHorario();
    }
}
