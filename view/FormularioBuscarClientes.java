/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import DAO.ClienteDao;
import entidades.Cliente;
import model.ClienteListModel;
import java.util.List;

/**
 *
 * @author Gusta
 */
public class FormularioBuscarClientes extends javax.swing.JInternalFrame {

    ClienteDao clienteDao = new ClienteDao();
    ClienteListModel clienteListModel;

    /**
     * Creates new form FormularioBuscarClientes
     */
    public FormularioBuscarClientes() {
        initComponents();
        List<Cliente> lista = clienteDao.listar();
        clienteListModel = new ClienteListModel(lista);
        tabelaClientes.setModel(clienteListModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNome = new javax.swing.JLabel();
        jtBuscarCliente = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jNome.setText("Nome:");

        jtBuscarCliente.setColumns(20);

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data Nascimento", "CPF", "RG", "E-mail", "Telefone", "Rua", "Número", "Bairro", "Cidade", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        btEditar.setText("Editar Cliente");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover Cliente");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar Tabela");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jNome)
                        .addGap(18, 18, 18)
                        .addComponent(jtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)
                        .addGap(71, 71, 71)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btEditar)
                .addGap(18, 18, 18)
                .addComponent(btRemover)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome)
                    .addComponent(jtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar)
                    .addComponent(btAtualizar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btRemover))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        List<Cliente> lista;
        lista = clienteDao.buscarPorNome(jtBuscarCliente.getText());
        clienteListModel = new ClienteListModel(lista);
        tabelaClientes.setModel(clienteListModel);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int indiceTabela = tabelaClientes.getSelectedRow();
        int clienteID = (Integer) clienteListModel.getValueAt(indiceTabela, 0);
        String nome = (String) clienteListModel.getValueAt(indiceTabela, 1);
        String datanasc = (String) clienteListModel.getValueAt(indiceTabela, 2);
        String cpf = (String) clienteListModel.getValueAt(indiceTabela, 3);
        String rg = (String) clienteListModel.getValueAt(indiceTabela, 4);
        String email = (String) clienteListModel.getValueAt(indiceTabela, 5);
        String telefone = (String) clienteListModel.getValueAt(indiceTabela, 6);
        String rua = (String) clienteListModel.getValueAt(indiceTabela, 7);
        String numero = (String) clienteListModel.getValueAt(indiceTabela, 8);
        String bairro = (String) clienteListModel.getValueAt(indiceTabela, 9);
        String cidade = (String) clienteListModel.getValueAt(indiceTabela, 10);
        String estado = (String) clienteListModel.getValueAt(indiceTabela, 11);

        Cliente cliente = new Cliente();
        cliente.setClienteID(clienteID);
        cliente.setNome(nome);
        cliente.setDataNascimento(datanasc);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        cliente.setRua(rua);
        cliente.setNumero(numero);
        cliente.setBairro(bairro);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        cliente.setCpf(cpf);
        cliente.setRg(rg);

        FormularioEditarCliente formCliente = new FormularioEditarCliente(cliente);
        formCliente.setDados(cliente);
        getParent().add(formCliente);
        formCliente.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int indiceTabela = tabelaClientes.getSelectedRow();
        Object idCliente = clienteListModel.getValueAt(indiceTabela, 0);
        clienteDao.remover((Integer) idCliente);
        clienteListModel.removeModel(indiceTabela);
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        List<Cliente> lista = clienteDao.listar();
        clienteListModel = new ClienteListModel(lista);
        tabelaClientes.setModel(clienteListModel);
    }//GEN-LAST:event_btAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel jNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtBuscarCliente;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}