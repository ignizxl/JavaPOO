/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto00;

/**
 *
 * @author João Igor
 */
public class Quarto implements ImprimeStatus {
    //atributos 
    private double valorDaDiaria;
    private int numMaxDePessoas;
    private boolean arCondicionado;
    private boolean hidromassagem;
    
    //construtor 
    public Quarto(double valorDaDiaria, int numMaxDePessoas){    
        this.setValorDaDiaria(valorDaDiaria);
        this.setNumMaxDePessoas(numMaxDePessoas);
        this.setArCondicionado(false);
        this.setHidromassagem(false);
    }

    //getters e setters
    public double getValorDaDiaria() {
        return valorDaDiaria;
    }
    public void setValorDaDiaria(double valorDaDiaria) {
        this.valorDaDiaria = valorDaDiaria;
    }
    public int getNumMaxDePessoas() {
        return numMaxDePessoas;
    }
    public void setNumMaxDePessoas(int numMaxDePessoas) {
        this.numMaxDePessoas = numMaxDePessoas;
    }
    public boolean isArCondicionado() {
        return arCondicionado;
    }
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
    public boolean isHidromassagem() {
        return hidromassagem;
    }
    public void setHidromassagem(boolean hidromassagem) {
        this.hidromassagem = hidromassagem;
    }
    //fazendo a sobrescrita do método abstrato preview para exibir todas as informações do Quarto
    @Override
    public void preview(){
        System.out.println("=-= Informaçõoes do Quarto: =-=");
        System.out.println("- Valor da Diária: R$" + this.getValorDaDiaria());
        System.out.println("- Máximo de Pessoas: " + this.getNumMaxDePessoas());
        System.out.println("- Possui Ar-Condicionado: " + this.isArCondicionado());
        System.out.println("- Possui Hidromassagem: " + this.isHidromassagem());
    }
}
