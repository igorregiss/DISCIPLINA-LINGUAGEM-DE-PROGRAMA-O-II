/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista06;

import java.util.Scanner;

/**
 *
 * @author Igor-PC
 */
public class Lista06 {

    public static void main(String[] args) {
    
    Scanner en = new Scanner(System.in);
System.out.println("VALOR INICIAL: ");
int inicio = en.nextInt();

    System.out.println("VALOR FINAL: ");
    int fim = en.nextInt();
        System.out.println("SEU VALOR INICIAL: " + inicio);
        System.out.println("SEU VALOR FINAL: " + fim);
while(inicio<=fim){
if(inicio%11==2){
System.out.println(inicio);
}
inicio ++;
}
    }
    
}
