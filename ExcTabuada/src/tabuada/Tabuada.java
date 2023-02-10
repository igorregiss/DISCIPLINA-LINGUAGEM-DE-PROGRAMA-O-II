/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;
import java.util.Scanner;
/**
 *
 * @author Cara de tabaco
 */
public class Tabuada {
public static void main(String args[]) {

    int A;
    do {
        Scanner tab = new Scanner(System.in);
        System.out.println("Informar um número (0(zero) para finalizar):");

        A = tab.nextInt();
        if (A != 0) {
            int mult = 0;
            while (mult < 10) {
                mult++;
                System.out.println(A + " * " + mult + "  = " + (A * mult));
            }
        }
    } while (A != 0);

} 
}
