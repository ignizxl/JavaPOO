/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto01;

import form.FormLogin;

/**
 *
 * @author João Igor
 */
public class Projeto01 {

    public static void main(String[] args) {
        //criando o objeto validarDados
        Dados validarDados = new Dados();
        
        //criando o objeto dela de login
        FormLogin telaDeLogin = new FormLogin();
        
        //puxando o método set
        telaDeLogin.setValidarDados(validarDados);
        
        //deixando a tela de login visível e centralizando 
        telaDeLogin.setLocationRelativeTo(null);
        telaDeLogin.setVisible(true);
        
    }
}
