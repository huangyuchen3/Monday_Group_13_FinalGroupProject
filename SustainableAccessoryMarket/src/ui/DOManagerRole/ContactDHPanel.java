/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DOManagerRole;

import Business.EcoSystem;
import Business.DropOff.DropOff;
import Business.DistributionHub.DistributionHub;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author reetikabhanushali 
 */
public class ContactDHPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContactDHPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String WHname;
    String FCPmgname;
    public ContactDHPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        lblRequestVol.setVisible(false);
        lblVolReq.setVisible(false);
        cbVolReq.setVisible(false);
        btnSubmitReq.setVisible(false);

        FCPmgname = userAcc.getEmployee().getName();
        for(DropOff fcp: ecosystem.getACDOFDirectory().getFcpList()){
            if(fcp.getDropOffManager().equals(FCPmgname)){
                 WHname = fcp.getDropOffHubName();
            }
        }
        setBG();
        populatefields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDHTitle = new javax.swing.JLabel();
        txtDHManager = new javax.swing.JTextField();
        lblDHName = new javax.swing.JLabel();
        txtDHName = new javax.swing.JTextField();
        lblDHPhone = new javax.swing.JLabel();
        txtDHPhone = new javax.swing.JTextField();
        lblDHAdd = new javax.swing.JLabel();
        txtDHAdd = new javax.swing.JTextField();
        lblDHCity = new javax.swing.JLabel();
        txtDHCity = new javax.swing.JTextField();
        lblDHState = new javax.swing.JLabel();
        txtDHState = new javax.swing.JTextField();
        lblDHZip = new javax.swing.JLabel();
        txtDHZip = new javax.swing.JTextField();
        lblDHManager = new javax.swing.JLabel();
        cbVolReq = new javax.swing.JComboBox<>();
        btnSubmitReq = new javax.swing.JButton();
        lblVolReq = new javax.swing.JLabel();
        lblRequestVol = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDHTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblDHTitle.setForeground(new java.awt.Color(102, 102, 255));
        lblDHTitle.setText("Contact Distribution Hub");
        add(lblDHTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtDHManager.setEditable(false);
        txtDHManager.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDHManager.setEnabled(false);
        txtDHManager.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDHManager.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDHManagerFocusLost(evt);
            }
        });
        add(txtDHManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 137, -1));

        lblDHName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDHName.setText("Distribution Hub Name :");
        add(lblDHName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtDHName.setEditable(false);
        txtDHName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDHName.setEnabled(false);
        txtDHName.setOpaque(true);
        txtDHName.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDHName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDHNameFocusLost(evt);
            }
        });
        add(txtDHName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 137, -1));

        lblDHPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDHPhone.setText("Phone Number :");
        add(lblDHPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        txtDHPhone.setEditable(false);
        txtDHPhone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDHPhone.setEnabled(false);
        txtDHPhone.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDHPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDHPhoneFocusLost(evt);
            }
        });
        add(txtDHPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 137, -1));

        lblDHAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDHAdd.setText("Address :");
        add(lblDHAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        txtDHAdd.setEditable(false);
        txtDHAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDHAdd.setEnabled(false);
        txtDHAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDHAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 137, -1));

        lblDHCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDHCity.setText("City :");
        add(lblDHCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        txtDHCity.setEditable(false);
        txtDHCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDHCity.setEnabled(false);
        txtDHCity.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDHCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDHCityActionPerformed(evt);
            }
        });
        add(txtDHCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 137, -1));

        lblDHState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDHState.setText("State :");
        add(lblDHState, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        txtDHState.setEditable(false);
        txtDHState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDHState.setEnabled(false);
        txtDHState.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtDHState, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 137, -1));

        lblDHZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDHZip.setText("Zip Code :");
        add(lblDHZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        txtDHZip.setEditable(false);
        txtDHZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDHZip.setEnabled(false);
        txtDHZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDHZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDHZipFocusLost(evt);
            }
        });
        add(txtDHZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 137, -1));

        lblDHManager.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDHManager.setText("Distribution Hub Manager:");
        add(lblDHManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        cbVolReq.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbVolReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "10", "20", "30", "40", "50" }));
        add(cbVolReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 132, -1));

        btnSubmitReq.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnSubmitReq.setText("Submit Request");
        btnSubmitReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitReqActionPerformed(evt);
            }
        });
        add(btnSubmitReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, -1, -1));

        lblVolReq.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblVolReq.setText("Number of Volunteers Required :");
        add(lblVolReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        lblRequestVol.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblRequestVol.setText("Request Volunteers");
        add(lblRequestVol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 700));
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

        }
    }
    private void txtDHManagerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDHManagerFocusLost
        // TODO add your handling code here:
