/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Worker.Worker;
import Business.DistributionHub.DistributionHub;
import Business.DistributionHub.DistributionHubDirectory;
import Business.Role.ACAdminRole;
import Business.Role.Role;
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
import userinterface.DonorRole.DonorProfilePanel;

/**
 *
 *@author ankitapatil
 */
public class AddWarehousePanel extends javax.swing.JPanel {

    /**
     * Creates new form AddWarehousePanel
     */
    private Image img;
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    DistributionHubDirectory fcd;
    UserAccountDirectory uad;

    public AddWarehousePanel(String img) {
        this(new ImageIcon(img).getImage());
    }

    public AddWarehousePanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if (ecosystem.getACDOFDirectory() == null) {
            ecosystem.setACDDirectory(new DistributionHubDirectory());
        }

        setBG();

    }

    public AddWarehousePanel(Image img) {
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
        lblWarehousename = new javax.swing.JLabel();
        txtWHname = new javax.swing.JTextField();
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
        lblFCAdminpwd1 = new javax.swing.JLabel();
        txtFCAdminpwd1 = new javax.swing.JTextField();
        btnWarehouseSubmit = new javax.swing.JButton();
        lblWarehouseid = new javax.swing.JLabel();
        txtWarehouseid = new javax.swing.JTextField();
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
        lblAddWarehouseTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblAddWarehouseTitle.setText("Add Warehouse");
        add(lblAddWarehouseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 16, -1, -1));

        lblWarehousename.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehousename.setText("Warehouse Name:");
        add(lblWarehousename, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 114, -1, -1));

        txtWHname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWHname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHnameFocusLost(evt);
            }
        });
        add(txtWHname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 137, -1));

        lblWarehousePhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehousePhone.setText("Warehouse Phone Number:");
        add(lblWarehousePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        txtWarehousePhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehousePhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWarehousePhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWarehousePhoneFocusLost(evt);
            }
        });
        add(txtWarehousePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 153, 137, -1));

        lblWarehouseAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseAdd.setText("Warehouse Address:");
        add(lblWarehouseAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        txtWarehouseAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtWarehouseAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 196, 137, -1));

        lblWarehouseCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseCity.setText("City:");
        add(lblWarehouseCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 243, -1, -1));

        txtWarehouseCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtWarehouseCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 239, 137, -1));

        lblWarehouseState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseState.setText("State:");
        add(lblWarehouseState, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        txtWarehouseState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtWarehouseState, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 282, 137, -1));

        lblWarehouseZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseZip.setText("Zip:");
        add(lblWarehouseZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        txtWarehouseZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWarehouseZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWarehouseZipFocusLost(evt);
            }
        });
        add(txtWarehouseZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 325, 137, -1));

        lblWarehouseFCAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseFCAdmin.setText("Warehouse Admin Name:");
        add(lblWarehouseFCAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        txtWarehouseFCAdmin.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseFCAdmin.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWarehouseFCAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWarehouseFCAdminFocusLost(evt);
            }
        });
        add(txtWarehouseFCAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 368, 137, -1));

        lblFCAdminuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCAdminuname.setText("Warehouse Admin Username:");
        add(lblFCAdminuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        txtFCAdminuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCAdminuname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFCAdminuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 411, 137, -1));

        lblFCAdminpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCAdminpwd.setText("Password:");
        add(lblFCAdminpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 458, -1, -1));

        txtFCAdminpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCAdminpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCAdminpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCAdminpwdActionPerformed(evt);
            }
        });
        add(txtFCAdminpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 454, 137, -1));

        lblFCAdminpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCAdminpwd1.setText("Confirm Password:");
        add(lblFCAdminpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 501, -1, -1));

        txtFCAdminpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFCAdminpwd1.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCAdminpwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCAdminpwd1FocusLost(evt);
            }
        });
        add(txtFCAdminpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 497, 137, -1));

        btnWarehouseSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnWarehouseSubmit.setText("Submit");
        btnWarehouseSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarehouseSubmitActionPerformed(evt);
            }
        });
        add(btnWarehouseSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, -1, -1));

        lblWarehouseid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehouseid.setText("Warehouse ID:");
        add(lblWarehouseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 71, -1, -1));

        txtWarehouseid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtWarehouseid.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWarehouseid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWarehouseidFocusLost(evt);
            }
        });
        txtWarehouseid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarehouseidActionPerformed(evt);
            }
        });
        txtWarehouseid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWarehouseidKeyReleased(evt);
            }
        });
        add(txtWarehouseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 67, 134, -1));

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

    private void btnWarehouseSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarehouseSubmitActionPerformed
        // TODO add your handling code here:

        if (!nullCheck()) {
            if (chkpwd()) {
                String whid = txtWarehouseid.getText();
                String whName = txtWHname.getText();
                String phone = txtWarehousePhone.getText();

                String whCity = txtWarehouseCity.getText();
                String whState = txtWarehouseState.getText();
                String whZip = txtWarehouseZip.getText();
                String whAdmin = txtWarehouseFCAdmin.getText();
                String whUser = txtFCAdminuname.getText();
                String whPswd = txtFCAdminpwd.getText();
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
                employee.setName(txtWarehouseFCAdmin.getText());
                String role = "FCAdmin";
                DistributionHub fcw = new DistributionHub();
                fcw.setAcDistributionHubId("fcw" + txtWarehouseid.getText());
                fcw.setAcDistributionHubName(txtWHname.getText());
                fcw.setAcDistributionHubPhone(txtWarehousePhone.getText());
                fcw.setAcDistributionHubAddress(txtWarehouseAdd.getText());
                fcw.setAcDistributionHubCity(txtWarehouseCity.getText());
                fcw.setAcDistributionHubState(txtWarehouseState.getText());
                fcw.setAcDistributionHubZipcode(txtWarehouseZip.getText());
                fcw.setAcDistributionHubAdmin(txtWarehouseFCAdmin.getText());
                UserAccount fcWarehouseAccount = new UserAccount();
                String uaName = txtFCAdminuname.getText();
                fcWarehouseAccount.setUsername(uaName);
                String uaPwd = txtFCAdminpwd.getText();
                fcWarehouseAccount.setPassword(uaPwd);
                fcWarehouseAccount.setRole(new ACAdminRole());
                fcWarehouseAccount.setEmployee(employee);
                fcw.setAcDistributionHubAccount(fcWarehouseAccount);
                fcd = ecosystem.getACDDirectory();
                fcd.addNewACDistributionHub(fcw);
                ecosystem.setACDDirectory(fcd);
                uad = ecosystem.getUserAccountDirectory();
                uad.createUserAccount(txtFCAdminuname.getText(), txtFCAdminpwd.getText(), employee, new ACAdminRole());
                ecosystem.setUserAccountDirectory(uad);
                Integer whcnt = ecosystem.getdistributionHubCnt();
                ecosystem.setdistributionHubCnt(whcnt+1);
                JOptionPane.showMessageDialog(this, "warehouse added successfully!");
                clearfields();
            } else {
                JOptionPane.showMessageDialog(this, "Password Mismatch. Please verify the password entered.");
                txtFCAdminpwd1.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnWarehouseSubmitActionPerformed

    private void txtWarehouseidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWarehouseidKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtWarehouseidKeyReleased

    private void txtWarehouseidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWarehouseidFocusLost
        // TODO add your handling code here:
        if ((txtWarehouseid.getText().matches("^[a-zA-Z]*$"))) {
            lblWarehouseid2.setText("Invalid input. Please enter only numbers");
        } else {
            lblWarehouseid2.setText("");
        }
    }//GEN-LAST:event_txtWarehouseidFocusLost

    private void txtWHnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHnameFocusLost
        // TODO add your handling code here:
        if (!(txtWHname.getText().matches("^[a-zA-Z]*$"))) {
            lblWarehousename1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblWarehousename1.setText("");
        }
    }//GEN-LAST:event_txtWHnameFocusLost

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
            lblWarehouseFCAdmin1.setText("Invalid input. Please enter only alphabets.");
        } else {
            lblWarehouseFCAdmin1.setText("");
        }
    }//GEN-LAST:event_txtWarehouseFCAdminFocusLost

    private void txtFCAdminpwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCAdminpwd1FocusLost
        // TODO add your handling code here:
