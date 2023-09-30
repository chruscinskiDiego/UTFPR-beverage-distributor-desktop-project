/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidades.Fornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dickc
 */
public class FornecedorListModel extends AbstractTableModel {

    private List<Fornecedor> listaFornecedor;

    private String[] colunas = new String[]{"Codigo", "Nome", "Email", "Telefone", "Rua", "Numero", "Bairro", "Cidade", "Estado", "Cnpj"};

    public FornecedorListModel(List<Fornecedor> listaFornecedor) {
        this.listaFornecedor = listaFornecedor;
    }

    @Override
    public int getRowCount() {
        return listaFornecedor.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Fornecedor fornecedor = listaFornecedor.get(row);
        switch (column) {
            case 0:
                return fornecedor.getFornecedorID();
            case 1:
                return fornecedor.getNome();
            case 2:
                return fornecedor.getEmail();
            case 3:
                return fornecedor.getTelefone();
            case 4:
                return fornecedor.getRua();
            case 5:
                return fornecedor.getNumero();
            case 6:
                return fornecedor.getBairro();
            case 7:
                return fornecedor.getCidade();
            case 8:
                return fornecedor.getEstado();
            case 9:
                return fornecedor.getCnpj();

            default:
                break;
        }
        return fornecedor;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Fornecedor fornecedor) {
        listaFornecedor.add(fornecedor);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaFornecedor.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha, Fornecedor fornecedor) {
        listaFornecedor.set(indiceLinha, fornecedor);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }

}
