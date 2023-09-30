/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Gusta
 */
public class Fornecedor {
   private int fornecedorID;
   private String nome;
   private String email;
   private String telefone;
   private String rua;
   private String numero;
   private String bairro;
   private String cidade;
   private String estado;
   private String cnpj;

    public Fornecedor(int fornecedorID, String nome, String email, String telefone, String rua, String numero, String bairro, String cidade, String estado, String cnpj) {
        this.fornecedorID = fornecedorID;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cnpj = cnpj;
    }

    public Fornecedor() {
       
    }

    public int getFornecedorID() {
        return fornecedorID;
    }

    public void setFornecedorID(int fornecedorID) {
        this.fornecedorID = fornecedorID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   
}