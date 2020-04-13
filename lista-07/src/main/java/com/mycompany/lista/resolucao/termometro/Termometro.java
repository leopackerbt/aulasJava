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
public class Termometro {
    
    private Integer temperaturaAtual;
    private Integer temperaturaMax;
    private Integer temperaturaMin;
     
    public Termometro() {
        System.out.println("Criando um termometro");
    }
    
    public Termometro(Integer temperaturaAtual, Integer temperaturaMax, Integer temperaturaMin) {
        this();
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public void aumentaTemperatura(Integer valorAumentar) {
        System.out.println("" + temperaturaAtual);
        temperaturaAtual += valorAumentar;
        System.out.println("" + temperaturaAtual);
        
        if (temperaturaAtual > temperaturaMax) {
            temperaturaMax = temperaturaAtual;
        }
    } 
    
    public void diminuiTemperatura(Integer valorDiminuir) {
        temperaturaAtual -= valorDiminuir;
        
        if (temperaturaAtual < temperaturaMin) {
            temperaturaMin = temperaturaAtual;
        }
    }
    
    public void exibeFahreinheit() {
        Double fahreinheit = Double.valueOf(temperaturaAtual);
        fahreinheit = ((fahreinheit * 9) / 5) + 32;
        System.out.println("Temperatura atual em Fahreinheit: " + fahreinheit);
    }
     
    public void exibeDados() {
        System.out.println("Temperatura atual: " + temperaturaAtual);
        System.out.println("Temperatura máxima: " + temperaturaMax);
        System.out.println("Temperatura mínima: " + temperaturaMin);
    }
    
    public Integer getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Integer temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Integer getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Integer temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Integer getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Integer temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }
     
     
}
