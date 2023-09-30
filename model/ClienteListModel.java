/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entidades.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gusta
 */
public class ClienteListModel extends AbstractTableModel {

    private List<Cliente> listaCliente;

    private String[] colunas = new String[]{"Código", "Nome", "Data Nascimento", "CPF", "RG", "E-mail", "Telefone", "Rua", "Número", "Bairro", "Cidade", "Estado"};

    public ClienteListModel(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    @Override
    public int getRowCount() {
        return listaCliente.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Cliente cliente = listaCliente.get(row);
        switch (column) {
            case 0:
                return cliente.getClienteID();
            case 1:
                return cliente.getNome();
            case 2:
                return cliente.getDataNascimento();
            case 3:
                return cliente.getCpf();
            case 4:
                return cliente.getRg();
            case 5:
                return cliente.getEmail();
            case 6:
                return cliente.getTelefone();
            case 7:
                return cliente.getRua();
            case 8:
                return cliente.getNumero();
            case 9:
                return cliente.getBairro();
            case 10:
                return cliente.getCidade();
            case 11:
                return cliente.getEstado();
            default:
                break;
        }
        return cliente;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Cliente cliente) {
        listaCliente.add(cliente);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaCliente.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha, Cliente cliente) {
        listaCliente.set(indiceLinha, cliente);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }

}
