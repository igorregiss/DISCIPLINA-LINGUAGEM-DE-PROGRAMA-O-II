/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Cara de tabaco
 */
public class Animais {

    public double altura;
    public String sexo;
    public double peso;
    public String nome;

    public void exibirNome() {
        System.out.println("Nome: " + nome);
    }
    public void exibirSexo(){
        System.out.println("Sexo: " + sexo);
    }
    public void exibirPeso(){
        System.out.println("Peso: " + peso + "KG");
    }
    public void exibirAltura(){
        System.out.println("Altura: " + altura + "m");
    }
    
   public void verificaPeso(){
        if(this.peso < 10){
            System.out.println("Animal leve");
        }  else if (this.peso >= 10 && this.peso < 50){
            System.out.println("Animal medio");
        }
        else {
            System.out.println("Animal de grande porte");
        }
    }

}
