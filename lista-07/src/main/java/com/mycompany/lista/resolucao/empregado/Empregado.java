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
public class Empregado {
    // atributos
    private String nome;
    private String cargo;
    private Double salario;
    
    public Empregado() {
        System.out.println("Criando um Empregado");
    };
    
    public Empregado(String nome) {
       this();
       this.nome = nome;
    }
    
    public Empregado(String nome, String cargo, Double salario) {
        this();
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void reajustarSalario(Integer porcentagem) {
        salario = salario + ((salario * porcentagem) / 100);
        System.out.println("Novo salário: R$" + salario);
    }
    
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void getDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
    }
    
}
