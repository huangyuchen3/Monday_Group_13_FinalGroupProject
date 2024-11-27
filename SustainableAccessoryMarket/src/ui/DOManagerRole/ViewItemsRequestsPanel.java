/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DOManagerRole;

import Business.EcoSystem;
import Business.DropOff.DropOff;
import Business.DropOff.DropOffItems;
import Business.COVolunteer.COVolunteer;
import Business.AccessoryRequestorder.AccessoryRequestorder;
import Business.AccessoryRequestorder.AccessoryRequestorderDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reetikabhanushali 
 */
public class ViewItemsRequestsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewItemsRequestsPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String volname;
    String FCPname;
    String FCPmgname;
    String WHname;
    String city;

    public ViewItemsRequestsPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        if (ecosystem.getReqorderDirectory() == null) {
            ecosystem.setReqorderDirectory(new AccessoryRequestorderDirectory());
        }
//        String FCAname = userAcc.getEmployee().getName();
//        WHname = ecosystem.getFCWDirectory().getWHname(FCAname);
        FCPmgname = userAcc.getEmployee().getName();
        for (DropOff fcp : ecosystem.getACDOFDirectory().getFcpList()) {
            if (fcp.getDropOffManager().equals(FCPmgname)) {
                FCPname = fcp.getDropOffName();
                city = fcp.getDropOffCity();
                System.out.println(FCPname + " pantry Fcp name");
                System.out.println(city + " pantry city name");
                
                break;
            }
        }
        ArrayList<String> VolunteerList = new ArrayList();
        for (COVolunteer vol : ecosystem.getVolDir().getVolunteerList()) {
            if (vol.getVolCity().equals(city) && vol.getVolAvail().equals("Yes")) {
                VolunteerList.add(vol.getVolName());
            }
        }
        ArrayList<String> donIdList = new ArrayList();

        for (DropOffItems fci : ecosystem.getACDOIDirectory().getDOiList()) {
            if (fci.getDropOffName().equals(FCPname)) {
                donIdList.add(fci.getDropOffItemId());
            }
        }

        cbAssignVol.setModel(new DefaultComboBoxModel<String>(VolunteerList.toArray(new String[0])));
//        asgvol.setModel(new DefaultComboBoxModel<String>(VolunteerList.toArray(new String[0])));
        cbDonationID.setModel(new DefaultComboBoxModel<String>(donIdList.toArray(new String[0])));
//        cbdonid.setModel(new DefaultComboBoxModel<String>(donIdList.toArray(new String[0])));
        populateTable();
