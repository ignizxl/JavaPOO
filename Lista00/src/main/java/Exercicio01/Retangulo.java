/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author João Igor
 */
public class Retangulo {
    //atributos
    private double comprimento;
    private double largura;
    
    //construtor
    public Retangulo(double comprimento, double largura) {
        this.setComprimento(comprimento);
        this.setLargura(largura);
    }
    
    //get e set 
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    //métodos calcularArea, calcularPerimetro e imprimir 
    public double calcularArea(){
        return (this.getComprimento() * this.getLargura());
    }
    public double calcularPerimetro(){
        return ((this.getComprimento() * 2) + (this.getLargura() * 2));
    }
    public void imprimir(){
        System.out.println("Valor do 'Comprimento': " + this.getComprimento());
        System.out.println("Valor da 'Largura': " + this.getLargura());
        System.out.println("Valor da Área: " + this.calcularArea());
        System.out.println("Valor do Perímetro: " + this.calcularPerimetro());
    }
}
