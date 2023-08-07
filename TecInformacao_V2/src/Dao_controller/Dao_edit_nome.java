package Dao_controller;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao_edit_nome {
    private Connection connection;
    
    public Dao_edit_nome() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void Editarnome(String cpf, String Novonome) {
        String sql = "UPDATE dados_candidatos SET nome_sobrenome = ? WHERE cpf = ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Novonome);
            stmt.setString(2, cpf);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}