package view;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Matriz extends javax.swing.JFrame {

    /**
     * Creates new form Matriz
     */
    public Matriz() {
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

        txt3 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        escolhaCal = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        lblTitulo = new javax.swing.JFormattedTextField();
        txtRe = new javax.swing.JTextField();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MATRIZ");
        getContentPane().setLayout(null);
        getContentPane().add(txt3);
        txt3.setBounds(150, 70, 50, 39);
        getContentPane().add(txt2);
        txt2.setBounds(90, 70, 50, 39);
        getContentPane().add(txt1);
        txt1.setBounds(30, 70, 50, 39);
        getContentPane().add(txt4);
        txt4.setBounds(30, 130, 50, 39);
        getContentPane().add(txt5);
        txt5.setBounds(90, 130, 50, 39);
        getContentPane().add(txt6);
        txt6.setBounds(150, 130, 50, 39);
        getContentPane().add(txt7);
        txt7.setBounds(30, 190, 50, 39);
        getContentPane().add(txt8);
        txt8.setBounds(90, 190, 50, 39);
        getContentPane().add(txt9);
        txt9.setBounds(150, 190, 50, 39);

        escolhaCal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soma total","Mult total"}));
        escolhaCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaCalActionPerformed(evt);
            }
        });
        getContentPane().add(escolhaCal);
        escolhaCal.setBounds(240, 80, 120, 22);

        btnCalcular.setText("calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(150, 250, 100, 30);

        lblTitulo.setEditable(false);
        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblTitulo.setText("preencha  com as informa????es nescessarias");
        lblTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTituloActionPerformed(evt);
            }
        });
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(40, 20, 310, 40);

        txtRe.setEditable(false);
        getContentPane().add(txtRe);
        txtRe.setBounds(280, 240, 100, 40);

        lblFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\mathe\\Downloads\\Fundo.png")); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 390, 300);

        setSize(new java.awt.Dimension(409, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
double a, b, c, d, e, f, g, h, i;
double re =0;
String escolha =  escolhaCal.getSelectedItem().toString();;

a = Double.parseDouble(txt1.getText());
b = Double.parseDouble(txt2.getText());
c = Double.parseDouble(txt3.getText());
d = Double.parseDouble(txt4.getText());
e = Double.parseDouble(txt5.getText());
f = Double.parseDouble(txt6.getText());
g = Double.parseDouble(txt7.getText());
h = Double.parseDouble(txt8.getText());
i = Double.parseDouble(txt9.getText());

if(escolha.equals("Soma total")){
    re = a+b+c+d+e+f+g+h+i ;
}else if(escolha.equals("Mult total")){
    re = a*b*c*d*e*f*g*h*i;
}

txtRe.setText(String.valueOf(re));
// TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void escolhaCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaCalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escolhaCalActionPerformed

    private void lblTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTituloActionPerformed

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
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> escolhaCal;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JFormattedTextField lblTitulo;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtRe;
    // End of variables declaration//GEN-END:variables
}
