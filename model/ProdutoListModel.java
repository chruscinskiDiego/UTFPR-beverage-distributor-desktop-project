/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidades.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gusta
 */
public class ProdutoListModel extends AbstractTableModel {
    private List<Produto> listaProduto;
    
    private String[] colunas = new String[]{"Código", "Nome", "Descrição", "Categoria", "Valor de Custo", "Valor de Venda", "Quantidade"};
    
     public ProdutoListModel(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    @Override
    public int getRowCount() {
        return listaProduto.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Produto produto = listaProduto.get(row);
        switch (column) {
            case 0:
                return produto.getProdutoID();
            case 1:
                return produto.getNome();
            case 2:
                return produto.getDescricao();
            case 3:
                return produto.getCategoria();
            case 4:
                return produto.getValorCompra();
            case 5:
                return produto.getValorVenda();
            case 6:
                return produto.getQuantidade();
            
            default:
                break;
        }
        return produto;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Produto produto) {
        listaProduto.add(produto);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaProduto.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha,Produto produto) {
        listaProduto.set(indiceLinha, produto);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
    
    
}
