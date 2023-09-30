/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entidades.Produto;
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
public class ProdutoDao extends AbstractDaoImpl<Produto>{
    
    private Connection connection;
    private Logger logger = Logger.getLogger("ProdutoDao");
    ResultSet rs;
    PreparedStatement stmt;
    
    public ProdutoDao(){
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    @Override
    protected String getNomeTabela() {
        return "produtos";
    }
    
    @Override
    public List<Produto> listar(){
        String sql = "SELECT * FROM " + getNomeTabela();
        List<Produto> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            logger.info(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = mapResultSetToEntity(rs);
                retorno.add(produto);
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
   protected Produto mapResultSetToEntity(ResultSet rs){
       try{
            Produto produto = new Produto();
            produto.setProdutoID(rs.getInt("produtoID"));
            produto.setNome(rs.getString("nome"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setCategoria(rs.getString("categoria"));
            produto.setValorCompra(rs.getDouble("valorCompra"));
            produto.setValorVenda(rs.getDouble("valorVenda"));
            produto.setQuantidade(rs.getInt("quantidade"));
            return produto;
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar produto: " + ex.getMessage());
            return null;
        }
        
    }
   
    @Override
    public Produto buscarPorCodigo(int produtoID) {
        String sql = "SELECT * FROM produtos WHERE produtoID = ?";
        Produto retorno = new Produto();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, produtoID); //garante a busca
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
    
    public List<Produto> buscarPorNome(String nome) {
        String sql = "SELECT * FROM produtos WHERE nome LIKE ?";
        List<Produto> retorno = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%"); //garante a busca da string com começo.
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = mapResultSetToEntity(rs);
                retorno.add(produto);
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
    public boolean inserir(Produto produto) {
        String sql = "INSERT INTO produtos(nome, descricao, categoria, valorCompra, valorVenda, quantidade) VALUES(?,?,?,?,?,?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setString(3, produto.getCategoria());
            stmt.setDouble(4, produto.getValorCompra());
            stmt.setDouble(5, produto.getValorVenda());
            stmt.setInt(6, produto.getQuantidade());
       
            
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
    public boolean remover(int produtoID) {
        String sql = "DELETE FROM produtos WHERE produtoID=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, produtoID);
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
    public boolean alterar(Produto produto) {
        String sql = "UPDATE produtos SET nome=?, descricao=?, categoria=?, valorCompra=?, valorVenda=?, quantidade=? WHERE produtoID=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setString(3, produto.getCategoria());
            stmt.setDouble(4, produto.getValorCompra());
            stmt.setDouble(5, produto.getValorVenda());
            stmt.setInt(6, produto.getQuantidade());
            stmt.setInt(7, produto.getProdutoID());
           
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
