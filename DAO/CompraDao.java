/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entidades.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Gusta
 */
public class CompraDao {

    private Connection connection;
    private Logger logger = java.util.logging.Logger.getLogger("VendaDAO");
    PreparedStatement stmt;

    public CompraDao() {
        connection = ConexaoDao.getInstance().getConexao();
    }

    public boolean inserirCompra(Compra compra) {
        String sql = ""
                + "BEGIN; "
                + "INSERT INTO compras(fornecedorID, funcionarioID, produtoID, quantidade, valorCompra)"
                + "VALUES(?,?,?,?,?); "
                + "UPDATE produtos SET quantidade=? WHERE produtoID=?; "
                + "COMMIT;"
                + "END;";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, compra.getFornecedor().getFornecedorID());
            stmt.setInt(2, compra.getFuncionario().getFuncionarioID());
            stmt.setInt(3, compra.getProduto().getProdutoID());
            stmt.setInt(4, compra.getQuantidade());
            stmt.setDouble(5, compra.getValorCompra());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            logger.severe("Erro ao executar consulta: " + ex.getMessage());
            return false;
        }
    }
}
