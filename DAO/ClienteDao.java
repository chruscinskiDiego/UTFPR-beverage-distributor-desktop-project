/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entidades.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * author Gusta
 */
public class ClienteDao extends AbstractDaoImpl<Cliente> {
    private Connection connection;
    private Logger logger = Logger.getLogger("ClienteDao");
    ResultSet rs;
    PreparedStatement stmt;

    public ClienteDao() {
        connection = ConexaoDao.getInstance().getConexao();
    }

    @Override
    protected String getNomeTabela() {
        return "clientes";
    }

    @Override
    public List<Cliente> listar() {
        String sql = "SELECT * FROM " + getNomeTabela();
        List<Cliente> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = mapResultSetToEntity(rs);
                retorno.add(cliente);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        } finally {
            closeStatementAndResultSet(stmt, rs);
        }
        return retorno;
    }

    @Override
protected Cliente mapResultSetToEntity(ResultSet rs) {
    try {
        Cliente cliente = new Cliente();
        cliente.setClienteID(rs.getInt("clienteID"));
        cliente.setNome(rs.getString("nome"));
        cliente.setDataNascimento(rs.getString("dataNascimento"));
        cliente.setEmail(rs.getString("email"));
        cliente.setTelefone(rs.getString("telefone"));
        cliente.setRua(rs.getString("rua"));
        cliente.setNumero(rs.getString("numero"));
        cliente.setBairro(rs.getString("bairro"));
        cliente.setCidade(rs.getString("cidade"));
        cliente.setEstado(rs.getString("estado"));
        cliente.setCpf(rs.getString("cpf"));
        cliente.setRg(rs.getString("rg"));

        // Adicionar log de inserção
        logChange("Cliente inserido: " + cliente.toString());

        return cliente;
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao criar cliente: " + ex.getMessage());
        return null;
    }
}

    @Override
    public Cliente buscarPorCodigo(int clienteID) {
        String sql = "SELECT * FROM clientes WHERE clienteID = ?";
        Cliente retorno = new Cliente();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, clienteID); // garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
                retorno = mapResultSetToEntity(rs);
            }

        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        } finally {
            closeStatementAndResultSet(stmt, rs);
        }
        return retorno;
    }

    public List<Cliente> buscarPorNome(String nome) {
        String sql = "SELECT * FROM clientes WHERE nome LIKE ?";
        List<Cliente> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); // garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = mapResultSetToEntity(rs);
                retorno.add(cliente);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        } finally {
            closeStatementAndResultSet(stmt, rs);
        }
        return retorno;
    }
    
  


    @Override
    public boolean inserir(Cliente cliente) {
        String sql = "INSERT INTO clientes(nome, dataNascimento, email, telefone, rua, numero, bairro, cidade, estado, cpf, rg) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getDataNascimento());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getRua());
            stmt.setString(6, cliente.getNumero());
            stmt.setString(7, cliente.getBairro());
            stmt.setString(8, cliente.getCidade());
            stmt.setString(9, cliente.getEstado());
            stmt.setString(10, cliente.getCpf());
            stmt.setString(11, cliente.getRg());

            stmt.execute();

            // Realiza o log da alteração
            logChange("Cliente inserido: " + cliente.toString());

            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        } finally {
            closeStatement(stmt);
        }
    }

    @Override
    public boolean remover(int clienteID) {
        String sql = "DELETE FROM clientes WHERE clienteID=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, clienteID);
            stmt.execute();

            // Realiza o log da alteração
            logChange("Cliente removido - ID: " + clienteID);

            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        } finally {
            closeStatement(stmt);
        }
    }

    @Override
    public boolean alterar(Cliente cliente) {
        String sql = "UPDATE clientes SET nome=?, dataNascimento=?, email=?, telefone=?, rua=?, numero=?, bairro=?, cidade=?, estado=?, cpf=?, rg=? WHERE clienteID=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getDataNascimento());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getRua());
            stmt.setString(6, cliente.getNumero());
            stmt.setString(7, cliente.getBairro());
            stmt.setString(8, cliente.getCidade());
            stmt.setString(9, cliente.getEstado());
            stmt.setString(10, cliente.getCpf());
            stmt.setString(11, cliente.getRg());
            stmt.setInt(12, cliente.getClienteID());

            stmt.execute();

            // Realiza o log da alteração
            logChange("Cliente alterado: " + cliente.toString());

            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        } finally {
            closeStatement(stmt);
        }
    }

   private void logChange(String logMessage) {
    String filePath = "C:/Users/Gusta/OneDrive/Imagens/ChickenLittle/log.txt";
    try {
        PrintWriter writer = new PrintWriter(new FileWriter(filePath, true));
        writer.println(logMessage);
        writer.close();
    } catch (IOException e) {
        logger.severe("Erro ao gravar o log: " + e.getMessage());
    }
}

    private void closeStatement(PreparedStatement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                logger.severe("Erro ao fechar conexão" + ex.getMessage());
            }
        }
    }

    private void closeStatementAndResultSet(PreparedStatement stmt, ResultSet rs) {
        closeStatement(stmt);
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                logger.severe("Erro ao fechar conexão" + ex.getMessage());
            }
        }
    }
}