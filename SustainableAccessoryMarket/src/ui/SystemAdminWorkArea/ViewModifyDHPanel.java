/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.DistributionHub.DistributionHub;
import Business.DistributionHub.DistributionHubDirectory;

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
        populateWHtable();
        txtFCAdminuname.setEnabled(false);
        setBG();
        makeTableTransparent();
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
        lblWarehousename = new javax.swing.JLabel();
        txtWarehousename = new javax.swing.JTextField();
        lblWarehousePhone = new javax.swing.JLabel();
        txtWarehousePhone = new javax.swing.JTextField();
        lblWarehouseAdd = new javax.swing.JLabel();
        txtWarehouseAdd = new javax.swing.JTextField();
        lblWarehouseCity = new javax.swing.JLabel();
        txtWarehouseCity = new javax.swing.JTextField();
        lblWarehouseState = new javax.swing.JLabel();
        txtWarehouseState = new javax.swing.JTextField();
        lblWarehouseZip = new javax.swing.JLabel();
        txtWarehouseZip = new javax.swing.JTextField();
        lblWarehouseFCAdmin = new javax.swing.JLabel();
        txtWarehouseFCAdmin = new javax.swing.JTextField();
        lblFCAdminuname = new javax.swing.JLabel();
        txtFCAdminuname = new javax.swing.JTextField();
        lblFCAdminpwd = new javax.swing.JLabel();
        txtFCAdminpwd = new javax.swing.JTextField();
        btnWarehouseUpdate = new javax.swing.JButton();
        lblWarehousename1 = new javax.swing.JLabel();
        lblWarehousePhone1 = new javax.swing.JLabel();
        lblWarehouseAdd1 = new javax.swing.JLabel();
        lblWarehouseCity1 = new javax.swing.JLabel();
        lblWarehouseState1 = new javax.swing.JLabel();
        lblWarehouseZip1 = new javax.swing.JLabel();
        lblWarehouseFCAdmin1 = new javax.swing.JLabel();
        lblFCAdminuname1 = new javax.swing.JLabel();
        lblFCAdminpwd1 = new javax.swing.JLabel();
        lblWarehouseid = new javax.swing.JLabel();
        lblWarehouseid1 = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddWarehouseTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblAddWarehouseTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblAddWarehouseTitle.setText("Warehouse Details");
        add(lblAddWarehouseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        tblWarehouseDetails.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblWarehouseDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Warehouse ID", "Name", "Admin", "Phone Number", "Address", "City", "State", "Zip"
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

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 840, 153));

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

        lblWarehousename.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehousename.setText("Warehouse Name:");
        add(lblWarehousename, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        txtWarehousename.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehousename.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWarehousename.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWarehousenameFocusLost(evt);
            }
        });
        txtWarehousename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWarehousenameKeyReleased(evt);
            }
        });
        add(txtWarehousename, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 137, -1));

        lblWarehousePhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehousePhone.setText(" Warehouse Phone Number:");
        add(lblWarehousePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        txtWarehousePhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehousePhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWarehousePhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWarehousePhoneFocusLost(evt);
            }
        });
        txtWarehousePhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWarehousePhoneKeyReleased(evt);
            }
        });
        add(txtWarehousePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 277, 137, -1));

        lblWarehouseAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseAdd.setText("Warehouse Address:");
        add(lblWarehouseAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        txtWarehouseAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtWarehouseAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 313, 137, -1));

        lblWarehouseCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseCity.setText("Warehouse City:");
        add(lblWarehouseCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        txtWarehouseCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtWarehouseCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 137, -1));

        lblWarehouseState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseState.setText("Warehouse State:");
        add(lblWarehouseState, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        txtWarehouseState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtWarehouseState, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 387, 137, -1));

        lblWarehouseZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseZip.setText("Warehouse Zip:");
        add(lblWarehouseZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        txtWarehouseZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWarehouseZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWarehouseZipFocusLost(evt);
            }
        });
        add(txtWarehouseZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 424, 137, -1));

        lblWarehouseFCAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseFCAdmin.setText("Warehouse Admin Name:");
        add(lblWarehouseFCAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        txtWarehouseFCAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseFCAdmin.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWarehouseFCAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWarehouseFCAdminFocusLost(evt);
            }
        });
        add(txtWarehouseFCAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 461, 137, -1));

        lblFCAdminuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCAdminuname.setText("Warehouse Admin Username:");
        add(lblFCAdminuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        txtFCAdminuname.setEditable(false);
        txtFCAdminuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCAdminuname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCAdminuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 498, 137, -1));

        lblFCAdminpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCAdminpwd.setText("Warehouse Admin Password:");
        add(lblFCAdminpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, -1, 25));

        txtFCAdminpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCAdminpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCAdminpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 535, 137, -1));

        btnWarehouseUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnWarehouseUpdate.setText("Update");
        btnWarehouseUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarehouseUpdateActionPerformed(evt);
            }
        });
        add(btnWarehouseUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 92, -1));

        lblWarehousename1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehousename1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 240, -1, -1));

        lblWarehousePhone1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehousePhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblWarehouseAdd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehouseAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 313, -1, -1));

        lblWarehouseCity1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehouseCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 350, -1, -1));

        lblWarehouseState1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehouseState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblWarehouseZip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehouseZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblWarehouseFCAdmin1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehouseFCAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblFCAdminuname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCAdminuname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 498, -1, -1));

        lblFCAdminpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCAdminpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblWarehouseid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseid.setText("Warehouse ID:");
        add(lblWarehouseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 230, -1, -1));

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

    private void txtWarehousenameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWarehousenameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtWarehousenameKeyReleased

    private void txtWarehousePhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWarehousePhoneKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtWarehousePhoneKeyReleased

    private void txtWarehousenameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWarehousenameFocusLost
        // TODO add your handling code here:
        if (!(txtWarehousename.getText().matches("^[a-zA-Z]*$"))) {
            lblWarehousename1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblWarehousename1.setText("");
        }
    }//GEN-LAST:event_txtWarehousenameFocusLost

    private void txtWarehousePhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWarehousePhoneFocusLost
        // TODO add your handling code here:
        if (!(txtWarehousePhone.getText().matches("^[0-9]*$")) || !(txtWarehousePhone.getText().length() == 10)) {
            lblWarehousePhone1.setText("Please enter a valid phone number");
        } else {
            lblWarehousePhone1.setText("");

        }
    }//GEN-LAST:event_txtWarehousePhoneFocusLost

    private void txtWarehouseZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWarehouseZipFocusLost
        // TODO add your handling code here:
        if ((txtWarehouseZip.getText().matches("^[a-zA-Z]*$"))) {
            lblWarehouseZip1.setText("Invalid input. Please enter only numbers");
        } else {
            lblWarehouseZip1.setText("");
        }
    }//GEN-LAST:event_txtWarehouseZipFocusLost

    private void txtWarehouseFCAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWarehouseFCAdminFocusLost
        // TODO add your handling code here:
        if (!(txtWarehouseFCAdmin.getText().matches("^[a-zA-Z]*$"))) {
            lblWarehouseFCAdmin1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblWarehouseFCAdmin1.setText("");
        }
    }//GEN-LAST:event_txtWarehouseFCAdminFocusLost

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
        txtWarehousename.setText(selectedFCW.getDistributionHubName());
        txtWarehousePhone.setText(selectedFCW.getDistributionHubPhone());
        txtWarehouseAdd.setText(selectedFCW.getDistributionHubAddress());
        txtWarehouseCity.setText(selectedFCW.getDistributionHubCity());
        txtWarehouseState.setText(selectedFCW.getDistributionHubState());
        txtWarehouseZip.setText(selectedFCW.getDistributionHubZipcode());
        txtWarehouseFCAdmin.setText(selectedFCW.getDistributionHubAdmin());
        txtFCAdminuname.setText(selectedFCW.getDistributionHubAccount().getUsername());
        txtFCAdminpwd.setText(selectedFCW.getDistributionHubAccount().getPassword());
    }//GEN-LAST:event_btnWarehouseEditActionPerformed

    private void btnWarehouseDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarehouseDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouseDetails.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblWarehouseDetails.getModel();
        DistributionHub selectedFCW = (DistributionHub) model.getValueAt(selectedRowIndex, 0);
        ecosystem.getUserAccountDirectory().deleteUserAccount(
                ecosystem.getACDDirectory().getFadList().get(selectedRowIndex).getDistributionHubAccount());
        fcd = ecosystem.getACDDirectory();
        fcd.deleteDistributionHub(selectedFCW);
        ecosystem.setACDDirectory(fcd);
        Integer whcnt = ecosystem.getdistributionHubCnt();
        ecosystem.setdistributionHubCnt(whcnt-1);
        JOptionPane.showMessageDialog(this, "warehouse deleted Successfully");
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

                String whName = txtWarehousename.getText();
                String phone = txtWarehousePhone.getText();

                String whCity = txtWarehouseCity.getText();
                String whState = txtWarehouseState.getText();
                String whZip = txtWarehouseZip.getText();
                String whAdmin = txtWarehouseFCAdmin.getText();
                String whUser = txtFCAdminuname.getText();
                String whPswd = txtFCAdminpwd.getText();

                if (!isValid(whName, "^[A-Za-z]{3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid name");
                    return;
                }
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
                if (!isValid(whAdmin, "^[A-Za-z]{3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid name");
                    return;
                }
                if (!isValid(whUser, "^[a-zA-Z0-9._-]{6,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid username of atleast 6 characters");
                    return;
                }
                if (!isValid(whPswd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid password of atleast 8 characters in length. It must contain a number, a specicial character, a lowercase and an uppercase character.");
                    return;
                }

                f.setDistributionHubName(txtWarehousename.getText());
                f.setDistributionHubPhone(txtWarehousePhone.getText());
                f.setDistributionHubAddress(txtWarehouseAdd.getText());
                f.getDistributionHubCity(txtWarehouseCity.getText());
                f.setDistributionHubState(txtWarehouseState.getText());
                f.setDistributionHubZipcode(txtWarehouseZip.getText());
                f.setDistributionHubAdmin(txtWarehouseFCAdmin.getText());
                //UserAccount WHua=new UserAccount();
                //WHua.setUsername(txtFCAuname.getText());
                //WHua.setPassword(txtFCApwd.getText());
                if (f.getDistributionHubAccount().getUsername().equals(txtFCAdminuname.getText())) {
                    f.getDistributionHubAccount().setPassword(txtFCAdminpwd.getText());
                    f.getDistributionHubAccount().getEmployee().setName(txtWarehouseFCAdmin.getText());
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
    private javax.swing.JLabel lblFCAdminpwd;
    private javax.swing.JLabel lblFCAdminpwd1;
    private javax.swing.JLabel lblFCAdminuname;
    private javax.swing.JLabel lblFCAdminuname1;
    private javax.swing.JLabel lblWarehouseAdd;
    private javax.swing.JLabel lblWarehouseAdd1;
    private javax.swing.JLabel lblWarehouseCity;
    private javax.swing.JLabel lblWarehouseCity1;
    private javax.swing.JLabel lblWarehouseFCAdmin;
    private javax.swing.JLabel lblWarehouseFCAdmin1;
    private javax.swing.JLabel lblWarehousePhone;
    private javax.swing.JLabel lblWarehousePhone1;
    private javax.swing.JLabel lblWarehouseState;
    private javax.swing.JLabel lblWarehouseState1;
    private javax.swing.JLabel lblWarehouseZip;
    private javax.swing.JLabel lblWarehouseZip1;
    private javax.swing.JLabel lblWarehouseid;
    private javax.swing.JLabel lblWarehouseid1;
    private javax.swing.JLabel lblWarehousename;
    private javax.swing.JLabel lblWarehousename1;
    private javax.swing.JTable tblWarehouseDetails;
    private javax.swing.JTextField txtFCAdminpwd;
    private javax.swing.JTextField txtFCAdminuname;
    private javax.swing.JTextField txtWarehouseAdd;
    private javax.swing.JTextField txtWarehouseCity;
    private javax.swing.JTextField txtWarehouseFCAdmin;
    private javax.swing.JTextField txtWarehousePhone;
    private javax.swing.JTextField txtWarehouseState;
    private javax.swing.JTextField txtWarehouseZip;
    private javax.swing.JTextField txtWarehousename;
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
        txtWarehousename.setText("");
        txtWarehousePhone.setText("");
        txtWarehouseAdd.setText("");
        txtWarehouseCity.setText("");
        txtWarehouseState.setText("");
        txtWarehouseZip.setText("");
        txtWarehouseFCAdmin.setText("");
        txtFCAdminuname.setText("");
        txtFCAdminpwd.setText("");
        lblWarehouseid1.setText("");
    }
}
