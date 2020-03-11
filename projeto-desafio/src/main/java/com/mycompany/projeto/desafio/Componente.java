/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.desafio;

import java.awt.Color;
import java.util.Random;
/**
 *
 * @author Aluno
 */
public class Componente {
    Random gerador = new Random();
    
    Integer valor = 0;
    Color cor = Color.black;
    String status = "";
    
    void aleatorio() {
        valor = gerador.nextInt(101);
    }
    
    void trocarCor() {
        if (valor <= 20) {
            status = "Suave";
            cor = Color.green;
        }
        else if(valor <=70) {
            status = "Atenção";
            cor = Color.orange;
        }
        else {
            status = "Crítico";
            cor = Color.red;
        }
    }
    
}
