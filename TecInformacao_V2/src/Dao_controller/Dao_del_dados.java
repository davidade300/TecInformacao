package Dao_controller;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao_del_dados {
    private Connection connection;
    
    public Dao_del_dados() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void deletarCandidatura(String cpf) {
        String sql = "DELETE FROM dados_candidatos WHERE cpf = ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
