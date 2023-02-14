/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista07;

import java.util.Scanner;

/**
 *
 * @author Igor-PC
 */
public class Lista07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;
        Scanner en = new Scanner(System.in);
        int total = 0;
        int X = 0, Y = 0, Z = 0, S = 0, C = 0;
        while (i < 15) {
            System.out.println("Informe nome:\n");
            String nome = en.next();
            System.out.println("Informe idade:\n");
            int idade = en.nextInt();
            if (idade <= 15) {
                X++;
            } else if (idade >= 16 && idade <= 30) {
                Y++;
            } else if (idade >= 31 && idade <= 45) {
                Z++;
            } else if (idade >= 46 && idade <= 60) {
                S++;
            } else {
                C++;
            }
            i++;
        }
        System.out.println("MEDIA DE IDADE DE 15 ANOS\n" + X + " PESSOAS");
        System.out.println("MEDIA DE IDADE DE 16 A 30 ANOS\n" + Y + " PESSOAS");
        System.out.println("MEDIA DE IDADE DE 31 A 45 ANOS\n" + Z + " PESSOAS");
        System.out.println("MEDIA DE IDADE DE 46 A 60 ANOS\n" + S + " PESSOAS");
        System.out.println("MEDIA DE IDADE DE 60 ANOS ACIMA\n" + C + " PESSOAS");

        double calculo = X / 0.15;
        double calculo2 = C / 0.15;
        System.out.println("PORCENTAGEM DE IDADES NA FAIXA ETARIA DE 15 ANOS:\n"
                + calculo + " PORCENTOS");
        System.out.println("A PORCENTAGEM DE IDADE NA FAIXA ETARIA ACIMA DOS 61 WANOS:\n"
                + calculo2 + " PORCENTOS");
    }

}
