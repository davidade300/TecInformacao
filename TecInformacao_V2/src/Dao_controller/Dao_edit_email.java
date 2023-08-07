package Dao_controller;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao_edit_email {
    private Connection connection;
    
    public Dao_edit_email() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void editarEmail(String cpf, String novoEmail) {
        String sql = "UPDATE dados_candidatos SET email = ? WHERE cpf = ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoEmail);
            stmt.setString(2, cpf);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
