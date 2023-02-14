/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Cara de tabaco
 */
public class Peixe extends Animal {

    private int qtnadadeiras;

    public Peixe(int qtnadadeiras, String cor, double tamanho) {
        super(cor, tamanho);
        this.qtnadadeiras = qtnadadeiras;
    }

    public int getQtnadadeiras() {
        return qtnadadeiras;
    }

    public void setQtnadadeiras(int qtnadadeiras) {
        this.qtnadadeiras = qtnadadeiras;
    }

    @Override
    public void locomover(){
        System.out.println("O peixe nadou...");
    }
    
}
