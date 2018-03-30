package fatec.poo.control;

import fatec.poo.model.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

public class DaoProduto {

    private Connection conn;
    
    public DaoProduto(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO Produto(codProduto, descricao, qtdeDisp, precoUnit, estoqueMin) VALUES(?,?,?,?,?)");
            ps.setInt(1, produto.getCodigo());
            ps.setString(2, produto.getDescricao());
            ps.setInt(3, produto.getQtdeDisponivel());
            ps.setDouble(4, produto.getPrecoUnit());
            ps.setInt(5, produto.getEstoqueMin());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Produto SET codProduto = ?, descricao = ?, qtdeDisp = ?, precoUnit = ?, estoqueMin = ? WHERE codProduto = ?");
            
            ps.setInt(1, produto.getCodigo());
            ps.setString(2, produto.getDescricao());
            ps.setInt(3, produto.getQtdeDisponivel());
            ps.setDouble(4, produto.getPrecoUnit());
            ps.setInt(5, produto.getEstoqueMin());
            ps.setInt(6, produto.getCodigo());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Produto consultar (Integer codProduto) {
        Produto produto = null;
            PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from Produto WHERE codProduto = ?");
            
            ps.setInt(1, codProduto);

            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                produto = new Produto(codProduto, rs.getString("descricao"), rs.getInt("qtdeDisp"), rs.getDouble("precoUnit"), rs.getInt("estoqueMIn"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (produto);
    }    
     
    public void excluir(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Produto WHERE codProduto = ?");
            
            ps.setInt(1, produto.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}





