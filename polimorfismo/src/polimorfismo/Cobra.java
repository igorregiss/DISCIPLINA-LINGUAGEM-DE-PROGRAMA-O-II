/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Cara de tabaco
 */
public class Cobra extends Animal {
    private boolean venenosa;

    public Cobra (boolean venenosa, String cor, double tamanho) {
        super(cor, tamanho);
        this.venenosa = venenosa;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    @Override
    public void locomover() {
        System.out.println("A cobra rastejou...");
    }
}
    
