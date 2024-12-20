/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DonorRole;

import Business.AccessoryDonation.AccessoryDonation;
import Business.AccessoryDonation.AccessoryDonationDirectory;
import Business.AccessoryDonor.AccessoryDonor;
import Business.EcoSystem;
import Business.DistributionHub.DistributionHub;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author reetikabhanushali 
 */
public class DonateNowPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonateNowPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String donUName;
    String donName;
    String donState;
    Integer donId;
    AccessoryDonationDirectory donatD;

    public DonateNowPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        donId = ecosystem.getDonationCntId();
        System.out.println(donId + " a123123");
        ecosystem.setDonationCntId(donId);
        donUName = userAcc.getUsername();
        donName = userAcc.getEmployee().getName();
        if (ecosystem.getDonatDirectory() == null) {
            ecosystem.setDonatDirectory(new AccessoryDonationDirectory());
        }
        String donState = ecosystem.getDonDir().getdonState(donUName);
        ArrayList<String> CityList = new ArrayList<String>();
        for (DistributionHub fcw : ecosystem.getACDDirectory().getFadList()) {
            if (fcw.getDistributionHubState().equals(donState)) {
                CityList.add(fcw.getDistributionHubCity());
            }
        }        
        cbDonateCity.setModel(new DefaultComboBoxModel<String>(CityList.toArray(new String[0])));
        
        populateDistributionHubComboBox();
        setBG();
        // setLogo();
        lblDonateCity2.setVisible(false);
        cbDonateCity.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDonationProfileTitle = new javax.swing.JLabel();
        lblDonateFoodItem = new javax.swing.JLabel();
        lblDonateFoodQuantity = new javax.swing.JLabel();
        txtDonateItem = new javax.swing.JTextField();
        sdDonateQuantity = new javax.swing.JSlider();
        lblDonatePickupAddress = new javax.swing.JLabel();
        lblDonateAddress = new javax.swing.JLabel();
        txtDonateAddress = new javax.swing.JTextField();
        lblDonateCity = new javax.swing.JLabel();
        txtDonateCity = new javax.swing.JTextField();
        lblDonateState = new javax.swing.JLabel();
        txtDonateState = new javax.swing.JTextField();
        lblDonateZip = new javax.swing.JLabel();
        txtDonateZip = new javax.swing.JTextField();
        lblDonateCity2 = new javax.swing.JLabel();
        cbDonateCity = new javax.swing.JComboBox<>();
        lblDonateDH = new javax.swing.JLabel();
        cbDH = new javax.swing.JComboBox<>();
        btnDonateSubmit = new javax.swing.JButton();
        lblDonateMinQ = new javax.swing.JLabel();
        lblDonateMaxQ = new javax.swing.JLabel();
        lblDonatePeople = new javax.swing.JLabel();
        Imagelogo = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDonationProfileTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblDonationProfileTitle.setForeground(new java.awt.Color(102, 102, 255));
        lblDonationProfileTitle.setText("Donate Accessory ");
        add(lblDonationProfileTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        lblDonateFoodItem.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateFoodItem.setText("Accessory Item:");
        add(lblDonateFoodItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        lblDonateFoodQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateFoodQuantity.setText("Quantity:");
        add(lblDonateFoodQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        txtDonateItem.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonateItem.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonateItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonateItemFocusLost(evt);
            }
        });
        add(txtDonateItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 147, 137, -1));

        sdDonateQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        sdDonateQuantity.setMajorTickSpacing(10);
        sdDonateQuantity.setMinimum(10);
        sdDonateQuantity.setPaintTicks(true);
        sdDonateQuantity.setAutoscrolls(true);
        add(sdDonateQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 190, -1, -1));

        lblDonatePickupAddress.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblDonatePickupAddress.setForeground(new java.awt.Color(102, 102, 255));
        lblDonatePickupAddress.setText("Pickup Address");
        add(lblDonatePickupAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        lblDonateAddress.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateAddress.setText("Address:");
        add(lblDonateAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        txtDonateAddress.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonateAddress.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonateAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonateAddressFocusLost(evt);
            }
        });
        add(txtDonateAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 137, -1));

        lblDonateCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateCity.setText("City:");
        add(lblDonateCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        txtDonateCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonateCity.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonateCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonateCityFocusLost(evt);
            }
        });
        add(txtDonateCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 137, -1));

        lblDonateState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateState.setText("State:");
        add(lblDonateState, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        txtDonateState.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonateState.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonateState.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonateStateFocusLost(evt);
            }
        });
        add(txtDonateState, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 137, -1));

        lblDonateZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateZip.setText("Zip:");
        add(lblDonateZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        txtDonateZip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDonateZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDonateZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonateZipFocusLost(evt);
            }
        });
        add(txtDonateZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 137, -1));

        lblDonateCity2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateCity2.setText("City:");
        add(lblDonateCity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        cbDonateCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbDonateCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDonateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDonateCityActionPerformed(evt);
            }
        });
        add(cbDonateCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 150, -1));

        lblDonateDH.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateDH.setText("Nearest DistributionHub:");
        add(lblDonateDH, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        cbDH.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbDH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --" }));
        cbDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDHActionPerformed(evt);
            }
        });
        add(cbDH, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 190, -1));

        btnDonateSubmit.setBackground(new java.awt.Color(204, 204, 255));
        btnDonateSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnDonateSubmit.setText("Donate");
        btnDonateSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateSubmitActionPerformed(evt);
            }
        });
        add(btnDonateSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        lblDonateMinQ.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateMinQ.setText("Min 10");
        add(lblDonateMinQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        lblDonateMaxQ.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonateMaxQ.setText("Max 100");
        add(lblDonateMaxQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 230, -1, -1));

        lblDonatePeople.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonatePeople.setText("People");
        add(lblDonatePeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        Imagelogo.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(Imagelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 18, 102, 104));
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 850));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            lblImage.setMinimumSize(new Dimension(1500, 1000));
            lblImage.setPreferredSize(new Dimension(1500, 1000));
            lblImage.setMaximumSize(new Dimension(1500, 1000));
            
            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));
            
            Image newimg = img.getScaledInstance(2500, 1000, java.awt.Image.SCALE_SMOOTH);
            lblImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setLogo() {
        try {
            Imagelogo.setMinimumSize(new Dimension(100, 100));
            Imagelogo.setPreferredSize(new Dimension(100, 100));
            Imagelogo.setMaximumSize(new Dimension(100, 100));
            
            Image img = ImageIO.read(getClass().getResource("/Images/cmnlogo.jpeg"));
            
            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            Imagelogo.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtDonateItemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonateItemFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDonateItemFocusLost

    private void txtDonateAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonateAddressFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDonateAddressFocusLost

    private void txtDonateCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonateCityFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDonateCityFocusLost

    private void txtDonateStateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonateStateFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDonateStateFocusLost

    private void txtDonateZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonateZipFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDonateZipFocusLost

    private void btnDonateSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateSubmitActionPerformed
        // TODO add your handling code here:
            if (!nullCheck()) {
            AccessoryDonation dt = new AccessoryDonation();
            dt.setDonatId(String.valueOf(donId));
            dt.setDonatDname(donName);
            dt.setDonatItem(txtDonateItem.getText());
            dt.setDonatQuant(String.valueOf(sdDonateQuantity.getValue()));
            dt.setDonatPickuptype("Pick up");
            dt.setDonatStatus("Requested");
            dt.setDonatWHname(cbDH.getSelectedItem().toString());
            System.out.println("Donation WH Name: " + cbDH.getSelectedItem().toString());
            dt.setDonatAdd(txtDonateAddress.getText());
            dt.setDonatCity(txtDonateCity.getText());
            dt.setDonatZip(txtDonateZip.getText());
            dt.setDonatDonorAcc(userAcc);

            donatD = ecosystem.getDonatDirectory();
            donatD.addNewDonation(dt);

            // Debug: Check donation details
            System.out.println("New Donation Added: " + dt);

            ecosystem.setDonatDirectory(donatD);
            ecosystem.setDonationCnt(ecosystem.getDonationCnt() + 1);

            JOptionPane.showMessageDialog(this, "Thank you for your Donation! \n Your request has been placed.");
            clearfields();
        } else {
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnDonateSubmitActionPerformed

    private void cbDonateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDonateCityActionPerformed
        // TODO add your handling code here:
        String city = cbDonateCity.getSelectedItem().toString();
        ArrayList<String> whList = new ArrayList<String>();
        for (DistributionHub fcw : ecosystem.getACDDirectory().getFadList()) {
            if (fcw.getDistributionHubCity().equals(city)) {
                whList.add(fcw.getDistributionHubName());
            }
        }        
        cbDH.setModel(new DefaultComboBoxModel<String>(whList.toArray(new String[0])));
    }//GEN-LAST:event_cbDonateCityActionPerformed

    private void cbDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagelogo;
    private javax.swing.JButton btnDonateSubmit;
    private javax.swing.JComboBox<String> cbDH;
    private javax.swing.JComboBox<String> cbDonateCity;
    private javax.swing.JLabel lblDonateAddress;
    private javax.swing.JLabel lblDonateCity;
    private javax.swing.JLabel lblDonateCity2;
    private javax.swing.JLabel lblDonateDH;
    private javax.swing.JLabel lblDonateFoodItem;
    private javax.swing.JLabel lblDonateFoodQuantity;
    private javax.swing.JLabel lblDonateMaxQ;
    private javax.swing.JLabel lblDonateMinQ;
    private javax.swing.JLabel lblDonatePeople;
    private javax.swing.JLabel lblDonatePickupAddress;
    private javax.swing.JLabel lblDonateState;
    private javax.swing.JLabel lblDonateZip;
    private javax.swing.JLabel lblDonationProfileTitle;
    private javax.swing.JLabel lblImage;
    private javax.swing.JSlider sdDonateQuantity;
    private javax.swing.JTextField txtDonateAddress;
    private javax.swing.JTextField txtDonateCity;
    private javax.swing.JTextField txtDonateItem;
    private javax.swing.JTextField txtDonateState;
    private javax.swing.JTextField txtDonateZip;
    // End of variables declaration//GEN-END:variables

    private boolean nullCheck() {
        if (txtDonateItem.getText().length() != 0 && txtDonateAddress.getText().length() != 0 && txtDonateCity.getText().length() != 0
                && txtDonateState.getText().length() != 0 && txtDonateZip.getText().length() != 0) {
            return false;
        } else {
            return true;
        }
    }
    
    private void clearfields() {
        txtDonateItem.setText("");
        txtDonateAddress.setText("");
        txtDonateCity.setText("");
        txtDonateState.setText("");
        txtDonateZip.setText("");
        cbDonateCity.setSelectedIndex(0);
        cbDH.setSelectedIndex(0);
        sdDonateQuantity.setExtent(0);
        cbDonateCity.setSelectedIndex(0);
        cbDH.setSelectedIndex(0);
    }
    
    private void populateDistributionHubComboBox() {
        // Clear existing items
        cbDH.removeAllItems();
        cbDH.addItem("-- Select --"); // Default placeholder option

        // Fetch distribution hubs from EcoSystem
        ArrayList<DistributionHub> distributionHubs = ecosystem.getACDDirectory().getFadList();

        // Add each hub name to the combo box
        for (DistributionHub hub : distributionHubs) {
            cbDH.addItem(hub.getDistributionHubName());
        }
    }
}
