/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cara de tabaco
 */
package com.mycompany.newclass;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        int diasano = 365;
		int diasmes = 30;
		Scanner en= new Scanner(System.in);
		
		System.out.println("Informe a sua idade.");
		System.out.print("Anos: ");
		int anos= en.nextInt();
		
		System.out.print("Meses: ");
		int meses = en.nextInt();
		
		System.out.print("Dias: ");
		int dias = en.nextInt();
		
		dias += (anos * diasano) + (meses * diasmes);
		
		System.out.println("\n\nA sua idade em dias é " + dias);
    }
}
