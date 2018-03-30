package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.Cliente;

public class DaoCliente {

    private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO Cliente(cpf, nome, limiteDeCredito) VALUES(?,?)");
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setDouble(3, cliente.getLimiteCred());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Cliente SET Cliente = ? " +
                                                 "WHERE cpf = ?");
            
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setDouble(3, cliente.getLimiteCred());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Cliente consultar (String cpf) {
        Cliente cliente = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from Cliente WHERE " +
                                                 "cpf = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                cliente = new Cliente(cpf, rs.getString("nome"), rs.getDouble("limitedeCredito"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (cliente);
    }    
     
    public void excluir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Cliente WHERE cpf = ?");
            
            ps.setString(1, cliente.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}





