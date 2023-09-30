/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entidades.Funcionario;
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
public class FuncionarioDao extends AbstractDaoImpl<Funcionario>{
    private Connection connection;
    private Logger logger = Logger.getLogger("FuncionarioDao");
    ResultSet rs;
    PreparedStatement stmt;
    
    public FuncionarioDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "funcionarios";
    }
    
    @Override
    public List<Funcionario> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        List<Funcionario> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = mapResultSetToEntity(rs);
                retorno.add(funcionario);
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
   protected Funcionario mapResultSetToEntity(ResultSet rs){
       try{
            Funcionario funcionario = new Funcionario();
            funcionario.setFuncionarioID(rs.getInt("funcionarioID"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setFuncao(rs.getString("funcao_funcionario"));
            return funcionario;
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar funcionario: " + ex.getMessage());
            return null;
        }
        
    }
   
   @Override
    public Funcionario buscarPorCodigo(int funcionarioID) {
        String sql = "SELECT * FROM funcionarios WHERE funcionarioID = ?";
        Funcionario retorno = new Funcionario();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, funcionarioID); //garante a busca
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
    
    public List<Funcionario> buscarPorNome(String nome) {
        String sql = "SELECT * FROM funcionarios WHERE nome LIKE ?";
        List<Funcionario> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = mapResultSetToEntity(rs);
                retorno.add(funcionario);
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
    public boolean inserir(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios(nome, funcao) VALUES(?,?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getFuncao());
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
    public boolean remover(int funcionarioID) {
        String sql = "DELETE FROM funcionarios WHERE funcionarioID=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, funcionarioID);
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
    public boolean alterar(Funcionario funcionario) {
        String sql = "UPDATE funcionarios SET nome=?, funcao=? WHERE funcionarioID=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getFuncao());
            
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

