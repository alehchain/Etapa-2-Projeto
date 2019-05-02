/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaPratica;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {

    private String nome; 
    private int idade;
    private double cpf;

    public Pessoa(String nome, int idade, double cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getCpf() {
        return cpf;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
