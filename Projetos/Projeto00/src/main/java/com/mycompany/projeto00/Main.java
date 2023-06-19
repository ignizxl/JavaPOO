/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto00;

/**
 *
 * @author João Igor
 */
public class Main {

    public static void main(String[] args) {
        
        CadastroAluguel cadastrandoAlugueis = new CadastroAluguel();
        CadastroResidencia cadastrandoResidencias = new CadastroResidencia();
        CadastroHospede cadastrandoHospedes = new CadastroHospede();
        
        Quarto quarto00 = new Quarto(299.99, 4);
        Residencia residencia00 = new Residencia("Rua Maria do Carmo", 90 , 
        "Bairro Nobre" ,"240000" , "(83)91234-4322" , "residencia00@gmail.com"); 
        Hospede hospede00 = new Hospede("João", "12345678","Bélem - PB","12347654","76452341","joao@gmail.com");
        Aluguel alugueis00 = new Aluguel(quarto00, hospede00, "04/01/2023 12:12", "09/01/2023 12:23");
        
        cadastrandoHospedes.adicionarHospedes(hospede00);
        residencia00.adicionarQuarto(quarto00);
        cadastrandoResidencias.adicionarResidencias(residencia00);
        cadastrandoAlugueis.adicionarAlugueis(alugueis00);
        System.out.println("Todas as residências.");
        cadastrandoResidencias.imprimeResidencias();
        System.out.println("Todos os hóspedes. ");
        cadastrandoHospedes.imprimirHospedes();
        System.out.println("Todos alugueis:");
       cadastrandoAlugueis.imprimeAlugueis();
    }
}
