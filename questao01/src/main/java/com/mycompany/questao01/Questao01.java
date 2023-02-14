package com.mycompany.questao01;
import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) {
        int diasano = 365;
		int diasmes = 30;
		Scanner en= new Scanner(System.in);
		System.out.println("Conversora de idade em dias");
                System.out.println("Vamos calcular sua idade em dias?");
		System.out.print("Para começar, me informe quantos anos completos você tem: \n");
		int anos= en.nextInt();
		System.out.print("Muito bem! Agora me diga, quantos meses completos você tem: \n");
		int meses = en.nextInt();
		System.out.print("Por último, me dia quantos dias quebrado você tem: \n");
		int dias = en.nextInt();
		dias += (anos * diasano) + (meses * diasmes);
		System.out.println("Já tenho sua idade em dias! \nSua idade em dias é de: " + dias);
    }
}