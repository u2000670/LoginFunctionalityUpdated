/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package updatedloginfunctionality;

import java.awt.CardLayout;
import java.sql.*;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author T_T
 */
public class RegisterFormStudent extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    Connection con;
    PreparedStatement ps = null;
    ResultSet rs = null;
    CardLayout cardLayout;

    public RegisterFormStudent() {
        initComponents();
        emptyFieldLabel.setVisible(false);
        emptyFieldLabel1.setVisible(false);
        registerSuccessLabel.setVisible(false);
        registerSuccessLabel1.setVisible(false);
        duplicateMatrixLabel.setVisible(false);
        duplicateStaffIdLabel.setVisible(false);
        
        cardLayout = (CardLayout) (BgPanel.getLayout());
        setVisible(true);
        con = ConnectDatabase.connectdb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgPanel = new javax.swing.JPanel();
        UserTypeCard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        studentBttn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        staffBttn = new javax.swing.JButton();
        exit2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        StudentRegisterCard = new javax.swing.JPanel();
        registerPanel = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        passwordRegisterField = new javax.swing.JPasswordField();
        degreeLabel = new javax.swing.JLabel();
        matrixNoField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        specializationLabel = new javax.swing.JLabel();
        muetBandLabel = new javax.swing.JLabel();
        registerStudBttn = new javax.swing.JButton();
        degreeMenu = new javax.swing.JComboBox<>();
        specializationMenu = new javax.swing.JComboBox<>();
        muetBandMenu = new javax.swing.JComboBox<>();
        messagePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emptyFieldLabel = new javax.swing.JLabel();
        registerSuccessLabel = new javax.swing.JLabel();
        returnToLoginLabel = new javax.swing.JLabel();
        duplicateMatrixLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        returnToUserType = new javax.swing.JLabel();
        StaffRegisterCard = new javax.swing.JPanel();
        registerPanel2 = new javax.swing.JPanel();
        exit1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fullNameField1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        passwordRegisterField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        departmentLabel = new javax.swing.JLabel();
        registerStaffBttn = new javax.swing.JButton();
        departmentMenu = new javax.swing.JComboBox<>();
        staffIdField = new javax.swing.JTextField();
        messagePanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        emptyFieldLabel1 = new javax.swing.JLabel();
        registerSuccessLabel1 = new javax.swing.JLabel();
        duplicateStaffIdLabel = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        returnToUserType1 = new javax.swing.JLabel();
        returnToLoginLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1366, 1366));
        setMinimumSize(new java.awt.Dimension(392, 392));
        setUndecorated(true);

        BgPanel.setLayout(new java.awt.CardLayout());

        UserTypeCard.setBackground(new java.awt.Color(244, 247, 252));
        UserTypeCard.setPreferredSize(new java.awt.Dimension(1366, 783));

        jLabel4.setFont(new java.awt.Font("Readex Pro Medium", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(58, 83, 155));
        jLabel4.setText("Register as");

        studentBttn.setBackground(new java.awt.Color(58, 83, 155));
        studentBttn.setFont(new java.awt.Font("Readex Pro Medium", 0, 24)); // NOI18N
        studentBttn.setForeground(new java.awt.Color(255, 255, 255));
        studentBttn.setText("Student");
        studentBttn.setBorder(null);
        studentBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentBttn.setFocusPainted(false);
        studentBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentBttnMouseClicked(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(58, 83, 155));

        staffBttn.setBackground(new java.awt.Color(58, 83, 155));
        staffBttn.setFont(new java.awt.Font("Readex Pro Medium", 0, 24)); // NOI18N
        staffBttn.setForeground(new java.awt.Color(255, 255, 255));
        staffBttn.setText("Staff");
        staffBttn.setBorder(null);
        staffBttn.setBorderPainted(false);
        staffBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staffBttn.setFocusPainted(false);
        staffBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffBttnMouseClicked(evt);
            }
        });

        exit2.setBackground(new java.awt.Color(80, 101, 177));
        exit2.setFont(new java.awt.Font("Readex Pro Medium", 1, 14)); // NOI18N
        exit2.setForeground(new java.awt.Color(80, 101, 177));
        exit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit2.setText("X");
        exit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit2MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(96, 111, 137));
        jLabel14.setText("Choose your user type");

        javax.swing.GroupLayout UserTypeCardLayout = new javax.swing.GroupLayout(UserTypeCard);
        UserTypeCard.setLayout(UserTypeCardLayout);
        UserTypeCardLayout.setHorizontalGroup(
            UserTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserTypeCardLayout.createSequentialGroup()
                .addGroup(UserTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserTypeCardLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserTypeCardLayout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addGroup(UserTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(UserTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UserTypeCardLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UserTypeCardLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(staffBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UserTypeCardLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(studentBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 334, Short.MAX_VALUE)))
                .addContainerGap())
        );
        UserTypeCardLayout.setVerticalGroup(
            UserTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserTypeCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addGroup(UserTypeCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserTypeCardLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(358, 358, 358))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserTypeCardLayout.createSequentialGroup()
                        .addComponent(staffBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studentBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))))
        );

        BgPanel.add(UserTypeCard, "UserTypeCard");

        StudentRegisterCard.setPreferredSize(new java.awt.Dimension(1366, 783));
        StudentRegisterCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerPanel.setBackground(new java.awt.Color(58, 83, 155));
        registerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 247, 252), 2));
        registerPanel.setPreferredSize(new java.awt.Dimension(420, 540));

        exit.setBackground(new java.awt.Color(80, 101, 177));
        exit.setFont(new java.awt.Font("Readex Pro Medium", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(244, 247, 252));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(80, 101, 177));
        jLabel1.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 247, 252));
        jLabel1.setText("FULL NAME :");

        fullNameField.setBackground(new java.awt.Color(58, 83, 155));
        fullNameField.setFont(new java.awt.Font("Readex Pro Light", 0, 18)); // NOI18N
        fullNameField.setForeground(new java.awt.Color(244, 247, 252));
        fullNameField.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(244, 247, 252));

        jLabel2.setBackground(new java.awt.Color(80, 101, 177));
        jLabel2.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 247, 252));
        jLabel2.setText("PASSWORD :");

        jSeparator2.setForeground(new java.awt.Color(244, 247, 252));

        passwordRegisterField.setBackground(new java.awt.Color(58, 83, 155));
        passwordRegisterField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordRegisterField.setForeground(new java.awt.Color(244, 247, 252));
        passwordRegisterField.setBorder(null);

        degreeLabel.setBackground(new java.awt.Color(80, 101, 177));
        degreeLabel.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        degreeLabel.setForeground(new java.awt.Color(244, 247, 252));
        degreeLabel.setText("BACHELOR'S DEGREE :");
        degreeLabel.setToolTipText("");
        degreeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                degreeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                degreeLabelMouseExited(evt);
            }
        });

        matrixNoField.setBackground(new java.awt.Color(58, 83, 155));
        matrixNoField.setFont(new java.awt.Font("Readex Pro Light", 0, 18)); // NOI18N
        matrixNoField.setForeground(new java.awt.Color(244, 247, 252));
        matrixNoField.setBorder(null);

        jLabel3.setBackground(new java.awt.Color(80, 101, 177));
        jLabel3.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 247, 252));
        jLabel3.setText("MATRIX NO :");

        jSeparator4.setForeground(new java.awt.Color(244, 247, 252));

        specializationLabel.setBackground(new java.awt.Color(80, 101, 177));
        specializationLabel.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        specializationLabel.setForeground(new java.awt.Color(244, 247, 252));
        specializationLabel.setText("SPECIALIZATION :");
        specializationLabel.setToolTipText("");
        specializationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                specializationLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                specializationLabelMouseExited(evt);
            }
        });

        muetBandLabel.setBackground(new java.awt.Color(80, 101, 177));
        muetBandLabel.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        muetBandLabel.setForeground(new java.awt.Color(244, 247, 252));
        muetBandLabel.setText("MUET BAND :");
        muetBandLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                muetBandLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                muetBandLabelMouseExited(evt);
            }
        });

        registerStudBttn.setBackground(new java.awt.Color(80, 101, 177));
        registerStudBttn.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        registerStudBttn.setForeground(new java.awt.Color(244, 247, 252));
        registerStudBttn.setText("REGISTER");
        registerStudBttn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 247, 252)));
        registerStudBttn.setContentAreaFilled(false);
        registerStudBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerStudBttn.setFocusPainted(false);
        registerStudBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerStudBttnMouseClicked(evt);
            }
        });

        degreeMenu.setBackground(new java.awt.Color(244, 247, 252));
        degreeMenu.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        degreeMenu.setForeground(new java.awt.Color(58, 83, 155));
        degreeMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        degreeMenu.setBorder(null);
        degreeMenu.setName("box"); // NOI18N

        specializationMenu.setBackground(new java.awt.Color(244, 247, 252));
        specializationMenu.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        specializationMenu.setForeground(new java.awt.Color(58, 83, 155));
        specializationMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        specializationMenu.setBorder(null);
        specializationMenu.setName("box"); // NOI18N

        muetBandMenu.setBackground(new java.awt.Color(244, 247, 252));
        muetBandMenu.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        muetBandMenu.setForeground(new java.awt.Color(58, 83, 155));
        muetBandMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        muetBandMenu.setBorder(null);
        muetBandMenu.setName("box"); // NOI18N

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(muetBandLabel)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(specializationLabel)
                                    .addComponent(jLabel1)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator4)
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordRegisterField)
                                            .addComponent(matrixNoField)
                                            .addGroup(registerPanelLayout.createSequentialGroup()
                                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(degreeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(specializationMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(degreeLabel)))
                            .addComponent(registerStudBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(muetBandMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(matrixNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(passwordRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(degreeLabel)
                .addGap(18, 18, 18)
                .addComponent(degreeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(specializationLabel)
                .addGap(18, 18, 18)
                .addComponent(specializationMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(muetBandLabel)
                .addGap(18, 18, 18)
                .addComponent(muetBandMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(registerStudBttn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StudentRegisterCard.add(registerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 690, 783));

        messagePanel.setBackground(new java.awt.Color(244, 247, 252));
        messagePanel.setPreferredSize(new java.awt.Dimension(420, 540));

        jLabel5.setBackground(new java.awt.Color(96, 111, 137));
        jLabel5.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(96, 111, 137));
        jLabel5.setText("for more information");

        jLabel6.setBackground(new java.awt.Color(80, 101, 177));
        jLabel6.setFont(new java.awt.Font("Readex Pro Medium", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(58, 83, 155));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText(" Register Your Details");

        jLabel7.setBackground(new java.awt.Color(96, 111, 137));
        jLabel7.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(96, 111, 137));
        jLabel7.setText("Tip: Some labels can be hovered over");

        emptyFieldLabel.setBackground(new java.awt.Color(96, 111, 137));
        emptyFieldLabel.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        emptyFieldLabel.setForeground(new java.awt.Color(145, 38, 67));
        emptyFieldLabel.setText("All fields must be filled for registration");

        registerSuccessLabel.setBackground(new java.awt.Color(96, 111, 137));
        registerSuccessLabel.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        registerSuccessLabel.setForeground(new java.awt.Color(58, 83, 155));
        registerSuccessLabel.setText("You've successfully registered!");

        returnToLoginLabel.setBackground(new java.awt.Color(96, 111, 137));
        returnToLoginLabel.setFont(new java.awt.Font("Readex Pro Medium", 2, 14)); // NOI18N
        returnToLoginLabel.setForeground(new java.awt.Color(96, 111, 137));
        returnToLoginLabel.setText("<-- Login Page");
        returnToLoginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnToLoginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnToLoginLabelMouseClicked(evt);
            }
        });

        duplicateMatrixLabel.setBackground(new java.awt.Color(96, 111, 137));
        duplicateMatrixLabel.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        duplicateMatrixLabel.setForeground(new java.awt.Color(145, 38, 67));
        duplicateMatrixLabel.setText("The entered matrix no. has already been registered");

        jSeparator3.setForeground(new java.awt.Color(58, 83, 155));

        returnToUserType.setBackground(new java.awt.Color(96, 111, 137));
        returnToUserType.setFont(new java.awt.Font("Readex Pro Medium", 2, 14)); // NOI18N
        returnToUserType.setForeground(new java.awt.Color(96, 111, 137));
        returnToUserType.setText("<-- Choose User Type");
        returnToUserType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnToUserType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnToUserTypeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout messagePanelLayout = new javax.swing.GroupLayout(messagePanel);
        messagePanel.setLayout(messagePanelLayout);
        messagePanelLayout.setHorizontalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(messagePanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(messagePanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5))
                            .addComponent(jLabel7)
                            .addComponent(registerSuccessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duplicateMatrixLabel)
                            .addComponent(emptyFieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(messagePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(messagePanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnToUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnToLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        messagePanelLayout.setVerticalGroup(
            messagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(121, 121, 121)
                .addComponent(emptyFieldLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duplicateMatrixLabel)
                .addGap(18, 18, 18)
                .addComponent(registerSuccessLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(returnToUserType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnToLoginLabel)
                .addGap(49, 49, 49))
        );

        StudentRegisterCard.add(messagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 683, 783));

        BgPanel.add(StudentRegisterCard, "StudentRegisterCard");

        StaffRegisterCard.setPreferredSize(new java.awt.Dimension(1366, 783));
        StaffRegisterCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerPanel2.setBackground(new java.awt.Color(58, 83, 155));
        registerPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 247, 252), 2));
        registerPanel2.setPreferredSize(new java.awt.Dimension(420, 540));

        exit1.setBackground(new java.awt.Color(80, 101, 177));
        exit1.setFont(new java.awt.Font("Readex Pro Medium", 1, 14)); // NOI18N
        exit1.setForeground(new java.awt.Color(244, 247, 252));
        exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit1.setText("X");
        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(80, 101, 177));
        jLabel8.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(244, 247, 252));
        jLabel8.setText("FULL NAME :");

        fullNameField1.setBackground(new java.awt.Color(58, 83, 155));
        fullNameField1.setFont(new java.awt.Font("Readex Pro Light", 0, 18)); // NOI18N
        fullNameField1.setForeground(new java.awt.Color(244, 247, 252));
        fullNameField1.setBorder(null);

        jSeparator6.setForeground(new java.awt.Color(244, 247, 252));

        jLabel9.setBackground(new java.awt.Color(80, 101, 177));
        jLabel9.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(244, 247, 252));
        jLabel9.setText("PASSWORD :");

        jSeparator7.setForeground(new java.awt.Color(244, 247, 252));

        passwordRegisterField1.setBackground(new java.awt.Color(58, 83, 155));
        passwordRegisterField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordRegisterField1.setForeground(new java.awt.Color(244, 247, 252));
        passwordRegisterField1.setBorder(null);

        jLabel10.setBackground(new java.awt.Color(80, 101, 177));
        jLabel10.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(244, 247, 252));
        jLabel10.setText("STAFF ID :");

        jSeparator8.setForeground(new java.awt.Color(244, 247, 252));

        departmentLabel.setBackground(new java.awt.Color(80, 101, 177));
        departmentLabel.setFont(new java.awt.Font("Readex Pro Medium", 0, 18)); // NOI18N
        departmentLabel.setForeground(new java.awt.Color(244, 247, 252));
        departmentLabel.setText("DEPARTMENT :");
        departmentLabel.setToolTipText("");
        departmentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                departmentLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                departmentLabelMouseExited(evt);
            }
        });

        registerStaffBttn.setBackground(new java.awt.Color(80, 101, 177));
        registerStaffBttn.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        registerStaffBttn.setForeground(new java.awt.Color(244, 247, 252));
        registerStaffBttn.setText("REGISTER");
        registerStaffBttn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 247, 252)));
        registerStaffBttn.setContentAreaFilled(false);
        registerStaffBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerStaffBttn.setFocusPainted(false);
        registerStaffBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerStaffBttnMouseClicked(evt);
            }
        });

        departmentMenu.setBackground(new java.awt.Color(244, 247, 252));
        departmentMenu.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        departmentMenu.setForeground(new java.awt.Color(58, 83, 155));
        departmentMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        departmentMenu.setBorder(null);
        departmentMenu.setName("box"); // NOI18N

        staffIdField.setBackground(new java.awt.Color(58, 83, 155));
        staffIdField.setFont(new java.awt.Font("Readex Pro Light", 0, 18)); // NOI18N
        staffIdField.setForeground(new java.awt.Color(244, 247, 252));
        staffIdField.setBorder(null);

        javax.swing.GroupLayout registerPanel2Layout = new javax.swing.GroupLayout(registerPanel2);
        registerPanel2.setLayout(registerPanel2Layout);
        registerPanel2Layout.setHorizontalGroup(
            registerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(registerPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(registerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerStaffBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(departmentLabel)
                        .addGroup(registerPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(departmentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(registerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator8)
                            .addGroup(registerPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(registerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordRegisterField1)
                                    .addGroup(registerPanel2Layout.createSequentialGroup()
                                        .addComponent(fullNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(staffIdField))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        registerPanel2Layout.setVerticalGroup(
            registerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit1)
                .addGap(160, 160, 160)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(fullNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(staffIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addComponent(passwordRegisterField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(departmentLabel)
                .addGap(18, 18, 18)
                .addComponent(departmentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerStaffBttn)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        StaffRegisterCard.add(registerPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 690, 783));

        messagePanel2.setBackground(new java.awt.Color(244, 247, 252));
        messagePanel2.setPreferredSize(new java.awt.Dimension(420, 540));

        jLabel11.setBackground(new java.awt.Color(96, 111, 137));
        jLabel11.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(96, 111, 137));
        jLabel11.setText("for more information");

        jLabel12.setBackground(new java.awt.Color(80, 101, 177));
        jLabel12.setFont(new java.awt.Font("Readex Pro Medium", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 83, 155));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText(" Register Your Details");

        jLabel13.setBackground(new java.awt.Color(96, 111, 137));
        jLabel13.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 111, 137));
        jLabel13.setText("Tip: Some labels can be hovered over");

        emptyFieldLabel1.setBackground(new java.awt.Color(96, 111, 137));
        emptyFieldLabel1.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        emptyFieldLabel1.setForeground(new java.awt.Color(145, 38, 67));
        emptyFieldLabel1.setText("All fields must be filled for registration");

        registerSuccessLabel1.setBackground(new java.awt.Color(96, 111, 137));
        registerSuccessLabel1.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        registerSuccessLabel1.setForeground(new java.awt.Color(58, 83, 155));
        registerSuccessLabel1.setText("You've successfully registered!");

        duplicateStaffIdLabel.setBackground(new java.awt.Color(96, 111, 137));
        duplicateStaffIdLabel.setFont(new java.awt.Font("Readex Pro Medium", 0, 14)); // NOI18N
        duplicateStaffIdLabel.setForeground(new java.awt.Color(145, 38, 67));
        duplicateStaffIdLabel.setText("The entered staff id has already been registered");

        jSeparator9.setForeground(new java.awt.Color(58, 83, 155));

        returnToUserType1.setBackground(new java.awt.Color(96, 111, 137));
        returnToUserType1.setFont(new java.awt.Font("Readex Pro Medium", 2, 14)); // NOI18N
        returnToUserType1.setForeground(new java.awt.Color(96, 111, 137));
        returnToUserType1.setText("<-- Choose User Type");
        returnToUserType1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnToUserType1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnToUserType1MouseClicked(evt);
            }
        });

        returnToLoginLabel1.setBackground(new java.awt.Color(96, 111, 137));
        returnToLoginLabel1.setFont(new java.awt.Font("Readex Pro Medium", 2, 14)); // NOI18N
        returnToLoginLabel1.setForeground(new java.awt.Color(96, 111, 137));
        returnToLoginLabel1.setText("<-- Login Page");
        returnToLoginLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnToLoginLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnToLoginLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout messagePanel2Layout = new javax.swing.GroupLayout(messagePanel2);
        messagePanel2.setLayout(messagePanel2Layout);
        messagePanel2Layout.setHorizontalGroup(
            messagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanel2Layout.createSequentialGroup()
                .addGroup(messagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(messagePanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(messagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(messagePanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel11))
                            .addComponent(jLabel13)
                            .addComponent(registerSuccessLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duplicateStaffIdLabel)
                            .addComponent(emptyFieldLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnToUserType1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnToLoginLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(messagePanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(messagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        messagePanel2Layout.setVerticalGroup(
            messagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagePanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(121, 121, 121)
                .addComponent(emptyFieldLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duplicateStaffIdLabel)
                .addGap(18, 18, 18)
                .addComponent(registerSuccessLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addComponent(returnToUserType1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnToLoginLabel1)
                .addGap(45, 45, 45))
        );

        StaffRegisterCard.add(messagePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 683, 783));

        BgPanel.add(StaffRegisterCard, "StaffRegisterCard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void degreeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degreeLabelMouseEntered
        // TODO add your handling code here:
        degreeLabel.setForeground(new java.awt.Color(228, 88, 98));
        degreeLabel.setToolTipText("<html>"
                + "Select the number :"
                + "<br> '1' for Computer Science </br>"
                + "<br> '2' for Information Technology </br>"
                + "</html>");
        UIManager.put("ToolTip.font", new Font("Readex Pro Light", 0, 11));
    }//GEN-LAST:event_degreeLabelMouseEntered

    private void degreeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degreeLabelMouseExited
        // TODO add your handling code here:
        degreeLabel.setForeground(new java.awt.Color(244, 247, 252));
    }//GEN-LAST:event_degreeLabelMouseExited

    private void specializationLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specializationLabelMouseEntered
        // TODO add your handling code here:
        specializationLabel.setForeground(new java.awt.Color(228, 88, 98));

        specializationLabel.setToolTipText("<html>"
                + "Select the number :"
                + "<br> '1' for Computer Systems and Network </br>"
                + "<br> '2' for Artificial Intelligence </br>"
                + "<br> '3' for Information Systems </br>"
                + "<br> '4' for Software Engineering </br>"
                + "<br> '5' for Multimedia </br>"
                + "<br> '6' for Data Science </br>"
                + "</html>");
        UIManager.put("ToolTip.font", new Font("Readex Pro Light", 0, 11));
    }//GEN-LAST:event_specializationLabelMouseEntered

    private void specializationLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specializationLabelMouseExited
        // TODO add your handling code here:
        specializationLabel.setForeground(new java.awt.Color(244, 247, 252));
    }//GEN-LAST:event_specializationLabelMouseExited

    private void registerStudBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerStudBttnMouseClicked

        try {
            //check if entered matrix no. is already registered or not
            // it's not placed in the else if block cuz i want to pass it in the else if condition
            String q1 = "SELECT matrix_number FROM logintable where matrix_number = '" + matrixNoField.getText().toLowerCase() + "'";
            ps = con.prepareStatement(q1);
            rs = ps.executeQuery();
            
            //checking if any of the fields are empty
            if (fullNameField.getText().trim().length() == 0
                    || String.valueOf(passwordRegisterField.getPassword()).trim().length() == 0
                    || matrixNoField.getText().trim().length() == 0) {

                emptyFieldLabel.setVisible(true);
            
            //see if there are any rows (duplicate matrix no.) in rs
            } else if (rs.next()) {
                duplicateMatrixLabel.setVisible(true);

            } else {

                String q2 = "INSERT INTO logintable values(?,?,?,?,?,?)";

                String fullName = fullNameField.getText();
                String password = String.valueOf(passwordRegisterField.getPassword());
                String matrixNo = matrixNoField.getText();
                int degree = Integer.parseInt(degreeMenu.getSelectedItem().toString()); //converting Object -> String -> int
                int special = Integer.parseInt(specializationMenu.getSelectedItem().toString());
                int muetBand = Integer.parseInt(muetBandMenu.getSelectedItem().toString());

                ps = con.prepareStatement(q2);
                ps.setString(1, matrixNo);
                ps.setString(2, password);
                ps.setInt(3, special);
                ps.setInt(4, muetBand);
                ps.setString(5, fullName);
                ps.setInt(6, degree);
                ps.executeUpdate();

                emptyFieldLabel.setVisible(false);
                duplicateMatrixLabel.setVisible(false);
                registerSuccessLabel.setVisible(true);

            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFormStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerStudBttnMouseClicked

    private void returnToLoginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToLoginLabelMouseClicked
        // TODO add your handling code here:

        LoginForm1 lf = new LoginForm1();
        lf.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnToLoginLabelMouseClicked

    private void muetBandLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muetBandLabelMouseEntered
        // TODO add your handling code here:
        muetBandLabel.setForeground(new java.awt.Color(228, 88, 98));

        muetBandLabel.setToolTipText("<html>"
                + "Select the band of 1 - 6"
                + "<br> 1 = lowest </br>"
                + "<br> 6 = highest </br>"
                + "</html>");
        UIManager.put("ToolTip.font", new Font("Readex Pro Light", 0, 11));
    }//GEN-LAST:event_muetBandLabelMouseEntered

    private void muetBandLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muetBandLabelMouseExited
        // TODO add your handling code here:
        muetBandLabel.setForeground(new java.awt.Color(244, 247, 252));
    }//GEN-LAST:event_muetBandLabelMouseExited

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        // TODO add your handling code here:
        exitMouseClicked(evt);
    }//GEN-LAST:event_exit1MouseClicked

    private void departmentLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentLabelMouseEntered
        // TODO add your handling code here:
        departmentLabel.setForeground(new java.awt.Color(228, 88, 98));

        departmentLabel.setToolTipText("<html>"
                + "Select the number :"
                + "<br> '1' for Computer Systems and Network </br>"
                + "<br> '2' for Artificial Intelligence </br>"
                + "<br> '3' for Information Systems </br>"
                + "<br> '4' for Software Engineering </br>"
                + "<br> '5' for Multimedia </br>"
                + "<br> '6' for Data Science </br>"
                + "</html>");
        UIManager.put("ToolTip.font", new Font("Readex Pro Light", 0, 11));
    }//GEN-LAST:event_departmentLabelMouseEntered

    private void departmentLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentLabelMouseExited
        // TODO add your handling code here:
        departmentLabel.setForeground(new java.awt.Color(244, 247, 252));
        
    }//GEN-LAST:event_departmentLabelMouseExited

    private void registerStaffBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerStaffBttnMouseClicked
        try {
            // TODO add your handling code here:
            String q1 = "SELECT staff_id FROM stafflogin where staff_id = '" + staffIdField.getText().toLowerCase() + "'";
            ps = con.prepareStatement(q1);
            rs = ps.executeQuery();
            
            if (fullNameField1.getText().trim().length() == 0
                    || String.valueOf(passwordRegisterField1.getPassword()).trim().length() == 0
                    || staffIdField.getText().trim().length() == 0){
                emptyFieldLabel1.setVisible(true);
            
            } else if (rs.next()){
                duplicateStaffIdLabel.setVisible(true);
                
            } else {
            
                String q2 = "INSERT INTO stafflogin values (?, ?, ?, ?)";

                String fullNameStaff = fullNameField1.getText();
                String passwordStaff = String.valueOf(passwordRegisterField1.getPassword());
                String staffId = staffIdField.getText();
                int department = Integer.parseInt(departmentMenu.getSelectedItem().toString());

                ps = con.prepareStatement(q2);
                ps.setString(1, staffId);
                ps.setString(2, fullNameStaff);
                ps.setString(3, passwordStaff);
                ps.setInt(4, department);
                ps.executeUpdate();

                emptyFieldLabel1.setVisible(false);
                duplicateStaffIdLabel.setVisible(false);
                registerSuccessLabel1.setVisible(true);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFormStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_registerStaffBttnMouseClicked

    private void exit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit2MouseClicked
        // TODO add your handling code here:
        exitMouseClicked(evt);
    }//GEN-LAST:event_exit2MouseClicked

    private void returnToUserTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToUserTypeMouseClicked
        // TODO add your handling code here:
        cardLayout.show(BgPanel, "UserTypeCard");
    }//GEN-LAST:event_returnToUserTypeMouseClicked

    private void returnToUserType1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToUserType1MouseClicked
        // TODO add your handling code here:
        returnToUserTypeMouseClicked(evt);
    }//GEN-LAST:event_returnToUserType1MouseClicked

    private void returnToLoginLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToLoginLabel1MouseClicked
        // TODO add your handling code here:
        returnToLoginLabelMouseClicked(evt);
    }//GEN-LAST:event_returnToLoginLabel1MouseClicked

    private void studentBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentBttnMouseClicked
        // TODO add your handling code here:
        cardLayout.show(BgPanel, "StudentRegisterCard");
    }//GEN-LAST:event_studentBttnMouseClicked

    private void staffBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffBttnMouseClicked
        // TODO add your handling code here:
        cardLayout.show(BgPanel, "StaffRegisterCard");
    }//GEN-LAST:event_staffBttnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterFormStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFormStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFormStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFormStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFormStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JPanel StaffRegisterCard;
    private javax.swing.JPanel StudentRegisterCard;
    private javax.swing.JPanel UserTypeCard;
    private javax.swing.JLabel degreeLabel;
    private javax.swing.JComboBox<String> degreeMenu;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JComboBox<String> departmentMenu;
    private javax.swing.JLabel duplicateMatrixLabel;
    private javax.swing.JLabel duplicateStaffIdLabel;
    private javax.swing.JLabel emptyFieldLabel;
    private javax.swing.JLabel emptyFieldLabel1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel exit2;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JTextField fullNameField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField matrixNoField;
    private javax.swing.JPanel messagePanel;
    private javax.swing.JPanel messagePanel2;
    private javax.swing.JLabel muetBandLabel;
    private javax.swing.JComboBox<String> muetBandMenu;
    private javax.swing.JPasswordField passwordRegisterField;
    private javax.swing.JPasswordField passwordRegisterField1;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPanel registerPanel2;
    private javax.swing.JButton registerStaffBttn;
    private javax.swing.JButton registerStudBttn;
    private javax.swing.JLabel registerSuccessLabel;
    private javax.swing.JLabel registerSuccessLabel1;
    private javax.swing.JLabel returnToLoginLabel;
    private javax.swing.JLabel returnToLoginLabel1;
    private javax.swing.JLabel returnToUserType;
    private javax.swing.JLabel returnToUserType1;
    private javax.swing.JLabel specializationLabel;
    private javax.swing.JComboBox<String> specializationMenu;
    private javax.swing.JButton staffBttn;
    private javax.swing.JTextField staffIdField;
    private javax.swing.JButton studentBttn;
    // End of variables declaration//GEN-END:variables
}
