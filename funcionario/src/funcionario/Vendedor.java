/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author Cara de tabaco
 */
public class Vendedor extends Funcionarios {
private String setor;

    public Vendedor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
 public void realizerVenda(){
     System.out.println("realizou uma venda!");
 }
   
}
