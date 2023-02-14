/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1609;

/**
 *
 * @author Cara de tabaco
 */
public class Pessoa {

    public String nome;
    public int dtNascimento;
    public double peso;
    public boolean namorando;

    public void exibirNome() {
        System.out.println("Nome: " + nome);
    }

    public void exibirdtNascimento() {
        System.out.println("Data de Nascimento: " + dtNascimento);
    }

    public void exibirPeso() {
        System.out.println("Peso: " + peso);
    }

    public void exibirNamorando() {
        System.out.println("Namorando: " + namorando);
    }

    public int calcularIdade(int dtNascimento) {
        int idade = 2022 - dtNascimento;
        return idade;
    }

    public void verificaNamorando(){
        if(this.namorando){
            System.out.println(this.nome + " esta namorando");
        }   else{
            System.out.println(this.nome + " nao esta namorando");
        }
    }
}