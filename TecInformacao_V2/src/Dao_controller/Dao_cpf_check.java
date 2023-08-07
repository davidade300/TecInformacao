/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao_controller;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author iader
 */

public class Dao_cpf_check {
    private Connection conexao_cpf;
    String cpf;
    int id;
    
    
    
    public boolean is_cpf(String cpf){
    this.conexao_cpf = new ConnectionFactory().getConnection();
    
     PreparedStatement statemt = null;
        ResultSet res = null;
        
        boolean check = false;
        try{
            statemt = conexao_cpf.prepareStatement("SELECT * FROM dados_candidatos"
                    + " WHERE cpf = ? AND id in(SELECT id FROM dados_candidatos"
                    + " WHERE cpf = ? )");
            statemt.setString(1,cpf);
            statemt.setString(2,cpf);
            
            res = statemt.executeQuery();
            if (res.next()){
                check = true;
            }
        }
        catch(SQLException u){
        throw new RuntimeException(u);
        }
        return check;
    }
}
