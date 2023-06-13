/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Main {
    public static void main(String[] args) {
        //criando o objeto 'input' para pegar a entrada de dados 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do 'Raio': ");
        double raio = input.nextDouble();
        //criando o objeto resultado para testar os métodos 
        Circulo resultado = new Circulo(raio);
        resultado.imprimir();
    }
}
