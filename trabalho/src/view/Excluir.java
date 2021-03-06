/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.Usuario;
import data.UsuarioDao;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Excluir extends javax.swing.JFrame {

    /**
     * Creates new form Exclui
     */
    public Excluir() {
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

        lblEmail = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JFormattedTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnExcluir = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EXCLUIR");
        setResizable(false);
        getContentPane().setLayout(null);

        lblEmail.setEditable(false);
        lblEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblEmail.setText("Email:");
        lblEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEmailActionPerformed(evt);
            }
        });
        getContentPane().add(lblEmail);
        lblEmail.setBounds(29, 38, 48, 30);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(111, 38, 251, 30);

        lblSenha.setEditable(false);
        lblSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(29, 108, 48, 33);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(111, 108, 240, 33);

        btnExcluir.setText("excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(277, 240, 90, 41);

        lblFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\mathe\\Downloads\\Fundo.png")); // NOI18N
        lblFundo.setText("jLabel2");
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEmailActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
String email, senha, Senha = null;
email = txtEmail.getText();
senha = txtSenha.getText();

UsuarioDao dao = new UsuarioDao();
if(email.equals("") || senha.equals("")){
    JOptionPane.showMessageDialog(null, "Insira as informa????es");
}else{
    
    
boolean status = dao.conectar();
    if(status == false){
        JOptionPane.showMessageDialog(null, "Erro de conex??o");
    }if(status==true){
            Usuario usuario = dao.consultar(email);
            //se foi feita tras as informa????es do banco para a classe usuario
            if(usuario==null){
                //mesagem que vai aparecer caso n??o teha sido digitado nada 
                JOptionPane.showMessageDialog(null, "Usuario n??o encontado");
            }else{
                            
                Senha = usuario.getSenha();                
            }
            if(Senha.equals(senha)){
                status = dao.excluir(email);
                if(status==true){
                    JOptionPane.showMessageDialog(null, "Usuario Excluido");
                    new Inicio().setVisible(true);
                    new Pagina().setVisible(false);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Erro na excluss??o");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Senha incorreta");
            }
            dao.desconectar();
    }
}
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Excluir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JFormattedTextField lblEmail;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JFormattedTextField lblSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
