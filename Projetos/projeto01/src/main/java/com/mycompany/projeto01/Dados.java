/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto01;

/**
 *
 * @author João Igor
 */
public class Dados {
    
    //atributos (um vetor de usuarios de tamanho 10 e um contador que inicia valendo 0)
    private Usuario usuarios[] = new Usuario[10];
    private int contadorDeUsuarios = 0;

    //construtor 
    public Dados(){
        //criando um novo usuário e passando os seus dados
        Usuario novoUsuario = new Usuario("joao", "igor", "123", "test", 1);
        //adiciona o novo usuário na posição contador de usuário e incrementa o contador  
        usuarios[contadorDeUsuarios] = novoUsuario;
        contadorDeUsuarios ++;
    }
    //método para validar o usuário
    public boolean validarUsuario(String usuario, String senhaDoUsuario){    
        //boolean auxiliar = false;
        for (int i = 0; i < contadorDeUsuarios; i++){
            //faz a verificação se o id e se a senha do usuário são iguais ao parâmetros passados acima  
            if (usuarios[i].getIdUsuario().equals(usuario) && usuarios[i].getSenha().equals(senhaDoUsuario)){
                return true;
            }
        }
        //return auxiliar;
        return false;
    }
    //método get 
    public Usuario[] getUsuarios() {
        return usuarios;
    }
       
}