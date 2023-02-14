/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.atividade0209;

import java.util.Scanner;

/**
 *
 * @author Cara de tabaco
 */
public class Atividade0209 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Qual seu número limite?\n");
        int numLimite = en.nextInt();

        System.out.println("Qual seu número inicial?\n");
        int numInicial = en.nextInt();

        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");

        if (numLimite <= 0) {
            System.out.println("Número inválido");
        } else {

            while (numInicial < numLimite) {
                if (numInicial % 2 == 0) {
                    System.out.println(numInicial + " é par");
                } else {
                    System.out.println(numInicial + " é impar");
                }
                                    numInicial++;

            }
        }
    }
}
