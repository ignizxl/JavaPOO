/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto00;

/**
 *
 * @author João Igor
 */
public class Hospede implements ImprimeStatus {
    //atributos 
    private String nome;
    private String cpf;
    private String endereco;
    private String celular;
    private String telefoneFixo;
    private String email;

    //construtor
    public Hospede(String nome, String cpf, String endereco, String celular, String telefoneFixo, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setCelular(celular);
        this.setTelefoneFixo(telefoneFixo);
        this.setEmail(email);
    }
    
    //getters e setters    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getTelefoneFixo() {
        return telefoneFixo;
    }
    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    // fazendo a sobrescrita do método abstrato preview para exibir todas as informações do hospede 
    @Override
    public void preview(){
        System.out.println("=-=- Informações sobre o Hospede =-=-");
        System.out.println("- Nome: " + this.getNome());
        System.out.println("- CPF: " + this.getCpf());
        System.out.println("- Endereço: " + this.getEndereco());
        System.out.println("- Celular " + this.getCelular());
        System.out.println("- Telefone Fixo: " + this.getTelefoneFixo());
        System.out.println("- Email: " + this.getEmail());
    }
}
