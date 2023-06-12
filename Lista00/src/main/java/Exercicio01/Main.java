/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class Main {
    public static void main(String[] args) {
        //criando o objeto 'input' para pegar a entrada de dados 
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do 'Comprimento': ");
        double comprimento = input.nextDouble();
        System.out.print("Digite o valor da 'Largura': ");
        double largura = input.nextDouble();
        //criando o objeto resultado para testar os métodos 
        Retangulo resultado = new Retangulo(comprimento, largura);
        resultado.imprimir();
    }
}
