/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FCPManagerRole;

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
import userinterface.DonorRole.DonorProfilePanel;
import userinterface.FCAdminRole.FCAdminWorkAreaPanel;
import userinterface.MainJFrame;

/**
 *
 * @author ankitapatil 
 */
public class FCPManagerWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form FCPManagerWorkAreaPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem ecosystem;
    JPanel jp;
    JSplitPane jsp;

    public FCPManagerWorkAreaPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account, JPanel jp, JSplitPane jsp) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        this.jp = jp;
        this.jsp = jsp;

        logoutlogo();
        setLogo();
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

        SplitPaneFCPManager = new javax.swing.JSplitPane();
        MenubarFCPPanel = new javax.swing.JPanel();
        btnViewfoodDonationReqs = new javax.swing.JButton();
        btnPantryStock = new javax.swing.JButton();
        lblFCPWelcomemsg = new javax.swing.JLabel();
        btnConWarehouse = new javax.swing.JButton();
        lblFCPlogout = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        Imagelogo = new javax.swing.JLabel();
        WorkAreaFCPPanel = new javax.swing.JPanel();
        LabelImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SplitPaneFCPManager.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        MenubarFCPPanel.setBackground(new java.awt.Color(255, 255, 255));
        MenubarFCPPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewfoodDonationReqs.setBackground(new java.awt.Color(0, 153, 204));
        btnViewfoodDonationReqs.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnViewfoodDonationReqs.setText("View Food Requests");
        btnViewfoodDonationReqs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewfoodDonationReqsActionPerformed(evt);
            }
        });
        MenubarFCPPanel.add(btnViewfoodDonationReqs, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        btnPantryStock.setBackground(new java.awt.Color(0, 153, 204));
        btnPantryStock.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnPantryStock.setText("Pantry Stock");
        btnPantryStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPantryStockActionPerformed(evt);
            }
        });
        MenubarFCPPanel.add(btnPantryStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblFCPWelcomemsg.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblFCPWelcomemsg.setForeground(new java.awt.Color(0, 153, 204));
        lblFCPWelcomemsg.setText("Welcome Pantry Manager!");
        MenubarFCPPanel.add(lblFCPWelcomemsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btnConWarehouse.setBackground(new java.awt.Color(0, 153, 204));
        btnConWarehouse.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnConWarehouse.setText("Contact Warehouse");
        btnConWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConWarehouseActionPerformed(evt);
            }
        });
        MenubarFCPPanel.add(btnConWarehouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        lblFCPlogout.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFCPlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFCPlogoutMousePressed(evt);
            }
        });
        MenubarFCPPanel.add(lblFCPlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 40, 43, 41));

        jLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        MenubarFCPPanel.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 6, 10, 120));
        MenubarFCPPanel.add(Imagelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 60));

        SplitPaneFCPManager.setLeftComponent(MenubarFCPPanel);

        WorkAreaFCPPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
        WorkAreaFCPPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        WorkAreaFCPPanel.add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 650));

        SplitPaneFCPManager.setRightComponent(WorkAreaFCPPanel);

        add(SplitPaneFCPManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 790));
    }// </editor-fold>//GEN-END:initComponents

    public void logoutlogo() {

        try {

            lblFCPlogout.setMinimumSize(new Dimension(50, 60));
            lblFCPlogout.setPreferredSize(new Dimension(50, 60));
            lblFCPlogout.setMaximumSize(new Dimension(50, 60));

            Image img1 = ImageIO.read(getClass().getResource("/Images/signout.png"));
            Image newimg1 = img1.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);

            lblFCPlogout.setIcon(new ImageIcon(newimg1));

        } catch (IOException ex) {
            Logger.getLogger(FCAdminWorkAreaPanel.class.getName()).log(Level.SEVERE, null, ex);
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

    private void btnViewfoodDonationReqsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewfoodDonationReqsActionPerformed
        // TODO add your handling code here:
        ViewFoodRequestsPanel objFDreqs = new ViewFoodRequestsPanel(userProcessContainer, ecosystem, account);
        SplitPaneFCPManager.setRightComponent(objFDreqs);
    }//GEN-LAST:event_btnViewfoodDonationReqsActionPerformed

    private void btnPantryStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPantryStockActionPerformed
        // TODO add your handling code here:
        PantryStockPanel objWHI = new PantryStockPanel(userProcessContainer, ecosystem, account);
        SplitPaneFCPManager.setRightComponent(objWHI);
    }//GEN-LAST:event_btnPantryStockActionPerformed

    private void btnConWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConWarehouseActionPerformed
        // TODO add your handling code here:
        ContactWarehousePanel objConWH = new ContactWarehousePanel(userProcessContainer, ecosystem, account);
        SplitPaneFCPManager.setRightComponent(objConWH);
    }//GEN-LAST:event_btnConWarehouseActionPerformed

    private void lblFCPlogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFCPlogoutMousePressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            MainJFrame mjf = new MainJFrame();
            mjf.logout(userProcessContainer, jp, jsp);
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_lblFCPlogoutMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagelogo;
    private javax.swing.JLabel LabelImage;
    private javax.swing.JPanel MenubarFCPPanel;
    private javax.swing.JSplitPane SplitPaneFCPManager;
    private javax.swing.JPanel WorkAreaFCPPanel;
    private javax.swing.JButton btnConWarehouse;
    private javax.swing.JButton btnPantryStock;
    private javax.swing.JButton btnViewfoodDonationReqs;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel lblFCPWelcomemsg;
    private javax.swing.JLabel lblFCPlogout;
    // End of variables declaration//GEN-END:variables
}
