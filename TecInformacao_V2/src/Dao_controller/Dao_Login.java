
package Dao_controller;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Dao_Login {
    int id;
    String senha;
    String cpf;
    
    private Connection connection;
    
    public boolean Logincheck(String cpf, String senha){
        this.connection = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        // candidato inicia não logado
        boolean check = false;
        try{
            stmt = connection.prepareStatement("SELECT * FROM"
                    + " dados_candidatos WHERE cpf = ? and senha = ? ");
            stmt.setString(1, cpf);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            if (rs.next()){
                check = true;
            }
        
        }
        catch(SQLException u){
        throw new RuntimeException(u);
        }
        return check;
    }
    
}
