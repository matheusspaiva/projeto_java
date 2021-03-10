/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.AtendimentoDao;
import data.Atendimento;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Sac extends javax.swing.JFrame {

    /**
     * Creates new form Sac
     */
    public Sac() {
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
        lblMesagem = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensagem = new javax.swing.JTextArea();
        txtEmail = new javax.swing.JFormattedTextField();
        btnEnviar = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ATENDIMENTO");
        setResizable(false);
        getContentPane().setLayout(null);

        lblEmail.setEditable(false);
        lblEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblEmail.setText("E-mail:");
        lblEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEmailActionPerformed(evt);
            }
        });
        getContentPane().add(lblEmail);
        lblEmail.setBounds(10, 30, 80, 30);

        lblMesagem.setEditable(false);
        lblMesagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblMesagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblMesagem.setText("Mande sua mensagem");
        getContentPane().add(lblMesagem);
        lblMesagem.setBounds(10, 90, 140, 30);

        txtMensagem.setColumns(20);
        txtMensagem.setRows(5);
        jScrollPane1.setViewportView(txtMensagem);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 330, 96);

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtEmail);
        txtEmail.setBounds(100, 30, 210, 30);

        btnEnviar.setText("enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(240, 250, 100, 30);

        lblFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\mathe\\Downloads\\Fundo.png")); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(407, 332));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEmailActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
       if(txtEmail.getText().equals("") || txtMensagem.getText().equals("")){
        //condição que impede campos vazios
        JOptionPane.showMessageDialog(null, "digite informação");
        txtEmail.requestFocus();
    }else{
        Atendimento atendimento = new Atendimento();
        AtendimentoDao dao;
        boolean status; 
        int resp;
        
        atendimento.setEmail(txtEmail.getText());
        atendimento.setMensagem(txtMensagem.getText());
        
        dao = new AtendimentoDao();
        //tentar cria uma conexão com o banco de dados
           status = dao.conectar();
            if(status==false){
                //caso não conecte vai aparecer a mensagem 
                JOptionPane.showMessageDialog(null, "erro de conexão");
            }else{
                //se conectar vai entrar nessa condição 
                resp = dao.salvar(atendimento);
                    if(resp>1){
                        //condição que trata o erro da primary key
                JOptionPane.showMessageDialog(null, "Email inexistente");
            }else if(resp==1){
                //salva os dados na tabela
           JOptionPane.showMessageDialog(null, "Messagem enviada");
           dao.desconectar();
           txtMensagem.setText("");
           txtMensagem.requestFocus();
       }
            }
       }
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(Sac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField lblEmail;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JFormattedTextField lblMesagem;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JTextArea txtMensagem;
    // End of variables declaration//GEN-END:variables
}