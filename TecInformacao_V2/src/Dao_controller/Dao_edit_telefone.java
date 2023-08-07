package Dao_controller;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao_edit_telefone {
    private Connection connection;
    
    public Dao_edit_telefone() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void editarTelefone(String cpf, String novoTelefone) {
        String sql = "UPDATE dados_candidatos SET telefone = ? WHERE cpf = ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoTelefone);
            stmt.setString(2, cpf);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
