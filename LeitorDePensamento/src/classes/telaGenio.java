/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Font;

/**
 *
 * @author Admin
 */
public class telaGenio extends javax.swing.JFrame {

    /**
     * Creates new form telaGenio
     */
    public telaGenio() {
        initComponents();
        lblFrase.setText("<html>Vou pensar em um valor entre <strong>1 e 10</strong>. Tente adivinhar</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFrase = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnValor = new javax.swing.JSpinner();
        btnClick = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 75));
        setMaximumSize(new java.awt.Dimension(413, 473));
        setMinimumSize(new java.awt.Dimension(413, 473));
        setPreferredSize(new java.awt.Dimension(430, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(413, 473));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrase.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("FRASE");
        lblFrase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, 280, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel3.setText("PALPITE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 30));

        spnValor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        spnValor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(spnValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 50));

        btnClick.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClick.setText("VERIFICAR");
        btnClick.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });
        getContentPane().add(btnClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aladin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 467));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        
        double number = 1 + Math.random() * (11 - 1);
        int valor = (int) number;
        
        int numUser = Integer.parseInt(spnValor.getValue().toString());
        
        String f1 = "<html>Acertou!</html>";
        String f2 = "<html>ERROU! Eu pensei no valor " + valor + "</html>";
        
        String res = (valor == numUser)? f1 : f2;
        
        lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 24));
        
        lblFrase.setText(res);
        
    }//GEN-LAST:event_btnClickActionPerformed

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
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner spnValor;
    // End of variables declaration//GEN-END:variables
}