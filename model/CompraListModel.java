/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidades.Compra;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dickc
 */
public class CompraListModel extends AbstractTableModel {
    
    private List <Compra> listaCompra;
    
    private String[] colunas = new String [] {
        "Codigo",
        "Funcionario",
        "Produto",
        "Fornecedor",
        "Quantidade",
        "ValorCompra",
    };

    public CompraListModel( List<Compra> listaCompra) {
        this.listaCompra = listaCompra;
    }
    
    
    @Override
    public int getRowCount() {
        return listaCompra.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

      @Override
        public Object getValueAt(int row, int column) {
        Compra compra = listaCompra.get(row);
        switch (column) {
         
            case 0:
                return compra.getFuncionarioID();
            case 1:
                return compra.getProdutoID();
            case 2:
                return compra.getFornecedor();
            case 3:
                return compra.getQuantidade();
            case 4:
                return compra.getValorCompra();
            
            default:
                break;
        }
        
        return compra;
    }
        
          @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public void insertModel(Compra compra) {
        listaCompra.add(compra);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     public void removeModel(int indexRow) {
        listaCompra.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }
     
     public void atualizarModel(int indiceLinha,Compra compra) {
        listaCompra.set(indiceLinha, compra);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
     
    
}
