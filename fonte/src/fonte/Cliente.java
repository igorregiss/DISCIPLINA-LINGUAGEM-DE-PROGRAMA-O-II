/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fonte;

/**
 *
 * @author Cara de tabaco
 */
public class Cliente extends Pessoa {

    private double totalCompra;
    private int numFicha;

    public Cliente(String nome, char sexo, String cpf, int numFicha) {
        super(nome, sexo, cpf);
        this.numFicha = numFicha;
    }
    
    public int getNumFicha() {
        return numFicha;
    }

    public void setNumFicha(int numFicha) {
        this.numFicha = numFicha;
    }
    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    
    
}


    
