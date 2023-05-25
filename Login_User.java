/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame.login;

import connection.MainConnection;
import frame.background_processing.WindowAction;
import frame.home.Home_Guest;
import frame.home.Home_User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author PREDATOR
 */
public class Login_User extends WindowAction {

    /**
     * Creates new form Home_User
     */
    public Login_User() {
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
        lbLogoUserLogin = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        lbForgetPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lbYouNeedAccount = new javax.swing.JLabel();
        lbSignUp = new javax.swing.JLabel();
        btnReturn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login As User");

        panel.setBackground(new java.awt.Color(220, 220, 220));
        panel.setPreferredSize(new java.awt.Dimension(1080, 660));

        lbLogoCrimeFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo/logo.png"))); // NOI18N

        lbLogoUserLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo/logo_user_login.png"))); // NOI18N

        lbUsername.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbUsername.setText("Username");

        lbPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbPassword.setText("Password");

        lbForgetPassword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbForgetPassword.setText("Forget password ?");

        btnLogin.setBackground(new java.awt.Color(51, 102, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/login_of_login.png"))); // NOI18N
        btnLogin.setPreferredSize(new java.awt.Dimension(110, 35));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 51, 51));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/cancel_of_login.png"))); // NOI18N
        btnReset.setPreferredSize(new java.awt.Dimension(110, 35));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));

        lbYouNeedAccount.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lbYouNeedAccount.setText("You need an account ?");

        lbSignUp.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbSignUp.setText("<html><u>SIGN UP</u></html>");
        lbSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSignUpMouseClicked(evt);
            }
        });

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/btn_return.png"))); // NOI18N
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(lbForgetPassword)))))
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(lbLogoUserLogin)
                        .addGap(412, 412, 412))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(lbYouNeedAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSignUp)
                        .addGap(357, 357, 357))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(btnReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogoCrimeFile))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogoCrimeFile)
                    .addComponent(btnReturn))
                .addGap(110, 110, 110)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lbLogoUserLogin)
                        .addGap(53, 53, 53)
                        .addComponent(lbUsername))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lbForgetPassword)
                .addGap(39, 39, 39)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbYouNeedAccount)
                    .addComponent(lbSignUp))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String usernameStr = txtUsername.getText();
            String passwordStr = new String(txtPassword.getPassword());
            
            PreparedStatement preparedStatement = MainConnection.getConnection()
                    .prepareStatement("select Username, Password from Users");
            ResultSet resultSet = preparedStatement.executeQuery();
            
            boolean isUser = false;
            while (resultSet.next()) {
                if (usernameStr.equalsIgnoreCase(resultSet.getString("Username")) 
                        && passwordStr.equalsIgnoreCase(resultSet.getString("Password")))
                    isUser = true;
            }
            
            if (isUser) {
                JOptionPane.showMessageDialog(this, 
                        "Login successfully with username " + usernameStr + "!", 
                        "Login Successful!", JOptionPane.INFORMATION_MESSAGE, 
                        new ImageIcon(getClass().getResource("/images/logo/logo.png")));
                setVisible(false);
                JFrame frame = new Home_User();
                frame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Invalid username or password, please try again later", 
                        "Error", JOptionPane.ERROR_MESSAGE, 
                        new ImageIcon(getClass().getResource("/images/logo/logo.png")));
                txtUsername.requestFocus();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        JTextField[] arrTxt = {txtUsername, txtPassword};
        
        List<JTextField> listTxt = new ArrayList<>();
        listTxt.addAll(Arrays.asList(arrTxt));
        
        listTxt.forEach(txt -> txt.setText(""));
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        setVisible(false);
        JFrame frame = new Home_Guest();
        frame.setVisible(true);
    }//GEN-LAST:event_btnReturnMouseClicked

    private void lbSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSignUpMouseClicked
        setVisible(false);
        JFrame frame = new Create_Account_User();
        frame.setVisible(true);
    }//GEN-LAST:event_lbSignUpMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel btnReturn;
    private javax.swing.JLabel lbForgetPassword;
    private javax.swing.JLabel lbLogoCrimeFile;
    private javax.swing.JLabel lbLogoUserLogin;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSignUp;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbYouNeedAccount;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
