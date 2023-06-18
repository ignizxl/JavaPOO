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
public class CadastroResidencia {
    //atributo
    private ArrayList<Residencia> residencias;
    
    //construtor 
    public CadastroResidencia() {
        this.setResidencias(new ArrayList<Residencia>());
    }
    
    //get e set 
    public ArrayList<Residencia> getResidencias() {
        return residencias;
    }
    public void setResidencias(ArrayList<Residencia> residencias) {
        this.residencias = residencias;
    }
    public void adicionarResidencias(Residencia residencias){
        this.residencias.add(residencias);
    }
    
    //método para mostrar as informações de cada residência 
    public void imprimeResidencias(){
        for (Residencia indice : residencias){
            indice.preview();
        }
    }
}
