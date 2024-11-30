/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.DropOff.DropOff;
import Business.DropOff.DropOffDirectory;

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
public class ViewModifyDOPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyDOPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    DropOffDirectory fcpd;

    public ViewModifyDOPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populatePantryTable();
        //txtDropOffuname.setEnabled(false);

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
        tblViewDropOff = new javax.swing.JTable();
        btnDropOffDelete = new javax.swing.JButton();
        btnDropOffEdit = new javax.swing.JButton();
        lblDropOffname = new javax.swing.JLabel();
        txtDropOffname = new javax.swing.JTextField();
        lblDropOffPhone = new javax.swing.JLabel();
        txtDropOffPhone = new javax.swing.JTextField();
        lblDropOffAdd = new javax.swing.JLabel();
        txtDropOffAdd = new javax.swing.JTextField();
        lblDropOffCity = new javax.swing.JLabel();
        txtDropOffCity = new javax.swing.JTextField();
        lblDropOffState = new javax.swing.JLabel();
        txtDropOffState = new javax.swing.JTextField();
        lblDropOffZip = new javax.swing.JLabel();
        txtDropOffZip = new javax.swing.JTextField();
        lblDropOffManager = new javax.swing.JLabel();
        txtDropOffManager = new javax.swing.JTextField();
        lblDropOffuname = new javax.swing.JLabel();
        txtDropOffuname = new javax.swing.JTextField();
        lblDropOffpwd = new javax.swing.JLabel();
        txtDropOffpwd = new javax.swing.JTextField();
        btnDropOffUpdate = new javax.swing.JButton();
        lblDropOffid = new javax.swing.JLabel();
        lblFCPantryid1 = new javax.swing.JLabel();
        lblFCPantryname1 = new javax.swing.JLabel();
        lblDropOffPhone1 = new javax.swing.JLabel();
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
        lblAddWarehouseTitle.setForeground(new java.awt.Color(102, 102, 255));
        lblAddWarehouseTitle.setText("View/Modify Drop Off");
        add(lblAddWarehouseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        tblViewDropOff.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblViewDropOff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Distribution Hub Name", "Manager", "Phone Number", "Address", "City", "State", "Zip"
            }
        ));
        tblViewDropOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblViewDropOffMousePressed(evt);
            }
        });
        jScrollPane.setViewportView(tblViewDropOff);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 980, 153));

        btnDropOffDelete.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnDropOffDelete.setText("Delete");
        btnDropOffDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropOffDeleteActionPerformed(evt);
            }
        });
        add(btnDropOffDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 200, 92, -1));

        btnDropOffEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnDropOffEdit.setText("Edit");
        btnDropOffEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropOffEditActionPerformed(evt);
            }
        });
        add(btnDropOffEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 200, 92, -1));

        lblDropOffname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffname.setText("Drop Off Name:");
        add(lblDropOffname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        txtDropOffname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDropOffname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDropOffname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDropOffnameFocusLost(evt);
            }
        });
        txtDropOffname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDropOffnameKeyReleased(evt);
            }
        });
        add(txtDropOffname, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 235, 137, -1));

        lblDropOffPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDropOffPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 304, -1, -1));

        txtDropOffPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDropOffPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDropOffPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDropOffPhoneFocusLost(evt);
            }
        });
        txtDropOffPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDropOffPhoneKeyReleased(evt);
            }
        });
        add(txtDropOffPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 272, 137, -1));

        lblDropOffAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffAdd.setText("Drop Off Address:");
        add(lblDropOffAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        txtDropOffAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDropOffAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDropOffAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 308, 137, -1));

        lblDropOffCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffCity.setText("Drop Off City:");
        add(lblDropOffCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        txtDropOffCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDropOffCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDropOffCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 345, 137, -1));

        lblDropOffState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffState.setText("Drop Off State:");
        add(lblDropOffState, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        txtDropOffState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDropOffState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDropOffState, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 382, 137, -1));

        lblDropOffZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffZip.setText("Drop Off Zip:");
        add(lblDropOffZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        txtDropOffZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDropOffZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDropOffZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDropOffZipFocusLost(evt);
            }
        });
        add(txtDropOffZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 419, 137, -1));

        lblDropOffManager.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffManager.setText("Drop Off Manager Name:");
        add(lblDropOffManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        txtDropOffManager.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDropOffManager.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDropOffManager.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDropOffManagerFocusLost(evt);
            }
        });
        add(txtDropOffManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 456, 137, -1));

        lblDropOffuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffuname.setText("Drop Off Manager Username:");
        add(lblDropOffuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        txtDropOffuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDropOffuname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDropOffuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 493, 137, -1));

        lblDropOffpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffpwd.setText("Password:");
        add(lblDropOffpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, 25));

        txtDropOffpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDropOffpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDropOffpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 530, 137, -1));

        btnDropOffUpdate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnDropOffUpdate.setText("Update");
        btnDropOffUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropOffUpdateActionPerformed(evt);
            }
        });
        add(btnDropOffUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 92, -1));

        lblDropOffid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffid.setText("Drop Off ID:");
        add(lblDropOffid, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, -1, -1));

        lblFCPantryid1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 217, -1, -1));

        lblFCPantryname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCPantryname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 243, -1, -1));

        lblDropOffPhone1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDropOffPhone1.setText("Drop Off Phone Number:");
        add(lblDropOffPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

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

    private void btnDropOffDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropOffDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewDropOff.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewDropOff.getModel();
        DropOff selectedFCP = (DropOff) model.getValueAt(selectedRowIndex, 0);
        ecosystem.getUserAccountDirectory().deleteUserAccount(
                ecosystem.getACDOFDirectory().getFcpList().get(selectedRowIndex).getDropOffAccount());
        fcpd = ecosystem.getACDOFDirectory();
        fcpd.deleteFCPantry(selectedFCP);
        ecosystem.setACDODirectory(fcpd);
        Integer pantryCnt = ecosystem.getDropOffCnt();
        ecosystem.setDropOffCnt(pantryCnt-1);
        JOptionPane.showMessageDialog(this, "Drop Off store deleted Successfully");
        populatePantryTable();
        clearfields();
    }//GEN-LAST:event_btnDropOffDeleteActionPerformed

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
        tblViewDropOff.setOpaque(false);
        ((DefaultTableCellRenderer) tblViewDropOff.getDefaultRenderer(Object.class)).setOpaque(false);
        tblViewDropOff.setShowGrid(false);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblViewDropOff.getModel().getColumnCount(); i++) {
            tblViewDropOff.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    private void btnDropOffEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropOffEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewDropOff.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewDropOff.getModel();
        DropOff selectedFCP = (DropOff) model.getValueAt(selectedRowIndex, 0);
        lblFCPantryid1.setText(selectedFCP.getDropOffId());
        txtDropOffname.setText(selectedFCP.getDropOffName());
        txtDropOffPhone.setText(selectedFCP.getDropOffPhone());
        txtDropOffAdd.setText(selectedFCP.getDropOffAddress());
        txtDropOffCity.setText(selectedFCP.getDropOffCity());
        txtDropOffState.setText(selectedFCP.getDropOffState());
        txtDropOffZip.setText(selectedFCP.getDropOffZipcode());
        txtDropOffManager.setText(selectedFCP.getDropOffManager());
        txtDropOffuname.setText(selectedFCP.getDropOffAccount().getUsername());
        txtDropOffpwd.setText(selectedFCP.getDropOffAccount().getPassword());
    }//GEN-LAST:event_btnDropOffEditActionPerformed

    private void txtDropOffnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDropOffnameFocusLost
        // TODO add your handling code here:
        if (!(txtDropOffname.getText().matches("^[a-zA-Z]*$"))) {
            lblFCPantryname1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblFCPantryname1.setText("");
        }
    }//GEN-LAST:event_txtDropOffnameFocusLost

    private void txtDropOffnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDropOffnameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDropOffnameKeyReleased

    private void txtDropOffPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDropOffPhoneFocusLost
        // TODO add your handling code here:
        if (!(txtDropOffPhone.getText().matches("^[0-9]*$")) || !(txtDropOffPhone.getText().length() == 10)) {
            lblDropOffPhone.setText("Please enter a valid phone number");
        } else {
            lblDropOffPhone.setText("");

        }
    }//GEN-LAST:event_txtDropOffPhoneFocusLost

    private void txtDropOffPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDropOffPhoneKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDropOffPhoneKeyReleased

    private void txtDropOffZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDropOffZipFocusLost
        // TODO add your handling code here:
        if ((txtDropOffZip.getText().matches("^[a-zA-Z]*$"))) {
            lblFCPantryZip1.setText("Invalid input. Please enter only numbers");
        } else {
            lblFCPantryZip1.setText("");
        }
    }//GEN-LAST:event_txtDropOffZipFocusLost

    private void txtDropOffManagerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDropOffManagerFocusLost
        // TODO add your handling code here:
        if (!(txtDropOffManager.getText().matches("^[a-zA-Z]*$"))) {
            lblFCPantryManager1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblFCPantryManager1.setText("");
        }
    }//GEN-LAST:event_txtDropOffManagerFocusLost

    public boolean isValid(String test, String regex) {
//        String regex = "^[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (test == null) {
            return false;
        }

        Matcher m = p.matcher(test);

        return m.matches();
    }


    private void btnDropOffUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropOffUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewDropOff.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewDropOff.getModel();
        String FCPid = lblFCPantryid1.getText();

        ArrayList<DropOff> fcPantryList = ecosystem.getACDOFDirectory().getFcpList();
        for (DropOff f : fcPantryList) {
            if (f.getDropOffId().equals(FCPid)) {

                String panName = txtDropOffname.getText();
                String phone = txtDropOffPhone.getText();

                String panCity = txtDropOffCity.getText();
                String panState = txtDropOffState.getText();
                String panZip = txtDropOffZip.getText();
                String panManager = txtDropOffManager.getText();
                String panUser = txtDropOffuname.getText();
                String panPswd = txtDropOffpwd.getText();

//                if (!isValid(panName, "^[A-Za-z]{3,}")) {
//                    JOptionPane.showMessageDialog(this, "Please enter valid name");
//                    return;
//                }
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
//                if (!isValid(panManager, "^[A-Za-z]{3,}")) {
//                    JOptionPane.showMessageDialog(this, "Please enter a valid name");
//                    return;
//                }
                if (!isValid(panUser, "^[a-zA-Z0-9._-]{6,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid username of atleast 6 characters");
                    return;
                }
                if (!isValid(panPswd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid password of atleast 8 characters in length. It must contain a number, a specicial character, a lowercase and an uppercase character.");
                    return;
                }

                f.setDropOffName(txtDropOffname.getText());
                f.setDropOffPhone(txtDropOffPhone.getText());
                f.setDropOffAddress(txtDropOffAdd.getText());
                f.setDropOffCity(txtDropOffCity.getText());
                f.setDropOffState(txtDropOffState.getText());
                f.setDropOffZipcode(txtDropOffZip.getText());
                f.setDropOffManager(txtDropOffManager.getText());
                //UserAccount FCPua=new UserAccount();
                //FCPua.setUsername(txtFCPuname.getText());
                //FCPua.setPassword(txtFCPpwd.getText());
                //f.setFcpAccount(FCPua);
                if (f.getDropOffAccount().getUsername().equals(txtDropOffuname.getText())) {
                    f.getDropOffAccount().setPassword(txtDropOffpwd.getText());
                    f.getDropOffAccount().getEmployee().setName(txtDropOffManager.getText());
                }
                break;
            }

        }
        // ecosystem.setFCWDirectory(fcWarehouseList);
        JOptionPane.showMessageDialog(this, "pantry details updated successfully");
        clearfields();
        populatePantryTable();
    }//GEN-LAST:event_btnDropOffUpdateActionPerformed

    private void tblViewDropOffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewDropOffMousePressed
        // TODO add your handling code here:
        tblViewDropOff.setSelectionForeground(Color.BLUE);

    }//GEN-LAST:event_tblViewDropOffMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnDropOffDelete;
    private javax.swing.JButton btnDropOffEdit;
    private javax.swing.JButton btnDropOffUpdate;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblAddWarehouseTitle;
    private javax.swing.JLabel lblDropOffAdd;
    private javax.swing.JLabel lblDropOffCity;
    private javax.swing.JLabel lblDropOffManager;
    private javax.swing.JLabel lblDropOffPhone;
    private javax.swing.JLabel lblDropOffPhone1;
    private javax.swing.JLabel lblDropOffState;
    private javax.swing.JLabel lblDropOffZip;
    private javax.swing.JLabel lblDropOffid;
    private javax.swing.JLabel lblDropOffname;
    private javax.swing.JLabel lblDropOffpwd;
    private javax.swing.JLabel lblDropOffuname;
    private javax.swing.JLabel lblFCPantryAdd1;
    private javax.swing.JLabel lblFCPantryCity1;
    private javax.swing.JLabel lblFCPantryManager1;
    private javax.swing.JLabel lblFCPantryState1;
    private javax.swing.JLabel lblFCPantryZip1;
    private javax.swing.JLabel lblFCPantryid1;
    private javax.swing.JLabel lblFCPantryname1;
    private javax.swing.JLabel lblFCPantrypwd1;
    private javax.swing.JLabel lblFCPantryuname1;
    private javax.swing.JTable tblViewDropOff;
    private javax.swing.JTextField txtDropOffAdd;
    private javax.swing.JTextField txtDropOffCity;
    private javax.swing.JTextField txtDropOffManager;
    private javax.swing.JTextField txtDropOffPhone;
    private javax.swing.JTextField txtDropOffState;
    private javax.swing.JTextField txtDropOffZip;
    private javax.swing.JTextField txtDropOffname;
    private javax.swing.JTextField txtDropOffpwd;
    private javax.swing.JTextField txtDropOffuname;
    // End of variables declaration//GEN-END:variables

    private void populatePantryTable() {
        DefaultTableModel model = (DefaultTableModel) tblViewDropOff.getModel();
        model.setRowCount(0);
        for (DropOff fcp : ecosystem.getACDOFDirectory().getFcpList()) {
            Object[] row = new Object[9];
            row[0] = fcp;
            row[1] = fcp.getDropOffName();
            row[2] = fcp.getDropOffHubName();
            row[3] = fcp.getDropOffManager();
            row[4] = fcp.getDropOffPhone();
            row[5] = fcp.getDropOffAddress();
            row[6] = fcp.getDropOffCity();
            row[7] = fcp.getDropOffState();
            row[8] = fcp.getDropOffZipcode();
            model.addRow(row);
        }
    }

    private void clearfields() {
        txtDropOffname.setText("");
        txtDropOffPhone.setText("");
        txtDropOffAdd.setText("");
        txtDropOffCity.setText("");
        txtDropOffState.setText("");
        txtDropOffZip.setText("");
        txtDropOffManager.setText("");
        txtDropOffuname.setText("");
        txtDropOffpwd.setText("");
        lblFCPantryid1.setText("");
    }
}
