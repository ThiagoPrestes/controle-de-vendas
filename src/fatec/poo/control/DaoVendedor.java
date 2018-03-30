package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Vendedor;

public class DaoVendedor {

    private Connection conn;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO Vendedor(cpf, nome, endereco, cidade, cep, uf, telefoneddd, telefonenum, salarioBase, comissao) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getComissao());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Vendedor SET cpf = ?, nome = ?, endereco = ?, cidade = ?, cep = ?, uf = ?, ddd = ?, telefone = ?, salarioBase = ?, comissao = ? " +
                                                 "WHERE cpf = ?");
            
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getComissao());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Vendedor consultar (String cpf) {
        Vendedor vendedor = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from Vendedor WHERE cpf = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                vendedor = new Vendedor(cpf, rs.getString("nome"), rs.getString("endereco"), rs.getString("cidade"), rs.getString("cep"), rs.getString("uf"), rs.getString("telefoneDdd"), rs.getString("telefoneNum"), rs.getDouble("salarioBase"), rs.getDouble("comissao"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (vendedor);
    }    
     
    public void excluir(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Vendedor WHERE cpf = ?");
            
            ps.setString(1, vendedor.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}





