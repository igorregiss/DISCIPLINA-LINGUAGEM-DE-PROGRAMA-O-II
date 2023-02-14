/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Aluno
 */
public class Ave extends Animal {
    private double tamanhoBico;

    public Ave(double tamanhoBico, String cor, double tamanho) {
        super(cor, tamanho);
        this.tamanhoBico = tamanhoBico;
    }

    public double getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(double tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }
    
    @Override
    public void locomover(){
        System.out.println("A ave VOou..");
    }
    
    
    
}
