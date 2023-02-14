
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cara de tabaco
 */
public class Aula02092022 {
 
    public static void main(String[] args){
        Scanner en = new Scanner (System.in);
        System.out.println("Informe um nçumero:");
        int num = en.nextInt();
        if (num < 10){
           System.out.println("O número informado foi:" + num +", este numero é maior que 10");
        }
    }
}