//        if(!(txtWHFCAdmin.getText().matches("^[a-zA-Z]*$"))){
//            lblWHFCAdmin1.setText("Invalid input. Please enter only alphabets.");
//        }
//        else{
//            lblWHFCAdmin1.setText("");
//        }
    }//GEN-LAST:event_txtDHManagerFocusLost

    private void txtDHNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDHNameFocusLost
        // TODO add your handling code here:
//        if(!(txtWHname.getText().matches("^[a-zA-Z]*$"))){
//            lblWHname1.setText("Invalid input. Please enter only alphabets");
//        }
//        else{
//            lblWHname1.setText("");
//        }
    }//GEN-LAST:event_txtDHNameFocusLost

    private void txtDHPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDHPhoneFocusLost
        // TODO add your handling code here:
//        if(!(txtWHPhno.getText().matches("^[0-9]*$")) || !(txtWHPhno.getText().length()==10)) {
//            lblWHPhno1.setText("Please enter a valid phone number");
//        }
//        else{
//            lblWHPhno1.setText("");
//
//        }
    }//GEN-LAST:event_txtDHPhoneFocusLost

    private void txtDHZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDHZipFocusLost
        // TODO add your handling code here:
//        if((txtWHZip.getText().matches("^[a-zA-Z]*$"))){
//            lblWHZip1.setText("Invalid input. Please enter only numbers");
//        }
//        else{
//            lblWHZip1.setText("");
//        }
    }//GEN-LAST:event_txtDHZipFocusLost

    private void btnSubmitReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitReqActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Your request has been sent to Warehouse");
    }//GEN-LAST:event_btnSubmitReqActionPerformed

    private void txtDHCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDHCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDHCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnSubmitReq;
    private javax.swing.JComboBox<String> cbVolReq;
    private javax.swing.JLabel lblDHAdd;
    private javax.swing.JLabel lblDHCity;
    private javax.swing.JLabel lblDHManager;
    private javax.swing.JLabel lblDHName;
    private javax.swing.JLabel lblDHPhone;
    private javax.swing.JLabel lblDHState;
    private javax.swing.JLabel lblDHTitle;
    private javax.swing.JLabel lblDHZip;
    private javax.swing.JLabel lblRequestVol;
    private javax.swing.JLabel lblVolReq;
    private javax.swing.JTextField txtDHAdd;
    private javax.swing.JTextField txtDHCity;
    private javax.swing.JTextField txtDHManager;
    private javax.swing.JTextField txtDHName;
    private javax.swing.JTextField txtDHPhone;
    private javax.swing.JTextField txtDHState;
    private javax.swing.JTextField txtDHZip;
    // End of variables declaration//GEN-END:variables

    private void populatefields() {
        for(DistributionHub fcw : ecosystem.getACDDirectory().getFadList()){
            if(fcw.getDistributionHubName().equals(WHname)){
                txtDHName.setText(fcw.getDistributionHubName());
                txtDHPhone.setText(fcw.getDistributionHubPhone());
                txtDHAdd.setText(fcw.getDistributionHubAddress());
                txtDHCity.setText(fcw.getDistributionHubCity());
                txtDHState.setText(fcw.getDistributionHubState());
                txtDHZip.setText(fcw.getDistributionHubZipcode());
                txtDHManager.setText(fcw.getDistributionHubAdmin());
            }
        }
    }

}
