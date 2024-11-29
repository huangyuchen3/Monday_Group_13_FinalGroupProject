/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.UserAccount.UserAccountDirectory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartFrame;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.CategoryPlot;
//import org.jfree.chart.plot.PiePlot;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;
//import org.jfree.data.general.DefaultPieDataset;
import ui.DonorRole.DonorProfilePanel;

/**
 *
 *@author reetikabhanushali
 */
public class ViewAllStatsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsers
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory uad;
    //private DefaultPieDataset pieDataset;
    //private JFreeChart pieChart;
    //private PiePlot piePlot;
    //private ChartPanel chartPanel;

    public ViewAllStatsPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        setBG();
        setLogo();
        populateUserTable();
        makeTableTransparent();
        jLabel2.setText(ecosystem.getDonorsCnt().toString());
        jLabel3.setText(ecosystem.getRequestorsCnt().toString());
        jLabel1.setText(ecosystem.getVolunteersCnt().toString());
        //showPieChart();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewUsersTitle = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblViewUsers = new javax.swing.JTable();
        logoImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(2000, 1100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewUsersTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 29)); // NOI18N
        lblViewUsersTitle.setForeground(new java.awt.Color(102, 102, 255));
        lblViewUsersTitle.setText("View Statstics");
        add(lblViewUsersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 24, -1, -1));

        tblViewUsers.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblViewUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Distribution hubs", "Drop Offs", "COs", "Volunteers", "Donors", "Requestors", "Organizations", "Donations", "Requests"
            }
        ));
        tblViewUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblViewUsersMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewUsersMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tblViewUsers);
        if (tblViewUsers.getColumnModel().getColumnCount() > 0) {
            tblViewUsers.getColumnModel().getColumn(0).setResizable(false);
            tblViewUsers.getColumnModel().getColumn(1).setResizable(false);
            tblViewUsers.getColumnModel().getColumn(2).setResizable(false);
            tblViewUsers.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 990, 212));
        add(logoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 80));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 0)), "no. of Donars", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18), new java.awt.Color(255, 51, 0)), "no.of Volunteers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18), new java.awt.Color(255, 0, 51))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 180, 140));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 0)), "no. of Donars", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18), new java.awt.Color(255, 51, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(255, 0, 51))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 180, 140));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 0)), "no. of Donars", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18), new java.awt.Color(255, 51, 0)), " No.of Requestors", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18), new java.awt.Color(255, 0, 51))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 180, 140));

        jButton1.setText("Get Statistics");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
//        try {
//            LabelImg.setMinimumSize(new Dimension(1500, 1000));
//            LabelImg.setPreferredSize(new Dimension(1500, 1000));
//            LabelImg.setMaximumSize(new Dimension(1500, 1000));
//
//            Image img = ImageIO.read(getClass().getResource("/Images/background2.png"));
//
//            Image newimg = img.getScaledInstance(2500, 1000, java.awt.Image.SCALE_SMOOTH);
//            LabelImg.setIcon(new ImageIcon(newimg));
//        } catch (IOException ex) {
//            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public void setLogo() {
        try {
            logoImg.setMinimumSize(new Dimension(100, 100));
            logoImg.setPreferredSize(new Dimension(100, 100));
            logoImg.setMaximumSize(new Dimension(100, 100));

            Image img = ImageIO.read(getClass().getResource("/Images/cmnlogo.jpeg"));

            Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            logoImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void makeTableTransparent() {
        tblViewUsers.setOpaque(false);
        ((DefaultTableCellRenderer) tblViewUsers.getDefaultRenderer(Object.class)).setOpaque(false);
        tblViewUsers.setShowGrid(false);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);

       
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.WHITE);
   //     headerRenderer.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        for (int i = 0; i < tblViewUsers.getModel().getColumnCount(); i++) {
            tblViewUsers.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
    }
/*    
       public void showPieChart(){
            pieDataset = new DefaultPieDataset();
            pieDataset.setValue("No.of Requests",ecosystem.getRequestCnt());
            pieDataset.setValue("No.of Donations",ecosystem.getDonationCnt());
//            pieDataset.setValue("No.of Requests",new Double(9.2));
//            pieDataset.setValue("No.of Donations",new Double(10.2));
            
            pieChart = ChartFactory.createPieChart("Donation chart", pieDataset, true, true, false);
            piePlot = (PiePlot) pieChart.getPlot();
            piePlot.setBackgroundPaint(new Color(255,255,255));
            piePlot.setSectionPaint("No.of Requests", new Color(255,204,0));
            piePlot.setSectionPaint("No.of Donations", new Color(0,204,153));
            chartPanel = new ChartPanel(pieChart);
            pieChartPanel.removeAll();
            pieChartPanel.add(chartPanel, BorderLayout.CENTER);
            chartPanel.validate();
        }
*/
    private void tblViewUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewUsersMousePressed
        // TODO add your handling code here:
        //tblUsers.setSelectionBackground(Color.BLUE );
        tblViewUsers.setSelectionForeground(Color.BLUE);

    }//GEN-LAST:event_tblViewUsersMousePressed

    private void tblViewUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewUsersMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblViewUsersMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(ecosystem.getDonorsCnt(), "Population", "Donors");
        dataset.setValue(ecosystem.getRequestorsCnt(), "Population", "Requestors");
        dataset.setValue(ecosystem.getVolunteersCnt(), "Population", "Volunteers");

        JFreeChart chart = ChartFactory.createBarChart("Population count", "roles", "Population", dataset, PlotOrientation.VERTICAL, false, true, false);
           CategoryPlot p = chart.getCategoryPlot();
           p.setRangeGridlinePaint(Color.black);
           ChartFrame f = new ChartFrame("Request Analysis",chart);
           f.setVisible(true);
           f.setSize(500,400);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblViewUsersTitle;
    private javax.swing.JLabel logoImg;
    private javax.swing.JTable tblViewUsers;
    // End of variables declaration//GEN-END:variables

    private void populateUserTable() {
        DefaultTableModel model = (DefaultTableModel) tblViewUsers.getModel();
        model.setRowCount(0);
        
            Object[] row = new Object[10];
            row[0] = ecosystem.getdistributionHubCnt();
            row[1] = ecosystem.getDropOffCnt();
            row[2] = ecosystem.getcoCnt();
            row[3] = ecosystem.getVolunteersCnt();
            row[4] = ecosystem.getDonorsCnt();
            row[5] = ecosystem.getRequestorsCnt();
            row[6] = ecosystem.getOrganisationsCnt();
            
            row[7] = ecosystem.getDonationCnt();
            row[8] = ecosystem.getRequestCnt();
            
            model.addRow(row);
        
    }

    private Object getRoles(String role) {
        String rl = "";
        
        if(role.equals("Business.Role.SystemAdminRole")){
             rl="System Admin";
        }else if(role.equals("Business.Role.FCAdminRole")){
            rl="FC Admin";
        }else if(role.equals("Business.Role.FCPManagerRole")){
            rl="FCP Manager";
        }else if(role.equals("Business.Role.NgoRole")){
            rl="NGO";
        }else if(role.equals("Business.Role.PersonalDonorRole")){
            rl="Donor";
        }else if(role.equals("Business.Role.PersonalRequestorRole")){
            rl="Requestor";
        }else if(role.equals("Business.Role.Volunteer")){
            rl="Volunteer";
        }
        
        return rl;
    }

}
