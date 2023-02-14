/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fonte;

/**
 *
 * @author
 */
public class Professor extends Pessoa {

    private String disciplina;
    private String cursoGraduacao;
    private double salario;

    public Professor(String disciplina, String cursoGraduacao, double salario, String nome, char sexo, String cpf) {
        super(nome, sexo, cpf);
        this.disciplina = disciplina;
        this.cursoGraduacao = cursoGraduacao;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
       public String getCursoGraduacao() {
        return cursoGraduacao;
    }

    public void setCursoGraduacao(String cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }
       public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
