/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fonte;

/**
 *
 * @author Cara de tabaco
 */
public class Funcionario extends Pessoa {

    public Funcionario(String cargo, double valorHora, int horasTrabalhadas, String nome, char sexo, String cpf) {
        super(nome, sexo, cpf);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    private String cargo;
    private double valorHora;
    private int horasTrabalhadas;



    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }

}
