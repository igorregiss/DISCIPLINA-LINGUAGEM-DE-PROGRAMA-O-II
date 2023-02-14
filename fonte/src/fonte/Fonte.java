/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fonte;

/**
 *
 * @author Cara de tabaco
 */
public class Fonte {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("JOAO", 'M', "454845545");
        Cliente maria = new Cliente("MARIA", 'F', "4545121", 10);

        System.out.println("=-=-=-=-= DADOS DO CLIENTE =-=-=-=-=");
        System.out.println("NOME:" + maria.getNome());
        System.out.println("NUM FICHA:" + maria.getNumFicha());
        
        System.out.println("=-=-=-=-= DADOS DO CLIENTE =-=-=-=-=");
        System.out.println("NOME:" + joao.getNome());
    
    Funcionario func1 = new Funcionario("Fazer programa", 100, 20, "Victória", 'F', "69");
        System.out.println(func1.calcularSalario());
    }
    
    Professor erlanio = new Professor("LP2", "AIDS", 1000, "ERLANIO", 'F', "123456");
    
}
