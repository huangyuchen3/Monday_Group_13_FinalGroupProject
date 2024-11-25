/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Worker.Worker;
import Business.FoodPantry.FoodPantry;
import Business.FoodPantry.FoodPantryDirectory;
import Business.UserAccount.UserAccount;
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
import userinterface.DonorRole.DonorProfilePanel;

/**
 *
 *@author ankitapatil
 */
public class ViewModifyPantryPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyPantryPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    FoodPantryDirectory fcpd;

    public ViewModifyPantryPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populatePantryTable();
        txtFCPantryuname.setEnabled(false);

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
        tblViewPantry = new javax.swing.JTable();
        btnPantryDelete = new javax.swing.JButton();
        btnPantryEdit = new javax.swing.JButton();
        lblFCPantryname = new javax.swing.JLabel();
        txtFCPantryname = new javax.swing.JTextField();
        lblFCPantryPhone = new javax.swing.JLabel();
        txtFCPantryPhone = new javax.swing.JTextField();
        lblFCPantryAdd = new javax.swing.JLabel();
        txtFCPantryAdd = new javax.swing.JTextField();
        lblFCPantryCity = new javax.swing.JLabel();
        txtFCPantryCity = new javax.swing.JTextField();
        lblFCPantryState = new javax.swing.JLabel();
        txtFCPantryState = new javax.swing.JTextField();
        lblFCPantryZip = new javax.swing.JLabel();
        txtFCPantryZip = new javax.swing.JTextField();
        lblFCPantryManager = new javax.swing.JLabel();
        txtFCPantryManager = new javax.swing.JTextField();
        lblFCPantryuname = new javax.swing.JLabel();
        txtFCPantryuname = new javax.swing.JTextField();
        lblFCPantrypwd = new javax.swing.JLabel();
        txtFCPantrypwd = new javax.swing.JTextField();
        btnPantryUpdate = new javax.swing.JButton();
        lblFCPantryid = new javax.swing.JLabel();
        lblFCPantryid1 = new javax.swing.JLabel();
        lblFCPantryname1 = new javax.swing.JLabel();
        lblFCPantryPhone1 = new javax.swing.JLabel();
        lblFCPantryAdd1 = new javax.swing.JLabel();
        lblFCPantryCity1 = new javax.swing.JLabel();
        lblFCPantryState1 = new javax.swing.JLabel();
        lblFCPantryZip1 = new javax.swing.JLabel();
        lblFCPantryManager1 = new javax.swing.JLabel();
        lblFCPantryuname1 = new javax.swing.JLabel();
        lblFCPantrypwd1 = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddWarehouseTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblAddWarehouseTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblAddWarehouseTitle.setText("View/Modify Pantry");
        add(lblAddWarehouseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        tblViewPantry.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblViewPantry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Warehouse Name", "Manager", "Phone Number", "Address", "City", "State", "Zip"
            }
        ));
        tblViewPantry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblViewPantryMousePressed(evt);
            }
        });
        jScrollPane.setViewportView(tblViewPantry);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 840, 153));

        btnPantryDelete.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnPantryDelete.setText("Delete");
        btnPantryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantryDeleteActionPerformed(evt);
            }
        });
        add(btnPantryDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 200, 92, -1));

        btnPantryEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnPantryEdit.setText("Edit");
        btnPantryEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantryEditActionPerformed(evt);
            }
        });
        add(btnPantryEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 200, 92, -1));

        lblFCPantryname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantryname.setText("Pantry Name:");
        add(lblFCPantryname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        txtFCPantryname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCPantryname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPantryname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPantrynameFocusLost(evt);
            }
        });
        txtFCPantryname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFCPantrynameKeyReleased(evt);
            }
        });
        add(txtFCPantryname, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 235, 137, -1));

        lblFCPantryPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 304, -1, -1));

        txtFCPantryPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCPantryPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPantryPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPantryPhoneFocusLost(evt);
            }
        });
        txtFCPantryPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFCPantryPhoneKeyReleased(evt);
            }
        });
        add(txtFCPantryPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 272, 137, -1));

        lblFCPantryAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantryAdd.setText("Pantry Address:");
        add(lblFCPantryAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        txtFCPantryAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCPantryAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCPantryAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 308, 137, -1));

        lblFCPantryCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantryCity.setText("Pantry City:");
        add(lblFCPantryCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        txtFCPantryCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCPantryCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCPantryCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 345, 137, -1));

        lblFCPantryState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantryState.setText("Pantry State:");
        add(lblFCPantryState, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        txtFCPantryState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCPantryState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCPantryState, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 382, 137, -1));

        lblFCPantryZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantryZip.setText("Pantry Zip:");
        add(lblFCPantryZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 423, -1, -1));

        txtFCPantryZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCPantryZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPantryZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPantryZipFocusLost(evt);
            }
        });
        add(txtFCPantryZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 419, 137, -1));

        lblFCPantryManager.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantryManager.setText("Pantry Manager Name:");
        add(lblFCPantryManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 460, -1, -1));

        txtFCPantryManager.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCPantryManager.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPantryManager.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPantryManagerFocusLost(evt);
            }
        });
        add(txtFCPantryManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 456, 137, -1));

        lblFCPantryuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantryuname.setText("Pantry Manager Username:");
        add(lblFCPantryuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 497, -1, -1));

        txtFCPantryuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCPantryuname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCPantryuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 493, 137, -1));

        lblFCPantrypwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantrypwd.setText("Password:");
        add(lblFCPantrypwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, 25));

        txtFCPantrypwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCPantrypwd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCPantrypwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 530, 137, -1));

        btnPantryUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnPantryUpdate.setText("Update");
        btnPantryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantryUpdateActionPerformed(evt);
            }
        });
        add(btnPantryUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 92, -1));

        lblFCPantryid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantryid.setText("Pantry ID:");
        add(lblFCPantryid, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, -1, -1));

        lblFCPantryid1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 217, -1, -1));

        lblFCPantryname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 243, -1, -1));

        lblFCPantryPhone1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPantryPhone1.setText("Pantry Phone Number:");
        add(lblFCPantryPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        lblFCPantryAdd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 339, -1, -1));

        lblFCPantryCity1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 377, -1, -1));

        lblFCPantryState1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 415, -1, -1));

        lblFCPantryZip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 453, -1, -1));

        lblFCPantryManager1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryManager1, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 477, -1, -1));

        lblFCPantryuname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryuname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 497, -1, -1));

        lblFCPantrypwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantrypwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 526, -1, 25));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPantryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantryDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewPantry.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPantry.getModel();
        FoodPantry selectedFCP = (FoodPantry) model.getValueAt(selectedRowIndex, 0);
        ecosystem.getUserAccountDirectory().deleteUserAccount(
                ecosystem.getFCPDirectory().getFcpList().get(selectedRowIndex).getFcpAccount());
        fcpd = ecosystem.getFCPDirectory();
        fcpd.deleteFCPantry(selectedFCP);
        ecosystem.setFCPDirectory(fcpd);
        Integer pantryCnt = ecosystem.getPantryCnt();
        ecosystem.setPantryCnt(pantryCnt - 1);
        JOptionPane.showMessageDialog(this, "pantry deleted Successfully");
        populatePantryTable();
        clearfields();
    }//GEN-LAST:event_btnPantryDeleteActionPerformed

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

    public void makeTableTransparent() {
        tblViewPantry.setOpaque(false);
        ((DefaultTableCellRenderer) tblViewPantry.getDefaultRenderer(Object.class)).setOpaque(false);
        tblViewPantry.setShowGrid(false);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblViewPantry.getModel().getColumnCount(); i++) {
            tblViewPantry.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    private void btnPantryEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantryEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewPantry.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPantry.getModel();
        FoodPantry selectedFCP = (FoodPantry) model.getValueAt(selectedRowIndex, 0);
        lblFCPantryid1.setText(selectedFCP.getFcpId());
        txtFCPantryname.setText(selectedFCP.getFcpName());
        txtFCPantryPhone.setText(selectedFCP.getFcpPhno());
        txtFCPantryAdd.setText(selectedFCP.getFcpAddres());
        txtFCPantryCity.setText(selectedFCP.getFcpCity());
        txtFCPantryState.setText(selectedFCP.getFcpState());
        txtFCPantryZip.setText(selectedFCP.getFcpZipcode());
        txtFCPantryManager.setText(selectedFCP.getFcpManager());
        txtFCPantryuname.setText(selectedFCP.getFcpAccount().getUsername());
        txtFCPantrypwd.setText(selectedFCP.getFcpAccount().getPassword());
    }//GEN-LAST:event_btnPantryEditActionPerformed

    private void txtFCPantrynameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPantrynameFocusLost
        // TODO add your handling code here:
        if (!(txtFCPantryname.getText().matches("^[a-zA-Z]*$"))) {
            lblFCPantryname1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblFCPantryname1.setText("");
        }
    }//GEN-LAST:event_txtFCPantrynameFocusLost

    private void txtFCPantrynameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFCPantrynameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFCPantrynameKeyReleased

    private void txtFCPantryPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPantryPhoneFocusLost
        // TODO add your handling code here:
        if (!(txtFCPantryPhone.getText().matches("^[0-9]*$")) || !(txtFCPantryPhone.getText().length() == 10)) {
            lblFCPantryPhone.setText("Please enter a valid phone number");
        } else {
            lblFCPantryPhone.setText("");

        }
    }//GEN-LAST:event_txtFCPantryPhoneFocusLost

    private void txtFCPantryPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFCPantryPhoneKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFCPantryPhoneKeyReleased

    private void txtFCPantryZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPantryZipFocusLost
        // TODO add your handling code here:
        if ((txtFCPantryZip.getText().matches("^[a-zA-Z]*$"))) {
            lblFCPantryZip1.setText("Invalid input. Please enter only numbers");
        } else {
            lblFCPantryZip1.setText("");
        }
    }//GEN-LAST:event_txtFCPantryZipFocusLost

    private void txtFCPantryManagerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPantryManagerFocusLost
        // TODO add your handling code here:
        if (!(txtFCPantryManager.getText().matches("^[a-zA-Z]*$"))) {
            lblFCPantryManager1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblFCPantryManager1.setText("");
        }
    }//GEN-LAST:event_txtFCPantryManagerFocusLost

    public boolean isValid(String test, String regex) {
//        String regex = "^[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (test == null) {
            return false;
        }

        Matcher m = p.matcher(test);

        return m.matches();
    }


    private void btnPantryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantryUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewPantry.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewPantry.getModel();
        String FCPid = lblFCPantryid1.getText();

        ArrayList<FoodPantry> fcPantryList = ecosystem.getFCPDirectory().getFcpList();
        for (FoodPantry f : fcPantryList) {
            if (f.getFcpId().equals(FCPid)) {

                String panName = txtFCPantryname.getText();
                String phone = txtFCPantryPhone.getText();

                String panCity = txtFCPantryCity.getText();
                String panState = txtFCPantryState.getText();
                String panZip = txtFCPantryZip.getText();
                String panManager = txtFCPantryManager.getText();
                String panUser = txtFCPantryuname.getText();
                String panPswd = txtFCPantrypwd.getText();

                if (!isValid(panName, "^[A-Za-z]{3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid name");
                    return;
                }
                if (!isValid(phone, "[+]?[0-9]{10,13}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid phone number");
                    return;
                }
                if (!isValid(panCity, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid city");
                    return;
                }
                if (!isValid(panState, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){2,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid state");
                    return;
                }
                if (!isValid(panZip, "^[0-9]{5}(?:-[0-9]{4})?$")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid zip");
                    return;
                }
                if (!isValid(panManager, "^[A-Za-z]{3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid name");
                    return;
                }
                if (!isValid(panUser, "^[a-zA-Z0-9._-]{6,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid username of atleast 6 characters");
                    return;
                }
                if (!isValid(panPswd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid password of atleast 8 characters in length. It must contain a number, a specicial character, a lowercase and an uppercase character.");
                    return;
                }

                f.setFcpName(txtFCPantryname.getText());
                f.setFcpPhno(txtFCPantryPhone.getText());
                f.setFcpAddres(txtFCPantryAdd.getText());
                f.setFcpCity(txtFCPantryCity.getText());
                f.setFcpState(txtFCPantryState.getText());
                f.setFcpZipcode(txtFCPantryZip.getText());
                f.setFcpManager(txtFCPantryManager.getText());
                //UserAccount FCPua=new UserAccount();
                //FCPua.setUsername(txtFCPuname.getText());
                //FCPua.setPassword(txtFCPpwd.getText());
                //f.setFcpAccount(FCPua);
                if (f.getFcpAccount().getUsername().equals(txtFCPantryuname.getText())) {
                    f.getFcpAccount().setPassword(txtFCPantrypwd.getText());
                    f.getFcpAccount().getEmployee().setName(txtFCPantryManager.getText());
                }
                break;
            }

        }
        // ecosystem.setFCWDirectory(fcWarehouseList);
        JOptionPane.showMessageDialog(this, "pantry details updated successfully");
        clearfields();
        populatePantryTable();
    }//GEN-LAST:event_btnPantryUpdateActionPerformed

    private void tblViewPantryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewPantryMousePressed
        // TODO add your handling code here:
        tblViewPantry.setSelectionForeground(Color.BLUE);

    }//GEN-LAST:event_tblViewPantryMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnPantryDelete;
    private javax.swing.JButton btnPantryEdit;
    private javax.swing.JButton btnPantryUpdate;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblAddWarehouseTitle;
    private javax.swing.JLabel lblFCPantryAdd;
    private javax.swing.JLabel lblFCPantryAdd1;
    private javax.swing.JLabel lblFCPantryCity;
    private javax.swing.JLabel lblFCPantryCity1;
    private javax.swing.JLabel lblFCPantryManager;
    private javax.swing.JLabel lblFCPantryManager1;
    private javax.swing.JLabel lblFCPantryPhone;
    private javax.swing.JLabel lblFCPantryPhone1;
    private javax.swing.JLabel lblFCPantryState;
    private javax.swing.JLabel lblFCPantryState1;
    private javax.swing.JLabel lblFCPantryZip;
    private javax.swing.JLabel lblFCPantryZip1;
    private javax.swing.JLabel lblFCPantryid;
    private javax.swing.JLabel lblFCPantryid1;
    private javax.swing.JLabel lblFCPantryname;
    private javax.swing.JLabel lblFCPantryname1;
    private javax.swing.JLabel lblFCPantrypwd;
    private javax.swing.JLabel lblFCPantrypwd1;
    private javax.swing.JLabel lblFCPantryuname;
    private javax.swing.JLabel lblFCPantryuname1;
    private javax.swing.JTable tblViewPantry;
    private javax.swing.JTextField txtFCPantryAdd;
    private javax.swing.JTextField txtFCPantryCity;
    private javax.swing.JTextField txtFCPantryManager;
    private javax.swing.JTextField txtFCPantryPhone;
    private javax.swing.JTextField txtFCPantryState;
    private javax.swing.JTextField txtFCPantryZip;
    private javax.swing.JTextField txtFCPantryname;
    private javax.swing.JTextField txtFCPantrypwd;
    private javax.swing.JTextField txtFCPantryuname;
    // End of variables declaration//GEN-END:variables

    private void populatePantryTable() {
        DefaultTableModel model = (DefaultTableModel) tblViewPantry.getModel();
        model.setRowCount(0);
        for (FoodPantry fcp : ecosystem.getFCPDirectory().getFcpList()) {
            Object[] row = new Object[9];
            row[0] = fcp;
            row[1] = fcp.getFcpName();
            row[2] = fcp.getFcpWHname();
            row[3] = fcp.getFcpManager();
            row[4] = fcp.getFcpPhno();
            row[5] = fcp.getFcpAddres();
            row[6] = fcp.getFcpCity();
            row[7] = fcp.getFcpState();
            row[8] = fcp.getFcpZipcode();
            model.addRow(row);
        }
    }

    private void clearfields() {
        txtFCPantryname.setText("");
        txtFCPantryPhone.setText("");
        txtFCPantryAdd.setText("");
        txtFCPantryCity.setText("");
        txtFCPantryState.setText("");
        txtFCPantryZip.setText("");
        txtFCPantryManager.setText("");
        txtFCPantryuname.setText("");
        txtFCPantrypwd.setText("");
        lblFCPantryid1.setText("");
    }
}
