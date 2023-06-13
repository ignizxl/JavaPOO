/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author João Igor
 */
public class Circulo {
    //atributo 
    private double raio;
    private double pi;
    //construtor 
    public Circulo(double raio) {
        this.setRaio(raio);
        this.setPi(3.141516);
    }
    //get e set 
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    //métodos calcularArea, calcularPerimetro e imprimir
    public double calcularArea(){
        return (this.getPi() * this.getRaio() * this.getRaio());
    } 
    public double calcularPerimetro(){
        return (2 * this.getPi() * this.getRaio());
    }
    public void imprimir(){
        System.out.println("-=- Calculando a área e o perímetro de Circulo; -=- ");
        System.out.println("Valor de 'Pi': " + this.getPi());
        System.out.println("Valor do 'Raio': " + this.getRaio());
        System.out.println("Valor da Área: " + this.calcularArea());
        System.out.println("Valor do Perímetro: " + this.calcularPerimetro());
    }
}