//        setBG();
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

        lblFoodRequestsTitle = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblFoodRequests = new javax.swing.JTable();
        btnFoodRequestsAssign = new javax.swing.JButton();
        lblRequestsid = new javax.swing.JLabel();
        txtFoodRequestsid = new javax.swing.JTextField();
        lblFoodRequestsid1 = new javax.swing.JLabel();
        btnFoodRequestsSend = new javax.swing.JButton();
        lblFoodRequestsTitle1 = new javax.swing.JLabel();
        cbVolunteerLbl = new javax.swing.JLabel();
        cbAssignVol = new javax.swing.JComboBox<>();
        cbDonationID = new javax.swing.JComboBox<>();
        lblDonationID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFoodRequestsTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblFoodRequestsTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblFoodRequestsTitle.setText("Accessory Requests");
        add(lblFoodRequestsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 32, -1, -1));

        tblFoodRequests.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblFoodRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Requestor", "Quantity", "Order Type", "Status", "Donation ID"
            }
        ));
        tblFoodRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblFoodRequestsMousePressed(evt);
            }
        });
        jScrollPane.setViewportView(tblFoodRequests);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 99, 999, 153));

        btnFoodRequestsAssign.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnFoodRequestsAssign.setText("Assign");
        btnFoodRequestsAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodRequestsAssignActionPerformed(evt);
            }
        });
        add(btnFoodRequestsAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        lblRequestsid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblRequestsid.setText("Request ID :");
        add(lblRequestsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 380, -1, -1));

        txtFoodRequestsid.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtFoodRequestsid.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFoodRequestsid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFoodRequestsidFocusLost(evt);
            }
        });
        txtFoodRequestsid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFoodRequestsidKeyReleased(evt);
            }
        });
        add(txtFoodRequestsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 376, 137, -1));

        lblFoodRequestsid1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblFoodRequestsid1.setText("Assign Volunteer :");
        add(lblFoodRequestsid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 423, -1, -1));

        btnFoodRequestsSend.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnFoodRequestsSend.setText("Send request to volunteer");
        btnFoodRequestsSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodRequestsSendActionPerformed(evt);
            }
        });
        add(btnFoodRequestsSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 286, -1, -1));

        lblFoodRequestsTitle1.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblFoodRequestsTitle1.setForeground(new java.awt.Color(0, 153, 204));
        lblFoodRequestsTitle1.setText("Assign Volunteer");
        add(lblFoodRequestsTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 302, -1, -1));

        cbVolunteerLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        add(cbVolunteerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -70, 980, 670));

        cbAssignVol.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbAssignVol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAssignVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAssignVolActionPerformed(evt);
            }
        });
        add(cbAssignVol, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 419, 137, -1));

        cbDonationID.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cbDonationID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDonationID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDonationIDActionPerformed(evt);
            }
        });
        add(cbDonationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 100, -1));

        lblDonationID.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        lblDonationID.setText("Donation ID:");
        add(lblDonationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 466, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

//    public void setBG() {
//        try {
//            cbVolunteerLbl.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
//            cbVolunteerLbl.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
//            cbVolunteerLbl.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
//
//            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));
//
//            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
//            cbVolunteerLbl.setIcon(new ImageIcon(newimg));
//        } catch (IOException ex) {
//
//        }
//    }

    public void makeTableTransparent() {
        tblFoodRequests.setOpaque(false);
        ((DefaultTableCellRenderer) tblFoodRequests.getDefaultRenderer(Object.class)).setOpaque(false);
        tblFoodRequests.setShowGrid(false);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);

        for (int i = 0; i < tblFoodRequests.getModel().getColumnCount(); i++) {
            tblFoodRequests.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    private void txtFoodRequestsidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFoodRequestsidFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFoodRequestsidFocusLost

    private void txtFoodRequestsidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFoodRequestsidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodRequestsidKeyReleased

    private void btnFoodRequestsSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodRequestsSendActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblFoodRequests.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a request");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblFoodRequests.getModel();
        AccessoryRequestorder selectedR = (AccessoryRequestorder) model.getValueAt(selectedRowIndex, 0);
        txtFoodRequestsid.setText(selectedR.getReqOrderId());
//        ArrayList<String> VolunteerList = new ArrayList();
//        for (COVolunteer vol : ecosystem.getVolDir().getVolunteerList()) {
//            VolunteerList.add(vol.getVolName());
//        }
//        cbAssignVol.setModel(new DefaultComboBoxModel<String>(VolunteerList.toArray(new String[0])));
    }//GEN-LAST:event_btnFoodRequestsSendActionPerformed

    private void btnFoodRequestsAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodRequestsAssignActionPerformed
        // TODO add your handling code here:
        String Reqid = txtFoodRequestsid.getText();
        String donId = cbDonationID.getSelectedItem().toString();
        System.out.println(donId + "don combo box");
        volname = cbAssignVol.getSelectedItem().toString();
        String reqQunty = "";
        Integer intReqQunty = 0;
        String donQnt = "";
        Integer intDonQnt = 0;
        DropOffItems donatItem = new DropOffItems();
        for (DropOffItems fcpi : ecosystem.getACDOIDirectory().getDOiList()) {
            System.out.println(fcpi.getDropOffItemId() + "fcpi item id is....");
            if (fcpi.getDropOffItemId()== null ? donId == null : fcpi.getDropOffItemId().equals(donId)) {
                donQnt = fcpi.getAccessoryQuantity();
                intDonQnt = Integer.parseInt(donQnt);
                donatItem = fcpi;
//                    ecosystem.getFCPIDirectory().deleteFCPItems(fcpi);
                break;
            }
        }

        for (AccessoryRequestorder r : ecosystem.getReqorderDirectory().getReqOrderList()) {
            if (r.getReqOrderId() == null ? Reqid == null : r.getReqOrderId().equals(Reqid)) {
                reqQunty = r.getReqOrderQuant();
                intReqQunty = Integer.parseInt(reqQunty);

                if (intReqQunty > intDonQnt) {
                    JOptionPane.showMessageDialog(this, " request quanty is greater than donation");
                    return;
                } else {
                    volname = cbAssignVol.getSelectedItem().toString();
                    r.setReqVol(volname);
                    r.setReqOrderStatus("Assigned to Volunteer");
                    r.setReqDonId(donId);
                    ecosystem.getACDOIDirectory().deleteFCPItems(donatItem);
                    String remQunt = String.valueOf(intDonQnt - intReqQunty);
                    donatItem.setAccessoryQuantity(remQunt);
                    if (!Objects.equals(intReqQunty, intDonQnt)) {
                        ecosystem.getACDOIDirectory().addFCPItems(donatItem);
                        System.out.println(donatItem + "donation item in fcp....");
                    }

                    for (COVolunteer v : ecosystem.getVolDir().getVolunteerList()) {
                        if (v.getVolName().equals(volname)) {
                            v.setVolAvail("No");
                        }
                    }
                    populateTable();
                }

                System.out.println(reqQunty + "req qunty is....");
            }
        }

//        for(COVolunteer v:ecosystem.getVolDir().getVolunteerList()){
//            if(v.getVolName().equals(volname)){
//                v.setVolAvail("No");
//            }
//        }
//        for(AccessoryDonation d : ecosystem.getDonatDirectory().getDonatList()){
//        System.out.println(d.getDonatId() + "donID");
//        if(d.getDonatId() == null ? donId == null : d.getDonatId().equals(donId)){
//             ecosystem.getDonatDirectory().deleteDonation(d);
//             System.out.println(d + "delete ");
//             break;
//        }
//    }
        JOptionPane.showMessageDialog(this, "Delivery Assigned to Volunteer Successfully!");
    }//GEN-LAST:event_btnFoodRequestsAssignActionPerformed

    private void tblFoodRequestsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFoodRequestsMousePressed
        // TODO add your handling code here:
        tblFoodRequests.setSelectionForeground(Color.BLUE);
    }//GEN-LAST:event_tblFoodRequestsMousePressed

    private void cbAssignVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAssignVolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAssignVolActionPerformed

    private void cbDonationIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDonationIDActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_cbDonationIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoodRequestsAssign;
    private javax.swing.JButton btnFoodRequestsSend;
    private javax.swing.JComboBox<String> cbAssignVol;
    private javax.swing.JComboBox<String> cbDonationID;
    private javax.swing.JLabel cbVolunteerLbl;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblDonationID;
    private javax.swing.JLabel lblFoodRequestsTitle;
    private javax.swing.JLabel lblFoodRequestsTitle1;
    private javax.swing.JLabel lblFoodRequestsid1;
    private javax.swing.JLabel lblRequestsid;
    private javax.swing.JTable tblFoodRequests;
    private javax.swing.JTextField txtFoodRequestsid;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblFoodRequests.getModel();
        model.setRowCount(0);
        for (AccessoryRequestorder rq : ecosystem.getReqorderDirectory().getReqOrderList()) {
            if (rq.getReqPantryName().equals(FCPname)) {
                Object[] row = new Object[6];
                row[0] = rq;
                row[1] = rq.getReqName();
                row[2] = rq.getReqOrderQuant();
                row[3] = rq.getReqOrderType();
                row[4] = rq.getReqOrderStatus();
                if (rq.getReqDonId() != null) {
                    row[5] = rq.getReqDonId();

                } else {
                    row[5] = "-";
                }
                model.addRow(row);
            }
        }
    }
}
