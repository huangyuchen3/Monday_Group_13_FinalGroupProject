/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ui.DHManagerRole;

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

/**
 *
 *@author reetikabhanushali
 */
public class ManageDHItemsPanel extends javax.swing.JPanel {

    /** Creates new form ManageWHitemsPanel */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    public ManageDHItemsPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc =userAcc;
        setBG();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneFCP = new javax.swing.JSplitPane();
        FCAControlPanel = new javax.swing.JPanel();
        btnAddDOItems = new javax.swing.JButton();
        btnViewDOItems = new javax.swing.JButton();
        FCAWorkareaPanel = new javax.swing.JPanel();
        LabelImage = new javax.swing.JLabel();

        FCAControlPanel.setBackground(new java.awt.Color(255, 255, 255));
        FCAControlPanel.setPreferredSize(new java.awt.Dimension(150, 600));

        btnAddDOItems.setBackground(new java.awt.Color(204, 204, 255));
        btnAddDOItems.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAddDOItems.setText("Add Items");
        btnAddDOItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDOItemsActionPerformed(evt);
            }
        });

        btnViewDOItems.setBackground(new java.awt.Color(204, 204, 255));
        btnViewDOItems.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnViewDOItems.setText("View/Update Items");
        btnViewDOItems.setToolTipText("");
        btnViewDOItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDOItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FCAControlPanelLayout = new javax.swing.GroupLayout(FCAControlPanel);
        FCAControlPanel.setLayout(FCAControlPanelLayout);
        FCAControlPanelLayout.setHorizontalGroup(
            FCAControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FCAControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FCAControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewDOItems, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDOItems, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FCAControlPanelLayout.setVerticalGroup(
            FCAControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FCAControlPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnAddDOItems)
                .addGap(26, 26, 26)
                .addComponent(btnViewDOItems)
                .addContainerGap(663, Short.MAX_VALUE))
        );

        SplitPaneFCP.setLeftComponent(FCAControlPanel);

        FCAWorkareaPanel.setPreferredSize(new java.awt.Dimension(840, 600));

        LabelImage.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout FCAWorkareaPanelLayout = new javax.swing.GroupLayout(FCAWorkareaPanel);
        FCAWorkareaPanel.setLayout(FCAWorkareaPanelLayout);
        FCAWorkareaPanelLayout.setHorizontalGroup(
            FCAWorkareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FCAWorkareaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 1470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FCAWorkareaPanelLayout.setVerticalGroup(
            FCAWorkareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );

        SplitPaneFCP.setRightComponent(FCAWorkareaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneFCP, javax.swing.GroupLayout.DEFAULT_SIZE, 1646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneFCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImage.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImage.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(1650, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImage.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(ManageDHItemsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnAddDOItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDOItemsActionPerformed
        // TODO add your handling code here:
       AddDOItemsPanel objAddPI = new AddDOItemsPanel(userProcessContainer, ecosystem,userAcc);
       SplitPaneFCP.setRightComponent(objAddPI);
    }//GEN-LAST:event_btnAddDOItemsActionPerformed

    private void btnViewDOItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDOItemsActionPerformed
        // TODO add your handling code here:
       ViewDHItemsPanel objViewPI = new ViewDHItemsPanel(userProcessContainer, ecosystem,userAcc);
       SplitPaneFCP.setRightComponent(objViewPI);
    }//GEN-LAST:event_btnViewDOItemsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FCAControlPanel;
    private javax.swing.JPanel FCAWorkareaPanel;
    private javax.swing.JLabel LabelImage;
    private javax.swing.JSplitPane SplitPaneFCP;
    private javax.swing.JButton btnAddDOItems;
    private javax.swing.JButton btnViewDOItems;
    // End of variables declaration//GEN-END:variables

}
