
package view;

import data.Usuario;
import data.UsuarioDao;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {
    
    


    /**
     * Creates new form cadastro
     */
    public Cadastro() {
        initComponents();
        txtEmail.grabFocus();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JFormattedTextField();
        txtIdade = new javax.swing.JTextField();
        lblIdade = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO");
        setResizable(false);
        getContentPane().setLayout(null);

        btnCancelar.setText("cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(40, 240, 89, 34);

        btnSalvar.setText("salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(278, 243, 89, 35);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(90, 181, 300, 30);

        lblSenha.setEditable(false);
        lblSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblSenha.setText(" Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(10, 183, 52, 30);
        getContentPane().add(txtIdade);
        txtIdade.setBounds(91, 130, 64, 30);

        lblIdade.setEditable(false);
        lblIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblIdade.setText(" Idade:");
        getContentPane().add(lblIdade);
        lblIdade.setBounds(10, 132, 52, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(135, 80, 250, 30);

        lblNome.setEditable(false);
        lblNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblNome.setText(" Nome de usuario:");
        getContentPane().add(lblNome);
        lblNome.setBounds(10, 80, 110, 30);

        lblEmail.setEditable(false);
        lblEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblEmail.setText(" E-mail:");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(10, 34, 52, 30);

        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(80, 32, 276, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mathe\\Downloads\\Fundo.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
new Inicio().setVisible(true);  
dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
String se =txtSenha.getText();
    if(txtEmail.getText().equals("") || txtNome.getText().equals("") || txtIdade.getText().equals("") || txtSenha.getText().equals("")){
        //condição que impede campos vazios
        JOptionPane.showMessageDialog(null, "digite informação");
        txtEmail.requestFocus();
    }else if(se.length()<8){
        JOptionPane.showMessageDialog(null, "digite uma senha com 8 caracteres no minimo");
        txtSenha.requestFocus();
    }
        
    else{ 
        
        //
        Usuario usuario = new Usuario();
        UsuarioDao dao;
        boolean status; 
        int resp;
        
        usuario.setEmail(txtEmail.getText());
        usuario.setNome(txtNome.getText());
        usuario.setIdade(txtIdade.getText());
        usuario.setSenha(txtSenha.getText());
            //captura os textos digitados
            
        dao = new UsuarioDao();
        //tentar cria uma conexão com o banco de dados
           status = dao.conectar();
            if(status==false){
                //caso não conecte vai aparecer a mensagem 
                JOptionPane.showMessageDialog(null, "erro de conexão");
            }else{
                //se conectar vai entrar nessa condição 
                resp = dao.salvar(usuario);
                    if(resp==1062){
                        //condição que trata o erro da primary key
                JOptionPane.showMessageDialog(null, "Email ja cadastrado");
            }else if(resp==1){
                //salva os dados na tabela
           JOptionPane.showMessageDialog(null, "dados salvos");
           dao.desconectar();
    
    new Inicio().setVisible(true);
    dispose();
                    }
    }
    }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
    
 
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFormattedTextField lblEmail;
    private javax.swing.JFormattedTextField lblIdade;
    private javax.swing.JFormattedTextField lblNome;
    private javax.swing.JFormattedTextField lblSenha;
    public javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private boolean length(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
