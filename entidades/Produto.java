/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Gusta
 */
public class Produto {
   private int produtoID;
   private String nome;
   private String descricao;
   private String categoria;
   private double valorCompra;
   private double valorVenda;
   private int quantidade;

    public Produto(int produtoID, String nome, String descricao, String categoria, double valorCompra, double valorVenda, int quantidade) {
        this.produtoID = produtoID;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.quantidade = quantidade; 
    }

    public Produto() {
    }

    public int getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(int produtoID) {
        this.produtoID = produtoID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}