/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DHManagerRole;

import Business.EcoSystem;
import Business.DistributionHub.DistributionHub;
import Business.CommunityOutreach.CommunityOutreach;
import Business.COVolunteer.COVolunteerRequests;
import Business.COVolunteer.COVolunteerRequestsDirectory;
import Business.COVolunteer.COVolunteer;
import Business.COVolunteer.COVolunteerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 *@author reetikabhanushali
 */
public class ManageVolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVolunteerPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    COVolunteerDirectory vold;
    COVolunteerRequestsDirectory vrD;
    String WHname;
    String city;
    public ManageVolunteerPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
         if(ecosystem.getVRDirectory() == null){
         ecosystem.setVRDirectory(new COVolunteerRequestsDirectory());
        }
        for(DistributionHub fcw:ecosystem.getACDDirectory().getFadList()){
            if(fcw.getDistributionHubAdmin().equals(userAcc.getEmployee().getName())){
              city=fcw.getDistributionHubCity();
            }
        }
        ArrayList<String> nogList = new ArrayList();
        for (CommunityOutreach ng : ecosystem.getcoDir().getNgoList()){
            if(ng.getCOCity().equals(city)){
            nogList.add(ng.getCOName());
            }
        }
        cbSelectNGO.setModel(new DefaultComboBoxModel<String>(nogList.toArray(new String[0])));
        for(DistributionHub fcw: ecosystem.getACDDirectory().getFadList()){
            if(fcw.getDistributionHubAdmin().equals(userAcc.getEmployee().getName())){
                WHname=fcw.getDistributionHubName();
            }
        }

        lbVolReq.setVisible(false);
        cbVolReq.setVisible(false);
        populateTable();

        setBG();
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

        lblManageVolTitle = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblManageVolunteer = new javax.swing.JTable();
        lblDonationProfileTitle = new javax.swing.JLabel();
        lbVolReq = new javax.swing.JLabel();
        cbVolReq = new javax.swing.JComboBox<>();
        btnVolReq = new javax.swing.JButton();
        lblSelectNGO = new javax.swing.JLabel();
        cbSelectNGO = new javax.swing.JComboBox<>();
        LabelImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblManageVolTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblManageVolTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblManageVolTitle.setText("Manage Volunteers");

        tblManageVolunteer.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblManageVolunteer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Volunteer ID", "Name", "Phone Number", "Address", "City", "Zip", "Availability"
            }
        ));
        tblManageVolunteer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblManageVolunteerMousePressed(evt);
            }
        });
        jScrollPane.setViewportView(tblManageVolunteer);

        lblDonationProfileTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblDonationProfileTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblDonationProfileTitle.setText("Request Volunteers");

        lbVolReq.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lbVolReq.setText("Number of Volunteers Required:");

        cbVolReq.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbVolReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "1", "2", "3", "4", "5" }));

        btnVolReq.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnVolReq.setText("Submit Request");
        btnVolReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolReqActionPerformed(evt);
            }
        });

        lblSelectNGO.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblSelectNGO.setText("Select a CO :");

        cbSelectNGO.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbSelectNGO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelImage.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addComponent(cbSelectNGO, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(lblManageVolTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(lblDonationProfileTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbVolReq)
                            .addComponent(lblSelectNGO))
                        .addGap(33, 33, 33)
                        .addComponent(cbVolReq, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(502, 502, 502)
                        .addComponent(btnVolReq)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblDonationProfileTitle)
                        .addGap(31, 31, 31)
                        .addComponent(cbSelectNGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(lblSelectNGO))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbVolReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVolReq)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblManageVolTitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnVolReq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
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

    public void makeTableTransparent() {
        tblManageVolunteer.setOpaque(false);
        ((DefaultTableCellRenderer) tblManageVolunteer.getDefaultRenderer(Object.class)).setOpaque(false);
        tblManageVolunteer.setShowGrid(false);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblManageVolunteer.getModel().getColumnCount(); i++) {
            tblManageVolunteer.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    private void btnVolReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolReqActionPerformed
        // TODO add your handling code here:
        COVolunteerRequests vr = new COVolunteerRequests();
        vr.setVolreqId("1");
        vr.setVolreqName(cbSelectNGO.getSelectedItem().toString());
        vr.setVolreqNum("1");
        //vr.setVolreqWH(WHname);
        vr.setVolreqStatus("Requested");
        vrD = ecosystem.getVRDirectory();
        vrD.addVR(vr);
       ecosystem.setVRDirectory(vrD);
        JOptionPane.showMessageDialog(this, "Your request has been sent to CO");
    }//GEN-LAST:event_btnVolReqActionPerformed

    private void tblManageVolunteerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManageVolunteerMousePressed
        // TODO add your handling code here:
        tblManageVolunteer.setSelectionForeground(Color.BLUE);
    }//GEN-LAST:event_tblManageVolunteerMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JButton btnVolReq;
    private javax.swing.JComboBox<String> cbSelectNGO;
    private javax.swing.JComboBox<String> cbVolReq;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lbVolReq;
    private javax.swing.JLabel lblDonationProfileTitle;
    private javax.swing.JLabel lblManageVolTitle;
    private javax.swing.JLabel lblSelectNGO;
    private javax.swing.JTable tblManageVolunteer;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageVolunteer.getModel();
        model.setRowCount(0);
        for(COVolunteer vol: ecosystem.getVolDir().getVolunteerList()){
            if(vol.getVolAvail().equals("Yes") && vol.getVolCity().equals(city)){
           Object[] row = new Object[7];
           row[0] =vol;
           row[1] =vol.getVolName();
           row[2] =vol.getVolPhno();
           row[3] =vol.getVolAddress();
           row[4] =vol.getVolCity();
           row[5] =vol.getVolZipcode();
           row[6] =vol.getVolAvail();
           model.addRow(row);
            }
        } 
    }
}
