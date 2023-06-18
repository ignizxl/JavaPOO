/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto00;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author João Igor
 */
public class Aluguel implements ImprimeStatus{
    // date format 
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    
    //atributos
    private Quarto quarto;
    private Hospede hospede;
    private LocalDateTime dataDeEntrada;
    private LocalDateTime dataDeSaida;
    
    //construtor
    public Aluguel(Quarto quarto, Hospede hospede, LocalDateTime dataDeEntrada, LocalDateTime dataDeSaida) {
       this.setHospede(hospede);
       this.setQuarto(quarto);
       this.setDataDeEntrada(LocalDateTime.parse(dataDeEntrada + " 12:00 ;", formatter));
       this.setDataDeSaida(LocalDateTime.parse(dataDeSaida + " 12:00 ;", formatter));
    }
    
    //getters e setters
    public Quarto getQuarto() {
        return quarto;
    }
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    public Hospede getHospede() {
        return hospede;
    }
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    public LocalDateTime getDataDeEntrada() {
        return dataDeEntrada;
    }
    public void setDataDeEntrada(LocalDateTime dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
    public LocalDateTime getDataDeSaida() {
        return dataDeSaida;
    }
    public void setDataDeSaida(LocalDateTime dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }
    // método para calcular o total de diárias 
    public int totalDeDiarias() {
        int totalDeDiarias = (int) ChronoUnit.DAYS.between(dataDeEntrada, dataDeSaida);
        return totalDeDiarias;
    }
    // método para calcular o total a pagar 
    public double totalAPagar(){
        double totalAPagar = (this.totalDeDiarias() * this.getQuarto().getValorDaDiaria());
        return totalAPagar;
    }
    // fazendo a sobrescrita do método preview para exibir as informações sobre o aluguel
    @Override
    public void preview(){
        System.out.println("=-= Informações sobre o Aluguel =-=");
        System.out.println("- Nome do Hóspede: " + this.getHospede().getNome());
        System.out.println("- Data/Hora de entrada: " + dataDeEntrada.format(formatter));
        System.out.println("- Data/Hora de saída: " + dataDeSaida.format(formatter));
        System.out.println("- Total de Diárias: " + this.totalDeDiarias());
        System.out.println("- Total a Pagar: " + this.totalAPagar());
    }
}
