/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.DistributionHub.DistributionHub;
import Business.DistributionHub.DistributionHubDirectory;
import Business.UserAccount.UserAccount;
import Business.Worker.Worker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import ui.DonorRole.DonorProfilePanel;

/**
 *
 *@author reetikabhanushali
 */
public class ViewModifyDHPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyDHPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    DistributionHubDirectory fcd;

    public ViewModifyDHPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        addMockData();
        populateWHtable();
        //txtDistributionHubuname.setEnabled(false);
        setBG();
        makeTableTransparent();
    }
    
    public void addMockData() {
        // Create UserAccount for Central Hub
        Worker worker1 = new Worker();
        worker1.setName("John Doe");
        UserAccount user1 = new UserAccount();
        user1.setUsername("DHOne");
        user1.setPassword("DHOne@123");
        user1.setEmployee(worker1);

        // Create Central Hub
        DistributionHub dh1 = new DistributionHub();
        dh1.setDistributionHubId("DH001");
        dh1.setDistributionHubName("DistHubOne");
        dh1.setDistributionHubPhone("1234567890");
        dh1.setDistributionHubAddress("123 Main St");
        dh1.setDistributionHubCity("Boston");
        dh1.setDistributionHubState("MA");
        dh1.setDistributionHubZipcode("02118");
        dh1.setDistributionHubAdmin("DHAdminOne");
        dh1.setDistributionHubAccount(user1); // Link the UserAccount to this hub

        // Create UserAccount for East Hub
        Worker worker2 = new Worker();
        worker2.setName("DHtwo");
        UserAccount user2 = new UserAccount();
        user2.setUsername("DHTwo");
        user2.setPassword("DHTwo@123");
        user2.setEmployee(worker2);

        // Create East Hub
        DistributionHub dh2 = new DistributionHub();
        dh2.setDistributionHubId("DH002");
        dh2.setDistributionHubName("DistHubOne");
        dh2.setDistributionHubPhone("9876543210");
        dh2.setDistributionHubAddress("456 Elm St");
        dh2.setDistributionHubCity("New York");
        dh2.setDistributionHubState("NY");
        dh2.setDistributionHubZipcode("10001");
        dh2.setDistributionHubAdmin("DHAdminTwo");
        dh2.setDistributionHubAccount(user2); // Link the UserAccount to this hub

        // Add mock data to the DistributionHubDirectory
        ecosystem.getACDDirectory().addNewDistributionHub(dh1);
        ecosystem.getACDDirectory().addNewDistributionHub(dh2);
        
        ecosystem.setdistributionHubCnt(ecosystem.getdistributionHubCnt() + 2);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddWarehouseTitle = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblWarehouseDetails = new javax.swing.JTable();
        btnWarehouseDelete = new javax.swing.JButton();
        btnWarehouseEdit = new javax.swing.JButton();
        lblDistributionHubname = new javax.swing.JLabel();
        txtDistributionHubname = new javax.swing.JTextField();
        lblDistributionHubPhone = new javax.swing.JLabel();
        txtDistributionHubPhone = new javax.swing.JTextField();
        lblDistributionHubAdd = new javax.swing.JLabel();
        txtDistributionHubAdd = new javax.swing.JTextField();
        lblDistributionHubCity = new javax.swing.JLabel();
        txtDistributionHubCity = new javax.swing.JTextField();
        lblDistributionHubState = new javax.swing.JLabel();
        txtDistributionHubState = new javax.swing.JTextField();
        lblDistributionHubZip = new javax.swing.JLabel();
        txtDistributionHubZip = new javax.swing.JTextField();
        lblDistributionHubAdmin = new javax.swing.JLabel();
        txtDistributionHubAdmin = new javax.swing.JTextField();
        lblDistributionHubuname = new javax.swing.JLabel();
        txtDistributionHubuname = new javax.swing.JTextField();
        lblDistributionHubAdminpwd = new javax.swing.JLabel();
        txtDistributionHubAdminpwd = new javax.swing.JTextField();
        btnWarehouseUpdate = new javax.swing.JButton();
        lblDistributionHubname1 = new javax.swing.JLabel();
        lblDistributionHubPhone1 = new javax.swing.JLabel();
        lblDistributionHubAdd1 = new javax.swing.JLabel();
        lblDistributionHubCity1 = new javax.swing.JLabel();
        lblDistributionHubState1 = new javax.swing.JLabel();
        lblDistributionHubZip1 = new javax.swing.JLabel();
        lblDistributionHubAdmin1 = new javax.swing.JLabel();
        lblDistributionHubuname1 = new javax.swing.JLabel();
        lblFCAdminpwd1 = new javax.swing.JLabel();
        lblDistributionHubid = new javax.swing.JLabel();
        lblWarehouseid1 = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddWarehouseTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblAddWarehouseTitle.setForeground(new java.awt.Color(102, 102, 255));
        lblAddWarehouseTitle.setText("Distribution Hub Details");
        add(lblAddWarehouseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        tblWarehouseDetails.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblWarehouseDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Distribution Hub ID", "Name", "Admin", "Phone Number", "Address", "City", "State", "Zip"
            }
        ));
        tblWarehouseDetails.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tblWarehouseDetailsMouseMoved(evt);
            }
        });
        tblWarehouseDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblWarehouseDetailsMousePressed(evt);
            }
        });
        jScrollPane.setViewportView(tblWarehouseDetails);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 950, 153));

        btnWarehouseDelete.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnWarehouseDelete.setText("Delete");
        btnWarehouseDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarehouseDeleteActionPerformed(evt);
            }
        });
        add(btnWarehouseDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 92, -1));

        btnWarehouseEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnWarehouseEdit.setText("Edit");
        btnWarehouseEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarehouseEditActionPerformed(evt);
            }
        });
        add(btnWarehouseEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 92, -1));

        lblDistributionHubname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubname.setText("Distribution Hub Name:");
        add(lblDistributionHubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        txtDistributionHubname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubnameFocusLost(evt);
            }
        });
        txtDistributionHubname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDistributionHubnameKeyReleased(evt);
            }
        });
        add(txtDistributionHubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 137, -1));

        lblDistributionHubPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubPhone.setText(" Distribution Hub Phone Number:");
        add(lblDistributionHubPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        txtDistributionHubPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubPhoneFocusLost(evt);
            }
        });
        txtDistributionHubPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDistributionHubPhoneKeyReleased(evt);
            }
        });
        add(txtDistributionHubPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 277, 137, -1));

        lblDistributionHubAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubAdd.setText("Distribution Hub Address:");
        add(lblDistributionHubAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        txtDistributionHubAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDistributionHubAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 313, 137, -1));

        lblDistributionHubCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubCity.setText("Distribution Hub City:");
        add(lblDistributionHubCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        txtDistributionHubCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDistributionHubCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 137, -1));

        lblDistributionHubState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubState.setText("Distribution Hub State:");
        add(lblDistributionHubState, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        txtDistributionHubState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDistributionHubState, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 387, 137, -1));

        lblDistributionHubZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubZip.setText("Distribution Hub Zip:");
        add(lblDistributionHubZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        txtDistributionHubZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubZipFocusLost(evt);
            }
        });
        add(txtDistributionHubZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 424, 137, -1));

        lblDistributionHubAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubAdmin.setText("Distribution Hub Admin Name:");
        add(lblDistributionHubAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        txtDistributionHubAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubAdmin.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubAdminFocusLost(evt);
            }
        });
        add(txtDistributionHubAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 461, 137, -1));

        lblDistributionHubuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubuname.setText("Distribution Hub Admin Username:");
        add(lblDistributionHubuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        txtDistributionHubuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubuname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDistributionHubuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 498, 137, -1));

        lblDistributionHubAdminpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubAdminpwd.setText("Distribution Hub Admin Password:");
        add(lblDistributionHubAdminpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, 25));

        txtDistributionHubAdminpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubAdminpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDistributionHubAdminpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 535, 137, -1));

        btnWarehouseUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnWarehouseUpdate.setText("Update");
        btnWarehouseUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarehouseUpdateActionPerformed(evt);
            }
        });
        add(btnWarehouseUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 92, -1));

        lblDistributionHubname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDistributionHubname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 240, -1, -1));

        lblDistributionHubPhone1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDistributionHubPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDistributionHubAdd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDistributionHubAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 313, -1, -1));

        lblDistributionHubCity1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDistributionHubCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 350, -1, -1));

        lblDistributionHubState1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDistributionHubState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDistributionHubZip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDistributionHubZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDistributionHubAdmin1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDistributionHubAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDistributionHubuname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDistributionHubuname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 498, -1, -1));

        lblFCAdminpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCAdminpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDistributionHubid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubid.setText("Distribution Hub ID:");
        add(lblDistributionHubid, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 230, -1, -1));

        lblWarehouseid1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehouseid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 230, -1, -1));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 730));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void txtDistributionHubnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistributionHubnameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDistributionHubnameKeyReleased

    private void txtDistributionHubPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistributionHubPhoneKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDistributionHubPhoneKeyReleased

    private void txtDistributionHubnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubnameFocusLost
        // TODO add your handling code here:
        if (!(txtDistributionHubname.getText().matches("^[a-zA-Z]*$"))) {
            lblDistributionHubname1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblDistributionHubname1.setText("");
        }
    }//GEN-LAST:event_txtDistributionHubnameFocusLost

    private void txtDistributionHubPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubPhoneFocusLost
        // TODO add your handling code here:
        if (!(txtDistributionHubPhone.getText().matches("^[0-9]*$")) || !(txtDistributionHubPhone.getText().length() == 10)) {
            lblDistributionHubPhone1.setText("Please enter a valid phone number");
        } else {
            lblDistributionHubPhone1.setText("");

        }
    }//GEN-LAST:event_txtDistributionHubPhoneFocusLost

    private void txtDistributionHubZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubZipFocusLost
        // TODO add your handling code here:
        if ((txtDistributionHubZip.getText().matches("^[a-zA-Z]*$"))) {
            lblDistributionHubZip1.setText("Invalid input. Please enter only numbers");
        } else {
            lblDistributionHubZip1.setText("");
        }
    }//GEN-LAST:event_txtDistributionHubZipFocusLost

    private void txtDistributionHubAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubAdminFocusLost
        // TODO add your handling code here:
        if (!(txtDistributionHubAdmin.getText().matches("^[a-zA-Z]*$"))) {
            lblDistributionHubAdmin1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblDistributionHubAdmin1.setText("");
        }
    }//GEN-LAST:event_txtDistributionHubAdminFocusLost

    private void btnWarehouseEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarehouseEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouseDetails.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblWarehouseDetails.getModel();
        DistributionHub selectedFCW = (DistributionHub) model.getValueAt(selectedRowIndex, 0);
        lblWarehouseid1.setText(selectedFCW.getDistributionHubId());
        txtDistributionHubname.setText(selectedFCW.getDistributionHubName());
        txtDistributionHubPhone.setText(selectedFCW.getDistributionHubPhone());
        txtDistributionHubAdd.setText(selectedFCW.getDistributionHubAddress());
        txtDistributionHubCity.setText(selectedFCW.getDistributionHubCity());
        txtDistributionHubState.setText(selectedFCW.getDistributionHubState());
        txtDistributionHubZip.setText(selectedFCW.getDistributionHubZipcode());
        txtDistributionHubAdmin.setText(selectedFCW.getDistributionHubAdmin());
        txtDistributionHubuname.setText(selectedFCW.getDistributionHubAccount().getUsername());
        txtDistributionHubAdminpwd.setText(selectedFCW.getDistributionHubAccount().getPassword());
    }//GEN-LAST:event_btnWarehouseEditActionPerformed

    private void btnWarehouseDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarehouseDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouseDetails.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblWarehouseDetails.getModel();
        DistributionHub selectedHub = (DistributionHub) model.getValueAt(selectedRowIndex, 0);

        ecosystem.getUserAccountDirectory().deleteUserAccount(
            ecosystem.getACDDirectory().getFadList().get(selectedRowIndex).getDistributionHubAccount()
        );
        ecosystem.getACDDirectory().deleteDistributionHub(selectedHub);

        Integer whcnt = ecosystem.getdistributionHubCnt();
        if (whcnt == null) {
            whcnt = 0; // Fallback to 0 if null
        }
        ecosystem.setdistributionHubCnt(whcnt - 1);

        JOptionPane.showMessageDialog(this, "Warehouse deleted successfully");
        populateWHtable();
        clearfields();
    }//GEN-LAST:event_btnWarehouseDeleteActionPerformed

    public boolean isValid(String test, String regex) {
//        String regex = "^[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (test == null) {
            return false;
        }

        Matcher m = p.matcher(test);

        return m.matches();
    }


    private void btnWarehouseUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarehouseUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouseDetails.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblWarehouseDetails.getModel();
        String WHid = lblWarehouseid1.getText();

        ArrayList<DistributionHub> fcWarehouseList = ecosystem.getACDDirectory().getFadList();
        for (DistributionHub f : fcWarehouseList) {
            if (f.getDistributionHubId().equals(WHid)) {

                String whName = txtDistributionHubname.getText();
                String phone = txtDistributionHubPhone.getText();

                String whCity = txtDistributionHubCity.getText();
                String whState = txtDistributionHubState.getText();
                String whZip = txtDistributionHubZip.getText();
                String whAdmin = txtDistributionHubAdmin.getText();
                String whUser = txtDistributionHubuname.getText();
                String whPswd = txtDistributionHubAdminpwd.getText();

//                if (!isValid(whName, "^[A-Za-z]{3,}")) {
//                    JOptionPane.showMessageDialog(this, "Please enter valid name");
//                    return;
//                }
                if (!isValid(phone, "[+]?[0-9]{10,13}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid phone number");
                    return;
                }
                if (!isValid(whCity, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid city");
                    return;
                }
                if (!isValid(whState, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){2,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid state");
                    return;
                }
                if (!isValid(whZip, "^[0-9]{5}(?:-[0-9]{4})?$")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid zip");
                    return;
                }
//                if (!isValid(whAdmin, "^[A-Za-z]{3,}")) {
//                    JOptionPane.showMessageDialog(this, "Please enter a valid name");
//                    return;
//                }
                if (!isValid(whUser, "^[a-zA-Z0-9._-]{6,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid username of atleast 6 characters");
                    return;
                }
                if (!isValid(whPswd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid password of atleast 8 characters in length. It must contain a number, a specicial character, a lowercase and an uppercase character.");
                    return;
                }

                f.setDistributionHubName(txtDistributionHubname.getText());
                f.setDistributionHubPhone(txtDistributionHubPhone.getText());
                f.setDistributionHubAddress(txtDistributionHubAdd.getText());
                f.getDistributionHubCity(txtDistributionHubCity.getText());
                f.setDistributionHubState(txtDistributionHubState.getText());
                f.setDistributionHubZipcode(txtDistributionHubZip.getText());
                f.setDistributionHubAdmin(txtDistributionHubAdmin.getText());
                //UserAccount WHua=new UserAccount();
                //WHua.setUsername(txtFCAuname.getText());
                //WHua.setPassword(txtFCApwd.getText());
                if (f.getDistributionHubAccount().getUsername().equals(txtDistributionHubuname.getText())) {
                    f.getDistributionHubAccount().setPassword(txtDistributionHubAdminpwd.getText());
                    f.getDistributionHubAccount().getEmployee().setName(txtDistributionHubAdmin.getText());
                }
                //f.setFcwAccount(WHua);
                break;
            }

        }
        // ecosystem.setFCWDirectory(fcWarehouseList);
        fcd = ecosystem.getACDDirectory();
        ecosystem.setACDDirectory(fcd);
        JOptionPane.showMessageDialog(this, "warehouse details updated successfully");
        clearfields();
        populateWHtable();
    }//GEN-LAST:event_btnWarehouseUpdateActionPerformed

    private void tblWarehouseDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWarehouseDetailsMousePressed
        tblWarehouseDetails.setSelectionForeground(Color.BLACK);

    }//GEN-LAST:event_tblWarehouseDetailsMousePressed

    private void tblWarehouseDetailsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWarehouseDetailsMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tblWarehouseDetailsMouseMoved

    public void makeTableTransparent() {
        tblWarehouseDetails.setOpaque(false);
        ((DefaultTableCellRenderer) tblWarehouseDetails.getDefaultRenderer(Object.class)).setOpaque(false);
        tblWarehouseDetails.setShowGrid(false);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblWarehouseDetails.getModel().getColumnCount(); i++) {
            tblWarehouseDetails.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnWarehouseDelete;
    private javax.swing.JButton btnWarehouseEdit;
    private javax.swing.JButton btnWarehouseUpdate;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblAddWarehouseTitle;
    private javax.swing.JLabel lblDistributionHubAdd;
    private javax.swing.JLabel lblDistributionHubAdd1;
    private javax.swing.JLabel lblDistributionHubAdmin;
    private javax.swing.JLabel lblDistributionHubAdmin1;
    private javax.swing.JLabel lblDistributionHubAdminpwd;
    private javax.swing.JLabel lblDistributionHubCity;
    private javax.swing.JLabel lblDistributionHubCity1;
    private javax.swing.JLabel lblDistributionHubPhone;
    private javax.swing.JLabel lblDistributionHubPhone1;
    private javax.swing.JLabel lblDistributionHubState;
    private javax.swing.JLabel lblDistributionHubState1;
    private javax.swing.JLabel lblDistributionHubZip;
    private javax.swing.JLabel lblDistributionHubZip1;
    private javax.swing.JLabel lblDistributionHubid;
    private javax.swing.JLabel lblDistributionHubname;
    private javax.swing.JLabel lblDistributionHubname1;
    private javax.swing.JLabel lblDistributionHubuname;
    private javax.swing.JLabel lblDistributionHubuname1;
    private javax.swing.JLabel lblFCAdminpwd1;
    private javax.swing.JLabel lblWarehouseid1;
    private javax.swing.JTable tblWarehouseDetails;
    private javax.swing.JTextField txtDistributionHubAdd;
    private javax.swing.JTextField txtDistributionHubAdmin;
    private javax.swing.JTextField txtDistributionHubAdminpwd;
    private javax.swing.JTextField txtDistributionHubCity;
    private javax.swing.JTextField txtDistributionHubPhone;
    private javax.swing.JTextField txtDistributionHubState;
    private javax.swing.JTextField txtDistributionHubZip;
    private javax.swing.JTextField txtDistributionHubname;
    private javax.swing.JTextField txtDistributionHubuname;
    // End of variables declaration//GEN-END:variables

    private void populateWHtable() {
        DefaultTableModel model = (DefaultTableModel) tblWarehouseDetails.getModel();
        model.setRowCount(0);
        for (DistributionHub fcwh : ecosystem.getACDDirectory().getFadList()) {
            Object[] row = new Object[8];
            row[0] = fcwh;
            row[1] = fcwh.getDistributionHubName();
            row[2] = fcwh.getDistributionHubAdmin();
            row[3] = fcwh.getDistributionHubPhone();
            row[4] = fcwh.getDistributionHubAddress();
            row[5] = fcwh.getDistributionHubCity();
            row[6] = fcwh.getDistributionHubState();
            row[7] = fcwh.getDistributionHubZipcode();
            model.addRow(row);
        }
    }

    private void clearfields() {
        txtDistributionHubname.setText("");
        txtDistributionHubPhone.setText("");
        txtDistributionHubAdd.setText("");
        txtDistributionHubCity.setText("");
        txtDistributionHubState.setText("");
        txtDistributionHubZip.setText("");
        txtDistributionHubAdmin.setText("");
        txtDistributionHubuname.setText("");
        txtDistributionHubAdminpwd.setText("");
        lblWarehouseid1.setText("");
    }
}
