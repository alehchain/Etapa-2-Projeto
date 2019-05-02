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

import java.util.Scanner;

public class Principal {
  
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        
        Funcionario.nome = "Alexandre";
        Funcionario.cargo = "Gerente";
        Funcionario.idade = 25;
        Funcionario.idRegistro = 12345;
        
        System.out.println(Funcionario.nome);
        System.out.println(Funcionario.cargo);
        System.out.println(Funcionario.idade);
        System.out.println(Funcionario.idRegistro);
    }
    
  
}
