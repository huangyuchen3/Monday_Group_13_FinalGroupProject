/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Worker.Worker;
import Business.DistributionHub.DistributionHub;
import Business.DistributionHub.DistributionHubDirectory;
import Business.Role.DHManagerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.DonorRole.DonorProfilePanel;

/**
 *
 *@author reetikabhanushali
 */
public class AddDHPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDHPanel
     */
    private Image img;
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    DistributionHubDirectory fcd;
    UserAccountDirectory uad;

    public AddDHPanel(String img) {
        this(new ImageIcon(img).getImage());
    }

    public AddDHPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if (ecosystem.getACDOFDirectory() == null) {
            ecosystem.setACDDirectory(new DistributionHubDirectory(ecosystem.getUserAccountDirectory()));
        }

        setBG();

    }

    public AddDHPanel(Image img) {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
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
        lblDistributionHubManager = new javax.swing.JLabel();
        txtDistributionHubManagerName = new javax.swing.JTextField();
        lblDistributionHubusername = new javax.swing.JLabel();
        txtDistributionHubusername = new javax.swing.JTextField();
        lblDistributionHubpwd = new javax.swing.JLabel();
        txtDistributionHubpwd = new javax.swing.JTextField();
        lblDistributionHubpwd1 = new javax.swing.JLabel();
        txtDistributionHubpwd1 = new javax.swing.JTextField();
        btnDistributionHubSubmit = new javax.swing.JButton();
        lblDistributionHubid = new javax.swing.JLabel();
        txtDistributionHubid = new javax.swing.JTextField();
        lblWarehouseid2 = new javax.swing.JLabel();
        lblWarehousename1 = new javax.swing.JLabel();
        lblWarehousePhone1 = new javax.swing.JLabel();
        lblWarehouseZip1 = new javax.swing.JLabel();
        lblWarehouseFCAdmin1 = new javax.swing.JLabel();
        lblFCAdminpwd2 = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddWarehouseTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblAddWarehouseTitle.setForeground(new java.awt.Color(102, 102, 255));
        lblAddWarehouseTitle.setText("Add Distribution Hub");
        add(lblAddWarehouseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        lblDistributionHubname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubname.setText("Distribution Hub Name:");
        add(lblDistributionHubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, 30));

        txtDistributionHubname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubnameFocusLost(evt);
            }
        });
        add(txtDistributionHubname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 137, -1));

        lblDistributionHubPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubPhone.setText("Distribution Hub Phone Number:");
        add(lblDistributionHubPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        txtDistributionHubPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubPhoneFocusLost(evt);
            }
        });
        add(txtDistributionHubPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 153, 137, -1));

        lblDistributionHubAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubAdd.setText("Distribution Hub Address:");
        add(lblDistributionHubAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        txtDistributionHubAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDistributionHubAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 196, 137, -1));

        lblDistributionHubCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubCity.setText("City:");
        add(lblDistributionHubCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 243, -1, -1));

        txtDistributionHubCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDistributionHubCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 239, 137, -1));

        lblDistributionHubState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubState.setText("State:");
        add(lblDistributionHubState, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, 30));

        txtDistributionHubState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDistributionHubState, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 282, 137, -1));

        lblDistributionHubZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubZip.setText("Zip:");
        add(lblDistributionHubZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        txtDistributionHubZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubZipFocusLost(evt);
            }
        });
        add(txtDistributionHubZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 325, 137, -1));

        lblDistributionHubManager.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubManager.setText("Distribution Hub Manager Name:");
        add(lblDistributionHubManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        txtDistributionHubManagerName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubManagerName.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubManagerName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubManagerNameFocusLost(evt);
            }
        });
        add(txtDistributionHubManagerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 368, 137, -1));

        lblDistributionHubusername.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubusername.setText("Distribution Hub Manager Username:");
        add(lblDistributionHubusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        txtDistributionHubusername.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubusername.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDistributionHubusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 411, 137, -1));

        lblDistributionHubpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubpwd.setText("Password:");
        add(lblDistributionHubpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 458, -1, -1));

        txtDistributionHubpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistributionHubpwdActionPerformed(evt);
            }
        });
        add(txtDistributionHubpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 454, 137, -1));

        lblDistributionHubpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubpwd1.setText("Confirm Password:");
        add(lblDistributionHubpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 501, -1, -1));

        txtDistributionHubpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubpwd1.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubpwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubpwd1FocusLost(evt);
            }
        });
        add(txtDistributionHubpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 497, 137, -1));

        btnDistributionHubSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnDistributionHubSubmit.setText("Submit");
        btnDistributionHubSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistributionHubSubmitActionPerformed(evt);
            }
        });
        add(btnDistributionHubSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, -1, -1));

        lblDistributionHubid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDistributionHubid.setText("Distribution Hub ID:");
        add(lblDistributionHubid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        txtDistributionHubid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDistributionHubid.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDistributionHubid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDistributionHubidFocusLost(evt);
            }
        });
        txtDistributionHubid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistributionHubidActionPerformed(evt);
            }
        });
        txtDistributionHubid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDistributionHubidKeyReleased(evt);
            }
        });
        add(txtDistributionHubid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 67, 134, -1));

        lblWarehouseid2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehouseid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 67, -1, -1));

        lblWarehousename1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehousename1, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 110, -1, -1));

        lblWarehousePhone1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehousePhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 153, -1, -1));

        lblWarehouseZip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehouseZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 325, -1, -1));

        lblWarehouseFCAdmin1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWarehouseFCAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 368, -1, -1));

        lblFCAdminpwd2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblFCAdminpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 497, -1, -1));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 700));
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

    public boolean isValid(String test, String regex) {
//        String regex = "^[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (test == null) {
            return false;
        }

        Matcher m = p.matcher(test);

        return m.matches();
    }

    private void btnDistributionHubSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistributionHubSubmitActionPerformed
        // TODO add your handling code here:

        if (!nullCheck()) {
            if (chkpwd()) {
                String whid = txtDistributionHubid.getText();
                String whName = txtDistributionHubname.getText();
                String phone = txtDistributionHubPhone.getText();

                String whCity = txtDistributionHubCity.getText();
                String whState = txtDistributionHubState.getText();
                String whZip = txtDistributionHubZip.getText();
                String whAdmin = txtDistributionHubManagerName.getText();
                String whUser = txtDistributionHubusername.getText();
                String whPswd = txtDistributionHubpwd.getText();
                if (!isValid(whid, "^[0-9]+")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid ID");
                    return;
                }
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

                UserAccountDirectory uaList = ecosystem.getUserAccountDirectory();
                Worker employee = new Worker();
                employee.setName(txtDistributionHubManagerName.getText());
                String role = "FCAdmin";
                DistributionHub fcw = new DistributionHub();
                fcw.setDistributionHubId("fcw" + txtDistributionHubid.getText());
                fcw.setDistributionHubName(txtDistributionHubname.getText());
                fcw.setDistributionHubPhone(txtDistributionHubPhone.getText());
                fcw.setDistributionHubAddress(txtDistributionHubAdd.getText());
                fcw.getDistributionHubCity(txtDistributionHubCity.getText());
                fcw.setDistributionHubState(txtDistributionHubState.getText());
                fcw.setDistributionHubZipcode(txtDistributionHubZip.getText());
                fcw.setDistributionHubAdmin(txtDistributionHubManagerName.getText());
                UserAccount fcWarehouseAccount = new UserAccount();
                String uaName = txtDistributionHubusername.getText();
                fcWarehouseAccount.setUsername(uaName);
                String uaPwd = txtDistributionHubpwd.getText();
                fcWarehouseAccount.setPassword(uaPwd);
                fcWarehouseAccount.setRole(new DHManagerRole());
                fcWarehouseAccount.setEmployee(employee);
                fcw.setDistributionHubAccount(fcWarehouseAccount);
                fcd = ecosystem.getACDDirectory();
                fcd.addNewDistributionHub(fcw);
                ecosystem.setACDDirectory(fcd);
                uad = ecosystem.getUserAccountDirectory();
                uad.createUserAccount(txtDistributionHubusername.getText(), txtDistributionHubpwd.getText(), employee, new DHManagerRole());
                ecosystem.setUserAccountDirectory(uad);
                Integer whcnt = ecosystem.getdistributionHubCnt();
                ecosystem.setdistributionHubCnt(whcnt+1);
                JOptionPane.showMessageDialog(this, "warehouse added successfully!");
                clearfields();
            } else {
                JOptionPane.showMessageDialog(this, "Password Mismatch. Please verify the password entered.");
                txtDistributionHubpwd1.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnDistributionHubSubmitActionPerformed

    private void txtDistributionHubidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistributionHubidKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDistributionHubidKeyReleased

    private void txtDistributionHubidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubidFocusLost
        // TODO add your handling code here:
        if ((txtDistributionHubid.getText().matches("^[a-zA-Z]*$"))) {
            lblWarehouseid2.setText("Invalid input. Please enter only numbers");
        } else {
            lblWarehouseid2.setText("");
        }
    }//GEN-LAST:event_txtDistributionHubidFocusLost

    private void txtDistributionHubnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubnameFocusLost
        // TODO add your handling code here:
        if (!(txtDistributionHubname.getText().matches("^[a-zA-Z]*$"))) {
            lblWarehousename1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblWarehousename1.setText("");
        }
    }//GEN-LAST:event_txtDistributionHubnameFocusLost

    private void txtDistributionHubPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubPhoneFocusLost
        // TODO add your handling code here:
        if (!(txtDistributionHubPhone.getText().matches("^[0-9]*$")) || !(txtDistributionHubPhone.getText().length() == 10)) {
            lblWarehousePhone1.setText("Please enter a valid phone number");
        } else {
            lblWarehousePhone1.setText("");

        }
    }//GEN-LAST:event_txtDistributionHubPhoneFocusLost

    private void txtDistributionHubZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubZipFocusLost
        // TODO add your handling code here:
        if ((txtDistributionHubZip.getText().matches("^[a-zA-Z]*$"))) {
            lblWarehouseZip1.setText("Invalid input. Please enter only numbers");
        } else {
            lblWarehouseZip1.setText("");
        }
    }//GEN-LAST:event_txtDistributionHubZipFocusLost

    private void txtDistributionHubManagerNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubManagerNameFocusLost
        // TODO add your handling code here:
        if (!(txtDistributionHubManagerName.getText().matches("^[a-zA-Z]*$"))) {
            lblWarehouseFCAdmin1.setText("Invalid input. Please enter only alphabets.");
        } else {
            lblWarehouseFCAdmin1.setText("");
        }
    }//GEN-LAST:event_txtDistributionHubManagerNameFocusLost

    private void txtDistributionHubpwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDistributionHubpwd1FocusLost
        // TODO add your handling code here:
