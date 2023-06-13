/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**
 *
 * @author João Igor
 */
public class Fita {
    //atributos
    private String tituloDafita;
    private int diasAlugados;
    private double aluguelPorDia;
    private boolean alugada;
    //construtor
    public Fita(String tituloDafita, double aluguelPorDia) {
        this.setTituloDafita(tituloDafita);
        this.setDiaAlugados(0);
        this.setAluguelPorDia(aluguelPorDia);
        this.setAlugada(false);
    }
    //get e set 
    public String getTituloDafita() {
        return tituloDafita;
    }
    public void setTituloDafita(String tituloDafita) {
        this.tituloDafita = tituloDafita;
    }
    public int getDiaAlugados() {
        return diasAlugados;
    }
    public void setDiaAlugados(int diasAlugados) {
        this.diasAlugados = diasAlugados;
    }
    public double getAluguelPorDia() {
        return aluguelPorDia;
    }
    public void setAluguelPorDia(double aluguelPorDia) {
        this.aluguelPorDia = aluguelPorDia;
    }
    public boolean isAlugada() {
        return alugada;
    }
    public void setAlugada(boolean alugada) {
        this.alugada = alugada;
    }
    //fazendo a sobrescrita do método toString 
    @Override
    public String toString() {
        return "Fita{" + "\n Título Da Fita: " + tituloDafita + "\n Quantidade de dias alugados: " + diasAlugados + "\n Aluguel por Dia: " + aluguelPorDia + "\n Está alugada? : " + alugada + '}';
    }
}
