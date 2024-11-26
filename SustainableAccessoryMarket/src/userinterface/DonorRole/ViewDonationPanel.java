/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DonorRole;

import Business.AccessoryDonation.AccessoryDonation;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ankitapatil 
 */
public class ViewDonationPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDonationPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;

    public ViewDonationPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        populateTable();
        setBG();
       // setLogo();
        makeTableTransparent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDonorViewTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonations = new javax.swing.JTable();
        Imagelogo = new javax.swing.JLabel();
        Imagelabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setLayout(null);

        lblDonorViewTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblDonorViewTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblDonorViewTitle.setText(" Donations");
        add(lblDonorViewTitle);
        lblDonorViewTitle.setBounds(360, 60, 339, 35);

        tblDonations.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblDonations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Donation ID", "Item", "Quantity", "Distribution Hub", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDonations);
        if (tblDonations.getColumnModel().getColumnCount() > 0) {
            tblDonations.getColumnModel().getColumn(0).setResizable(false);
            tblDonations.getColumnModel().getColumn(1).setResizable(false);
            tblDonations.getColumnModel().getColumn(2).setResizable(false);
            tblDonations.getColumnModel().getColumn(3).setResizable(false);
            tblDonations.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(43, 185, 994, 220);
        add(Imagelogo);
        Imagelogo.setBounds(75, 31, 102, 104);
        add(Imagelabel);
        Imagelabel.setBounds(0, 0, 1550, 870);
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            Imagelabel.setMinimumSize(new Dimension(1500, 1000));
            Imagelabel.setPreferredSize(new Dimension(1500, 1000));
            Imagelabel.setMaximumSize(new Dimension(1500, 1000));

            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));

            Image newimg = img.getScaledInstance(2000, 1000, java.awt.Image.SCALE_SMOOTH);
            Imagelabel.setIcon(new ImageIcon(newimg));
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

    public void makeTableTransparent() {
        tblDonations.setOpaque(false);
        ((DefaultTableCellRenderer) tblDonations.getDefaultRenderer(Object.class)).setOpaque(false);
        tblDonations.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblDonations.getModel().getColumnCount(); i++) {
            tblDonations.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagelabel;
    private javax.swing.JLabel Imagelogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDonorViewTitle;
    private javax.swing.JTable tblDonations;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDonations.getModel();
        model.setRowCount(0);
        for (AccessoryDonation dt : ecosystem.getDonatDirectory().getDonatList()) {
            if(dt.getDonatDonorAcc().getUsername()==userAcc.getUsername()){
            Object[] row = new Object[5];
            row[0] = dt;
            row[1] = dt.getDonatItem();
            row[2] = dt.getDonatQuant();
            row[3] = dt.getDonatWHname();
            row[4] = dt.getDonatStatus();
            model.addRow(row);
        }
        }
    }

}
