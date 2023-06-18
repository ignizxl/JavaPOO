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
public class CadastroAluguel {
    //atributo
    private ArrayList<Aluguel> alugueis;
    
    //construtor
    public CadastroAluguel() {
        this.setAlugueis(new ArrayList<Aluguel>());
    }
    
    //get e set 
    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }
    public void setAlugueis(ArrayList<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
    
    //método para adicionar alugueis 
    public void adicionarAlugueis(Aluguel aluguel){
        this.setAlugueis(alugueis);
    }
    
    //método para as informações de todos os alugueis
    public void imprimeAlugueis(){
        for (Aluguel indice : alugueis){
            indice.preview();
        }
    }
}
