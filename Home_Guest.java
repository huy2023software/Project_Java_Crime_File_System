/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame.home;

import frame.background_processing.WindowAction;

/**
 *
 * @author user
 */
public class Home_Guest extends WindowAction {

    /**
     * Creates new form Home_Guest
     */
    public Home_Guest() {
        initComponents();
        setResizable(true);
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
        btnLoginAdmin = new javax.swing.JButton();
        btnLoginUser = new javax.swing.JButton();
        lbLogoHomeCrime = new javax.swing.JLabel();
        btnMWTCrime = new javax.swing.JButton();
        lbIntroduction = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaIntroduction = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Guest Home");

        panel.setBackground(new java.awt.Color(220, 220, 220));
        panel.setPreferredSize(new java.awt.Dimension(1080, 660));

        lbLogoCrimeFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo/logo.png"))); // NOI18N

        btnLoginAdmin.setBackground(new java.awt.Color(204, 255, 204));
        btnLoginAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/login_admin_of_home.png"))); // NOI18N
        btnLoginAdmin.setPreferredSize(new java.awt.Dimension(146, 27));

        btnLoginUser.setBackground(new java.awt.Color(204, 255, 255));
        btnLoginUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/login_user_of_home.png"))); // NOI18N
        btnLoginUser.setPreferredSize(new java.awt.Dimension(146, 27));

        lbLogoHomeCrime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo/logo_home_crime.png"))); // NOI18N
        lbLogoHomeCrime.setToolTipText("");

        btnMWTCrime.setBackground(new java.awt.Color(255, 204, 204));
        btnMWTCrime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/button_mwtcrime.png"))); // NOI18N
        btnMWTCrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMWTCrimeActionPerformed(evt);
            }
        });

        lbIntroduction.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lbIntroduction.setText("Introduction");
        lbIntroduction.setToolTipText("");

        txtaIntroduction.setBackground(new java.awt.Color(220, 220, 220));
        txtaIntroduction.setColumns(20);
        txtaIntroduction.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtaIntroduction.setRows(5);
        txtaIntroduction.setText("        Crime File is a useful application that allows users to record, manage, and search for information related to criminal cases.With its intuitive and user-friendly interface,\nusers can create criminal profiles and input detailed information such as the perpetrator's name, date of occurrence , location , and relevant evidence. The application also \nsupports storing documents, images, and videos to enhance the evidential value of the cases.\n\n        A significant feature of Crime File is its quick search capability based on criteria such as the criminal's name,crime type,or location. This enables efficient information \nretrieval and analysis of crime data. The data encryption and access management features ensure the security of user information. \n\n        Crime File contributes to improving the efficiency and effectiveness of criminal information management, thereby reducing crime and enhancing community security.");
        txtaIntroduction.setBorder(null);
        jScrollPane1.setViewportView(txtaIntroduction);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(lbLogoCrimeFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lbIntroduction)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 445, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(lbLogoHomeCrime)
                        .addGap(414, 414, 414))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(btnMWTCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogoCrimeFile)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnMWTCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(lbLogoHomeCrime)
                .addGap(85, 85, 85)
                .addComponent(lbIntroduction)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMWTCrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMWTCrimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMWTCrimeActionPerformed

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
            System.out.println("Erro " + ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home_Guest().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginAdmin;
    private javax.swing.JButton btnLoginUser;
    private javax.swing.JButton btnMWTCrime;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIntroduction;
    private javax.swing.JLabel lbLogoCrimeFile;
    private javax.swing.JLabel lbLogoHomeCrime;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea txtaIntroduction;
    // End of variables declaration//GEN-END:variables
}