//        if(!(txtFCApwd.getText().equals(txtFCApwd1.getText()))){
//            lblFCApwd2.setText("Password Mismatch. Please verify the password entered.");
//        }
//        else{
//            lblFCApwd2.setText("");
//        }
    }//GEN-LAST:event_txtDistributionHubpwd1FocusLost


    private void txtDistributionHubpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistributionHubpwdActionPerformed
        if (!Business.Validations.ValidateInputs.isPasswordValid(txtDistributionHubpwd.getText())) {
            JOptionPane.showMessageDialog(this, "Please verify the password (min 8).");

        }
    }//GEN-LAST:event_txtDistributionHubpwdActionPerformed

    private void txtDistributionHubidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistributionHubidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistributionHubidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnDistributionHubSubmit;
    private javax.swing.JLabel lblAddWarehouseTitle;
    private javax.swing.JLabel lblDistributionHubAdd;
    private javax.swing.JLabel lblDistributionHubCity;
    private javax.swing.JLabel lblDistributionHubManager;
    private javax.swing.JLabel lblDistributionHubPhone;
    private javax.swing.JLabel lblDistributionHubState;
    private javax.swing.JLabel lblDistributionHubZip;
    private javax.swing.JLabel lblDistributionHubid;
    private javax.swing.JLabel lblDistributionHubname;
    private javax.swing.JLabel lblDistributionHubpwd;
    private javax.swing.JLabel lblDistributionHubpwd1;
    private javax.swing.JLabel lblDistributionHubusername;
    private javax.swing.JLabel lblFCAdminpwd2;
    private javax.swing.JLabel lblWarehouseFCAdmin1;
    private javax.swing.JLabel lblWarehousePhone1;
    private javax.swing.JLabel lblWarehouseZip1;
    private javax.swing.JLabel lblWarehouseid2;
    private javax.swing.JLabel lblWarehousename1;
    private javax.swing.JTextField txtDistributionHubAdd;
    private javax.swing.JTextField txtDistributionHubCity;
    private javax.swing.JTextField txtDistributionHubManagerName;
    private javax.swing.JTextField txtDistributionHubPhone;
    private javax.swing.JTextField txtDistributionHubState;
    private javax.swing.JTextField txtDistributionHubZip;
    private javax.swing.JTextField txtDistributionHubid;
    private javax.swing.JTextField txtDistributionHubname;
    private javax.swing.JTextField txtDistributionHubpwd;
    private javax.swing.JTextField txtDistributionHubpwd1;
    private javax.swing.JTextField txtDistributionHubusername;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtDistributionHubid.setText("");
        txtDistributionHubname.setText("");
        txtDistributionHubPhone.setText("");
        txtDistributionHubAdd.setText("");
        txtDistributionHubCity.setText("");
        txtDistributionHubState.setText("");
        txtDistributionHubZip.setText("");
        txtDistributionHubManagerName.setText("");
        txtDistributionHubusername.setText("");
        txtDistributionHubpwd.setText("");
        txtDistributionHubpwd1.setText("");
    }

    private boolean nullCheck() {
        if (txtDistributionHubid.getText().length() != 0 && txtDistributionHubname.getText().length() != 0 && txtDistributionHubPhone.getText().length() != 0
                && txtDistributionHubAdd.getText().length() != 0 && txtDistributionHubCity.getText().length() != 0 && txtDistributionHubState.getText().length() != 0
                && txtDistributionHubZip.getText().length() != 0 && txtDistributionHubManagerName.getText().length() != 0 && txtDistributionHubusername.getText().length() != 0
                && txtDistributionHubpwd.getText().length() != 0 && txtDistributionHubpwd1.getText().length() != 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean chkpwd() {
        if (txtDistributionHubpwd.getText().equals(txtDistributionHubpwd1.getText())) {
            return true;
        } else {
            return false;
        }
    }

}
