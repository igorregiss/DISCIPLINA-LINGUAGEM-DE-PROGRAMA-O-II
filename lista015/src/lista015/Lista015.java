/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista015;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Lista015 {
public static void main(String[] args) {

    int lado1, lado2, lado3;
    int opcao = 1;

        Scanner s = new Scanner(System.in);

        System.out.println("Qual o lado 1: \n");
        lado1 = s.nextInt();
        System.out.println("Qual o lado 2: \n");
        lado2 = s.nextInt();
        System.out.println("Qual o lado 3: \n");
        lado3 = s.nextInt();

            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("\nTriangulo Equilatero");
            }
            else if ((lado1 == lado2) || (lado1 == lado3)) {
                System.out.println("\nTriangulo Isosceles");
            }
            else if ( lado2+lado3<lado1 || lado1+lado2>lado3 || lado1+lado2<lado3) {
            System.out.println("\nTriangulo");
            } 
            else{
                System.out.println("\nTriangulo Escaleno");
            }
            }
    }

