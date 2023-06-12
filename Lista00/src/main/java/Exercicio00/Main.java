/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio00;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Main {
    public static void main(String[] args) {
        //criando o objeto ler para capturar os dados pelo teclado
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor do 'Lado': ");
        double lado = ler.nextDouble();
        //criando o objeto 'resultado' para testar os métodos 
        Quadrado resultado = new Quadrado(lado);
     
        resultado.imprimir();
    }
}
