/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio00;

/**
 *
 * @author João Igor
 */
public class Quadrado {
    //atributo
    private double lado;
    //construtor
    public Quadrado(double lado) {
        this.setLado(lado);
    }
    //métodos calcularArea, calcularPerimetro e imprimir.
    public double calcularArea(){
        return (this.getLado() * this.getLado());
    }
    public double calcularPerimetro(){
        return (this.getLado() * 4);
    }
    public void imprimir(){
        System.out.println("-=- Calculando a área e o perímetro de Quadrado; -=- ");
        System.out.println("Valor da área: " + this.calcularArea());
        System.out.println("Valor do perímetro: " + this.calcularPerimetro());
    }
    //get e set
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
}