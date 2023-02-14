/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista01;
import java.util.Scanner;
/**
 *
 * @author Igor-PC
 */
public class Lista01 {

        
        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author Cara de tabaco
 */

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Qual primero número?\n");
        int x = en.nextInt();

        System.out.println("Qual segundo número?\n");
        int y = en.nextInt();

        System.out.println("Qual terceiro?\n");
        int z = en.nextInt();
        
if( ( x > y && x > z ) && ( y > z ) ) { //  x > y > z
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
}
else if( ( x > y && x > z ) && ( z > y ) ) { // x > z > y
    System.out.println(x);
    System.out.println(z);
    System.out.println(y);
}
else if( ( y > x && y > z ) && ( x > z ) ) { 
    System.out.println(y);
    System.out.println(x);
    System.out.println(z);
}
else if( ( y > x && y > z ) && ( z > x ) ) { // y > z > x
    System.out.println(y);
    System.out.println(z);
    System.out.println(x);
}
else if( ( z > x && z > y ) && ( x > y ) ) { // z > x > y
    System.out.println(z);
    System.out.println(x);
    System.out.println(y);
}
else if( ( z > x && z > y ) && ( y > x ) ) { // z > y > x
    System.out.println(z);
    System.out.println(y);
    System.out.println(x);
}

            }
        }

        
  
