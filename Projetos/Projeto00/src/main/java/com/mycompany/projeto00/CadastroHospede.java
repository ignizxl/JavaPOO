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
public class CadastroHospede {
    //atributo
    private ArrayList<Hospede> hospedes;
    
    //construtor 
    public CadastroHospede() {
        this.setHospedes(new ArrayList<Hospede>());
    }
    
    //get e set 
    public ArrayList<Hospede> getHospedes() {
        return hospedes;
    }
    public void setHospedes(ArrayList<Hospede> hospedes) {
        this.hospedes = hospedes;
    }
    
    //método para adicionar os hospedes 
    public void adicionarHospedes(Hospede hospedes){
        this.hospedes.add(hospedes);
    }
    
    //método para mostrar as informações de todos os hospedes
    public void imprimirHospedes(){
        for (Hospede indice : hospedes){
            indice.preview();
        }
    }
}
