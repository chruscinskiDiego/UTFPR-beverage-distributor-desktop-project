/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Gusta
 */
public class Funcionario {
   private int funcionarioID;
   private String nome;
   private String funcao;

    public Funcionario(int funcionarioID, String nome, String funcao) {
        this.funcionarioID = funcionarioID;
        this.nome = nome;
        this.funcao = funcao;
    }

    public Funcionario() {
    }

    public int getFuncionarioID() {
        return funcionarioID;
    }

    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

  
   
   
}
