package Dao_controller;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao_edit_senha {
    private Connection connection;
    
    public Dao_edit_senha() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void editarSenha(String cpf, String novaSenha) {
        String sql = "UPDATE dados_candidatos SET senha = ? WHERE cpf = ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, novaSenha);
            stmt.setString(2, cpf);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
