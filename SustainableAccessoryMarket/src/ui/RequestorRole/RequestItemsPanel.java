/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.RequestorRole;

import Business.EcoSystem;
import Business.DropOff.DropOff;
import Business.AccessoryRequestorder.AccessoryRequestorder;
import Business.AccessoryRequestorder.AccessoryRequestorderDirectory;
import Business.AccessoryRequestor.AccessoryRequestor;
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
public class RequestItemsPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestItemsPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String reqUName;
    String requestorName;
    String requestorState;
    String selDelCity;
    Integer requestorId;
    AccessoryRequestorderDirectory rqorD;
    public RequestItemsPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.ecosystem =ecosystem;
        this.userAcc = userAcc;
        reqUName = userAcc.getUsername();
        requestorName  = userAcc.getEmployee().getName();
        requestorId = ecosystem.getReqCntID();
        System.out.println(requestorId +" reqsId");
        ecosystem.setReqCntID(requestorId);
        if(ecosystem.getReqorderDirectory()== null){
         ecosystem.setReqorderDirectory(new AccessoryRequestorderDirectory());
        }
        String requestorState = ecosystem.getReqDir().getreqState(reqUName);
         ArrayList<String> CityList = new ArrayList<String>();
        for (DropOff fcp : ecosystem.getACDOFDirectory().getFcpList()){
            if(fcp.getDropOffState().equals(requestorState)){
                CityList.add(fcp.getDropOffCity());
                selDelCity = fcp.getDropOffCity();
                break;
            }
        }         
        cbSelectCity.setModel(new DefaultComboBoxModel<String>(CityList.toArray(new String[0])));
        
