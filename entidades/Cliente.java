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
public class Cliente {
   private int clienteID;
   private String nome;
   private String dataNascimento;
   private String email;
   private String telefone;
   private String rua;
   private String numero;
   private String bairro;
   private String cidade;
   private String estado;
   private String cpf;
   private String rg;

    public Cliente(int clienteID, String nome, String dataNascimento, String email, String telefone, String rua, String numero, String bairro, String cidade, String estado, String cpf, String rg) {
        this.clienteID = clienteID;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cpf = cpf;
        this.rg = rg;
    }

    

    public Cliente(){
        
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    @Override
    public String toString() {
        return "Cliente ["
                + "ID=" + getClienteID()
                + ", Nome=" + getNome()
                + ", Data de Nascimento=" + getDataNascimento()
                + ", Email=" + getEmail()
                + ", Telefone=" + getTelefone()
                + ", Rua=" + getRua()
                + ", Número=" + getNumero()
                + ", Bairro=" + getBairro()
                + ", Cidade=" + getCidade()
                + ", Estado=" + getEstado()
                + ", CPF=" + getCpf()
                + ", RG=" + getRg()
                + "]";
    }
}