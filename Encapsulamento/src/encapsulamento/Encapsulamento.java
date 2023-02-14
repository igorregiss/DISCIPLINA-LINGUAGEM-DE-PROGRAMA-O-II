/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulamento;

/**
 *
 * @author Cara de tabaco
 */
public class Encapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        animal cachorro = new animal();
        cachorro.setNome("Erlanio");
        cachorro.setCor("Preto");
        cachorro.setSexo('M');
        cachorro.exibirAnimal();
    }
    
}
