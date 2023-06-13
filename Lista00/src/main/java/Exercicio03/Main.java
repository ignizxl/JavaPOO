/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Main {
    public static void main(String[] args) {
        //criando o objeto input para pegar a entrada de dados 
        Scanner input = new Scanner(System.in);
        //criando o objeto fitas[] que é um vetor 
        Fita fitas[] = new Fita[2];
        //deixando os títulos e os preços das fitas já predefinidas
        fitas[0] = new Fita("The Godfather", 9.99);
        fitas[1] = new Fita("Scarface", 7.99);
        
        System.out.println("Fitas disponíveis: \n"
                + "0 - The Godfather; \n"
                + "1 - Scarface; \n");
        System.out.printf("Escolha um fita para alugar: \n"
                + "Sua opção: ");
        int opcao = input.nextInt();
        //criando o objeto locado para testar os métodos e chamar um menu de opções para a fita escolhida;
        if (opcao == 0){
            Menu locadora = new Menu(fitas[0]);
            locadora.menuDeOpcoes();
        } else if (opcao == 1){
            Menu locadora = new Menu(fitas[1]);
            locadora.menuDeOpcoes();
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
