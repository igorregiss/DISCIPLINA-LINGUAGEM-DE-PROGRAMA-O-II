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
public class Polimorfismo {

    public static void main(String[] args) {
        Animal al = new Animal ("Azul", 10.0);
        al.locomover();
        Cachorro cl = new Cachorro("Vira-lata", "preto", 10);
        cl.locomover();
        Cobra veronica = new Cobra(true, "Rosa", 1.4);
        veronica.locomover();
        Peixe pi = new Peixe(4, "branco", 30);
        pi.locomover();
        
        Ave avel = new Ave(5,"branca",10);
        avel.locomover();
    }
    
}
