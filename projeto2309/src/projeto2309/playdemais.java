/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto2309;

/**
 *
 * @author Cara de tabaco
 */
public class playdemais {

    private String nome;
    private String email;
    private int AnoNascimento;
    private int anos;
    private char sexo;
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setAnoNascimento(int AnoNascimento) {
        this.AnoNascimento = AnoNascimento;
    }

    public int getAnoNascimento() {
        return this.AnoNascimento;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public int getAnos() {
        return this.anos;
    }

    public void verificaSexo() {
        if (sexo == 'M') {
            System.out.println("Sexo:\nMasculino");
        } else {
            System.out.println("Sexo:\nFeminino");
        }
    }

    public int calcularIdade(int AnoNascimento) {
        int idade = 2022 - AnoNascimento;
        return idade;
    }


    public void exibirPessoa() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nome:\n" + this.getNome());
        System.out.println("\nmail:\n" + this.getEmail());
        System.out.println("\nIdade antes:\n" + calcularIdade(AnoNascimento) + "\n");
        verificaSexo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
