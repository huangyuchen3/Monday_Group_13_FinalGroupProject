/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DOManagerRole;

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
import ui.DonorRole.DonorProfilePanel;
import ui.DHManagerRole.DHManagerWorkAreaPanel;
import ui.MainJFrame;

/**
 *
 * @author reetikabhanushali 
 */
public class DOManagerWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form DOManagerWorkAreaPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem ecosystem;
    JPanel jp;
    JSplitPane jsp;

    public DOManagerWorkAreaPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount account, JPanel jp, JSplitPane jsp) {
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
        btnViewAccessoryDonationReqs = new javax.swing.JButton();
        btnStoreStock = new javax.swing.JButton();
        lblFCPWelcomemsg = new javax.swing.JLabel();
        btnConDH = new javax.swing.JButton();
        lblFCPlogout = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        Imagelogo = new javax.swing.JLabel();
        WorkAreaFCPPanel = new javax.swing.JPanel();
        LabelImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SplitPaneFCPManager.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        MenubarFCPPanel.setBackground(new java.awt.Color(255, 255, 255));
        MenubarFCPPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewAccessoryDonationReqs.setBackground(new java.awt.Color(204, 204, 255));
        btnViewAccessoryDonationReqs.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnViewAccessoryDonationReqs.setText("View Accessory Requests");
        btnViewAccessoryDonationReqs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAccessoryDonationReqsActionPerformed(evt);
            }
        });
        MenubarFCPPanel.add(btnViewAccessoryDonationReqs, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        btnStoreStock.setBackground(new java.awt.Color(204, 204, 255));
        btnStoreStock.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnStoreStock.setText("Store Stock");
        btnStoreStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreStockActionPerformed(evt);
            }
        });
        MenubarFCPPanel.add(btnStoreStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblFCPWelcomemsg.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblFCPWelcomemsg.setForeground(new java.awt.Color(102, 102, 255));
        lblFCPWelcomemsg.setText("Welcome Drop-Off Store Manager!");
        MenubarFCPPanel.add(lblFCPWelcomemsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        btnConDH.setBackground(new java.awt.Color(204, 204, 255));
        btnConDH.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnConDH.setText("Contact Distribution Hub");
        btnConDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConDHActionPerformed(evt);
            }
        });
        MenubarFCPPanel.add(btnConDH, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

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
            Logger.getLogger(DHManagerWorkAreaPanel.class.getName()).log(Level.SEVERE, null, ex);
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

    private void btnViewAccessoryDonationReqsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAccessoryDonationReqsActionPerformed
        // TODO add your handling code here:
        ViewItemsRequestsPanel objFDreqs = new ViewItemsRequestsPanel(userProcessContainer, ecosystem, account);
        SplitPaneFCPManager.setRightComponent(objFDreqs);
    }//GEN-LAST:event_btnViewAccessoryDonationReqsActionPerformed

    private void btnStoreStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreStockActionPerformed
        // TODO add your handling code here:
        DHStockPanel objWHI = new DHStockPanel(userProcessContainer, ecosystem, account);
        SplitPaneFCPManager.setRightComponent(objWHI);
    }//GEN-LAST:event_btnStoreStockActionPerformed

    private void btnConDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConDHActionPerformed
        // TODO add your handling code here:
        ContactDHPanel objConWH = new ContactDHPanel(userProcessContainer, ecosystem, account);
        SplitPaneFCPManager.setRightComponent(objConWH);
    }//GEN-LAST:event_btnConDHActionPerformed

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
    private javax.swing.JButton btnConDH;
    private javax.swing.JButton btnStoreStock;
    private javax.swing.JButton btnViewAccessoryDonationReqs;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel lblFCPWelcomemsg;
    private javax.swing.JLabel lblFCPlogout;
    // End of variables declaration//GEN-END:variables
}
