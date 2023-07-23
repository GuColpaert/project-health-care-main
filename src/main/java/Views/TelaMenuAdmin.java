package Views;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author thaina.matos
 */
public class TelaMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaRegistro
     */
    public TelaMenuAdmin() {
        super("Menu principal");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTitle = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        controleButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        menuDescrip = new javax.swing.JLabel();
        DashboardButton = new javax.swing.JButton();
        RegisterImage = new javax.swing.JLabel();
        RegisterButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        menuTitle.setText("MENU");
        getContentPane().add(menuTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        RegisterButton.setBackground(new java.awt.Color(81, 135, 81));
        RegisterButton.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setText("REGISTRO DE DADOS CORPORAIS");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 320, 60));

        controleButton.setBackground(new java.awt.Color(81, 135, 81));
        controleButton.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        controleButton.setForeground(new java.awt.Color(255, 255, 255));
        controleButton.setText("CONTROLE DE USUÁRIOS");
        controleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(controleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 320, 60));

        ExitButton.setBackground(new java.awt.Color(153, 0, 0));
        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Sair");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 120, 30));

        menuDescrip.setFont(new java.awt.Font("Heiti TC", 0, 13)); // NOI18N
        menuDescrip.setText("Deseja acessar:");
        getContentPane().add(menuDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 110, -1));

        DashboardButton.setBackground(new java.awt.Color(81, 135, 81));
        DashboardButton.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        DashboardButton.setForeground(new java.awt.Color(255, 255, 255));
        DashboardButton.setText("DASHBOARD");
        getContentPane().add(DashboardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 320, 60));

        RegisterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TelaMenu.jpg"))); // NOI18N
        getContentPane().add(RegisterImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RegisterButton1.setBackground(new java.awt.Color(204, 204, 204));
        RegisterButton1.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        RegisterButton1.setText("Registro de dados corporais");
        getContentPane().add(RegisterButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 270, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        TelaRegistroAdmin telaRegistro = new TelaRegistroAdmin(); 
        telaRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void controleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleButtonActionPerformed
        TelaControle telaControle = new TelaControle(); 
        telaControle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_controleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DashboardButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton RegisterButton1;
    private javax.swing.JLabel RegisterImage;
    private javax.swing.JButton controleButton;
    private javax.swing.JLabel menuDescrip;
    private javax.swing.JLabel menuTitle;
    // End of variables declaration//GEN-END:variables
}
