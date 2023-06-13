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
public class Menu {
    //atributo
    private Fita fitas;
    //construtor
    public Menu(Fita fitas) {
        this.fitas = fitas;
    }
    //criando o objeto 'input' para pegar a entrada de dados 
    Scanner input = new Scanner(System.in);
    public void menuDeOpcoes(){
        while (true){
            System.out.println("Menu de opções: ");
            System.out.println("0 - Alugar Fita; ");
            System.out.println("1 - Mostrar Título da Fita; ");
            System.out.println("2 - Mostrar Status da fita alugada; ");
            System.out.println("3 - Calcular aluguel; ");
            System.out.println("4 - Mostrar preço do aluguel/dias; ");
            System.out.println("5 - Encerrar; ");
            System.out.print("Sua opção: ");
            int opcao = input.nextInt();
            
            if (opcao == 0){
                if (this.fitas.isAlugada()){
                    System.out.println("Erro! Essa fita já foi alugada! ");
                } else {
                    this.fitas.setAlugada(true);
                    System.out.print("Digite a quantidade de dias que deseja alugar está fita: ");
                    int dias = input.nextInt();
                    if (dias >= 1){
                        this.fitas.setDiaAlugados(dias);
                        System.out.println("Fita alugada com sucesso!");
                    } else {
                        System.out.println("Erro!");
                    }
                }
            } else if (opcao == 1){
                System.out.println(fitas.getTituloDafita());
            } else if (opcao == 2){
                if (this.fitas.isAlugada()){
                    System.out.println(fitas.toString());
                } else {
                    System.out.println("Erro! Nenhuma fita foi alugada! ");
                }
            } else if (opcao == 3){
                if (this.fitas.isAlugada()){
                    System.out.println("Total a pagar: " + this.calcularAluguel());
                } else {
                    System.out.println("Erro! nenhuma fita foi alugada! ");
                }
            } else if (opcao == 4) {
                    System.out.println("Preço atual: " + this.fitas.getAluguelPorDia());
            } else if (opcao == 5){
                System.out.println("Encerrando ...");
                break;
            } else {
                System.out.println("Opção inválida! Digite novamente.");
            }
        }
    }
    //get e set
    public Fita getFitas() {
        return fitas;
    }
    public void setFitas(Fita fitas) {
        this.fitas = fitas;
    }
    //método calcularAluguel
    public double calcularAluguel(){
        return (this.getFitas().getAluguelPorDia() * this.getFitas().getDiaAlugados());
    }
}
