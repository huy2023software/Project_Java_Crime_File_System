/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame.login;

import frame.background_processing.WindowAction;

/**
 *
 * @author PREDATOR
 */
public class Create_Account_User extends WindowAction {

    /**
     * Creates new form Create_Account_User
     */
    public Create_Account_User() {
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

        panel = new javax.swing.JPanel();
        lbLogoCrimeFile = new javax.swing.JLabel();
        lbLogoCreateAccount = new javax.swing.JLabel();
        lbFirstName = new javax.swing.JLabel();
        lbLastName = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        lbConfirmPassword = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbNumberPhone = new javax.swing.JLabel();
        txtfPassword = new javax.swing.JPasswordField();
        txtfConfirmPassword = new javax.swing.JPasswordField();
        txtfLastName = new javax.swing.JTextField();
        txtfEmail = new javax.swing.JTextField();
        txtfUsername = new javax.swing.JTextField();
        txtfFirstName = new javax.swing.JTextField();
        txtfNumberPhone = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnReturn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Create User Account");

        panel.setBackground(new java.awt.Color(220, 220, 220));
        panel.setPreferredSize(new java.awt.Dimension(1080, 660));

        lbLogoCrimeFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo/logo.png"))); // NOI18N

        lbLogoCreateAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo/logo_create_account.png"))); // NOI18N

        lbFirstName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbFirstName.setText("First name ");

        lbLastName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbLastName.setText("Last name ");

        lbUsername.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbUsername.setText("User name");

        lbPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbPassword.setText("Password");

        lbConfirmPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbConfirmPassword.setText("Confirm password");

        lbEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbEmail.setText("Email");

        lbNumberPhone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNumberPhone.setText("Number phone");

        txtfPassword.setBackground(new java.awt.Color(204, 204, 204));

        txtfConfirmPassword.setBackground(new java.awt.Color(204, 204, 204));

        txtfLastName.setBackground(new java.awt.Color(204, 204, 204));
        txtfLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfLastNameActionPerformed(evt);
            }
        });

        txtfEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEmailActionPerformed(evt);
            }
        });

        txtfUsername.setBackground(new java.awt.Color(204, 204, 204));
        txtfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfUsernameActionPerformed(evt);
            }
        });

        txtfFirstName.setBackground(new java.awt.Color(204, 204, 204));
        txtfFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfFirstNameActionPerformed(evt);
            }
        });

        txtfNumberPhone.setBackground(new java.awt.Color(204, 204, 204));
        txtfNumberPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNumberPhoneActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(204, 255, 255));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/register_button.png"))); // NOI18N
        btnRegister.setPreferredSize(new java.awt.Dimension(121, 32));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/reset_button.png"))); // NOI18N
        btnReset.setPreferredSize(new java.awt.Dimension(105, 32));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/btn_return.png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                            .addComponent(lbNumberPhone)
                                            .addGap(48, 48, 48))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                            .addComponent(lbConfirmPassword)
                                            .addGap(18, 18, 18)))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbLastName)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbEmail)
                                                    .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbUsername)))
                                            .addComponent(lbFirstName))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfNumberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(lbLogoCreateAccount)))
                .addContainerGap(325, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(btnReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogoCrimeFile))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogoCrimeFile)
                    .addComponent(btnReturn))
                .addGap(59, 59, 59)
                .addComponent(lbLogoCreateAccount)
                .addGap(49, 49, 49)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbFirstName)
                            .addComponent(txtfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLastName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsername, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbPassword)
                            .addComponent(txtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbEmail)
                            .addComponent(txtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfNumberPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNumberPhone, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfLastNameActionPerformed

    private void txtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEmailActionPerformed

    private void txtfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfUsernameActionPerformed

    private void txtfFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfFirstNameActionPerformed

    private void txtfNumberPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNumberPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNumberPhoneActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Account_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Account_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel btnReturn;
    private javax.swing.JLabel lbConfirmPassword;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbLogoCreateAccount;
    private javax.swing.JLabel lbLogoCrimeFile;
    private javax.swing.JLabel lbNumberPhone;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField txtfConfirmPassword;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JTextField txtfFirstName;
    private javax.swing.JTextField txtfLastName;
    private javax.swing.JTextField txtfNumberPhone;
    private javax.swing.JPasswordField txtfPassword;
    private javax.swing.JTextField txtfUsername;
    // End of variables declaration//GEN-END:variables
}
