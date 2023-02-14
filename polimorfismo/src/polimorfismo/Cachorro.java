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
public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String raca, String cor, double tamanho) {
        super(cor, tamanho);
        this.raca = raca;
    }
        public String getRaca(){
        return raca;
    }
        public void latir(){
        System.out.println("AU, AU, AUUUU");
    }
        
    @Override
    public void locomover(){
        System.out.println("O cachorro andou..");
    }
  }
    
    
    
