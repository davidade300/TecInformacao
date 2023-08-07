/*16/06/2023: não consegui consertar a questão a data de modo algum, nem mesmo copiando o
código que Alex deu na aula do dia 02/06 então está sem a data, o mesmo vale p/
o validador de cpf, consegui criar o código porém não consegui implementá-lo.
*/

/*
19/06/2023: ainda não consegui resolver esses dois pontos, como solução paleativa
transformei a data de nascimento (data_nascimento) no bd em Varchar e aqui no 
programa todos os cantos que recebiam a data como int agora recebem como String
no molde yyyy-mm-dd (padrão do mysql), inserir a data de forma diferente quebra
o programa
*/
package Dao_controller;

import Conexao.ConnectionFactory;
import Modelo.Candidatov2;
import java.sql.*;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class criar_candidatura {
    private Connection connection;
    int id;
    String cpf;
    String nome_sobrenome;
    String data_nascimento;
    String telefone;
    String email;
    String senha;
   
    
    public criar_candidatura(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void criar(Candidatov2 candidato){
        String sql = "INSERT INTO dados_candidatos(cpf, nome_sobrenome, data_nascimento,"
                + " telefone, email, senha) values (?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, candidato.getCpf());
            stmt.setString(2, candidato.getNome_sobrenome());
            stmt.setString (3, candidato.getData_nascimento()); 
            stmt.setString(4, candidato.getTelefone());
            stmt.setString(5, candidato.getEmail());
            stmt.setString(6, candidato.getSenha());
            stmt.execute();
            stmt.close();
        }
        catch(SQLException u){
            throw new RuntimeException();
        }
    }   
}
