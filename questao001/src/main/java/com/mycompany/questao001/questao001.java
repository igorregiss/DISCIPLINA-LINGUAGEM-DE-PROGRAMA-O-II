/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao001;

import java.util.Scanner;

public class questao001 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor = 1;
        double valorMaior = 0;
        double valorMenor = 0;
        for(;valor!=0;) {
            System.out.println("Digite os valores (0 para parar):");
            valor = input.nextDouble();
            if(valor > valorMaior && valor!=0) {
                valorMaior = valor;

            }
            if(valor < valorMenor && valor!=0) {
                valorMenor = valor;
            }   
        }
        System.out.println("Maior valor: "+ valorMaior);
        System.out.println("Menor valor: "+ valorMenor);

    }

}