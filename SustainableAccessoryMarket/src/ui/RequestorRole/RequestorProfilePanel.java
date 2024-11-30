/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.RequestorRole;

import Business.EcoSystem;
import Business.AccessoryRequestor.AccessoryRequestor;
import Business.AccessoryRequestor.AccessoryRequestorDirectory;
import Business.UserAccount.UserAccount;
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

/**
 *
 * @author reetikabhanushali 
 */
public class RequestorProfilePanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestorProfilePanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String reqUname;
    String requestorName;
    AccessoryRequestorDirectory requestorDir;

    public RequestorProfilePanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        btnReqSubmit.setVisible(false);
        btnReqCancel.setVisible(false);
        lblReqpwd1.setVisible(false);
        txtReqpwd1.setVisible(false);
        reqUname = userAcc.getUsername();
        requestorName = userAcc.getEmployee().getName();
        populateFields();
        setBG();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtReqadd = new javax.swing.JTextField();
        lblReqadd = new javax.swing.JLabel();
        lblReqphone = new javax.swing.JLabel();
        txtReqName = new javax.swing.JTextField();
        lblReqName = new javax.swing.JLabel();
        lblReqProfileTitle = new javax.swing.JLabel();
        txtReqpwd1 = new javax.swing.JTextField();
        lblReqpwd1 = new javax.swing.JLabel();
        txtReqpwd = new javax.swing.JTextField();
        lblReqpwd = new javax.swing.JLabel();
        txtRequname = new javax.swing.JTextField();
        txtReqphone = new javax.swing.JTextField();
        lblReqUname = new javax.swing.JLabel();
        btnReqEdit = new javax.swing.JButton();
        btnReqSubmit = new javax.swing.JButton();
        txtReqemail = new javax.swing.JTextField();
        lblReqemail = new javax.swing.JLabel();
        txtReqzip = new javax.swing.JTextField();
        lblReqzip = new javax.swing.JLabel();
        txtReqstate = new javax.swing.JTextField();
        lblReqstate = new javax.swing.JLabel();
        txtReqcity = new javax.swing.JTextField();
        lblReqcity = new javax.swing.JLabel();
        lblReqName1 = new javax.swing.JLabel();
        lblReqphno1 = new javax.swing.JLabel();
        lblReqadd1 = new javax.swing.JLabel();
        lblReqcity1 = new javax.swing.JLabel();
        lblReqstate1 = new javax.swing.JLabel();
        lblReqzip1 = new javax.swing.JLabel();
        lblReqemail1 = new javax.swing.JLabel();
        lblReqUname1 = new javax.swing.JLabel();
        lblReqpwd2 = new javax.swing.JLabel();
        lblReqpwd3 = new javax.swing.JLabel();
        btnReqCancel = new javax.swing.JButton();
        LabelImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReqadd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtReqadd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtReqadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReqaddFocusLost(evt);
            }
        });
        add(txtReqadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 180, 137, -1));

        lblReqadd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqadd.setText("Address:");
        add(lblReqadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 184, -1, -1));

        lblReqphone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqphone.setText("Phone Number:");
        add(lblReqphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 141, -1, -1));

        txtReqName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtReqName.setPreferredSize(new java.awt.Dimension(150, 25));
        txtReqName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReqNameFocusLost(evt);
            }
        });
        txtReqName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReqNameActionPerformed(evt);
            }
        });
        add(txtReqName, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 91, 137, -1));

        lblReqName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqName.setText("Name:");
        add(lblReqName, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 95, -1, -1));

        lblReqProfileTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblReqProfileTitle.setForeground(new java.awt.Color(102, 102, 255));
        lblReqProfileTitle.setText(" Accessory Requestor Profile");
        add(lblReqProfileTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        txtReqpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtReqpwd1.setPreferredSize(new java.awt.Dimension(150, 25));
        txtReqpwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReqpwd1FocusLost(evt);
            }
        });
        add(txtReqpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 481, 137, -1));

        lblReqpwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqpwd1.setText("Confirm Password");
        add(lblReqpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 485, -1, -1));

        txtReqpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtReqpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtReqpwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReqpwdFocusLost(evt);
            }
        });
        add(txtReqpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 438, 137, -1));

        lblReqpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqpwd.setText("Password:");
        add(lblReqpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 442, -1, -1));

        txtRequname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtRequname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtRequname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRequnameFocusLost(evt);
            }
        });
        add(txtRequname, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 395, 137, -1));

        txtReqphone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtReqphone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtReqphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReqphoneFocusLost(evt);
            }
        });
        add(txtReqphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 137, 137, -1));

        lblReqUname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqUname.setText("Username:");
        add(lblReqUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 399, -1, -1));

        btnReqEdit.setBackground(new java.awt.Color(204, 204, 255));
        btnReqEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnReqEdit.setText("Edit Profile");
        btnReqEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqEditActionPerformed(evt);
            }
        });
        add(btnReqEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        btnReqSubmit.setBackground(new java.awt.Color(204, 204, 255));
        btnReqSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnReqSubmit.setText("Submit");
        btnReqSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqSubmitActionPerformed(evt);
            }
        });
        add(btnReqSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        txtReqemail.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtReqemail.setPreferredSize(new java.awt.Dimension(150, 25));
        txtReqemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReqemailFocusLost(evt);
            }
        });
        add(txtReqemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 352, 137, -1));

        lblReqemail.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqemail.setText("Email ID:");
        add(lblReqemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        txtReqzip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtReqzip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtReqzip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReqzipFocusLost(evt);
            }
        });
        add(txtReqzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 309, 137, -1));

        lblReqzip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqzip.setText("Zip:");
        add(lblReqzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        txtReqstate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtReqstate.setPreferredSize(new java.awt.Dimension(150, 25));
        txtReqstate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReqstateFocusLost(evt);
            }
        });
        add(txtReqstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 266, 137, -1));

        lblReqstate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqstate.setText("State:");
        add(lblReqstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 270, -1, -1));

        txtReqcity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtReqcity.setPreferredSize(new java.awt.Dimension(150, 25));
        txtReqcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReqcityFocusLost(evt);
            }
        });
        add(txtReqcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 223, 137, -1));

        lblReqcity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqcity.setText("City:");
        add(lblReqcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 227, -1, -1));

        lblReqName1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 90, -1, -1));

        lblReqphno1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqphno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 137, -1, -1));

        lblReqadd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 180, -1, -1));

        lblReqcity1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqcity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 223, -1, -1));

        lblReqstate1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqstate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 266, -1, -1));

        lblReqzip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqzip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 309, -1, -1));

        lblReqemail1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 352, -1, -1));

        lblReqUname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqUname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 395, -1, -1));

        lblReqpwd2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 438, -1, -1));

        lblReqpwd3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblReqpwd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 481, -1, -1));

        btnReqCancel.setBackground(new java.awt.Color(204, 204, 255));
        btnReqCancel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnReqCancel.setText("Cancel");
        btnReqCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqCancelActionPerformed(evt);
            }
        });
        add(btnReqCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1590, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void txtReqaddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReqaddFocusLost
        // TODO add your handling code here:
        if (!(txtReqadd.getText().matches("^[a-zA-Z]*$"))) {
            lblReqadd1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblReqadd1.setText("");
        }
    }//GEN-LAST:event_txtReqaddFocusLost

    private void txtReqNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReqNameFocusLost
        // TODO add your handling code here:
        if (!(txtReqName.getText().matches("^[a-zA-Z]*$"))) {
            lblReqName1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblReqName1.setText("");
        }
    }//GEN-LAST:event_txtReqNameFocusLost

    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1650, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(RequestorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtReqpwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReqpwd1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReqpwd1FocusLost

    private void txtReqpwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReqpwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReqpwdFocusLost

    private void txtRequnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRequnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRequnameFocusLost

    private void txtReqphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReqphoneFocusLost
        // TODO add your handling code here:
        if (!(txtReqphone.getText().matches("^[0-9]*$")) || !(txtReqphone.getText().length() == 10)) {
            lblReqphno1.setText("Please enter a valid phone number");
        } else {
            lblReqphno1.setText("");

        }
    }//GEN-LAST:event_txtReqphoneFocusLost

    private void btnReqEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqEditActionPerformed
        // TODO add your handling code here:
        enablefields();
    }//GEN-LAST:event_btnReqEditActionPerformed

    public boolean isValid(String test, String regex) {
//        String regex = "^[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (test == null) {
            return false;
        }

        Matcher m = p.matcher(test);

        return m.matches();
    }

    private void btnReqSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqSubmitActionPerformed
        // TODO add your handling code here:
        if (!nullCheck()) {
            ArrayList<AccessoryRequestor> reqList = ecosystem.getReqDir().getReqAccList();
            for (AccessoryRequestor r : reqList) {
                if (r.getReqAccount().getUsername().equals(reqUname)) {

                    String reqName = txtReqName.getText();
                    String phone = txtReqphone.getText();
                    String reqAdds = txtReqadd.getText();
                    String reqCity = txtReqcity.getText();
                    String reqState = txtReqstate.getText();
                    String reqZip = txtReqzip.getText();
                    String reqMail = txtReqemail.getText();
                    String reqUser = txtRequname.getText();
                    String reqPswd = txtReqpwd.getText();

//                    if (!isValid(reqName, "^[A-Za-z]{3,}")) {
//                        JOptionPane.showMessageDialog(this, "Please enter valid name");
//                        return;
//                    }
                    if (!isValid(phone, "[+]?[0-9]{10,13}")) {
                        JOptionPane.showMessageDialog(this, "Please enter valid phone number");
                        return;
                    }
                    if (reqAdds.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Please enter requestor address");
                        return;
                    }
                    if (!isValid(reqCity, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){3,}")) {
                        JOptionPane.showMessageDialog(this, "Please enter valid city");
                        return;
                    }
                    if (!isValid(reqState, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){2,}")) {
                        JOptionPane.showMessageDialog(this, "Please enter valid state");
                        return;
                    }
                    if (!isValid(reqZip, "^[0-9]{5}(?:-[0-9]{4})?$")) {
                        JOptionPane.showMessageDialog(this, "Please enter valid zip");
                        return;
                    }

                    if (!isValid(reqUser, "^[a-zA-Z0-9._-]{6,}$")) {
                        JOptionPane.showMessageDialog(this, "Please enter a valid username of atleast 6 characters");
                        return;
                    }
                    if (!isValid(reqPswd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                        JOptionPane.showMessageDialog(this, "Please enter a valid password of atleast 8 characters in length. It must contain a number, a specicial character, a lowercase and an uppercase character.");
                        return;
                    }
//                    if (!isValid(reqMail, "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")) {
//                        JOptionPane.showMessageDialog(this, "Please enter a valid mail");
//                        return;
//                    }

                    r.setReqName(txtReqName.getText());
                    r.setReqPhno(txtReqphone.getText());
                    r.setReqEmail(txtReqemail.getText());
                    r.setReqAddres(txtReqadd.getText());
                    r.setReqCity(txtReqcity.getText());
                    r.setReqState(txtReqstate.getText());
                    r.setReqZipcode(txtReqzip.getText());
                    r.setReqUserName(txtRequname.getText());
                    r.setReqPwd(txtReqpwd.getText());
                    
                    r.getReqAccount().setUsername(txtRequname.getText());
                    r.getReqAccount().setPassword(txtReqpwd.getText());
                }
            }
            // ecosystem.setFCWDirectory(fcWarehouseList);
            requestorDir = ecosystem.getReqDir();
            ecosystem.setReqDir(requestorDir);
            JOptionPane.showMessageDialog(this, "Profile updated successfully");
            disableFields();
        } else {
            JOptionPane.showMessageDialog(this, "All fields are mandatory!");
        }
    }//GEN-LAST:event_btnReqSubmitActionPerformed

    private void txtReqemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReqemailFocusLost
        // TODO add your handling code here:
        if ((!txtReqemail.getText().isEmpty()) && !txtReqemail.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            lblReqemail1.setText("Please Provide Valid Email Address !!");
        } else {
            lblReqemail1.setText("");
        }
    }//GEN-LAST:event_txtReqemailFocusLost

    private void txtReqzipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReqzipFocusLost
        // TODO add your handling code here:
        if ((txtReqzip.getText().matches("^[a-zA-Z]*$"))) {
            lblReqzip1.setText("Invalid input. Please enter only numbers");
        } else {
            lblReqzip1.setText("");
        }
    }//GEN-LAST:event_txtReqzipFocusLost

    private void txtReqstateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReqstateFocusLost
        // TODO add your handling code here:
        if (!(txtReqstate.getText().matches("^[a-zA-Z]*$"))) {
            lblReqstate1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblReqstate1.setText("");
        }
    }//GEN-LAST:event_txtReqstateFocusLost

    private void txtReqcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReqcityFocusLost
        // TODO add your handling code here:
        if (!(txtReqcity.getText().matches("^[a-zA-Z]*$"))) {
            lblReqcity1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblReqcity1.setText("");
        }
    }//GEN-LAST:event_txtReqcityFocusLost

    private void btnReqCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqCancelActionPerformed
        // TODO add your handling code here:
        disableFields();

    }//GEN-LAST:event_btnReqCancelActionPerformed

    private void txtReqNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReqNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReqNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnReqCancel;
    private javax.swing.JButton btnReqEdit;
    private javax.swing.JButton btnReqSubmit;
    private javax.swing.JLabel lblReqName;
    private javax.swing.JLabel lblReqName1;
    private javax.swing.JLabel lblReqProfileTitle;
    private javax.swing.JLabel lblReqUname;
    private javax.swing.JLabel lblReqUname1;
    private javax.swing.JLabel lblReqadd;
    private javax.swing.JLabel lblReqadd1;
    private javax.swing.JLabel lblReqcity;
    private javax.swing.JLabel lblReqcity1;
    private javax.swing.JLabel lblReqemail;
    private javax.swing.JLabel lblReqemail1;
    private javax.swing.JLabel lblReqphno1;
    private javax.swing.JLabel lblReqphone;
    private javax.swing.JLabel lblReqpwd;
    private javax.swing.JLabel lblReqpwd1;
    private javax.swing.JLabel lblReqpwd2;
    private javax.swing.JLabel lblReqpwd3;
    private javax.swing.JLabel lblReqstate;
    private javax.swing.JLabel lblReqstate1;
    private javax.swing.JLabel lblReqzip;
    private javax.swing.JLabel lblReqzip1;
    private javax.swing.JTextField txtReqName;
    private javax.swing.JTextField txtReqadd;
    private javax.swing.JTextField txtReqcity;
    private javax.swing.JTextField txtReqemail;
    private javax.swing.JTextField txtReqphone;
    private javax.swing.JTextField txtReqpwd;
    private javax.swing.JTextField txtReqpwd1;
    private javax.swing.JTextField txtReqstate;
    private javax.swing.JTextField txtRequname;
    private javax.swing.JTextField txtReqzip;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        for (AccessoryRequestor r : ecosystem.getReqDir().getReqAccList()) {
            if (r.getReqAccount().getUsername().equals(reqUname)) {
                txtReqName.setText(r.getReqName());
                txtReqName.setEnabled(false);
                txtReqphone.setText(r.getReqPhno());
                txtReqphone.setEnabled(false);
                txtReqemail.setText(r.getReqEmail());
                txtReqemail.setEnabled(false);
                txtReqadd.setText(r.getReqAddres());
                txtReqadd.setEnabled(false);
                txtReqcity.setText(r.getReqCity());
                txtReqcity.setEnabled(false);
                txtReqstate.setText(r.getReqState());
                txtReqstate.setEnabled(false);
                txtReqzip.setText(r.getReqZipcode());
                txtReqzip.setEnabled(false);
                txtRequname.setText(r.getReqAccount().getUsername());
                txtRequname.setEnabled(false);
                txtReqpwd.setText(r.getReqAccount().getPassword());
                txtReqpwd.setEnabled(false);
                break;
            }
            
        }
    }

    private void enablefields() {
        txtReqName.setEnabled(true);
        txtReqphone.setEnabled(true);
        txtReqemail.setEnabled(true);
        txtReqadd.setEnabled(true);
        txtReqcity.setEnabled(true);
        txtReqstate.setEnabled(true);
        txtReqzip.setEnabled(true);
        txtRequname.setEnabled(true);
        txtReqpwd.setEnabled(true);
        btnReqSubmit.setVisible(true);
        btnReqCancel.setVisible(true);
        lblReqpwd1.setVisible(true);
        txtReqpwd1.setVisible(true);
    }

    private boolean nullCheck() {
        if (txtReqName.getText().length() != 0 && txtReqphone.getText().length() != 0 && txtReqemail.getText().length() != 0
                && txtReqadd.getText().length() != 0 && txtReqcity.getText().length() != 0 && txtReqstate.getText().length() != 0
                && txtReqzip.getText().length() != 0 && txtRequname.getText().length() != 0 && txtReqpwd.getText().length() != 0
                && txtReqpwd1.getText().length() != 0) {
            return false;
        } else {
            return true;
        }
    }

    private void disableFields() {
        txtReqName.setEnabled(false);
        txtReqphone.setEnabled(false);
        txtReqemail.setEnabled(false);
        txtReqadd.setEnabled(false);
        txtReqcity.setEnabled(false);
        txtReqstate.setEnabled(false);
        txtReqzip.setEnabled(false);
        txtRequname.setEnabled(false);
        txtReqpwd.setEnabled(false);
        btnReqSubmit.setVisible(false);
        btnReqCancel.setVisible(false);
        lblReqpwd1.setVisible(false);
        txtReqpwd1.setVisible(false);
        lblReqName1.setText("");
        lblReqphno1.setText("");
        lblReqemail1.setText("");
        lblReqadd1.setText("");
        lblReqcity1.setText("");
        lblReqstate1.setText("");
        lblReqzip1.setText("");
        lblReqUname1.setText("");
        lblReqpwd2.setText("");
        lblReqpwd3.setText("");
    }

}
