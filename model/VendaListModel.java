/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidades.Venda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dickc
 */
public class VendaListModel extends AbstractTableModel{
    
    private List <Venda> listaVenda;
    
    private String[] colunas = new String [] {
        "Codigo",
        "Funcionario",
        "Produto",
        "Cliente",
        "Quantidade",
        "ValorVenda",
    };
    
    public VendaListModel(List<Venda> listaVenda) {
        this.listaVenda = listaVenda;
    }

    
    @Override
    public int getRowCount() {
        return listaVenda.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    
     @Override
        public Object getValueAt(int row, int column) {
        Venda venda = listaVenda.get(row);
        switch (column) {
      
            case 0:
                return venda.getFuncionarioID();
            case 1:
                return venda.getProdutoID();
            case 2:
                return venda.getClienteID();
            case 3:
                return venda.getQuantidade();
            case 4:
                return venda.getValorVenda();
            
            default:
                break;
        }
        
        return venda;
    }
   
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public void insertModel(Venda venda) {
        listaVenda.add(venda);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     public void removeModel(int indexRow) {
        listaVenda.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }
     
     public void atualizarModel(int indiceLinha,Venda venda) {
        listaVenda.set(indiceLinha, venda);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
     
     
    
}
