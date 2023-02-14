/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista012;

import java.util.Scanner;

/**
 *
 * @author Cara de tabaco
 */
public class Lista012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);	

int a;
int b;
int c;
int d;
int e;
int maior;
int menor;

Scanner input = new Scanner( System.in );

System.out.println("Qual o primeiro numero? \n");
a = input.nextInt();

System.out.println("Qual o segundo numero? \n");
b = input.nextInt();

System.out.println("Qual o terceiro numero? \n");
c = input.nextInt();

maior = a;
menor = a;

if (b > maior) {
	maior = b ;
	}

if (c > maior) {
	maior = c ;
	}

 System.out.println("\nO maior numero: " + maior); 

if (b < menor) {
	menor = b ;
	}

if (c < menor) {
	menor = c ;
	}
 System.out.println("O menor numero: " + menor); 

}
}
 
    
