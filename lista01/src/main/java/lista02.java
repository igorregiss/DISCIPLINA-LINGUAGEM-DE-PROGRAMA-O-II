import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cara de tabaco
 */
public class lista02 {
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

System.out.println("Entre com o primeiro número");
a = input.nextInt();

System.out.println("Entre com o segundo número");
b = input.nextInt();

System.out.println("Entre com o terceiro número");
c = input.nextInt();

System.out.println("Entre com o quarto número");
d = input.nextInt();

System.out.println("Entre com o quinto número");
e = input.nextInt();

maior = a;
menor = a;

if (b > maior) {
	maior = b ;
	}

if (c > maior) {
	maior = c ;
	}

if (d > maior) {
	maior = d ;
	}

if (e > maior) {
	maior = e ;
	}
 System.out.println("O Menor nº eh " + maior); 

if (b < menor) {
	menor = b ;
	}

if (c < menor) {
	menor = c ;
	}

if (d < menor) {
	menor = d ;
	}

if (e < menor) {
	menor = e ;
	}
 System.out.println("O Menor nº eh " + menor); 

}
}