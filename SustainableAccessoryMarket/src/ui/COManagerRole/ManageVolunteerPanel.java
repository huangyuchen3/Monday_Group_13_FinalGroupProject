/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.COManagerRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author reetikabhanushali 
 */
public class ManageVolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form COWorkAreaPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    JPanel jp;
    JSplitPane jsp;
    public ManageVolunteerPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc, JPanel jp, JSplitPane jsp) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc =userAcc;
        this.jp = jp;
        this.jsp = jsp;
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

        SplitPaneNGO = new javax.swing.JSplitPane();
        NGOCP = new javax.swing.JPanel();
        btnAddItems = new javax.swing.JButton();
        btnViewItems = new javax.swing.JButton();
        btnRequests = new javax.swing.JButton();
        WorkareaPanelNGO = new javax.swing.JPanel();
        LabelImg = new javax.swing.JLabel();

        NGOCP.setBackground(new java.awt.Color(255, 255, 255));
        NGOCP.setPreferredSize(new java.awt.Dimension(150, 600));

        btnAddItems.setBackground(new java.awt.Color(0, 153, 204));
        btnAddItems.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAddItems.setText("Add Volunteer");
        btnAddItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemsActionPerformed(evt);
            }
        });

        btnViewItems.setBackground(new java.awt.Color(0, 153, 204));
        btnViewItems.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnViewItems.setText("View/Update Volunteer ");
        btnViewItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemsActionPerformed(evt);
            }
        });

        btnRequests.setBackground(new java.awt.Color(0, 153, 204));
        btnRequests.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRequests.setText("Requests");
        btnRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NGOCPLayout = new javax.swing.GroupLayout(NGOCP);
        NGOCP.setLayout(NGOCPLayout);
        NGOCPLayout.setHorizontalGroup(
            NGOCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOCPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NGOCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewItems, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddItems, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NGOCPLayout.setVerticalGroup(
            NGOCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOCPLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnAddItems)
                .addGap(26, 26, 26)
                .addComponent(btnViewItems)
                .addGap(29, 29, 29)
                .addComponent(btnRequests)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        SplitPaneNGO.setLeftComponent(NGOCP);

        WorkareaPanelNGO.setPreferredSize(new java.awt.Dimension(840, 600));

        javax.swing.GroupLayout WorkareaPanelNGOLayout = new javax.swing.GroupLayout(WorkareaPanelNGO);
        WorkareaPanelNGO.setLayout(WorkareaPanelNGOLayout);
        WorkareaPanelNGOLayout.setHorizontalGroup(
            WorkareaPanelNGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        WorkareaPanelNGOLayout.setVerticalGroup(
            WorkareaPanelNGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        SplitPaneNGO.setRightComponent(WorkareaPanelNGO);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneNGO, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneNGO, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemsActionPerformed
        // TODO add your handling code here:
        AddVolunteerPanel objAddPI = new AddVolunteerPanel(userProcessContainer, ecosystem,userAcc);
        SplitPaneNGO.setRightComponent(objAddPI);
    }//GEN-LAST:event_btnAddItemsActionPerformed

    private void btnViewItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemsActionPerformed
        // TODO add your handling code here:
        ViewModifyVolunteerPanel objViewPI = new ViewModifyVolunteerPanel(userProcessContainer, ecosystem,userAcc);
        SplitPaneNGO.setRightComponent(objViewPI);
    }//GEN-LAST:event_btnViewItemsActionPerformed

    private void btnRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestsActionPerformed
        // TODO add your handling code here:
        RequestsPanel objReq =  new RequestsPanel(userProcessContainer, ecosystem,userAcc);
        SplitPaneNGO.setRightComponent(objReq);
    }//GEN-LAST:event_btnRequestsActionPerformed

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1350, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(ManageVolunteerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JPanel NGOCP;
    private javax.swing.JSplitPane SplitPaneNGO;
    private javax.swing.JPanel WorkareaPanelNGO;
    private javax.swing.JButton btnAddItems;
    private javax.swing.JButton btnRequests;
    private javax.swing.JButton btnViewItems;
    // End of variables declaration//GEN-END:variables
}
