/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista10;

import java.util.Scanner;

/**
 *
 * @author Cara de tabaco
 */
public class Lista10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;

        Scanner en = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;

        while (i < 10) {

            System.out.println("INSIRA SUA IDADE: zn");
            int idade = en.nextInt();
            System.out.println("INSIRA SEU PESO: \n");
            int peso = en.nextDouble();
            System.out.println("INSIRA SUA IDADE: \n");
            altura = en.nextDouble();
            x += idade;

            if (altura < 1.5) {
                if (peso > 90) {
                    y++;
                }
            }
            if (altura > 1.90) {
                if (idade > 10 && idade < 30) {
                    z++;
                }
            }

            i++;
        }
        double media = x / 10;
        System.out.println("A media do peso das 10 pessoas de: " + media);
        System.out.println("A quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50 Ã©: " + y);
        double porcentagem = y / 0.10;
        System.out.println("A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90  " + porcentagem + "%.");
    }

}
