/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidades.Funcionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dickc
 */
public class FuncionarioListModel extends AbstractTableModel {
    
    private List <Funcionario> listaFuncionario;
    
    private String[] colunas = new String[] {
            "Codigo",
            "Nome",
            "Funcao"
            };
    
    public FuncionarioListModel (List <Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    @Override
    public int getRowCount() {
        return listaFuncionario.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

   @Override
  public Object getValueAt(int row, int column) {
        Funcionario funcionario = listaFuncionario.get(row);
        switch (column) {
            case 0:
                return funcionario.getFuncionarioID();
            case 1:
                return funcionario.getNome();
            case 2:
                return funcionario.getFuncao();
            default:
                break;
        }
        return funcionario;
    }   
  
   @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public void insertModel(Funcionario funcionario) {
        listaFuncionario.add(funcionario);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     public void removeModel(int indexRow) {
        listaFuncionario.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }
     
     public void atualizarModel(int indiceLinha,Funcionario funcionario) {
        listaFuncionario.set(indiceLinha, funcionario);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }
     
}
