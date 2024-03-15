package demoswing2;

import static demoswing2.ElectricianPage.data;
import static demoswing2.PlumberPage.data;
import javax.swing.*;
import demoswing2.ServiceProviders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vp362
 */
public class AmbulancePage extends javax.swing.JFrame {
    String login_id,passwor_d;

    /**
     * Creates new form AmbulancePage
     */
    public AmbulancePage( String loginid ,String password) {
        this.login_id =loginid;
         this.passwor_d=password;
        initComponents();
    }
     String CustName, CustContactno, CustAddress;
    Connection con = Database.getconnection();

    String ss_FullName, serviceType, s_contact, s_emaill, s_addresssing, s_city, s_state, s_pincode, s_fee, c_Fullname, c_contact, c_addressing;
    
    static ServiceProviderData[] data = new ServiceProviderData[5];

    static {
        data[0] = new ServiceProviderData("Praveen", "Yadav", "0", "Male", "praveen362@gmail.com", "Ambulance", "9893548642", "Sch. no. 94 World Sqaure", "Indore", "Madhya Pradesh", "India", "452210", "Praveen@123");
        data[1] = new ServiceProviderData("Mohan", "Gupta", "0", "Male", "mohan362@gmail.com", "Ambulance", "6893547442", "25 ,Khandwa Naka ", "Sanawad", "Madhya Pradesh", "India", "452001", "Mohan@2611");

        data[2] = new ServiceProviderData("Kushgra", "Singh", "0", "Male", "Kushagra362@gmail.com", "Ambulance", "7828057894", "12 Nanda Nagar", "Khandwa", "Madhya Pradesh", "India", "452010", "Kushagra@123");

        data[3] = new ServiceProviderData("Sumit", "Sen", "0", "Male", "sumit362@gmail.com", "Ambulance", "6874591023", "1, Ram  Nagar", "Ujjain", "Madhya Pradesh", "India", "452010", "sumit@123");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButto1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jButto2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jButto3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jButto4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(724, 848));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("Emergency  Services  Booking Page (Free Service ) ");

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setForeground(new java.awt.Color(0, 51, 255));

