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
public class EntradaDeCinema {
    
    private Integer hora;
    private Integer sala;
    private Integer valor;
    private String nome; // nome do filme
    private Double desconto;
    
    public EntradaDeCinema(Integer hora, Integer sala, Integer valor, String nome) {
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.nome = nome;
    }
    
    public void calculaDesconto(Integer idade, Boolean estudante) {
        if (idade < 12) {
            desconto = valor * 0.5; // desconto 50%
        }
        else if (idade <= 15 && estudante) {
            desconto = valor * 0.6; // desconto 40%
        }
        else if (idade <= 20 && estudante) {
            desconto = valor * 0.7; // desconto 30%
        }
        else if (idade > 20 && estudante) {
            desconto = valor * 0.8;
        }
        valor = desconto.intValue();
        System.out.println("Novo valor: R$" + valor);
    }
    
    public void calculaDescontoHorario() {
        if (hora < 16) {
            desconto = valor * 0.9;
            valor = desconto.intValue();
            System.out.println("Novo valor: R$" + valor);
        }
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
