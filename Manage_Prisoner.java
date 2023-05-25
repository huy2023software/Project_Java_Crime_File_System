/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame.prisoner;

import frame.background_processing.WindowAction;
import frame.home.Home_Admin;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import connection.MainConnection;
import object.Prisoner;

/**
 *
 * @author PREDATOR
 */
public class Manage_Prisoner extends WindowAction {

    public static final ArrayList<Prisoner> arrPrisoner = new ArrayList<Prisoner>();
    public static final Connection connCrimeFile = MainConnection.getConnection();

    /**
     * Creates new form Manage_Prisoner
     */
    public Manage_Prisoner() {
        dataArrayListPrisoner();
        initComponents();
        loadDataArrayListToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbLogoManagePrisoner = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPrisoner = new javax.swing.JTable();
        pnControlFIR = new javax.swing.JPanel();
        lbControlPrisoner = new javax.swing.JLabel();
        lbFullName = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        lbGender = new javax.swing.JLabel();
        lbPrisonerTerm = new javax.swing.JLabel();
        lbCrimeType = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtPrisonTerm = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lbStatus = new javax.swing.JLabel();
        cbbCrimeType = new javax.swing.JComboBox<>();
        cbbStatus = new javax.swing.JComboBox<>();
        cbbGender = new javax.swing.JComboBox<>();
        btnReturn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 660));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo/logo.png"))); // NOI18N
        lbLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoMouseClicked(evt);
            }
        });

        lbLogoManagePrisoner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo/logo_prisoner.png"))); // NOI18N

        txtSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search...");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tbPrisoner.setBackground(new java.awt.Color(204, 204, 204));
        tbPrisoner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prisoner ID", "Full Name", "Age", "Gender", "Crime Type", "Prisoner Term", "Status"
            }
        ));
        tbPrisoner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPrisonerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPrisoner);

        pnControlFIR.setBackground(new java.awt.Color(204, 204, 204));
        pnControlFIR.setPreferredSize(new java.awt.Dimension(1078, 239));

        lbControlPrisoner.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbControlPrisoner.setText("Control Prisoner");

        lbFullName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbFullName.setText("Full Name");

        lbAge.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAge.setText("Age");

        lbGender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbGender.setText("Gender");

        lbPrisonerTerm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbPrisonerTerm.setText("Prison Term");

        lbCrimeType.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCrimeType.setText("Crime Type");

        txtAge.setBackground(new java.awt.Color(220, 220, 220));
        txtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAgeFocusLost(evt);
            }
        });

        txtFullName.setBackground(new java.awt.Color(220, 220, 220));
        txtFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFullNameFocusLost(evt);
            }
        });

        txtPrisonTerm.setBackground(new java.awt.Color(220, 220, 220));
        txtPrisonTerm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrisonTermFocusLost(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(51, 153, 0));
        btnCreate.setForeground(new java.awt.Color(51, 153, 0));
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/create-button.png"))); // NOI18N
        btnCreate.setMaximumSize(new java.awt.Dimension(95, 31));
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 204, 255));
        btnUpdate.setForeground(new java.awt.Color(0, 204, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/update_button.png"))); // NOI18N
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setForeground(new java.awt.Color(255, 0, 51));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/delete-button.png"))); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 51, 51));
        btnReset.setForeground(new java.awt.Color(51, 51, 51));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/reset_button.png"))); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        lbStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbStatus.setText("Status");

        cbbCrimeType.setBackground(new java.awt.Color(220, 220, 220));
        cbbCrimeType.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbbCrimeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corruption", "Counterfeit Currency Or Documents", "Crimes Against Children", "Cyber Crime", "Drug Trafficking", "Environmental Crime", "Financial Crime", "Firearms Trafficking", "Human Trafficking", "Illcit Goods", "Killing Crime", "Kidnap Crime" }));

        cbbStatus.setBackground(new java.awt.Color(220, 220, 220));
        cbbStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detained", "Released" }));

        cbbGender.setBackground(new java.awt.Color(220, 220, 220));
        cbbGender.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout pnControlFIRLayout = new javax.swing.GroupLayout(pnControlFIR);
        pnControlFIR.setLayout(pnControlFIRLayout);
        pnControlFIRLayout.setHorizontalGroup(
            pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnControlFIRLayout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(lbControlPrisoner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnControlFIRLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAge)
                    .addComponent(lbFullName)
                    .addComponent(lbGender))
                .addGap(18, 18, 18)
                .addGroup(pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(cbbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFullName))
                .addGap(51, 51, 51)
                .addGroup(pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCrimeType)
                    .addComponent(lbPrisonerTerm)
                    .addComponent(lbStatus))
                .addGap(18, 18, 18)
                .addGroup(pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPrisonTerm, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbCrimeType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        pnControlFIRLayout.setVerticalGroup(
            pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnControlFIRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(pnControlFIRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbControlPrisoner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnControlFIRLayout.createSequentialGroup()
                        .addGroup(pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbFullName)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(lbAge))
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrisonerTerm)
                    .addGroup(pnControlFIRLayout.createSequentialGroup()
                        .addGroup(pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnControlFIRLayout.createSequentialGroup()
                                .addComponent(lbCrimeType)
                                .addGap(26, 26, 26))
                            .addGroup(pnControlFIRLayout.createSequentialGroup()
                                .addComponent(cbbCrimeType)
                                .addGap(24, 24, 24)))
                        .addComponent(txtPrisonTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(pnControlFIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbGender, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lbGender, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
        );

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/btn_return.png"))); // NOI18N
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 722, Short.MAX_VALUE))
                    .addComponent(pnControlFIR, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnReturn)
                .addGap(331, 331, 331)
                .addComponent(lbLogoManagePrisoner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(lbLogo))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbLogo)
                                .addGap(0, 40, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbLogoManagePrisoner)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnControlFIR, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusLost
        JTextField textField = (JTextField) evt.getSource();
        if (textField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Full Name not empty !");
            textField.requestFocus();
        }
    }//GEN-LAST:event_txtFullNameFocusLost

    private void txtAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusLost
        JTextField textField = (JTextField) evt.getSource();
        if (textField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Age not empty !");
            textField.requestFocus();
        }
    }//GEN-LAST:event_txtAgeFocusLost

    private void txtPrisonTermFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrisonTermFocusLost
        JTextField textField = (JTextField) evt.getSource();
        if (textField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Prison Term not empty !");
            textField.requestFocus();
        }
    }//GEN-LAST:event_txtPrisonTermFocusLost

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
        int selectRow = tbPrisoner.getSelectedRow();

        String fullname = txtFullName.getText();
        String age = txtAge.getText();
        String genderStr = cbbGender.getSelectedItem().toString();
        char gender = genderStr.charAt(0);
        String crimeType = cbbCrimeType.getSelectedItem().toString();
        String prisonTerm = txtPrisonTerm.getText();
        String status = cbbStatus.getSelectedItem().toString();

        try {
            Statement staCreateFir = connCrimeFile.createStatement();
            ResultSet rsCreatePrisoner = staCreateFir.executeQuery("SELECT TOP 1 PrisonerID FROM Prisoner ORDER BY PrisonerID DESC");

            int maxPrisonerID = 0;
            if (rsCreatePrisoner.next()) {
                String maxPrisonerIDStr = rsCreatePrisoner.getString("PrisonerID");
                maxPrisonerID = Integer.parseInt(maxPrisonerIDStr.substring(3));
            }

            String nextPrisonerID = "Pri" + String.format("%03d", maxPrisonerID + 1);

            PreparedStatement preCreatePrisoner = connCrimeFile.prepareStatement("INSERT INTO Prisoner (PrisonerID, Fullname, Age, Gender, CrimeType, "
                           + "PrisonTerm, Status) VALUES (?,?,?,?,?,?,?)");
            preCreatePrisoner.setString(1, nextPrisonerID);
            preCreatePrisoner.setString(2, fullname);
            preCreatePrisoner.setString(3, age);
            preCreatePrisoner.setString(4, String.valueOf(gender));
            preCreatePrisoner.setString(5, crimeType);
            preCreatePrisoner.setString(6, prisonTerm);
            preCreatePrisoner.setString(7, status);
            preCreatePrisoner.executeUpdate();

            rsCreatePrisoner.close();
            preCreatePrisoner.close();
            JOptionPane.showMessageDialog(null, "Create successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            dataArrayListPrisoner();
            loadDataArrayListToTable();
        } catch (SQLException ex) {
            System.out.println("Error create " + ex);
        }
    }//GEN-LAST:event_btnCreateMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        int confirmResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Confirm Update", JOptionPane.YES_NO_OPTION);

        if (confirmResult == JOptionPane.YES_OPTION) {
            int selectRow = tbPrisoner.getSelectedRow();

            String prisonerID = tbPrisoner.getValueAt(selectRow, 0).toString();
            String fullname = txtFullName.getText();
            String age = txtAge.getText();
            String genderStr = cbbGender.getSelectedItem().toString();
            char gender = genderStr.charAt(0);
            String crimeType = cbbCrimeType.getSelectedItem().toString();
            String prisonTerm = txtPrisonTerm.getText();
            String status = cbbStatus.getSelectedItem().toString();

            try {
                PreparedStatement preUpdatePrisoner = connCrimeFile.prepareStatement("UPDATE Prisoner SET Fullname = ?, Age = ?, Gender = ?, CrimeType = ?, PrisonTerm = ?, Status = ? WHERE PrisonerID = ?");
                preUpdatePrisoner.setString(1, fullname);
                preUpdatePrisoner.setString(2, age);
                preUpdatePrisoner.setString(3, String.valueOf(gender));
                preUpdatePrisoner.setString(4, crimeType);
                preUpdatePrisoner.setString(5, prisonTerm);
                preUpdatePrisoner.setString(6, status);
                preUpdatePrisoner.setString(7, prisonerID);

                preUpdatePrisoner.executeUpdate();
                preUpdatePrisoner.close();

                JOptionPane.showMessageDialog(null, "Update successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                dataArrayListPrisoner();
                loadDataArrayListToTable();
            } catch (SQLException ex) {
                System.out.println("Error during update: " + ex);
            }
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        int rely = JOptionPane.showConfirmDialog(this, "You sure want to delete !", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (rely == JOptionPane.YES_OPTION) {
            String idColumnDelete;
            int rowDelete;
            rowDelete = tbPrisoner.getSelectedRow();
            idColumnDelete = (String) tbPrisoner.getValueAt(rowDelete, 0);
            System.out.println(" " + idColumnDelete);
            deleteRow(idColumnDelete);
            dataArrayListPrisoner();
            loadDataArrayListToTable();
            JOptionPane.showMessageDialog(this, "Successful Delete.");
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        txtFullName.setText("");
        txtAge.setText("");
        cbbGender.setSelectedItem("Male");
        cbbCrimeType.setSelectedItem("Corruption");
        txtPrisonTerm.setText("");
        cbbStatus.setSelectedItem("Detained");
    }//GEN-LAST:event_btnResetMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        arrPrisoner.clear();
        try {
            String searchEnter = txtSearch.getText();
            String sqlSearch = "SELECT PrisonerID, Fullname, Age, Gender, CrimeType, PrisonTerm, Status FROM Prisoner Where PrisonerID Like ? Or Fullname Like ? "
                           + "Or Age Like ? Or PrisonTerm Like ? ";
            PreparedStatement preSearch = connCrimeFile.prepareStatement(sqlSearch);
            preSearch.setString(1, "%" + searchEnter + "%");
            preSearch.setString(2, "%" + searchEnter + "%");
            preSearch.setString(3, "%" + searchEnter + "%");
            preSearch.setString(4, "%" + searchEnter + "%");
            ResultSet rsPrisoner = preSearch.executeQuery();
            while (rsPrisoner.next()) {
                String prisonerID = rsPrisoner.getString("PrisonerID");
                String fullname = rsPrisoner.getString("Fullname");
                int age = rsPrisoner.getInt("Age");
                String genderStr = rsPrisoner.getString("Gender");
                char gender = genderStr.charAt(0);
                String crimeType = rsPrisoner.getString("CrimeType");
                int prisonTerm = rsPrisoner.getInt("PrisonTerm");
                String status = rsPrisoner.getString("Status");

                Prisoner prisonerTable = new Prisoner(prisonerID, fullname, age, gender, crimeType, prisonTerm, status);
                arrPrisoner.add(prisonerTable);
            }
            loadDataArrayListToTable();
        }catch (SQLException e) {
            System.out.println("Error search " + e);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        Color placeholderForeground = new Color(153, 153, 153); 
        txtSearch.setText("Search ...");
        txtSearch.setForeground(placeholderForeground);
    }//GEN-LAST:event_txtSearchFocusLost

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        Home_Admin homeAdmin = new Home_Admin();
        homeAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnMouseClicked

    private void lbLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoMouseClicked
        Home_Admin homeAdmin = new Home_Admin();
        homeAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbLogoMouseClicked

    private void tbPrisonerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPrisonerMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbPrisoner.getModel();
        int selectIndex = tbPrisoner.getSelectedRow();
        txtFullName.setText(model.getValueAt(selectIndex, 1).toString());
        txtAge.setText(model.getValueAt(selectIndex, 2).toString());
        String genderValue = model.getValueAt(selectIndex, 3).toString();
        if (genderValue.equals("M")) {
            cbbGender.setSelectedItem("Male");
        } else if (genderValue.equals("F")) {
            cbbGender.setSelectedItem("Female");
        }
        cbbCrimeType.setSelectedItem(model.getValueAt(selectIndex, 4).toString());
        txtPrisonTerm.setText(model.getValueAt(selectIndex, 5).toString());
        cbbStatus.setSelectedItem(model.getValueAt(selectIndex, 6).toString());
    }//GEN-LAST:event_tbPrisonerMouseClicked

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        Color textForeground = Color.BLACK;
        txtSearch.setText("");
        txtSearch.setForeground(textForeground);
    }//GEN-LAST:event_txtSearchFocusGained

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
            java.util.logging.Logger.getLogger(Manage_Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Prisoner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel btnReturn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbCrimeType;
    private javax.swing.JComboBox<String> cbbGender;
    private javax.swing.JComboBox<String> cbbStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbControlPrisoner;
    private javax.swing.JLabel lbCrimeType;
    private javax.swing.JLabel lbFullName;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbLogoManagePrisoner;
    private javax.swing.JLabel lbPrisonerTerm;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JPanel pnControlFIR;
    private static javax.swing.JTable tbPrisoner;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPrisonTerm;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void dataArrayListPrisoner() {
        arrPrisoner.clear();
        try {
            Statement staPrisoner = connCrimeFile.createStatement();
            ResultSet rsPrisoner = staPrisoner.executeQuery("SELECT PrisonerID, Fullname, Age, Gender, CrimeType, PrisonTerm, Status FROM Prisoner");
            while (rsPrisoner.next()) {
                String prisonerID = rsPrisoner.getString("PrisonerID");
                String fullname = rsPrisoner.getString("Fullname");
                int age = rsPrisoner.getInt("Age");
                String genderStr = rsPrisoner.getString("Gender");
                char gender = genderStr.charAt(0);
                String crimeType = rsPrisoner.getString("CrimeType");
                int prisonTerm = rsPrisoner.getInt("PrisonTerm");
                String status = rsPrisoner.getString("Status");

                Prisoner prisonerTable = new Prisoner(prisonerID, fullname, age, gender, crimeType, prisonTerm, status);
                arrPrisoner.add(prisonerTable);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving data from Prisoner: " + e);
        }
    }

    private void loadDataArrayListToTable() {
        DefaultTableModel model = (DefaultTableModel) Manage_Prisoner.tbPrisoner.getModel();
        model.setRowCount(0);

        for (Prisoner prisoner : arrPrisoner) {
            model.addRow(new Object[]{prisoner.getPrisonerID(), prisoner.getfullName(), prisoner.getAge(), prisoner.getGender(), prisoner.getCrimeType(),
                prisoner.getPrisonerTerm(), prisoner.getStatus()
            });
        }
    }

    private void deleteRow(String idColumnDelete) {
        int rows = 0;
        try {
            String sqlDelete = "Delete From Prisoner Where PrisonerID = ?";
            PreparedStatement preDelete = connCrimeFile.prepareStatement(sqlDelete);
            preDelete.setString(1, idColumnDelete);
            rows = preDelete.executeUpdate();
            if (rows >= 1) {
                System.out.println("Successful Delete");
            } else {
                System.out.println(rows + "Failed");
            }
            preDelete.close();
        } catch (SQLException e) {
            System.out.println("Error delete row" + e);
        }
    }
}