        jButton8.setBackground(new java.awt.Color(51, 51, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoswing2/AmbuBg.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Driver Name :- ");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Praveen Yadav");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Contact no. :-");

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("9893548642");

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Address :-");

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Sch no. 94 ,World -Cup Square");

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("City :- ");

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Indore");

        jLabel10.setBackground(new java.awt.Color(0, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("State :-");

        jLabel11.setBackground(new java.awt.Color(0, 102, 102));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("Madhya Pradesh");

        jLabel22.setBackground(new java.awt.Color(0, 102, 102));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("Fee :-");

        jLabel23.setBackground(new java.awt.Color(0, 102, 102));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 51));
        jLabel23.setText("0.0 Rs ");

        jButto1.setBackground(new java.awt.Color(102, 204, 0));
        jButto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButto1.setForeground(new java.awt.Color(51, 51, 51));
        jButto1.setText("Book Now");
        jButto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel23)))
                                    .addComponent(jLabel22))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButto1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addComponent(jButto1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(51, 204, 255));

        jLabel56.setBackground(new java.awt.Color(0, 102, 102));
        jLabel56.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 51, 51));
        jLabel56.setText("Driver Name :- ");

        jLabel57.setBackground(new java.awt.Color(0, 102, 102));
        jLabel57.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 51, 51));
        jLabel57.setText("Mohan Gupta");

        jLabel58.setBackground(new java.awt.Color(0, 102, 102));
        jLabel58.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 51, 51));
        jLabel58.setText("Contact no. :-");

        jLabel59.setBackground(new java.awt.Color(0, 102, 102));
        jLabel59.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 51, 51));
        jLabel59.setText("6893547442");

        jLabel60.setBackground(new java.awt.Color(0, 102, 102));
        jLabel60.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 51, 51));
        jLabel60.setText("Address :-");

        jLabel61.setBackground(new java.awt.Color(0, 102, 102));
        jLabel61.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 51, 51));
        jLabel61.setText("25, Khandwa Naka");

        jLabel62.setBackground(new java.awt.Color(0, 102, 102));
        jLabel62.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 51, 51));
        jLabel62.setText("City :- ");

        jLabel63.setBackground(new java.awt.Color(0, 102, 102));
        jLabel63.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 51, 51));
        jLabel63.setText("Sanawad");

        jLabel64.setBackground(new java.awt.Color(0, 102, 102));
        jLabel64.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 51, 51));
        jLabel64.setText("State :-");

        jLabel65.setBackground(new java.awt.Color(0, 102, 102));
        jLabel65.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 51, 51));
        jLabel65.setText("Madhya Pradesh");

        jButton15.setBackground(new java.awt.Color(51, 51, 0));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoswing2/AmbuBg.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel66.setBackground(new java.awt.Color(0, 102, 102));
        jLabel66.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 51, 51));
        jLabel66.setText("Fee :-");

        jLabel67.setBackground(new java.awt.Color(0, 102, 102));
        jLabel67.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 51, 51));
        jLabel67.setText("0.0 Rs ");

        jButto2.setBackground(new java.awt.Color(102, 204, 0));
        jButto2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButto2.setForeground(new java.awt.Color(51, 51, 51));
        jButto2.setText("Book Now");
        jButto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButto2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel58))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel64))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel67)))
                            .addComponent(jLabel66))
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButto2)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addGap(48, 48, 48))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67))
                .addGap(18, 18, 18)
                .addComponent(jButto2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel24.setBackground(new java.awt.Color(0, 102, 102));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 51));
        jLabel24.setText("Driver Name :- ");

        jLabel25.setBackground(new java.awt.Color(0, 102, 102));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 51));
        jLabel25.setText("Kushagra Singh");

        jLabel26.setBackground(new java.awt.Color(0, 102, 102));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 51, 51));
        jLabel26.setText("Contact no. :-");

        jLabel27.setBackground(new java.awt.Color(0, 102, 102));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 51));
        jLabel27.setText("7828057894");

        jLabel28.setBackground(new java.awt.Color(0, 102, 102));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 51, 51));
        jLabel28.setText("Address :-");

        jLabel29.setBackground(new java.awt.Color(0, 102, 102));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 51));
        jLabel29.setText("12 ,Nanda Nagar");

        jLabel30.setBackground(new java.awt.Color(0, 102, 102));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 51, 51));
        jLabel30.setText("City :- ");

        jLabel31.setBackground(new java.awt.Color(0, 102, 102));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 51));
        jLabel31.setText("Khandwa");

        jLabel52.setBackground(new java.awt.Color(0, 102, 102));
        jLabel52.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 51, 51));
        jLabel52.setText("State :-");

        jLabel53.setBackground(new java.awt.Color(0, 102, 102));
        jLabel53.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 51, 51));
        jLabel53.setText("Madhya Pradesh");

        jButton12.setBackground(new java.awt.Color(51, 51, 0));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoswing2/AmbuBg.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel54.setBackground(new java.awt.Color(0, 102, 102));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 51, 51));
        jLabel54.setText("Fee :-");

        jLabel55.setBackground(new java.awt.Color(0, 102, 102));
        jLabel55.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 51, 51));
        jLabel55.setText("0.0 Rs ");

        jButto3.setBackground(new java.awt.Color(102, 204, 0));
        jButto3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButto3.setForeground(new java.awt.Color(51, 51, 51));
        jButto3.setText("Book Now");
        jButto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButto3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel52))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel55)))
                            .addComponent(jLabel54))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jButto3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addGap(35, 35, 35))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addGap(32, 32, 32)
                .addComponent(jButto3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 204, 204));

        jButton18.setBackground(new java.awt.Color(51, 51, 0));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoswing2/AmbuBg.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel68.setBackground(new java.awt.Color(0, 102, 102));
        jLabel68.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 51, 51));
        jLabel68.setText("Driver Name :- ");

        jLabel69.setBackground(new java.awt.Color(0, 102, 102));
        jLabel69.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 51, 51));
        jLabel69.setText("Sumit Sen");

        jLabel70.setBackground(new java.awt.Color(0, 102, 102));
        jLabel70.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 51, 51));
        jLabel70.setText("Contact no. :-");

        jLabel71.setBackground(new java.awt.Color(0, 102, 102));
        jLabel71.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 51, 51));
        jLabel71.setText("6874591023");

        jLabel72.setBackground(new java.awt.Color(0, 102, 102));
        jLabel72.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 51, 51));
        jLabel72.setText("Address :-");

        jLabel73.setBackground(new java.awt.Color(0, 102, 102));
        jLabel73.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 51, 51));
        jLabel73.setText("1 Ram Nagar");

        jLabel74.setBackground(new java.awt.Color(0, 102, 102));
        jLabel74.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 51, 51));
        jLabel74.setText("City :- ");

        jLabel75.setBackground(new java.awt.Color(0, 102, 102));
        jLabel75.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 51, 51));
        jLabel75.setText("Ujjain");

        jLabel76.setBackground(new java.awt.Color(0, 102, 102));
        jLabel76.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 51, 51));
        jLabel76.setText("State :-");

        jLabel77.setBackground(new java.awt.Color(0, 102, 102));
        jLabel77.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 51, 51));
        jLabel77.setText("Madhya Pradesh");

        jLabel78.setBackground(new java.awt.Color(0, 102, 102));
        jLabel78.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 51, 51));
        jLabel78.setText("Fee :-");

        jLabel79.setBackground(new java.awt.Color(0, 102, 102));
        jLabel79.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 51, 51));
        jLabel79.setText("0.0 Rs ");

        jButto4.setBackground(new java.awt.Color(102, 204, 0));
        jButto4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButto4.setForeground(new java.awt.Color(51, 51, 51));
        jButto4.setText("Book Now");
        jButto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButto4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel70))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel71)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel72)
                                            .addComponent(jLabel74)
                                            .addComponent(jLabel76))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel75)
                                            .addComponent(jLabel73)
                                            .addComponent(jLabel77)
                                            .addComponent(jLabel79)))
                                    .addComponent(jLabel78))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton18)
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButto4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71)
                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79))
                .addGap(38, 38, 38)
                .addComponent(jButto4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButto1ActionPerformed
        try {
            String query = "SELECT * FROM customer WHERE email =? and acc_Passowrd=? ";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, login_id);
            ps.setString(2, passwor_d);
            System.out.print("start");
            ResultSet rs = ps.executeQuery();
            boolean bs = false;

            if (rs.next()) {
                bs = true;
                String firstName = rs.getString("Fname");
                System.out.println(firstName);
                String lastName = rs.getString("Lname");
                System.out.println(lastName);
                String address = rs.getString("address");
                String city = rs.getString("city");
                String state = rs.getString("state");
                CustName = firstName + " " + lastName;
                CustContactno = rs.getString("contact_no");
                CustAddress = address + " " + city + " " + state;
            }
        } catch (Exception e) {
            System.out.print("Exception 1 :" + e.getMessage());

        }
        
        
        
       
        try {
            
              String query = "SELECT * FROM appointment WHERE email =? and c_fullname=?  and c_contact_no=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, data[0].E_mail());
            ps.setString(2, CustName);
            ps.setString(3, CustContactno);
        
            ResultSet rs = ps.executeQuery();
            boolean bs = false;

            if (rs.next()) {
                bs = true;
              JOptionPane.showMessageDialog(null,CustName +"  Appointment Already Booked ");
            }else {
                 ss_FullName = data[0].Fname() + " " + data[0].Lname();
        System.out.print(" name :" + ss_FullName);

        String Query = "Insert into appointment (s_fullname, serviceType, email, s_contact_no, s_address, city, state, pinCode, fee, c_fullname, c_contact_no, c_address) Values(?,?,?,?,?,?,?,?,?,?,?,?)";
      
             ps = con.prepareStatement(Query);
            System.out.print("Quary Executing   ");
            ps.setString(1, ss_FullName);
            ps.setString(2, data[0].Service_CAtagory());
            ps.setString(3, data[0].E_mail());
            ps.setString(4, data[0].Contact_no());
            ps.setString(5, data[0].Address());
            ps.setString(6, data[0].City());
            ps.setString(7, data[0].State());
            ps.setString(8, data[0].Pincode());
            ps.setString(9, data[0].fee());
            ps.setString(10, CustName);
            ps.setString(11, CustContactno);
            ps.setString(12, CustAddress);
            int result = ps.executeUpdate();
            System.out.print("excecuted  ");
            if (result > 0) {
                System.out.print("Done    ");
                JOptionPane.showMessageDialog(null, CustName + " !!!! Appointment Done !!! \n Name :" + ss_FullName + "\nService : " + data[0].Service_CAtagory()
                        + "\nContact No : " + data[0].Contact_no() + "\n Email Id : " + data[0].E_mail() + "\n Address : " + data[0].Address() + " , " + data[0].City()
                        + " , " + data[0].State() + "\nPincode : " + data[0].Pincode() + "\n Fees : " + data[0].fee());
            }
            }
        } catch (SQLException ex) {
            System.out.print("Error here :");
            Logger.getLogger(PlumberPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButto1ActionPerformed

    private void jButto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButto2ActionPerformed
           try {
            String query = "SELECT * FROM customer WHERE email =? and acc_Passowrd=? ";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, login_id);
            ps.setString(2, passwor_d);
            System.out.print("start");
            ResultSet rs = ps.executeQuery();
            boolean bs = false;

            if (rs.next()) {
                bs = true;
                String firstName = rs.getString("Fname");
                String lastName = rs.getString("Lname");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String state = rs.getString("state");
                CustName = firstName + " " + lastName;
                CustContactno = rs.getString("contact_no");
                CustAddress = address + " " + city + " " + state;
            }
        } catch (Exception e) {
            System.out.print("Exception 1 :" + e.getMessage());

        }
           
           

     
      
        try {
            
            String query = "SELECT * FROM appointment WHERE email =? and c_fullname=?  and c_contact_no=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, data[1].E_mail());
            ps.setString(2, CustName);
            ps.setString(3, CustContactno);
        
            ResultSet rs = ps.executeQuery();
            boolean bs = false;

            if (rs.next()) {
                bs = true;
              JOptionPane.showMessageDialog(null,CustName +"  Appointment Already Booked ");
            }else{
                  ss_FullName = data[1].Fname() + " " + data[1].Lname();
        System.out.print(" name :" + ss_FullName);

        String Query = "Insert into appointment (s_fullname, serviceType, email, s_contact_no, s_address, city, state, pinCode, fee, c_fullname, c_contact_no, c_address) Values(?,?,?,?,?,?,?,?,?,?,?,?)";
       
             ps = con.prepareStatement(Query);
            System.out.print("Quary Executing   ");
            ps.setString(1, ss_FullName);
            ps.setString(2, data[1].Service_CAtagory());
            ps.setString(3, data[1].E_mail());
            ps.setString(4, data[1].Contact_no());
            ps.setString(5, data[1].Address());
            ps.setString(6, data[1].City());
            ps.setString(7, data[1].State());
            ps.setString(8, data[1].Pincode());
            ps.setString(9, data[1].fee());
            ps.setString(10, CustName);
            ps.setString(11, CustContactno);
            ps.setString(12, CustAddress);
            int result = ps.executeUpdate();
            System.out.print("excecuted  ");
            if (result > 0) {
                System.out.print("Done    ");
                JOptionPane.showMessageDialog(null, CustName + " !!!! Appointment Done !!! \n Name :" + ss_FullName + "\nService : " + data[1].Service_CAtagory()
                        + "\nContact No : " + data[1].Contact_no() + "\n Email Id : " + data[1].E_mail() + "\n Address : " + data[1].Address() + " , " + data[1].City()
                        + " , " + data[1].State() + "\nPincode : " + data[1].Pincode() + "\n Fees : " + data[1].fee());
            }
            }
        } catch (SQLException ex) {
            System.out.print("Error here :");
            Logger.getLogger(PlumberPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButto2ActionPerformed

    private void jButto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButto3ActionPerformed
      try {
            String query = "SELECT * FROM customer WHERE email =? and acc_Passowrd=? ";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, login_id);
            ps.setString(2, passwor_d);
            System.out.print("start");
            ResultSet rs = ps.executeQuery();
            boolean bs = false;

            if (rs.next()) {
                bs = true;
                String firstName = rs.getString("Fname");
                String lastName = rs.getString("Lname");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String state = rs.getString("state");
                CustName = firstName + " " + lastName;
                CustContactno = rs.getString("contact_no");
                CustAddress = address + " " + city + " " + state;

                System.out.println(CustName);
                System.out.println(CustContactno);
                System.out.println(CustAddress);
            }
        } catch (Exception e) {
            System.out.print("Exception 1 :" + e.getMessage());

        }
      
      
      
      
        try {
            
             String query = "SELECT * FROM appointment WHERE email =? and c_fullname=?  and c_contact_no=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, data[1].E_mail());
            ps.setString(2, CustName);
            ps.setString(3, CustContactno);
        
            ResultSet rs = ps.executeQuery();
            boolean bs = false;

            if (rs.next()) {
                bs = true;
              JOptionPane.showMessageDialog(null,CustName +"  Appointment Already Booked ");
            }else{
                  ss_FullName = data[2].Fname() + " " + data[2].Lname();
        System.out.print(" name :" + ss_FullName);

        String Query = "Insert into appointment (s_fullname, serviceType, email, s_contact_no, s_address, city, state, pinCode, fee, c_fullname, c_contact_no, c_address) Values(?,?,?,?,?,?,?,?,?,?,?,?)";
     
             ps = con.prepareStatement(Query);
            System.out.print("Quary Executing   ");
            ps.setString(1, ss_FullName);
            ps.setString(2, data[2].Service_CAtagory());
            ps.setString(4, data[2].Contact_no());
            ps.setString(3, data[2].E_mail());
            ps.setString(5, data[2].Address());
            ps.setString(6, data[2].City());
            ps.setString(7, data[2].State());
            ps.setString(8, data[2].Pincode());
            ps.setString(9, data[2].fee());
            ps.setString(10, CustName);
            ps.setString(11, CustContactno);
            ps.setString(12, CustAddress);
            int result = ps.executeUpdate();
            System.out.print("excecuted  ");
            if (result > 0) {
                System.out.print("Done    ");
                JOptionPane.showMessageDialog(null, CustName+" !!!! Appointment Done !!! \n Name :" + ss_FullName + "\nService : " + data[2].Service_CAtagory()
                        + "\nContact No : " + data[2].Contact_no() + "\n Email Id : " + data[2].E_mail() + "\n Address : " + data[2].Address() + " , " + data[2].City()
                        + " , " + data[2].State() + "\nPincode : " + data[2].Pincode() + "\n Fees : " + data[2].fee());
            }
            }
        } catch (SQLException ex) {
            System.out.print("Error here :");
//            Logger.getLogger(PlumberPage.class.getName()).log(Level.SEVERE, null, ex);
} 
    }//GEN-LAST:event_jButto3ActionPerformed

    private void jButto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButto4ActionPerformed
       try {
            String query = "SELECT * FROM customer WHERE email =? and acc_Passowrd=? ";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, login_id);
            ps.setString(2, passwor_d);
            System.out.print("start");
            ResultSet rs = ps.executeQuery();
            boolean bs = false;

            if (rs.next()) {
                bs = true;
                String firstName = rs.getString("Fname");
                String lastName = rs.getString("Lname");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String state = rs.getString("state");
                CustName = firstName + " " + lastName;
                CustContactno = rs.getString("contact_no");
                CustAddress = address + " " + city + " " + state;

                System.out.println(CustName);
                System.out.println(CustContactno);
                System.out.println(CustAddress);
            }
        } catch (Exception e) {
            System.out.print("Exception 1 :" + e.getMessage());

        }
       
     
        try {
            
              String query = "SELECT * FROM appointment WHERE email =? and c_fullname=?  and c_contact_no=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, data[3].E_mail());
            ps.setString(2, CustName);
            ps.setString(3, CustContactno);
        
            ResultSet rs = ps.executeQuery();
            boolean bs = false;

            if (rs.next()) {
                bs = true;
              JOptionPane.showMessageDialog(null,CustName +"  Appointment Already Booked ");
            }else{
                 ss_FullName = data[3].Fname() + " " + data[3].Lname();
        System.out.print(" name :" + ss_FullName);

        String Query = "Insert into appointment (s_fullname, serviceType, email, s_contact_no, s_address, city, state, pinCode, fee, c_fullname, c_contact_no, c_address) Values(?,?,?,?,?,?,?,?,?,?,?,?)";
      
             ps = con.prepareStatement(Query);
            System.out.print("Quary Executing   ");
            ps.setString(1, ss_FullName);
            ps.setString(2, data[3].Service_CAtagory());
            ps.setString(4, data[3].Contact_no());
            ps.setString(3, data[3].E_mail());
            ps.setString(5, data[3].Address());
            ps.setString(6, data[3].City());
            ps.setString(7, data[3].State());
            ps.setString(8, data[3].Pincode());
            ps.setString(9, data[3].fee());
            ps.setString(10, CustName);
            ps.setString(11, CustContactno);
            ps.setString(12, CustAddress);
            int result = ps.executeUpdate();
            System.out.print("excecuted  ");
            if (result > 0) {
                System.out.print("Done    ");
                JOptionPane.showMessageDialog(null, CustName+" !!!! Appointment Done !!! \n Name :" + ss_FullName + "\nService : " + data[3].Service_CAtagory()
                        + "\nContact No : " + data[3].Contact_no() + "\n Email Id : " + data[3].E_mail() + "\n Address : " + data[3].Address() + " , " + data[3].City()
                        + " , " + data[3].State() + "\nPincode : " + data[3].Pincode() + "\n Fees : " + data[3].fee());
            }
            }
        } catch (SQLException ex) {
            System.out.print("Error here :");
//            Logger.getLogger(PlumberPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButto4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  throws Exception{
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AmbulancePage("rahul@gmail.com","rahul123").setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButto1;
    private javax.swing.JButton jButto2;
    private javax.swing.JButton jButto3;
    private javax.swing.JButton jButto4;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
