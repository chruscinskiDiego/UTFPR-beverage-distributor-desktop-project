/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entidades.Fornecedor;
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
 * @author Gusta
 */
public class FornecedorDao extends AbstractDaoImpl<Fornecedor>{
    private Connection connection;
    private Logger logger = Logger.getLogger("ClienteDao");
    ResultSet rs;
    PreparedStatement stmt;
    
    public FornecedorDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "fornecedores";
    }
    
    @Override
    public List<Fornecedor> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        List<Fornecedor> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor fornecedor = mapResultSetToEntity(rs);
                retorno.add(fornecedor);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        finally{
            try {
                stmt.close();
                rs.close();
            } catch (SQLException ex) {
                logger.severe("Erro ao fechar conexão" + ex.getMessage());
            }
        }
        return retorno;
    }
    
    @Override
   protected Fornecedor mapResultSetToEntity(ResultSet rs){
       try{
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setFornecedorID(rs.getInt("fornecedorID"));
            fornecedor.setNome(rs.getString("nome"));
            fornecedor.setEmail(rs.getString("email"));
            fornecedor.setTelefone(rs.getString("telefone"));
            fornecedor.setRua(rs.getString("rua"));
            fornecedor.setNumero(rs.getString("numero"));
            fornecedor.setBairro(rs.getString("bairro"));
            fornecedor.setCidade(rs.getString("cidade"));
            fornecedor.setEstado(rs.getString("estado"));
            fornecedor.setCnpj(rs.getString("cnpj"));

            return fornecedor;
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar fornecedor: " + ex.getMessage());
            return null;
        }
        
    }
   
   @Override
    public Fornecedor buscarPorCodigo(int fornecedorID) {
        String sql = "SELECT * FROM fornecedores WHERE fornecedorID = ?";
        Fornecedor retorno = new Fornecedor();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, fornecedorID); //garante a busca
            rs = stmt.executeQuery();
            while (rs.next()) {
               retorno = mapResultSetToEntity(rs);
            }
           
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        finally{
            try {
                stmt.close();
                rs.close();
            } catch (SQLException ex) {
                logger.severe("Erro ao fechar conexão" + ex.getMessage());
            }
        }
        return retorno;
    }
    
    public List<Fornecedor> buscarPorNome(String nome) {
        String sql = "SELECT * FROM fornecedores WHERE nome LIKE ?";
        List<Fornecedor> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor fornecedor = mapResultSetToEntity(rs);
                retorno.add(fornecedor);
            }
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
        }
        finally{
            try {
                stmt.close();
                rs.close();
            } catch (SQLException ex) {
                logger.severe("Erro ao fechar conexão" + ex.getMessage());
            }
        }
        return retorno;
    }
    
    @Override
    public boolean inserir(Fornecedor fornecedor) {
        String sql = "INSERT INTO fornecedores (nome, email, telefone, rua, numero, bairro, cidade, estado, cnpj) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getEmail());
            stmt.setString(3, fornecedor.getTelefone());
            stmt.setString(4, fornecedor.getRua());
            stmt.setString(5, fornecedor.getNumero());
            stmt.setString(6, fornecedor.getBairro());
            stmt.setString(7, fornecedor.getCidade());
            stmt.setString(8, fornecedor.getEstado());
            stmt.setString(9, fornecedor.getCnpj());
           
            
            
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }finally{
            try {
                stmt.close();
            } catch (SQLException ex) {
                logger.severe("Erro ao fechar conexão" + ex.getMessage());
            }
        }
        
    }
    
    @Override
    public boolean remover(int fornecedorID) {
        String sql = "DELETE FROM fornecedores WHERE fornecedorID=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, fornecedorID);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
        finally{
            try {
                stmt.close();
            } catch (SQLException ex) {
                logger.severe("Erro ao fechar conexão" + ex.getMessage());
            }
        }
    }
    
    @Override
    public boolean alterar(Fornecedor fornecedor) {
        String sql = "UPDATE fornecedores SET nome=?, email=?, telefone=?, rua=?, numero=?, bairro=?, cidade=?, estado=?, cnpj=? WHERE fornecedorID=?";
        try {
            stmt = connection.prepareStatement(sql);
         stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getEmail());
            stmt.setString(3, fornecedor.getTelefone());
            stmt.setString(4, fornecedor.getRua());
            stmt.setString(5, fornecedor.getNumero());
            stmt.setString(6, fornecedor.getBairro());
            stmt.setString(7, fornecedor.getCidade());
            stmt.setString(8, fornecedor.getEstado());
            stmt.setString(9, fornecedor.getCnpj());
            stmt.setInt(10, fornecedor.getFornecedorID());

            
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }finally{
            try {
                stmt.close();
            } catch (SQLException ex) {
                logger.severe("Erro ao fechar conexão" + ex.getMessage());
            }
        }
    }
    
}


