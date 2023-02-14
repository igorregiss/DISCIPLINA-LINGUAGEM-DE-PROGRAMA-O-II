/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamento;

/**
 *
 * @author Cara de tabaco
 */
public class animal {

    public String nome;
    public String cor;
    private char sexo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void verificaSexo() {
        if (sexo == 'M') {
            System.out.println("Sexo:\nMasculino");
        } else {
            System.out.println("Sexo:\nFeminino");
        }
    }

    public void exibirAnimal() {
        System.out.println("== DADOS DO ANIMAL ==");
        System.out.println("Nome:\n" + this.getNome());
        System.out.println("Cor:\n" + this.getCor());
        verificaSexo();
    }

}
