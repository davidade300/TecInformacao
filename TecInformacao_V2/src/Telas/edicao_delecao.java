/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Dao_controller.Dao_cpf_check;
import Dao_controller.Dao_del_dados;
import Dao_controller.Dao_edit_email;
import Dao_controller.Dao_edit_nome;
import Dao_controller.Dao_edit_senha;
import Dao_controller.Dao_edit_telefone;
import javax.swing.JOptionPane;


/**
 *
 * @author iader
 */
public class edicao_delecao extends javax.swing.JFrame {

    /**
     * Creates new form teste
     */
    public edicao_delecao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        novo_nome = new javax.swing.JTextField();
        novo_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Confirmar_alteracao = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        apaga_tudo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cpf_delecao = new javax.swing.JTextField();
        novo_telefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pega_cpf = new javax.swing.JTextField();
        novo_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(710, 520));

        jLabel1.setText("Para alterar os dados preencha os campos abaixo com os novos dados.");

        jLabel2.setText("Novo nome completo: ");

        jLabel3.setText("Novo Email:");

        jLabel4.setText("Nova senha:");

        jLabel5.setText("Novo telefone:");
        jLabel5.setPreferredSize(new java.awt.Dimension(37, 22));

        Confirmar_alteracao.setText("confirmar alteração");
        Confirmar_alteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirmar_alteracaoActionPerformed(evt);
            }
        });

        jLabel6.setText("Para cancelar sua inscrição e apagar seus dados siga as instruções abaixo:");
        jLabel6.setPreferredSize(new java.awt.Dimension(37, 22));

        apaga_tudo.setText("Cancelar Inscrição");
        apaga_tudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apaga_tudoActionPerformed(evt);
            }
        });

        jLabel8.setText("cpf(somente numeros):");
        jLabel8.setPreferredSize(new java.awt.Dimension(37, 22));

        jLabel7.setText("Para prosseguir com a alteração insira seu cpf no campo abaixo e clique em \"confirmar alteração\"");
        jLabel7.setPreferredSize(new java.awt.Dimension(37, 22));

        pega_cpf.setText("apenas numeros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpf_delecao, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Confirmar_alteracao)
                            .addComponent(pega_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apaga_tudo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 318, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pega_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Confirmar_alteracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf_delecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apaga_tudo)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Confirmar_alteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirmar_alteracaoActionPerformed
   
    String cpf = pega_cpf.getText();
    String novoNome = novo_nome.getText();
    String novoEmail = novo_email.getText();
    String novaSenha = novo_senha.getText();
    String novoTelefone = novo_telefone.getText();
    
    //verifica se o cpf informado corresponde ao cpf do candidato no bd.
    Dao_cpf_check e_cpf = new Dao_cpf_check();
    if(e_cpf.is_cpf(cpf)){

    // Verifica se os campos estão vazios ou nulos antes de atualizar
    if (novoNome.isEmpty() && novoEmail.isEmpty() && novaSenha.isEmpty() && novoTelefone.isEmpty()) {
        // se nenhum campo preenchido, exibe uma mensagem de aviso
        JOptionPane.showMessageDialog(null, "Nenhum campo foi preenchido. Nenhum dado foi atualizado.");
    } else {
        // altera nome
        if (!novoNome.isEmpty()) {
            Dao_edit_nome atualizaNome = new Dao_edit_nome();
            atualizaNome.Editarnome(cpf,novoNome);
        }

        // altera email
        if (!novoEmail.isEmpty()) {
            Dao_edit_email atualizaEmail = new Dao_edit_email();
            atualizaEmail.editarEmail(cpf, novoEmail);
        }

        // altera senha
        if (!novaSenha.isEmpty()) {
            Dao_edit_senha atualizaSenha = new Dao_edit_senha();
            atualizaSenha.editarSenha(cpf, novaSenha);
        }

        // altera telefone
        if (!novoTelefone.isEmpty()) {
            Dao_edit_telefone atualizaTelefone = new Dao_edit_telefone();
            atualizaTelefone.editarTelefone(cpf, novoTelefone);
        }

        // mensagem de sucesso na alteracao
        JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
        
        this.dispose();
       
    }
    }else{JOptionPane.showMessageDialog(null,"cpf incorreto");}
        
        
    }//GEN-LAST:event_Confirmar_alteracaoActionPerformed

    private void apaga_tudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apaga_tudoActionPerformed
            String cpf = cpf_delecao.getText();
            Dao_cpf_check a_cpf = new Dao_cpf_check();
        
        if(a_cpf.is_cpf(cpf)){
        Dao_del_dados delecao = new Dao_del_dados();
        delecao.deletarCandidatura(cpf);
        JOptionPane.showMessageDialog(null, "Candidatura apagada com sucesso");
        this.dispose();
    }else{
            JOptionPane.showMessageDialog(null, "Cpf invalido para candidato");
    }
    }//GEN-LAST:event_apaga_tudoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(edicao_delecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edicao_delecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edicao_delecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edicao_delecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edicao_delecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar_alteracao;
    private javax.swing.JButton apaga_tudo;
    private javax.swing.JTextField cpf_delecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField novo_email;
    private javax.swing.JTextField novo_nome;
    private javax.swing.JPasswordField novo_senha;
    private javax.swing.JTextField novo_telefone;
    private javax.swing.JTextField pega_cpf;
    // End of variables declaration//GEN-END:variables
}