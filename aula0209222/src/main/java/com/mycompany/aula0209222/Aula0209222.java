/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.aula0209222;

import java.util.Scanner;

/**
 *
 * @author Cara de tabaco
 */
public class Aula0209222 {

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    /**
     *
     * @author Cara de tabaco
     */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        /*    System.out.println("Informe um nçumero:");
        int num = en.nextInt();
        if (num < 10){
           System.out.println("O número informado foi:" + num + ", este numero é maior que 10");
        }else if (num==10){
            System.out.println("Número informado foi: " + num + ", este número é igual a 10" );
        }else{
            System.out.println("O número informado foi: " + num+ ", é maior que 10");
            }
        }
    }
         */

 /*       System.out.println("Qual a sua idade? \n");
        int num = en.nextInt();
        if (num >= 16){
           System.out.println("Parabéns! Você pode exercer seu direito de cidadania!\nVamos lembrar de ser consciente, nada de Capitão Wagner ou Bolsonaro");
        }else{
            System.out.println("Poxa, que pena! Você não pode votar!");
            }
        }
    }
         */
        System.out.println("Informe um dia da semana:");
        int dia = en.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
