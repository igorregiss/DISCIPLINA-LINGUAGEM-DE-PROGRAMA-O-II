/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lacosrepeticao;

import java.util.Scanner;

/**
 *
 * @author Cara de tabaco
 */
public class LacosRepeticao {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Informe um númerio maior que 0");
        int numLimite = en.nextInt();

        if (numLimite <= 0) {
            System.out.println("Número inválido");
        } else {
            int numInicial = 0;
            while(numInicial < numLimite){
                System.out.println(numInicial);
            }
         {
                
            }
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lacosrepeticao;

import java.util.Scanner;

/**
 *
 * @author Cara de tabaco
 */
public class LacosRepeticao {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Informe um númerio limite maior que 0");
        int numLimite = en.nextInt();

        System.out.println("Informe um número inicial maior que 0");
        int numInicial = en.nextInt();

        System.out.println("============================");

        if (numLimite <= 0) {
            System.out.println("Número inválido");
        } else {

            while (numInicial < numLimite) {
                System.out.println(numInicial);
                numInicial++;
            }
            {

            }
        }
    }
}
