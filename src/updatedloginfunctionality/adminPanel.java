/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package updatedloginfunctionality;

import com.formdev.flatlaf.FlatIntelliJLaf;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ikhmal Fakhri <u2000600@siswa.um.edu.my>
 */
public class adminPanel extends javax.swing.JFrame {

    Connection con = ConnectDatabase.connectdb();
    PreparedStatement ps = null;
    ResultSet rs = null;
//    String[] activities;
    
    public adminPanel() {
        initComponents();
        txtSpec2.setVisible(false);
        extraDetailsPanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        view = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();
        addBttn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSpec2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtSpec1 = new javax.swing.JComboBox<>();
        txtCredit = new javax.swing.JSpinner();
        txtMuet = new javax.swing.JSpinner();
        txtOcc = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        extraDetailsPanel = new javax.swing.JPanel();
        Date date = new Date();
        SpinnerDateModel sm1 = new SpinnerDateModel(date,null,null, Calendar.HOUR_OF_DAY);
        startSpin = new javax.swing.JSpinner(sm1);
        SpinnerDateModel sm2 = new SpinnerDateModel(date,null,null, Calendar.HOUR_OF_DAY);
        endSpin = new javax.swing.JSpinner(sm2);
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtLect = new javax.swing.JTextField();
        txtDay = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        updateBttn = new javax.swing.JButton();
        deleteBttn = new javax.swing.JButton();
        publishBttn = new javax.swing.JButton();
        labBox = new javax.swing.JCheckBox();
        tutoBox = new javax.swing.JCheckBox();
        lectBox = new javax.swing.JCheckBox();
        resetBttn = new javax.swing.JButton();

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setText("Which Department");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 2147483647));

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setText("Credit Hour (s)");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD MODULE COURSE INFORMATION");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText("Course Code");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setText("Select Activity");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        Exit.setText("Back");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        addBttn.setText("Add New");
        addBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel9.setText("MUET Requirement");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setText("Specialization");

        txtSpec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpec2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        txtSpec1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "COMPUTER SCIENCE", "INFORMATION TECHNOLOGY" }));
        txtSpec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpec1ActionPerformed(evt);
            }
        });

        txtCredit.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        txtMuet.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));

        txtOcc.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setText("No. of Occurrences");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Module Code", "credit", "activity", "occ", "muet", "degree", "dept.", "lecturer", "day", "start_time", "end_time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(startSpin, "HH:mm");
        startSpin.setEditor(de1);

        JSpinner.DateEditor de2 = new JSpinner.DateEditor(endSpin, "HH:mm");
        endSpin.setEditor(de2);

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel15.setText("End Time :");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel14.setText("Start Time :");

        txtLect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLectActionPerformed(evt);
            }
        });

        txtDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel13.setText("Day :");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setText("Lecturer :");

        updateBttn.setText("Update");
        updateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout extraDetailsPanelLayout = new javax.swing.GroupLayout(extraDetailsPanel);
        extraDetailsPanel.setLayout(extraDetailsPanelLayout);
        extraDetailsPanelLayout.setHorizontalGroup(
            extraDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extraDetailsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(extraDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(extraDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(txtLect, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(extraDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(extraDetailsPanelLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(124, 124, 124)
                            .addComponent(endSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(extraDetailsPanelLayout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(extraDetailsPanelLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(124, 124, 124)
                            .addComponent(startSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, extraDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(extraDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        extraDetailsPanelLayout.setVerticalGroup(
            extraDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extraDetailsPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(extraDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtLect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(extraDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(extraDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(extraDetailsPanelLayout.createSequentialGroup()
                        .addComponent(startSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(extraDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(endSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        deleteBttn.setText("Delete");
        deleteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBttnActionPerformed(evt);
            }
        });

        publishBttn.setText("Publish");
        publishBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishBttnActionPerformed(evt);
            }
        });

        labBox.setText("lab");
        labBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labBoxActionPerformed(evt);
            }
        });

        tutoBox.setText("tuto");
        tutoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutoBoxActionPerformed(evt);
            }
        });

        lectBox.setText("lect");

        resetBttn.setText("Reset");
        resetBttn.setToolTipText("");
        resetBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(view)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lectBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tutoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(labBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(txtOcc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel9)
                                .addGap(62, 62, 62)
                                .addComponent(txtMuet, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(txtSpec1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(txtSpec2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(374, 374, 374)
                                .addComponent(addBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(extraDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(publishBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(resetBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lectBox)
                        .addGap(10, 10, 10)
                        .addComponent(tutoBox)))
                .addComponent(labBox)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtOcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtMuet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtSpec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtSpec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel11)
                .addGap(10, 10, 10)
                .addComponent(addBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(extraDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publishBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        adminModules db = new adminModules();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        WelcomePageV2 wp2 = new WelcomePageV2();
        wp2.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_ExitActionPerformed

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed

        String coursecode = txtCode.getText().toUpperCase();
        String[] type = getActivity();
        int credit = (int) txtCredit.getValue();
        int muet = (int) txtMuet.getValue();
        int occ = (int) txtOcc.getValue();
        String spc1 = txtSpec1.getSelectedItem().toString();
        String spc2;
        int csit = -1;
        int stype = -1; //to check for errors
        if (spc1.equals("COMPUTER SCIENCE")) {
            csit = 1;
        } else if (spc1.equals("ALL")) {
            csit = 0;
        } else {
            csit = 2;
        }

//        if(spc2.equals("ALL")){
//            stype = 0;
        if (csit == 1 || csit == 2) {
            spc2 = txtSpec2.getSelectedItem().toString();
            if (spc2.equals("Artificial Intelligence")) {
                stype = 2;
            } else if (spc2.equals("Information Systems")) {
                stype = 3;
            } else if (spc2.equals("Computer System and Network")) {
                stype = 1;
            } else if (spc2.equals("Multimedia")) {
                stype = 6;
            } else if (spc2.equals("Data Science")) {
                stype = 5;
            } else if (spc2.equals("Software Engineering")) {
                stype = 4;
            }
        } else {
            stype = 0;
        }

        try {
            /* inserting directly to VALID_MODULES
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/userlogin", "app", "app");
    Statement st;
    st = con.createStatement();
    
    String strQuery3 = "SELECT COUNT(*) FROM app.valid_modules where module='" + coursecode + "'";
    ResultSet rs3 = st.executeQuery(strQuery3);
    rs3.next();
    String Countrow3 = rs3.getString(1);
    System.out.println(Countrow3);
    if (Countrow3.equals("0")) { *** !!!!
    int i = st.executeUpdate("INSERT INTO APP.VALID_MODULES(MODULE,ACTIVITY,CREDIT,MUET,CSIT,STUDENTTYPE,OCC)VALUES('" + coursecode + "','" + type + "',"+credit+","+muet+","+csit+","+stype+","+occ+")");
    JOptionPane.showMessageDialog(this, "Course Added");
    } else {
    JOptionPane.showMessageDialog(this, "Added course already exists!");
    }
    
    // }
    //}*/
            String strQuery3 = "SELECT COUNT(*) FROM new_modules where module_code='" + coursecode + "'";
            Statement st = con.createStatement();
            ResultSet rs3 = st.executeQuery(strQuery3);
            rs3.next();
            String Countrow3 = rs3.getString(1);
            System.out.println(Countrow3);
            if (Countrow3.equals("0")) {
                for (String activity : type) {
                    if (activity.equals(""))
                        continue;
                    int occCount = 1;
                    while (occCount <= occ) {
                    String q1 = "INSERT INTO app.new_modules (MODULE_CODE, CREDIT, ACTIVITY, OCC, MUET, CSIT, STUDENT_TYPE) VALUES ('" + coursecode + "', " + credit + ", '" + activity + "'," + occCount + "," + muet + "," + csit + "," + stype + ") ";
                    ps = con.prepareStatement(q1);
                    ps.executeUpdate();
                    occCount++;
                }
                
                }
            } else {
                JOptionPane.showMessageDialog(this, "Added course already exists!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed to Add Course" + credit + muet + csit + stype);
        }
        displayTable();
        extraDetailsPanel.setVisible(true);

    }//GEN-LAST:event_addBttnActionPerformed

    private void txtSpec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpec1ActionPerformed
        // TODO add your handling code here:
        if (txtSpec1.getSelectedItem().toString().equals("COMPUTER SCIENCE")) {
            txtSpec2.setVisible(true);
            txtSpec2.addItem("Artificial Intelligence");
            txtSpec2.addItem("Information Systems");
            txtSpec2.addItem("Software Engineering");
            txtSpec2.addItem("Computer System and Network");
            txtSpec2.addItem("Data Science");
            txtSpec2.removeItem("Multimedia");
        } else if (txtSpec1.getSelectedItem().toString().equals("INFORMATION TECHNOLOGY")) {
            txtSpec2.setVisible(true);
            txtSpec2.removeAllItems();
            txtSpec2.addItem("Multimedia");
        } else {
            txtSpec2.setVisible(false);
        }
    }//GEN-LAST:event_txtSpec1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            // TODO add your handling code here:
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

            String tblLect = tblModel.getValueAt(jTable1.getSelectedRow(), 7).toString();
            String tblDay = tblModel.getValueAt(jTable1.getSelectedRow(), 8).toString();
            String tblStart = tblModel.getValueAt(jTable1.getSelectedRow(), 9).toString();
            String tblEnd = tblModel.getValueAt(jTable1.getSelectedRow(), 10).toString();

            txtLect.setText(tblLect);
            txtDay.setSelectedItem(tblDay);
            startSpin.setValue(new SimpleDateFormat("HH:mm").parse(tblStart));
            endSpin.setValue(new SimpleDateFormat("HH:mm").parse(tblEnd));
        } catch (ParseException ex) {
            Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void updateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBttnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        if (jTable1.getSelectedRowCount() == 1) {

            try {
                String lect = txtLect.getText();
                String day = txtDay.getSelectedItem().toString();

                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                String time = sdf.format(new Date());

                String startT = sdf.format(startSpin.getValue());
                String endT = sdf.format(endSpin.getValue());

                System.out.println(endSpin.getValue().getClass());

                String tblModule = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String tblAct = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
                String tblOcc = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();

                String q1 = "UPDATE new_modules "
                + "SET lecturer = '" + lect + "', day = '" + day + "',start_time = '" + startT + "', end_time = '" + endT + "'"
                + "WHERE module_code = '"+tblModule+"' AND activity = '"+tblAct+"' AND occ = "+tblOcc;
                ps = con.prepareStatement(q1);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            displayTable();

        }
    }//GEN-LAST:event_updateBttnActionPerformed

    private void txtLectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLectActionPerformed

    private void deleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBttnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        if (jTable1.getSelectedRowCount() == 1) {

            try {
                
                String tblModule = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String tblAct = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
                String tblOcc = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();

                String q1 = "DELETE FROM new_modules "
                        + "WHERE module_code = '"+tblModule+"' AND activity = '"+tblAct+"' AND occ = "+tblOcc;
                ps = con.prepareStatement(q1);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        displayTable();
    }//GEN-LAST:event_deleteBttnActionPerformed

    private void publishBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publishBttnActionPerformed

    private void labBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labBoxActionPerformed

    private void tutoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutoBoxActionPerformed

    private void txtSpec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpec2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpec2ActionPerformed

    private void resetBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBttnActionPerformed
        try {
            // TODO add your handling code here:
            String q1 = "DELETE FROM new_modules WHERE 1=1";
            
            ps = con.prepareStatement(q1);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayTable();
        
    }//GEN-LAST:event_resetBttnActionPerformed

    private void displayTable() {
        try {
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.setRowCount(0);

            String q2 = "SELECT * FROM new_modules";
            ps = con.prepareStatement(q2);
            rs = ps.executeQuery();
            while (rs.next()) {
                String MODULES = rs.getString("MODULE_CODE");
                String CREDIT = rs.getString("CREDIT");
                String ACTIVITY = rs.getString("ACTIVITY");
                String OCC = Integer.toString(rs.getInt("OCC"));
                String MUET = Integer.toString(rs.getInt("MUET"));
                String CSIT = Integer.toString(rs.getInt("CSIT"));
                String STYPE = Integer.toString(rs.getInt("STUDENT_TYPE"));
                String LECT = "";
                String DAY = "";
                String START_TIME = "";
                String END_TIME = "";

                if (Objects.isNull(rs.getString("LECTURER"))) {
                    LECT = "null";
                } else {
                    LECT = rs.getString("LECTURER");
                }

                if (Objects.isNull(rs.getString("DAY"))) {
                    DAY = "null";
                } else {
                    DAY = rs.getString("DAY");
                }

                DateFormat df = new SimpleDateFormat("HH:mm");
                //if start_time & end_time is null
                if (Objects.isNull(rs.getTime("START_TIME"))) {

                    START_TIME = "00:00";
                    END_TIME = "00:00";

                } else {
                    START_TIME = df.format(rs.getTime("START_TIME"));
                    END_TIME = df.format(rs.getTime("END_TIME"));
                }

                String tbData[] = {MODULES, CREDIT, ACTIVITY, OCC, MUET, CSIT, STYPE, LECT, DAY, START_TIME, END_TIME};

                tblModel.addRow(tbData);
            }

        } catch (SQLException ex) {
            Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String[] getActivity(){
    
        String[] activities = new String [3];
        
        if (lectBox.isSelected() && !tutoBox.isSelected() && !labBox.isSelected()){
            activities[0] = "LECTURE";
            activities[1] = "";
            activities[2] = "";
            System.out.println("1 selected");

        }else if (tutoBox.isSelected() && !lectBox.isSelected() && !labBox.isSelected()){
            activities[0] = "TUTORIAL";
            activities[1] = "";
            activities[2] = "";
            System.out.println("1 selected");
            
        }else if (labBox.isSelected()&& !lectBox.isSelected() && !tutoBox.isSelected()){
            activities[0] = "LAB";
            activities[1] = "";
            activities[2] = "";
            System.out.println("1 selected");
        }else if (lectBox.isSelected() && tutoBox.isSelected() && !labBox.isSelected()){
            System.out.println("2 selected");
            activities[0] = "LECTURE";
            activities[1] = "TUTORIAL";
            activities[2] = "";
        }else if (lectBox.isSelected() && labBox.isSelected() && !tutoBox.isSelected()){
            System.out.println("2 selected");
            activities[0] = "LECTURE";
            activities[1] = "LAB";            
            activities[2] = "";

        }else if (tutoBox.isSelected() && labBox.isSelected() && !lectBox.isSelected()){
            System.out.println("2 selected");
            activities[0] = "TUTORIAL";
            activities[1] = "LAB";
            activities[2] = "";
        } else if (lectBox.isSelected() && tutoBox.isSelected() && labBox.isSelected()){
            System.out.println("allselected");
            activities[0] = "LECTURE";
            activities[1] = "TUTORIAL";
            activities[2] = "LAB";
        }else
            JOptionPane.showMessageDialog(this, "Please select activity");
        return activities;
    
    }
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton addBttn;
    private javax.swing.JButton deleteBttn;
    private javax.swing.JSpinner endSpin;
    private javax.swing.JPanel extraDetailsPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox labBox;
    private javax.swing.JCheckBox lectBox;
    private javax.swing.JButton publishBttn;
    private javax.swing.JButton resetBttn;
    private javax.swing.JSpinner startSpin;
    private javax.swing.JCheckBox tutoBox;
    private javax.swing.JTextField txtCode;
    private javax.swing.JSpinner txtCredit;
    private javax.swing.JComboBox<String> txtDay;
    private javax.swing.JTextField txtLect;
    private javax.swing.JSpinner txtMuet;
    private javax.swing.JSpinner txtOcc;
    private javax.swing.JComboBox<String> txtSpec1;
    private javax.swing.JComboBox<String> txtSpec2;
    private javax.swing.JButton updateBttn;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