//        String city=cbSelectCity.getSelectedItem().toString();
        ArrayList<String> ptList = new ArrayList<String>();
        for (DropOff fcp : ecosystem.getACDOFDirectory().getFcpList()){
            if(fcp.getDropOffCity().equals(selDelCity)){
                ptList.add(fcp.getDropOffName());
            }
        }
        cbNearPantry.setModel(new DefaultComboBoxModel<String>(ptList.toArray(new String[0])));
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

        lblReqFoodTitle = new javax.swing.JLabel();
        lblReqQuan = new javax.swing.JLabel();
        sdFoodQuan = new javax.swing.JSlider();
        lblReqFoodTitle1 = new javax.swing.JLabel();
        chkDelAdd = new javax.swing.JCheckBox();
        lblDeladd = new javax.swing.JLabel();
        txtDeliveryadd = new javax.swing.JTextField();
        lblDelcity = new javax.swing.JLabel();
        txtDelcity = new javax.swing.JTextField();
        lblDelstate = new javax.swing.JLabel();
        txtDelstate = new javax.swing.JTextField();
        lblDelzip = new javax.swing.JLabel();
        txtDelzip = new javax.swing.JTextField();
        lblSelectCity = new javax.swing.JLabel();
        cbSelectCity = new javax.swing.JComboBox<>();
        lblNearPantry = new javax.swing.JLabel();
        cbNearPantry = new javax.swing.JComboBox<>();
        btnReqSubmit = new javax.swing.JButton();
        lblMinQuan = new javax.swing.JLabel();
        lblMaxQuan = new javax.swing.JLabel();
        lblPersons = new javax.swing.JLabel();
        lblDelType = new javax.swing.JLabel();
        cbDelType = new javax.swing.JComboBox<>();
        LabelImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReqFoodTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblReqFoodTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblReqFoodTitle.setText("Request Food");
        add(lblReqFoodTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        lblReqQuan.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblReqQuan.setText("Request for");
        add(lblReqQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        sdFoodQuan.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        sdFoodQuan.setMajorTickSpacing(10);
        sdFoodQuan.setMinimum(10);
        sdFoodQuan.setPaintTicks(true);
        sdFoodQuan.setAutoscrolls(true);
        add(sdFoodQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 145, -1, -1));

        lblReqFoodTitle1.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblReqFoodTitle1.setForeground(new java.awt.Color(0, 153, 204));
        lblReqFoodTitle1.setText("Delivery Address");
        add(lblReqFoodTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, -1, -1));

        chkDelAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        chkDelAdd.setText("Same Address as in Profile");
        chkDelAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDelAddActionPerformed(evt);
            }
        });
        add(chkDelAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, -1, -1));

        lblDeladd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDeladd.setText("Address:");
        add(lblDeladd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, -1, -1));

        txtDeliveryadd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDeliveryadd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDeliveryadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeliveryaddFocusLost(evt);
            }
        });
        add(txtDeliveryadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 220, 137, -1));

        lblDelcity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDelcity.setText("City:");
        add(lblDelcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, -1, -1));

        txtDelcity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDelcity.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDelcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDelcityFocusLost(evt);
            }
        });
        add(txtDelcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 270, 137, -1));

        lblDelstate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDelstate.setText("State:");
        add(lblDelstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, -1, -1));

        txtDelstate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDelstate.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDelstate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDelstateFocusLost(evt);
            }
        });
        add(txtDelstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 320, 137, -1));

        lblDelzip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDelzip.setText("Zip:");
        add(lblDelzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 360, -1, -1));

        txtDelzip.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtDelzip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDelzip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDelzipFocusLost(evt);
            }
        });
        add(txtDelzip, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 360, 137, -1));

        lblSelectCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblSelectCity.setText("Select City:");
        add(lblSelectCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        cbSelectCity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbSelectCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSelectCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelectCityActionPerformed(evt);
            }
        });
        add(cbSelectCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 245, 130, -1));

        lblNearPantry.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblNearPantry.setText("Select Nearest Pantry:");
        add(lblNearPantry, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        cbNearPantry.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbNearPantry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNearPantry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNearPantryActionPerformed(evt);
            }
        });
        add(cbNearPantry, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 297, 130, -1));

        btnReqSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnReqSubmit.setText("Submit Request");
        btnReqSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqSubmitActionPerformed(evt);
            }
        });
        add(btnReqSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 430, -1, -1));

        lblMinQuan.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblMinQuan.setText("Min 10");
        add(lblMinQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        lblMaxQuan.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblMaxQuan.setText("Max 100");
        add(lblMaxQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 185, -1, -1));

        lblPersons.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblPersons.setText("persons");
        add(lblPersons, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        lblDelType.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDelType.setText("Select Delivery Type:");
        add(lblDelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 344, -1, -1));

        cbDelType.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbDelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery" }));
        cbDelType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDelTypeActionPerformed(evt);
            }
        });
        add(cbDelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 120, -1));
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1600, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void chkDelAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDelAddActionPerformed
        // TODO add your handling code here:
        if(chkDelAdd.isSelected()){
            for(AccessoryRequestor r: ecosystem.getReqDir().getReqAccList()){
                if(r.getReqUserName().equals(reqUName)){
                    txtDeliveryadd.setText(r.getReqAddres());
                    txtDelcity.setText(r.getReqCity());
                    txtDelstate.setText(r.getReqState());
                    txtDelzip.setText(r.getReqZipcode());
                }
            }
        }
        else{
            txtDeliveryadd.setText("");
            txtDelcity.setText("");
            txtDelstate.setText("");
            txtDelzip.setText("");
        }
    }//GEN-LAST:event_chkDelAddActionPerformed

    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1650, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(RequestItemsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void txtDeliveryaddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeliveryaddFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDeliveryaddFocusLost

    private void txtDelcityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDelcityFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDelcityFocusLost

    private void txtDelstateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDelstateFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDelstateFocusLost

    private void txtDelzipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDelzipFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDelzipFocusLost

    private void cbSelectCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelectCityActionPerformed
        // TODO add your handling code here:
//        String city=cbSelectCity.getSelectedItem().toString();
//        ArrayList<String> ptList = new ArrayList<String>();
//        for (DropOff fcp : ecosystem.getFCPDirectory().getFcpList()){
//            if(fcp.getFcpCity().equals(city)){
//                ptList.add(fcp.getFcpName());
//            }
//        }
//        cbNearPantry.setModel(new DefaultComboBoxModel<String>(ptList.toArray(new String[0])));
    }//GEN-LAST:event_cbSelectCityActionPerformed

    private void btnReqSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            AccessoryRequestorder rq= new AccessoryRequestorder();
            rq.setReqOrderId(String.valueOf(requestorId));
            rq.setReqName(requestorName);
            rq.setReqOrderQuant(String.valueOf(sdFoodQuan.getValue()));
            rq.setReqOrderType(cbDelType.getSelectedItem().toString());
            rq.setReqOrderStatus("Requested");
            rq.setReqPantryName(cbNearPantry.getSelectedItem().toString());
            UserAccount ua=new UserAccount();
            ua.setUsername(userAcc.getUsername());
            ua.setPassword(userAcc.getPassword());
            rq.setReqRequestorAcc(ua);
            rq.setReqAdd(txtDeliveryadd.getText());
            rq.setReqCity(txtDelcity.getText());
            
            rq.setReqZip(txtDelzip.getText());
            rqorD = ecosystem.getReqorderDirectory();
            rqorD.addNewReqorder(rq);
            ecosystem.setReqorderDirectory(rqorD);
            Integer reqCnt = ecosystem.getRequestCnt();
            ecosystem.setRequestCnt(reqCnt + 1);
            JOptionPane.showMessageDialog(this, "Your request has been placed. We love to serve you soon!");
            clearfields();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnReqSubmitActionPerformed

    private void cbDelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDelTypeActionPerformed
        // TODO add your handling code here:
        if(cbDelType.getSelectedIndex()==0){
            lblReqFoodTitle1.setVisible(true);
            chkDelAdd.setVisible(true);
            lblDeladd.setVisible(true);
            txtDeliveryadd.setVisible(true);
            lblDelcity.setVisible(true);
            txtDelcity.setVisible(true);
            lblDelstate.setVisible(true);
            txtDelstate.setVisible(true);
            lblDelzip.setVisible(true);
            txtDelzip.setVisible(true);
        }
        else{
            lblReqFoodTitle1.setVisible(false);
            chkDelAdd.setVisible(false);
            lblDeladd.setVisible(false);
            txtDeliveryadd.setVisible(false);
            lblDelcity.setVisible(false);
            txtDelcity.setVisible(false);
            lblDelstate.setVisible(false);
            txtDelstate.setVisible(false);
            lblDelzip.setVisible(false);
            txtDelzip.setVisible(false);
        }
    }//GEN-LAST:event_cbDelTypeActionPerformed

    private void cbNearPantryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNearPantryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNearPantryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnReqSubmit;
    private javax.swing.JComboBox<String> cbDelType;
    private javax.swing.JComboBox<String> cbNearPantry;
    private javax.swing.JComboBox<String> cbSelectCity;
    private javax.swing.JCheckBox chkDelAdd;
    private javax.swing.JLabel lblDelType;
    private javax.swing.JLabel lblDeladd;
    private javax.swing.JLabel lblDelcity;
    private javax.swing.JLabel lblDelstate;
    private javax.swing.JLabel lblDelzip;
    private javax.swing.JLabel lblMaxQuan;
    private javax.swing.JLabel lblMinQuan;
    private javax.swing.JLabel lblNearPantry;
    private javax.swing.JLabel lblPersons;
    private javax.swing.JLabel lblReqFoodTitle;
    private javax.swing.JLabel lblReqFoodTitle1;
    private javax.swing.JLabel lblReqQuan;
    private javax.swing.JLabel lblSelectCity;
    private javax.swing.JSlider sdFoodQuan;
    private javax.swing.JTextField txtDelcity;
    private javax.swing.JTextField txtDeliveryadd;
    private javax.swing.JTextField txtDelstate;
    private javax.swing.JTextField txtDelzip;
    // End of variables declaration//GEN-END:variables

    private boolean nullCheck() {
        return !(txtDeliveryadd.getText().length() != 0 && txtDelcity.getText().length() != 0
                && txtDelzip.getText().length() != 0);
    }

    private void clearfields() {
        txtDeliveryadd.setText("");
        txtDelcity.setText("");
        txtDelstate.setText("");
        txtDelzip.setText("");
        cbSelectCity.setSelectedIndex(0);
        cbNearPantry.setSelectedIndex(0);
        sdFoodQuan.setExtent(0);
        chkDelAdd.setSelected(false);
        cbSelectCity.setSelectedIndex(0);
        cbNearPantry.setSelectedIndex(0);
        cbDelType.setSelectedIndex(0);
    }
}
