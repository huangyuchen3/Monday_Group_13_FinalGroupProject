/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Worker.Worker;
import Business.NonGovtOrg.NonGovtOrg;
import Business.NonGovtOrg.NonGovtOrgDirectory;
import Business.Role.NgoRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.Color;
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
public class AddNGOPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNGOPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    NonGovtOrgDirectory ngod;
    UserAccountDirectory uad;

    public AddNGOPanel(JPanel userProcessContainer, EcoSystem ecosystem) throws IOException {
        initComponents();

//        imageLbl.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
//        imageLbl.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
//        imageLbl.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
//
//        Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));
//
//        Image newimg = img.getScaledInstance(userProcessContainer.getWidth(), userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
//        imageLbl.setIcon(new ImageIcon(newimg));
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if (ecosystem.getNgoDir() == null) {
            ecosystem.setNgoDir(new NonGovtOrgDirectory());
        }

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

        lblAddNonGovtOrgTitle = new javax.swing.JLabel();
        lblNonGovtOrgname = new javax.swing.JLabel();
        txtNonGovtOrgname = new javax.swing.JTextField();
        lblNonGovtOrgPhno = new javax.swing.JLabel();
        txtNonGovtOrgPhone = new javax.swing.JTextField();
        lblNonGovtOrgAdd = new javax.swing.JLabel();
        txtNonGovtOrgAdd = new javax.swing.JTextField();
        lblNonGovtOrgCity = new javax.swing.JLabel();
        txtNonGovtOrgCity = new javax.swing.JTextField();
        lblNonGovtOrgState = new javax.swing.JLabel();
        txtNonGovtOrgState = new javax.swing.JTextField();
        lblNonGovtOrgZip = new javax.swing.JLabel();
        txtNonGovtOrgZip = new javax.swing.JTextField();
        lblNonGovtOrgAgent = new javax.swing.JLabel();
        txtNonGovtOrgAgent = new javax.swing.JTextField();
        lblNonGovtOrgAgentuname = new javax.swing.JLabel();
        txtNonGovtOrgAgentuname = new javax.swing.JTextField();
        lblNonGovtOrgpwd = new javax.swing.JLabel();
        txtNonGovtOrgpwd = new javax.swing.JTextField();
        lblNonGovtOrgcopwd1 = new javax.swing.JLabel();
        txtNonGovtOrgcopwd1 = new javax.swing.JTextField();
        btnNonGovtOrgSubmit = new javax.swing.JButton();
        lblNonGovtOrgid = new javax.swing.JLabel();
        txtNonGovtOrgid = new javax.swing.JTextField();
        lblNonGovtOrgid2 = new javax.swing.JLabel();
        lblNonGovtOrgname1 = new javax.swing.JLabel();
        lblNonGovtOrgPhone1 = new javax.swing.JLabel();
        lblNonGovtOrgZip1 = new javax.swing.JLabel();
        lblNonGovtOrgAdmin1 = new javax.swing.JLabel();
        lblNonGovtOrgpwd2 = new javax.swing.JLabel();
        btnNonGovtOrgCancel = new javax.swing.JButton();
        LabelImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddNonGovtOrgTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblAddNonGovtOrgTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblAddNonGovtOrgTitle.setText("Add NGO");
        add(lblAddNonGovtOrgTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        lblNonGovtOrgname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgname.setText("NGO Name:");
        add(lblNonGovtOrgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        txtNonGovtOrgname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgnameFocusLost(evt);
            }
        });
        add(txtNonGovtOrgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 137, -1));

        lblNonGovtOrgPhno.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgPhno.setText("NGO Phone Number:");
        add(lblNonGovtOrgPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        txtNonGovtOrgPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgPhoneFocusLost(evt);
            }
        });
        add(txtNonGovtOrgPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 137, -1));

        lblNonGovtOrgAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgAdd.setText("NGO Address:");
        add(lblNonGovtOrgAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        txtNonGovtOrgAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNonGovtOrgAddActionPerformed(evt);
            }
        });
        add(txtNonGovtOrgAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 137, -1));

        lblNonGovtOrgCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgCity.setText("City:");
        add(lblNonGovtOrgCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        txtNonGovtOrgCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgCity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtNonGovtOrgCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 137, -1));

        lblNonGovtOrgState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgState.setText("State:");
        add(lblNonGovtOrgState, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        txtNonGovtOrgState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtNonGovtOrgState, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 137, -1));

        lblNonGovtOrgZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgZip.setText("Zip:");
        add(lblNonGovtOrgZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        txtNonGovtOrgZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgZipFocusLost(evt);
            }
        });
        add(txtNonGovtOrgZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 137, -1));

        lblNonGovtOrgAgent.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgAgent.setText("NGO Agent Name:");
        add(lblNonGovtOrgAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, 20));

        txtNonGovtOrgAgent.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgAgent.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgAgent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgAgentFocusLost(evt);
            }
        });
        add(txtNonGovtOrgAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 137, -1));

        lblNonGovtOrgAgentuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgAgentuname.setText("NGO Agent Username:");
        add(lblNonGovtOrgAgentuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        txtNonGovtOrgAgentuname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgAgentuname.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtNonGovtOrgAgentuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 137, -1));

        lblNonGovtOrgpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgpwd.setText("Password:");
        add(lblNonGovtOrgpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        txtNonGovtOrgpwd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgpwd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNonGovtOrgpwdActionPerformed(evt);
            }
        });
        add(txtNonGovtOrgpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 137, -1));

        lblNonGovtOrgcopwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgcopwd1.setText("Confirm Password:");
        add(lblNonGovtOrgcopwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        txtNonGovtOrgcopwd1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgcopwd1.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgcopwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgcopwd1FocusLost(evt);
            }
        });
        add(txtNonGovtOrgcopwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 137, -1));

        btnNonGovtOrgSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNonGovtOrgSubmit.setText("Submit");
        btnNonGovtOrgSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonGovtOrgSubmitActionPerformed(evt);
            }
        });
        add(btnNonGovtOrgSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        lblNonGovtOrgid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNonGovtOrgid.setText("NGO ID:");
        add(lblNonGovtOrgid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        txtNonGovtOrgid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNonGovtOrgid.setPreferredSize(new java.awt.Dimension(150, 25));
        txtNonGovtOrgid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNonGovtOrgidFocusLost(evt);
            }
        });
        txtNonGovtOrgid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNonGovtOrgidKeyReleased(evt);
            }
        });
        add(txtNonGovtOrgid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 134, -1));

        lblNonGovtOrgid2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovtOrgid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        lblNonGovtOrgname1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovtOrgname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 0, 0));

        lblNonGovtOrgPhone1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovtOrgPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 0, 0));

        lblNonGovtOrgZip1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovtOrgZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 0));

        lblNonGovtOrgAdmin1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovtOrgAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 0, 0));

        lblNonGovtOrgpwd2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblNonGovtOrgpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 0, 0));

        btnNonGovtOrgCancel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNonGovtOrgCancel.setText("Cancel");
        btnNonGovtOrgCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNonGovtOrgCancelActionPerformed(evt);
            }
        });
        add(btnNonGovtOrgCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1430, 710));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void txtNonGovtOrgnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgnameFocusLost
        // TODO add your handling code here:
        if (!(txtNonGovtOrgname.getText().matches("^[a-zA-Z]*$"))) {
            lblNonGovtOrgname1.setText("Invalid input. Please enter only alphabets");
        } else {
            lblNonGovtOrgname1.setText("");
        }
    }//GEN-LAST:event_txtNonGovtOrgnameFocusLost

    private void txtNonGovtOrgPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgPhoneFocusLost
        // TODO add your handling code here:
        if (!(txtNonGovtOrgPhone.getText().matches("^[0-9]*$")) || !(txtNonGovtOrgPhone.getText().length() == 10)) {
            lblNonGovtOrgPhone1.setText("Please enter a valid phone number");
            //  lblNGOPhno1.setForeground(Color.red);
        } else {
            lblNonGovtOrgPhone1.setText("");

        }
    }//GEN-LAST:event_txtNonGovtOrgPhoneFocusLost

    private void txtNonGovtOrgZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgZipFocusLost
        // TODO add your handling code here:
        if ((txtNonGovtOrgZip.getText().matches("^[a-zA-Z]*$"))) {
            lblNonGovtOrgZip1.setText("Invalid input. Please enter only numbers");

        } else {
            lblNonGovtOrgZip1.setText("");
        }
    }//GEN-LAST:event_txtNonGovtOrgZipFocusLost

    private void txtNonGovtOrgAgentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgAgentFocusLost
        // TODO add your handling code here:
        if (!(txtNonGovtOrgAgent.getText().matches("^[a-zA-Z]*$"))) {
            lblNonGovtOrgAdmin1.setText("Invalid input. Please enter only alphabets.");
        } else {
            lblNonGovtOrgAdmin1.setText("");
        }
    }//GEN-LAST:event_txtNonGovtOrgAgentFocusLost

    private void txtNonGovtOrgcopwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgcopwd1FocusLost
        // TODO add your handling code here:
