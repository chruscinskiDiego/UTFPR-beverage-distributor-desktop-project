/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import DAO.ClienteDao;
import entidades.Cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Gusta
 */
public class FormularioCliente extends javax.swing.JInternalFrame {
    ClienteDao clienteDao = new ClienteDao();
    Cliente cliente;
    /**
     * Creates new form TelaCadastroCliente
     */
    public FormularioCliente() {
        initComponents();
    }
    
    public FormularioCliente(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jCDataNasc = new javax.swing.JLabel();
        jCCpf = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jCRg = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        jCRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jCNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jCEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jCCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jCBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jCEndereco = new javax.swing.JLabel();
        jCDadosPessoais = new javax.swing.JLabel();
        jCadastrarCliente = new javax.swing.JButton();
        jCTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jCEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDtNasc = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Clientes");
        setAlignmentX(2.0F);
        setFont(new java.awt.Font("Impact", 0, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 300));
        setVisible(true);

        jCNome.setText("Nome:");

        jCDataNasc.setText("Data de Nasc:");

        jCCpf.setText("CPF:");

        jCRg.setText("RG:");

        jCRua.setText("Rua:");

        jCNumero.setText("Número:");

        jCEstado.setText("Estado:");

        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        jCCidade.setText("Cidade:");

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        jCBairro.setText("Bairro:");

        jCEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCEndereco.setText("Endereço");

        jCDadosPessoais.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCDadosPessoais.setText("Dados Pessoais");

        jCadastrarCliente.setText("Cadastrar");
        jCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarClienteActionPerformed(evt);
            }
        });

        jCTelefone.setText("Telefone:");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jCEmail.setText("E-mail:");

        txtDtNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtNascActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEstado)
                        .addGap(264, 264, 264)
                        .addComponent(jCadastrarCliente)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCDadosPessoais)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCTelefone)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCNome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCDataNasc)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCCpf)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCRg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jCEmail)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jCRua)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(jCNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCBairro)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCEndereco))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jCDadosPessoais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCDataNasc)
                    .addComponent(jCCpf)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCRg)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCTelefone)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCEmail))
                .addGap(12, 12, 12)
                .addComponent(jCEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCEstado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCadastrarCliente))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void jCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarClienteActionPerformed
       if (validarCampos()) {
            cadastrarCliente();
        }
    }//GEN-LAST:event_jCadastrarClienteActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtDtNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtNascActionPerformed

    private boolean validarCampos() {
        // Verificando se os campos estão preenchidos
        if (txtNome.getText().isEmpty() ||
            txtDtNasc.getText().isEmpty() ||
            txtCPF.getText().isEmpty() ||
            txtRG.getText().isEmpty() ||
            txtRua.getText().isEmpty() ||
            txtNumero.getText().isEmpty() ||
            txtEstado.getText().isEmpty() ||
            txtCidade.getText().isEmpty() ||
            txtBairro.getText().isEmpty() ||
            txtTelefone.getText().isEmpty() ||
            txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Realizando outras validações se necessário
        
        return true;
    }
    
     private void cadastrarCliente() {
        // Criando um objeto Cliente com os dados do formulário
        Cliente cliente = new Cliente();
        cliente.setNome(txtNome.getText());
        cliente.setDataNascimento(txtDtNasc.getText());
        cliente.setCpf(txtCPF.getText());
        cliente.setRg(txtRG.getText());
        cliente.setRua(txtRua.getText());
        cliente.setNumero(txtNumero.getText());
        cliente.setEstado(txtEstado.getText());
        cliente.setCidade(txtCidade.getText());
        cliente.setBairro(txtBairro.getText());
        cliente.setTelefone(txtTelefone.getText());
        cliente.setEmail(txtEmail.getText());

        // Salvando o cliente no banco de dados
        clienteDao.inserir(cliente);
        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        
        // Limpando os campos do formulário
        limparCampos();
    }

     private void limparCampos() {
        txtNome.setText("");
        txtDtNasc.setText("");
        txtCPF.setText("");
        txtRG.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtEstado.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
    }
     
     
      public void setDados(Cliente cliente){
       
    txtNome.setText(cliente.getNome());
    txtDtNasc.setText(cliente.getDataNascimento());   
    txtCPF.setText(cliente.getCpf());
    txtRG.setText(cliente.getRg());
    txtRua.setText(cliente.getRua());
    txtNumero.setText(cliente.getNumero());
    txtEstado.setText(cliente.getEstado());
    txtCidade.setText(cliente.getCidade());
    txtBairro.setText(cliente.getBairro());
    txtTelefone.setText(cliente.getTelefone());
    txtEmail.setText(cliente.getEmail());
    }
      
      
      
      
      
      
      
      
      
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCBairro;
    private javax.swing.JLabel jCCidade;
    private javax.swing.JLabel jCCpf;
    private javax.swing.JLabel jCDadosPessoais;
    private javax.swing.JLabel jCDataNasc;
    private javax.swing.JLabel jCEmail;
    private javax.swing.JLabel jCEndereco;
    private javax.swing.JLabel jCEstado;
    private javax.swing.JLabel jCNome;
    private javax.swing.JLabel jCNumero;
    private javax.swing.JLabel jCRg;
    private javax.swing.JLabel jCRua;
    private javax.swing.JLabel jCTelefone;
    private javax.swing.JButton jCadastrarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDtNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

   
   }

