/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto00;

import java.util.ArrayList;

/**
 *
 * @author João Igor
 */
public class Residencia implements ImprimeStatus{
    //atributos 
    private String rua;
    private int numeroDacasa;
    private String bairro;
    private String cep;
    private String telefone;
    private String email;
    private ArrayList<Quarto> quartos;
    
    //construtor 
    public Residencia(String rua, int numeroDacasa, String bairro, String cep, String telefone, String email) {
        this.setRua(rua);
        this.setNumeroDacasa(numeroDacasa);
        this.setBairro(bairro);
        this.setCep(cep);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setQuartos(new ArrayList<Quarto>());
    }
    
    //get e set 
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumeroDacasa() {
        return numeroDacasa;
    }
    public void setNumeroDacasa(int numeroDacasa) {
        this.numeroDacasa = numeroDacasa;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }
    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
    //fazendo a sobrescrita do método abstrato preview para exibir todas as informações da Residência 
    @Override
    public void preview(){
        System.out.println("=-= Informações da residência: =-=");
        System.out.println("- Rua: " + this.getRua());
        System.out.println("- Número da Casa: " + this.getNumeroDacasa());
        System.out.println("- Bairro: " + this.getBairro());
        System.out.println("- CEP: " + this.getCep());
        System.out.println("- Telefone Fixo: " + this.getTelefone());
        System.out.println("- Email de Contato: " + this.getEmail());
        System.out.println("- Quartos: " + this.getQuartos());
    }
    
    public void adicionarQuarto(Quarto quarto){
        this.quartos.add(quarto);
    }
}
