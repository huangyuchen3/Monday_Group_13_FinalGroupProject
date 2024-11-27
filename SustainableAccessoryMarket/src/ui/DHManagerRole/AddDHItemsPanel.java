/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DHManagerRole;

import Business.EcoSystem;
import Business.DropOff.DropOff;
import Business.DropOff.DropOffItems;
import Business.DropOff.DropOffItemsDirectory;
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
import ui.DonorRole.DonorProfilePanel;

/**
 *
 *@author ankitapatil
 */
public class AddDHItemsPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDHItemsPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    DropOffItemsDirectory fcpid;
    String WHname;
    public AddDHItemsPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        if(ecosystem.getACDOIDirectory()== null){
         ecosystem.setACDOIDirectory(new DropOffItemsDirectory());
        }
        String FCAname=userAcc.getEmployee().getName();
        System.out.println(FCAname);
        WHname= ecosystem.getACDDirectory().getDHname(FCAname);
        System.out.println(WHname);
        lblWHname.setText(WHname);
        ArrayList<String> PantryList = new ArrayList<String>();
        for (DropOff fcp : ecosystem.getACDOFDirectory().getFcpList()){
            if(fcp.getDropOffName().equals(WHname)){
                PantryList.add(fcp.getDropOffName());
            }
            
        }
        cbPantryName.setModel(new DefaultComboBoxModel<String>(PantryList.toArray(new String[0])));
        txtPantryManager.setEnabled(false);
        if(cbPantryName.getSelectedItem() == null || cbPantryName.getItemCount() == 0){
        txtPantryManager.setText("");
        }else{ txtPantryManager.setText(getMngrName(cbPantryName.getSelectedItem().toString())); }
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

        lblAddFCPantryTitle = new javax.swing.JLabel();
        lblWarehousename = new javax.swing.JLabel();
        txtPantryManager = new javax.swing.JTextField();
        lblPantryManager = new javax.swing.JLabel();
        txtFooditem = new javax.swing.JTextField();
        lblFooditem = new javax.swing.JLabel();
        txtFoodQuantity = new javax.swing.JTextField();
        lblWHname = new javax.swing.JLabel();
        lblPantryName = new javax.swing.JLabel();
        cbPantryName = new javax.swing.JComboBox<>();
        btnPantrySubmit = new javax.swing.JButton();
        lblFooditemID = new javax.swing.JLabel();
        txtFooditemId = new javax.swing.JTextField();
        btnPantryclear = new javax.swing.JButton();
        LabelImage = new javax.swing.JLabel();
        lblFoodQuantity = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddFCPantryTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblAddFCPantryTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblAddFCPantryTitle.setText("Add Drop Off Items");
        add(lblAddFCPantryTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 19, -1, -1));

        lblWarehousename.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblWarehousename.setText("Distribution Hub Name:");
        add(lblWarehousename, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        txtPantryManager.setEditable(false);
        txtPantryManager.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtPantryManager.setPreferredSize(new java.awt.Dimension(150, 25));
        txtPantryManager.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPantryManagerFocusLost(evt);
            }
        });
        txtPantryManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantryManagerActionPerformed(evt);
            }
        });
        add(txtPantryManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 178, 137, -1));

        lblPantryManager.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblPantryManager.setText("Distribution Hub Manager:");
        add(lblPantryManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        txtFooditem.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFooditem.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFooditem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFooditemFocusLost(evt);
            }
        });
        add(txtFooditem, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 264, 137, -1));

        lblFooditem.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFooditem.setText("Accessory Item:");
        add(lblFooditem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        txtFoodQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFoodQuantity.setPreferredSize(new java.awt.Dimension(150, 25));
        add(txtFoodQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 307, 137, -1));

        lblWHname.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(lblWHname, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 98, 130, 20));

        lblPantryName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblPantryName.setText("Distribution Hub:");
        add(lblPantryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        cbPantryName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbPantryName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPantryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPantryNameActionPerformed(evt);
            }
        });
        add(cbPantryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 150, -1));

        btnPantrySubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnPantrySubmit.setText("Submit");
        btnPantrySubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantrySubmitActionPerformed(evt);
            }
        });
        add(btnPantrySubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 379, -1, -1));

        lblFooditemID.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFooditemID.setText("Item ID:");
        add(lblFooditemID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        txtFooditemId.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFooditemId.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFooditemId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFooditemIdFocusLost(evt);
            }
        });
        add(txtFooditemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 221, 137, -1));

        btnPantryclear.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnPantryclear.setText("Clear");
        btnPantryclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantryclearActionPerformed(evt);
            }
        });
        add(btnPantryclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        LabelImage.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 1270, 970));

        lblFoodQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFoodQuantity.setText("Item Quantity:");
        add(lblFoodQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 311, -1, -1));
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
    
    private void txtPantryManagerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPantryManagerFocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtPantryManagerFocusLost

    private void txtFooditemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFooditemFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtFooditemFocusLost

    private void btnPantrySubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantrySubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            DropOffItems fcpi=new DropOffItems();
            fcpi.setDropOffItemId(txtFooditemId.getText());
            fcpi.setDropOffHubName(WHname);
            fcpi.setDropOffName(String.valueOf(cbPantryName.getSelectedItem()));
            fcpi.setDropOffManager(txtPantryManager.getText());
            fcpi.setAccessoryItems(txtFooditem.getText());
            fcpi.setAccessoryQuantity(txtFoodQuantity.getText());           
            fcpid = ecosystem.getACDOIDirectory();
            fcpid.addFCPItems(fcpi);
            ecosystem.setACDOIDirectory(fcpid);
            JOptionPane.showMessageDialog(this, "Items added to Pantry successfully!");
            clearfields(); 
        }
        else{
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }

    private void clearfields() {
        txtFooditemId.setText("");
       if(cbPantryName.getSelectedItem().toString().isEmpty()){
        txtPantryManager.setText("");
        }else{ txtPantryManager.setText(getMngrName(cbPantryName.getSelectedItem().toString())); }
        txtFooditem.setText("");
        txtFoodQuantity.setText("");
    }//GEN-LAST:event_btnPantrySubmitActionPerformed

    private void cbPantryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPantryNameActionPerformed
        // TODO add your handling code here:
        String fpname=cbPantryName.getSelectedItem().toString();
        txtPantryManager.setText(getMngrName(fpname));
    }//GEN-LAST:event_cbPantryNameActionPerformed

    public String getMngrName(String Dropoff){
        String mngr="";
        for(DropOff fp: ecosystem.getACDOFDirectory().getFcpList()){
            if(fp.getDropOffName().equals(Dropoff)){
                mngr = fp.getDropOffManager(); 
            }
        }
        return mngr;
    }
    
    private void txtFooditemIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFooditemIdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFooditemIdFocusLost

    private void txtPantryManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantryManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantryManagerActionPerformed

    private void btnPantryclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantryclearActionPerformed
        // TODO add your handling code here:
        clearfields();
    }//GEN-LAST:event_btnPantryclearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnPantrySubmit;
    private javax.swing.JButton btnPantryclear;
    private javax.swing.JComboBox<String> cbPantryName;
    private javax.swing.JLabel lblAddFCPantryTitle;
    private javax.swing.JLabel lblFoodQuantity;
    private javax.swing.JLabel lblFooditem;
    private javax.swing.JLabel lblFooditemID;
    private javax.swing.JLabel lblPantryManager;
    private javax.swing.JLabel lblPantryName;
    private javax.swing.JLabel lblWHname;
    private javax.swing.JLabel lblWarehousename;
    private javax.swing.JTextField txtFoodQuantity;
    private javax.swing.JTextField txtFooditem;
    private javax.swing.JTextField txtFooditemId;
    private javax.swing.JTextField txtPantryManager;
    // End of variables declaration//GEN-END:variables

    private boolean nullCheck() {
        if(txtPantryManager.getText().length()!=0 && txtFooditem.getText().length()!=0 && txtFoodQuantity.getText().length()!=0)
        {
            return false;
        }
        else return true;
    }
}