//        if(!(txtNGOpwd.getText().equals(txtNGOcopwd1.getText()))){
//            lblNGOpwd2.setText("Password Mismatch. Please verify the password entered.");
//        }
//        else{
//            lblNGOpwd2.setText("");
//        }
    }//GEN-LAST:event_txtNonGovtOrgcopwd1FocusLost

    public boolean isValid(String test, String regex) {
//        String regex = "^[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);

        if (test == null) {
            return false;
        }

        Matcher m = p.matcher(test);

        return m.matches();
    }

    private void btnNonGovtOrgSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonGovtOrgSubmitActionPerformed
        // TODO add your handling code here:

        if (!nullCheck()) {
            if (chkpwd()) {

                String ngoid = txtNonGovtOrgid.getText();
                String ngoName = txtNonGovtOrgname.getText();
                String phone = txtNonGovtOrgPhone.getText();

                String ngoCity = txtNonGovtOrgCity.getText();
                String ngoState = txtNonGovtOrgState.getText();
                String ngoZip = txtNonGovtOrgZip.getText();
                String ngoAgent = txtNonGovtOrgAgent.getText();
                String ngoUser = txtNonGovtOrgAgentuname.getText();
                String ngoPswd = txtNonGovtOrgpwd.getText();
                if (!isValid(ngoid, "^[0-9]+")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid ID");
                    return;
                }
                if (!isValid(ngoName, "^[A-Za-z]{3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid name");
                    return;
                }
                if (!isValid(phone, "[+]?[0-9]{10,13}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid phone number");
                    return;
                }
                if (!isValid(ngoCity, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid city");
                    return;
                }
                if (!isValid(ngoState, "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+){2,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid state");
                    return;
                }
                if (!isValid(ngoZip, "^[0-9]{5}(?:-[0-9]{4})?$")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid zip");
                    return;
                }
                if (!isValid(ngoAgent, "^[A-Za-z]{3,}")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid name");
                    return;
                }
                if (!isValid(ngoUser, "^[a-zA-Z0-9._-]{6,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid username of atleast 6 characters");
                    return;
                }
                if (!isValid(ngoPswd, "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid password of atleast 8 characters in length. It must contain a number, a specicial character, a lowercase and an uppercase character.");
                    return;
                }

                UserAccountDirectory uaList = ecosystem.getUserAccountDirectory();
                Worker employee = new Worker();
                employee.setName(txtNonGovtOrgAgent.getText());
                String role = "NGOAgent";
                NonGovtOrg ngo = new NonGovtOrg();
                ngo.setNgoId("ngo" + txtNonGovtOrgid.getText());
                ngo.setNgoName(txtNonGovtOrgname.getText());
                ngo.setNgoPhno(txtNonGovtOrgPhone.getText());
                ngo.setNgoAddress(txtNonGovtOrgAdd.getText());
                ngo.setNgoCity(txtNonGovtOrgCity.getText());
                ngo.setNgoState(txtNonGovtOrgState.getText());
                ngo.setNgoZipcode(txtNonGovtOrgZip.getText());
                ngo.setNgoAgent(txtNonGovtOrgAgent.getText());
                UserAccount nogAccount = new UserAccount();
                nogAccount.setUsername(txtNonGovtOrgAgentuname.getText());
                nogAccount.setPassword(txtNonGovtOrgpwd.getText());
                // uaList.createUserAccount(txtFCAuname.getText(), txtFCApwd.getText(), employee, new FCAdminRole());
                //                ua = usersList.getUserAccount(txtUserName.getText());

                nogAccount.setRole(new NgoRole());
                nogAccount.setEmployee(employee);
                uad = ecosystem.getUserAccountDirectory();
                uad.createUserAccount(txtNonGovtOrgAgentuname.getText(), txtNonGovtOrgpwd.getText(), employee, new NgoRole());
                ecosystem.setUserAccountDirectory(uad);
                ngo.setNgoAccount(nogAccount);
                ngod = ecosystem.getNgoDir();
                ngod.addNewNGO(ngo);
                ecosystem.setNgoDir(ngod);
                Integer ngoCnt = ecosystem.getNgoCnt();
                ecosystem.setNgoCnt(ngoCnt + 1);
                JOptionPane.showMessageDialog(this, "NGO added successfully!");
                clearfields();
            } else {
                JOptionPane.showMessageDialog(this, "Password Mismatch. Please verify the password entered.");
                txtNonGovtOrgcopwd1.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnNonGovtOrgSubmitActionPerformed

    private void txtNonGovtOrgidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNonGovtOrgidFocusLost
        // TODO add your handling code here:
        if ((txtNonGovtOrgid.getText().matches("^[a-zA-Z]*$"))) {
            lblNonGovtOrgid2.setText("Invalid input. Please enter only numbers");
        } else {
            lblNonGovtOrgid2.setText("");
        }
    }//GEN-LAST:event_txtNonGovtOrgidFocusLost

    private void txtNonGovtOrgidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNonGovtOrgidKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNonGovtOrgidKeyReleased

    private void txtNonGovtOrgAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNonGovtOrgAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNonGovtOrgAddActionPerformed

    private void btnNonGovtOrgCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNonGovtOrgCancelActionPerformed
        // TODO add your handling code here:
        clearfields();
    }//GEN-LAST:event_btnNonGovtOrgCancelActionPerformed

    private void txtNonGovtOrgpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNonGovtOrgpwdActionPerformed
        if (!Business.Validations.ValidateInputs.isPasswordValid(txtNonGovtOrgpwd.getText())) {
            JOptionPane.showMessageDialog(this, "Please verify the password (min 8).");
        }
    }//GEN-LAST:event_txtNonGovtOrgpwdActionPerformed

    private boolean nullCheck() {
        if (txtNonGovtOrgid.getText().length() != 0 && txtNonGovtOrgname.getText().length() != 0
                && txtNonGovtOrgPhone.getText().length() != 0 && txtNonGovtOrgAdd.getText().length() != 0 && txtNonGovtOrgCity.getText().length() != 0
                && txtNonGovtOrgState.getText().length() != 0 && txtNonGovtOrgZip.getText().length() != 0 && txtNonGovtOrgAgent.getText().length() != 0
                && txtNonGovtOrgAgentuname.getText().length() != 0 && txtNonGovtOrgpwd.getText().length() != 0 && txtNonGovtOrgcopwd1.getText().length() != 0) {
            return false;
        } else {
            return true;
        }
    }

    private void clearfields() {
        txtNonGovtOrgname.setText("");
        txtNonGovtOrgPhone.setText("");
        txtNonGovtOrgAdd.setText("");
        txtNonGovtOrgCity.setText("");
        txtNonGovtOrgState.setText("");
        txtNonGovtOrgZip.setText("");
        txtNonGovtOrgAgent.setText("");
        txtNonGovtOrgAgentuname.setText("");
        txtNonGovtOrgpwd.setText("");
        txtNonGovtOrgcopwd1.setText("");
        txtNonGovtOrgid.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JButton btnNonGovtOrgCancel;
    private javax.swing.JButton btnNonGovtOrgSubmit;
    private javax.swing.JLabel lblAddNonGovtOrgTitle;
    private javax.swing.JLabel lblNonGovtOrgAdd;
    private javax.swing.JLabel lblNonGovtOrgAdmin1;
    private javax.swing.JLabel lblNonGovtOrgAgent;
    private javax.swing.JLabel lblNonGovtOrgAgentuname;
    private javax.swing.JLabel lblNonGovtOrgCity;
    private javax.swing.JLabel lblNonGovtOrgPhno;
    private javax.swing.JLabel lblNonGovtOrgPhone1;
    private javax.swing.JLabel lblNonGovtOrgState;
    private javax.swing.JLabel lblNonGovtOrgZip;
    private javax.swing.JLabel lblNonGovtOrgZip1;
    private javax.swing.JLabel lblNonGovtOrgcopwd1;
    private javax.swing.JLabel lblNonGovtOrgid;
    private javax.swing.JLabel lblNonGovtOrgid2;
    private javax.swing.JLabel lblNonGovtOrgname;
    private javax.swing.JLabel lblNonGovtOrgname1;
    private javax.swing.JLabel lblNonGovtOrgpwd;
    private javax.swing.JLabel lblNonGovtOrgpwd2;
    private javax.swing.JTextField txtNonGovtOrgAdd;
    private javax.swing.JTextField txtNonGovtOrgAgent;
    private javax.swing.JTextField txtNonGovtOrgAgentuname;
    private javax.swing.JTextField txtNonGovtOrgCity;
    private javax.swing.JTextField txtNonGovtOrgPhone;
    private javax.swing.JTextField txtNonGovtOrgState;
    private javax.swing.JTextField txtNonGovtOrgZip;
    private javax.swing.JTextField txtNonGovtOrgcopwd1;
    private javax.swing.JTextField txtNonGovtOrgid;
    private javax.swing.JTextField txtNonGovtOrgname;
    private javax.swing.JTextField txtNonGovtOrgpwd;
    // End of variables declaration//GEN-END:variables

    private boolean chkpwd() {
        if (txtNonGovtOrgpwd.getText().equals(txtNonGovtOrgcopwd1.getText())) {
            return true;
        } else {
            return false;
        }
    }
}
