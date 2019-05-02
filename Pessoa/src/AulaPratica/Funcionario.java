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
public class Funcionario extends Pessoa{
    
    String cargo; 
    private int idRegistro;

    public Funcionario(String nome, int idade, double cpf) {
        super(nome, idade, cpf);
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdRegistro() {
        return idRegistro;
    }
   
    
      
}
