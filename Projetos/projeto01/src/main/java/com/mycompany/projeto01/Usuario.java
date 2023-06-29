/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto01;

/**
 *
 * @author João Igor
 */
public class Usuario {
    
    //atributos do Usuário
    private String idUsuario, nome, sobrenome, senha;
    private int tipoDePerfil;
    
    //construtor
    public Usuario(String idUsuario, String nome, String sobrenome, String senha, int tipoDePerfil){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.tipoDePerfil = tipoDePerfil;
    }
    
    //getters e setters 
    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getTipoDePerfil() {
        return tipoDePerfil;
    }
    public void setTipoDePerfil(int tipoDePerfil) {
        this.tipoDePerfil = tipoDePerfil;
    }
}