//        if(!(txtFCApwd.getText().equals(txtFCApwd1.getText()))){
//            lblFCApwd2.setText("Password Mismatch. Please verify the password entered.");
//        }
//        else{
//            lblFCApwd2.setText("");
//        }
    }//GEN-LAST:event_txtFCAdminpwd1FocusLost


    private void txtFCAdminpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCAdminpwdActionPerformed
        if (!Business.Validations.ValidateInputs.isPasswordValid(txtFCAdminpwd.getText())) {
            JOptionPane.showMessageDialog(this, "Please verify the password (min 8).");

        }
    }//GEN-LAST:event_txtFCAdminpwdActionPerformed

    private void txtWarehouseidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarehouseidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarehouseidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnWarehouseSubmit;
    private javax.swing.JLabel lblAddWarehouseTitle;
    private javax.swing.JLabel lblFCAdminpwd;
    private javax.swing.JLabel lblFCAdminpwd1;
    private javax.swing.JLabel lblFCAdminpwd2;
    private javax.swing.JLabel lblFCAdminuname;
    private javax.swing.JLabel lblWarehouseAdd;
    private javax.swing.JLabel lblWarehouseCity;
    private javax.swing.JLabel lblWarehouseFCAdmin;
    private javax.swing.JLabel lblWarehouseFCAdmin1;
    private javax.swing.JLabel lblWarehousePhone;
    private javax.swing.JLabel lblWarehousePhone1;
    private javax.swing.JLabel lblWarehouseState;
    private javax.swing.JLabel lblWarehouseZip;
    private javax.swing.JLabel lblWarehouseZip1;
    private javax.swing.JLabel lblWarehouseid;
    private javax.swing.JLabel lblWarehouseid2;
    private javax.swing.JLabel lblWarehousename;
    private javax.swing.JLabel lblWarehousename1;
    private javax.swing.JTextField txtFCAdminpwd;
    private javax.swing.JTextField txtFCAdminpwd1;
    private javax.swing.JTextField txtFCAdminuname;
    private javax.swing.JTextField txtWHname;
    private javax.swing.JTextField txtWarehouseAdd;
    private javax.swing.JTextField txtWarehouseCity;
    private javax.swing.JTextField txtWarehouseFCAdmin;
    private javax.swing.JTextField txtWarehousePhone;
    private javax.swing.JTextField txtWarehouseState;
    private javax.swing.JTextField txtWarehouseZip;
    private javax.swing.JTextField txtWarehouseid;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtWarehouseid.setText("");
        txtWHname.setText("");
        txtWarehousePhone.setText("");
        txtWarehouseAdd.setText("");
        txtWarehouseCity.setText("");
        txtWarehouseState.setText("");
        txtWarehouseZip.setText("");
        txtWarehouseFCAdmin.setText("");
        txtFCAdminuname.setText("");
        txtFCAdminpwd.setText("");
        txtFCAdminpwd1.setText("");
    }

    private boolean nullCheck() {
        if (txtWarehouseid.getText().length() != 0 && txtWHname.getText().length() != 0 && txtWarehousePhone.getText().length() != 0
                && txtWarehouseAdd.getText().length() != 0 && txtWarehouseCity.getText().length() != 0 && txtWarehouseState.getText().length() != 0
                && txtWarehouseZip.getText().length() != 0 && txtWarehouseFCAdmin.getText().length() != 0 && txtFCAdminuname.getText().length() != 0
                && txtFCAdminpwd.getText().length() != 0 && txtFCAdminpwd1.getText().length() != 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean chkpwd() {
        if (txtFCAdminpwd.getText().equals(txtFCAdminpwd1.getText())) {
            return true;
        } else {
            return false;
        }
    }

}
