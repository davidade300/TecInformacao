// classe aposentada devido a bug desconhecido
package Telas;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class tela_admin extends javax.swing.JFrame {

    /**
     * Creates new form tela_admin
     */
    public tela_admin() {
        initComponents();
        exibirCandidatos();
    }

    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Crie um modelo de tabela personalizado
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "CPF", "Nome", "Data de Nascimento", "Telefone", "Email", "Senha"}
        );
        jTable1.setModel(model);

        jScrollPane1.setViewportView(jTable1);

        // Adicione jScrollPane1 ao layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration

    private void exibirCandidatos() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            // Estabeleça a conexão com o banco de dados
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecinovacao", "root", "Aderaldo@1");

            // Crie uma declaração SQL
            Statement stmt = conn.createStatement();

            // Execute a consulta para obter os dados dos candidatos
            String query = "SELECT id, cpf, nome_sobrenome, data_nascimento, telefone, email, senha FROM dados_candidatos";
            ResultSet rs = stmt.executeQuery(query);

            // Percorra o resultado e crie objetos Candidato com os dados
            while (rs.next()) {
                int id = rs.getInt("id");
                String cpf = rs.getString("cpf");
                String nomeSobrenome = rs.getString("nome_sobrenome");
                String dataNascimento = rs.getString("data_nascimento");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String senha = rs.getString("senha");

                model.addRow(new Object[]{
                        id,
                        cpf,
                        nomeSobrenome,
                        dataNascimento,
                        telefone,
                        email,
                        senha
                });
            }

            // Feche os recursos
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
