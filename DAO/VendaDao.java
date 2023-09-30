/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entidades.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Gusta
 */
public class VendaDao {
    
    private Connection connection;
    private Logger logger = java.util.logging.Logger.getLogger("VendaDAO");
    PreparedStatement stmt;
    
    public VendaDao() {
        connection = ConexaoDao.getInstance().getConexao();
    }
    
    public boolean inserirVenda(Venda venda) {
        String sql = ""
                + "BEGIN; "
                + "INSERT INTO vendas(clienteID, funcionarioID, produtoID, quantidade, valorVenda)"
                + "VALUES(?,?,?,?,?); "
                + "UPDATE produtos SET quantidade=? WHERE produtoID=?; "
                + "COMMIT;"
                + "END;"
                ;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, venda.getCliente().getClienteID());
            stmt.setInt(2, venda.getFuncionario().getFuncionarioID());
            stmt.setInt(3, venda.getProduto().getProdutoID());
            stmt.setInt(4, venda.getQuantidade());
            stmt.setDouble(5, venda.getValorVenda());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }
}
