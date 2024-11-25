/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DonorRole;

import Business.FoodDonor.FoodDonor;
import Business.FoodDonor.FoodDonorDirectory;
import Business.EcoSystem;
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
 * @author ankitapatil 
 */
public class DonorProfilePanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorProfilePanle
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String DonUname;
    String DonName;
    FoodDonorDirectory donorDir;

    public DonorProfilePanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        btnProfileSubmit.setVisible(false);
        btnDonorCancel.setVisible(false);
        lblDonorCPassword.setVisible(false);
        txtDonorCPassword.setVisible(false);
        DonUname = userAcc.getUsername();
        DonName = userAcc.getEmployee().getName();
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

        lblDonorProfileTitle = new javax.swing.JLabel();
        lblDonorName = new javax.swing.JLabel();
        txtDonorname = new javax.swing.JTextField();
        lblDonorPhone = new javax.swing.JLabel();
        txtDonorPhone = new javax.swing.JTextField();
        lblDonorAddress = new javax.swing.JLabel();
        txtDonorAddress = new javax.swing.JTextField();
        lblDonorCity = new javax.swing.JLabel();
        txtDonorCity = new javax.swing.JTextField();
        lblDonorState = new javax.swing.JLabel();
        txtDonorState = new javax.swing.JTextField();
        lblDonorZip = new javax.swing.JLabel();
        txtDonorZip = new javax.swing.JTextField();
        lblDonorEmail = new javax.swing.JLabel();
        txtDonorEmail = new javax.swing.JTextField();
        btnProfileSubmit = new javax.swing.JButton();
        btnProfileEdit = new javax.swing.JButton();
        lblDonorUsername = new javax.swing.JLabel();
        txtDonorUsername = new javax.swing.JTextField();
        lblDonorPassword = new javax.swing.JLabel();
        txtDonorPassword = new javax.swing.JTextField();
        lblDonorCPassword = new javax.swing.JLabel();
        txtDonorCPassword = new javax.swing.JTextField();
        lblDonorName1 = new javax.swing.JLabel();
        lblDonorphno1 = new javax.swing.JLabel();
        lblDonoradd1 = new javax.swing.JLabel();
        lblDonorcity1 = new javax.swing.JLabel();
        lblDonorstate1 = new javax.swing.JLabel();
        lblDonorzip1 = new javax.swing.JLabel();
        lblDonoremail1 = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        lblDonorpwd2 = new javax.swing.JLabel();
        lblDonorpwd3 = new javax.swing.JLabel();
        btnDonorCancel = new javax.swing.JButton();
        ImageLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(2000, 1100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDonorProfileTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblDonorProfileTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblDonorProfileTitle.setText("My  Profile");
        add(lblDonorProfileTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        lblDonorName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorName.setText("Name:");
        add(lblDonorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        txtDonorname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonornameFocusLost(evt);
            }
        });
        add(txtDonorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 137, -1));

        lblDonorPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorPhone.setText("Phone Number:");
        add(lblDonorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        txtDonorPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonorPhoneFocusLost(evt);
            }
        });
        add(txtDonorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 137, -1));

        lblDonorAddress.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorAddress.setText("Address:");
        add(lblDonorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        txtDonorAddress.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorAddress.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonorAddressFocusLost(evt);
            }
        });
        add(txtDonorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 137, -1));

        lblDonorCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorCity.setText("City:");
        add(lblDonorCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        txtDonorCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorCity.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonorCityFocusLost(evt);
            }
        });
        add(txtDonorCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 137, -1));

        lblDonorState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorState.setText("State:");
        add(lblDonorState, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        txtDonorState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorState.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorState.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonorStateFocusLost(evt);
            }
        });
        add(txtDonorState, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 137, -1));

        lblDonorZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorZip.setText("Zip:");
        add(lblDonorZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        txtDonorZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonorZipFocusLost(evt);
            }
        });
        add(txtDonorZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 137, -1));

        lblDonorEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorEmail.setText("Email ID:");
        add(lblDonorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        txtDonorEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorEmail.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonorEmailFocusLost(evt);
            }
        });
        add(txtDonorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 137, -1));

        btnProfileSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnProfileSubmit.setText("Submit");
        btnProfileSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileSubmitActionPerformed(evt);
            }
        });
        add(btnProfileSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, -1, -1));

        btnProfileEdit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnProfileEdit.setText("Edit Profile");
        btnProfileEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileEditActionPerformed(evt);
            }
        });
        add(btnProfileEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        lblDonorUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorUsername.setText("Username:");
        add(lblDonorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        txtDonorUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorUsername.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonorUsernameFocusLost(evt);
            }
        });
        add(txtDonorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 137, -1));

        lblDonorPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorPassword.setText("Password:");
        add(lblDonorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        txtDonorPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorPassword.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonorPasswordFocusLost(evt);
            }
        });
        add(txtDonorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 137, -1));

        lblDonorCPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonorCPassword.setText("Confirm Password :");
        add(lblDonorCPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        txtDonorCPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonorCPassword.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonorCPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonorCPasswordFocusLost(evt);
            }
        });
        add(txtDonorCPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 137, -1));

        lblDonorName1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDonorName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        lblDonorphno1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDonorphno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        lblDonoradd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDonoradd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        lblDonorcity1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDonorcity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        lblDonorstate1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDonorstate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, -1, -1));

        lblDonorzip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDonorzip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        lblDonoremail1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDonoremail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        lblUsername1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));

        lblDonorpwd2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDonorpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        lblDonorpwd3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblDonorpwd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));

        btnDonorCancel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnDonorCancel.setText("Cancel");
        btnDonorCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorCancelActionPerformed(evt);
            }
        });
        add(btnDonorCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        ImageLabel.setText(" ");
        add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 700));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            ImageLabel.setMinimumSize(new Dimension(1500, 1000));
            ImageLabel.setPreferredSize(new Dimension(1500, 1000));
            ImageLabel.setMaximumSize(new Dimension(1500, 1000));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1450, 950, java.awt.Image.SCALE_SMOOTH);
            ImageLabel.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void txtDonornameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonornameFocusLost
        // TODO add your handling code here:
        if (!(txtDonorname.getText().matches("^[a-zA-Z]*$"))) {
            lblDonorName1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblDonorName1.setText("");
        }
    }//GEN-LAST:event_txtDonornameFocusLost

    private void txtDonorPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonorPhoneFocusLost
        // TODO add your handling code here:
        if (!(txtDonorPhone.getText().matches("^[0-9]*$")) || !(txtDonorPhone.getText().length() == 10)) {
            lblDonorphno1.setText("Please enter a valid phone number");
        } else {
            lblDonorphno1.setText("");

        }
    }//GEN-LAST:event_txtDonorPhoneFocusLost

    private void txtDonorAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonorAddressFocusLost
        // TODO add your handling code here:
        if (!(txtDonorAddress.getText().matches("^[a-zA-Z]*$"))) {
            lblDonoradd1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblDonoradd1.setText("");
        }
    }//GEN-LAST:event_txtDonorAddressFocusLost

    private void txtDonorCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonorCityFocusLost
        // TODO add your handling code here:
        if (!(txtDonorCity.getText().matches("^[a-zA-Z]*$"))) {
            lblDonorcity1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblDonorcity1.setText("");
        }
    }//GEN-LAST:event_txtDonorCityFocusLost

    private void txtDonorStateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonorStateFocusLost
        // TODO add your handling code here:
        if (!(txtDonorState.getText().matches("^[a-zA-Z]*$"))) {
            lblDonorstate1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblDonorstate1.setText("");
        }
    }//GEN-LAST:event_txtDonorStateFocusLost

    private void txtDonorZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonorZipFocusLost
        // TODO add your handling code here:
        if ((txtDonorZip.getText().matches("^[a-zA-Z]*$"))) {
            lblDonorzip1.setText("Invalid input. Please enter only numbers");
        } else {
            lblDonorzip1.setText("");
        }
    }//GEN-LAST:event_txtDonorZipFocusLost

    private void txtDonorEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonorEmailFocusLost
        // TODO add your handling code here:
        if ((!txtDonorEmail.getText().isEmpty()) && !txtDonorEmail.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            lblDonoremail1.setText("Please Provide Valid Email Address !!");
        } else {
            lblDonoremail1.setText("");
        }
    }//GEN-LAST:event_txtDonorEmailFocusLost

    public boolean isValid(String test, String regex) {
//        String regex = "^[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (test == null) {
            return false;
        }

        Matcher m = p.matcher(test);

        return m.matches();
    }

    private void btnProfileSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileSubmitActionPerformed
        // TODO add your handling code here:
        if (!nullCheck()) {
            ArrayList<FoodDonor> donList = ecosystem.getDonDir().getDonorList();
            for (FoodDonor d : donList) {
                if (d.getDonorAccount().getUsername().equals(DonUname)) {

                    String donName = txtDonorname.getText();
                    String phone = txtDonorPhone.getText();
                    String donAdds = txtDonorAddress.getText();
                    String donCity = txtDonorCity.getText();
                    String donState = txtDonorState.getText();
                    String donZip = txtDonorZip.getText();
                    String donMail = txtDonorEmail.getText();
                    String donUser = txtDonorUsername.getText();
                    String donPswd = txtDonorPassword.getText();

                    if (!isValid(donName, "^[A-Za-z]{3,}")) {
                        JOptionPane.showMessageDialog(this, "Please enter valid name");
                        return;
                    }
                    if (!isValid(phone, "[+]?[0-9]{10,13}")) {
                        JOptionPane.showMessageDialog(this, "Please enter valid phone number");
                        return;
                    }
                    if(donAdds.isEmpty()){
                        JOptionPane.showMessageDialog(this, "Please enter donnor address");
                        return;
                    }
                    if (!isValid(donCity, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){3,}")) {
                        JOptionPane.showMessageDialog(this, "Please enter valid city");
                        return;
                    }
                    if (!isValid(donState, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){2,}")) {
                        JOptionPane.showMessageDialog(this, "Please enter valid state");
                        return;
                    }
                    if (!isValid(donZip, "^[0-9]{5}(?:-[0-9]{4})?$")) {
                        JOptionPane.showMessageDialog(this, "Please enter valid zip");
                        return;
                    }

                    if (!isValid(donUser, "^[a-zA-Z0-9._-]{6,}$")) {
                        JOptionPane.showMessageDialog(this, "Please enter a valid username of atleast 6 characters");
                        return;
                    }
                    if (!isValid(donPswd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                        JOptionPane.showMessageDialog(this, "Please enter a valid password of atleast 8 characters in length. It must contain a number, a specicial character, a lowercase and an uppercase character.");
                        return;
                    }
                    if (!isValid(donMail, "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")) {
                        JOptionPane.showMessageDialog(this, "Please enter a valid mail");
                        return;
                    }

                    d.setDonorName(txtDonorname.getText());
                    d.setDonorPhno(txtDonorPhone.getText());
                    d.setDonorEmail(txtDonorEmail.getText());
                    d.setDonorAddres(txtDonorAddress.getText());
                    d.setDonorCity(txtDonorCity.getText());
                    d.setDonorState(txtDonorState.getText());
                    d.setDonorZipcode(txtDonorZip.getText());
                    d.setDonUserName(txtDonorUsername.getText());
                    d.setDonPwd(txtDonorPassword.getText());
                }
            }
            // ecosystem.setFCWDirectory(fcWarehouseList);
            donorDir = ecosystem.getDonDir();
            ecosystem.setDonDir(donorDir);
            JOptionPane.showMessageDialog(this, "Profile updated successfully");
            disableFields();
        } else {
            JOptionPane.showMessageDialog(this, "All fields are mandatory!");
        }
    }//GEN-LAST:event_btnProfileSubmitActionPerformed

    private void btnProfileEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileEditActionPerformed
        // TODO add your handling code here:
        enablefields();
    }//GEN-LAST:event_btnProfileEditActionPerformed

    private void txtDonorUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonorUsernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonorUsernameFocusLost

    private void txtDonorPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonorPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonorPasswordFocusLost

    private void txtDonorCPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonorCPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonorCPasswordFocusLost

    private void btnDonorCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorCancelActionPerformed
        // TODO add your handling code here:
        disableFields();
    }//GEN-LAST:event_btnDonorCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JButton btnDonorCancel;
    private javax.swing.JButton btnProfileEdit;
    private javax.swing.JButton btnProfileSubmit;
    private javax.swing.JLabel lblDonorAddress;
    private javax.swing.JLabel lblDonorCPassword;
    private javax.swing.JLabel lblDonorCity;
    private javax.swing.JLabel lblDonorEmail;
    private javax.swing.JLabel lblDonorName;
    private javax.swing.JLabel lblDonorName1;
    private javax.swing.JLabel lblDonorPassword;
    private javax.swing.JLabel lblDonorPhone;
    private javax.swing.JLabel lblDonorProfileTitle;
    private javax.swing.JLabel lblDonorState;
    private javax.swing.JLabel lblDonorUsername;
    private javax.swing.JLabel lblDonorZip;
    private javax.swing.JLabel lblDonoradd1;
    private javax.swing.JLabel lblDonorcity1;
    private javax.swing.JLabel lblDonoremail1;
    private javax.swing.JLabel lblDonorphno1;
    private javax.swing.JLabel lblDonorpwd2;
    private javax.swing.JLabel lblDonorpwd3;
    private javax.swing.JLabel lblDonorstate1;
    private javax.swing.JLabel lblDonorzip1;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JTextField txtDonorAddress;
    private javax.swing.JTextField txtDonorCPassword;
    private javax.swing.JTextField txtDonorCity;
    private javax.swing.JTextField txtDonorEmail;
    private javax.swing.JTextField txtDonorPassword;
    private javax.swing.JTextField txtDonorPhone;
    private javax.swing.JTextField txtDonorState;
    private javax.swing.JTextField txtDonorUsername;
    private javax.swing.JTextField txtDonorZip;
    private javax.swing.JTextField txtDonorname;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        for (FoodDonor d : ecosystem.getDonDir().getDonorList()) {
            if (d.getDonorName().equals(DonName)) {
                txtDonorname.setText(d.getDonorName());
                txtDonorname.setEnabled(false);
                txtDonorPhone.setText(d.getDonorPhno());
                txtDonorPhone.setEnabled(false);
                txtDonorEmail.setText(d.getDonorEmail());
                txtDonorEmail.setEnabled(false);
                txtDonorAddress.setText(d.getDonorAddres());
                txtDonorAddress.setEnabled(false);
                txtDonorCity.setText(d.getDonorCity());
                txtDonorCity.setEnabled(false);
                txtDonorState.setText(d.getDonorState());
                txtDonorState.setEnabled(false);
                txtDonorZip.setText(d.getDonorZipcode());
                txtDonorZip.setEnabled(false);
                txtDonorUsername.setText(d.getDonorAccount().getUsername());
                txtDonorUsername.setEnabled(false);
                txtDonorPassword.setText(d.getDonorAccount().getPassword());
                txtDonorPassword.setEnabled(false);
            }
        }
    }

    private void enablefields() {
        txtDonorname.setEnabled(true);
        txtDonorPhone.setEnabled(true);
        txtDonorEmail.setEnabled(true);
        txtDonorAddress.setEnabled(true);
        txtDonorCity.setEnabled(true);
        txtDonorState.setEnabled(true);
        txtDonorZip.setEnabled(true);
        txtDonorUsername.setEnabled(true);
        txtDonorPassword.setEnabled(true);
        btnProfileSubmit.setVisible(true);
        btnDonorCancel.setVisible(true);
        lblDonorCPassword.setVisible(true);
        txtDonorCPassword.setVisible(true);
    }

    private boolean nullCheck() {
        if (txtDonorname.getText().length() != 0 && txtDonorPhone.getText().length() != 0 && txtDonorEmail.getText().length() != 0
                && txtDonorAddress.getText().length() != 0 && txtDonorCity.getText().length() != 0 && txtDonorState.getText().length() != 0
                && txtDonorZip.getText().length() != 0 && txtDonorUsername.getText().length() != 0 && txtDonorPassword.getText().length() != 0
                && txtDonorCPassword.getText().length() != 0) {
            return false;
        } else {
            return true;
        }
    }

    private void disableFields() {
        txtDonorname.setEnabled(false);
        txtDonorPhone.setEnabled(false);
        txtDonorEmail.setEnabled(false);
        txtDonorAddress.setEnabled(false);
        txtDonorCity.setEnabled(false);
        txtDonorState.setEnabled(false);
        txtDonorZip.setEnabled(false);
        txtDonorUsername.setEnabled(false);
        txtDonorPassword.setEnabled(false);
        btnProfileSubmit.setVisible(false);
        btnDonorCancel.setVisible(false);
        lblDonorCPassword.setVisible(false);
        txtDonorCPassword.setVisible(false);
        lblDonorName1.setText("");
        lblDonorphno1.setText("");
        lblDonoremail1.setText("");
        lblDonoradd1.setText("");
        lblDonorcity1.setText("");
        lblDonorstate1.setText("");
        lblDonorzip1.setText("");
        lblUsername1.setText("");
        lblDonorpwd2.setText("");
        lblDonorpwd3.setText("");
    }
}
