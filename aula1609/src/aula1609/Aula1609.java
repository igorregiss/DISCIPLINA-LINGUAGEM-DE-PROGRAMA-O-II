/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1609;

import java.util.Scanner;

/**
 *
 * @author Cara de tabaco
 */
public class Aula1609 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        joao.nome = "Joao";
        joao.peso = 80.5;
        joao.dtNascimento = 1997;
        joao.namorando = true;

        Pessoa maria = new Pessoa();
        maria.nome = "Maria";
        maria.peso = 50.5;
        maria.dtNascimento = 2001;
        maria.namorando = false;

        /* DIVIDIR */
        System.out.println("================================================================================");
        System.out.println("===============================EXIBIR DADOS=====================================");
        System.out.println("================================================================================");
        joao.exibirNome();
        joao.exibirPeso();
        joao.exibirdtNascimento();
        joao.exibirNamorando();
        System.out.println("Idade: " + joao.calcularIdade(joao.dtNascimento));
        joao.verificaNamorando();
        System.out.println("================================================================================");
        maria.exibirNome();
        maria.exibirPeso();
        maria.exibirdtNascimento();
        maria.exibirNamorando();
        System.out.println("Idade: " + maria.calcularIdade(maria.dtNascimento));
        maria.verificaNamorando();
        System.out.println("=====================================================================================");

    }
}
