/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuatalista;

import java.util.Scanner;

/**
 *
 * @author Cara de tabaco
 */
public class Tabuatalista {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

    int valorUsuario;
    int multiplicador = 0;
    int total = 0;


    Scanner ler = new Scanner(System.in);
    System.out.println("Informe um número: ");
    valorUsuario = ler.nextInt();

    for (int x = 0; x < 10; x++) {
            total = valorUsuario * ++multiplicador;
            System.out.println(valorUsuario + " x " + multiplicador + " = " + total);
        }

    }
    }
    