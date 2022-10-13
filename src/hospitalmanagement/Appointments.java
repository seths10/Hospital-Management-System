/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Seth Bithermann
 */
public class Appointments extends javax.swing.JFrame {

    public Appointments() {
        initComponents();
        GetPatient();
        AppCount();
        GetTreatment();
        DisplayAppointments();
    }

   
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TreatName = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentTable = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        PatName = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        AppDate = new com.toedter.calendar.JDateChooser();
        AppTime = new lu.tudor.santec.jtimechooser.JTimeChooser();
        ClearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(230, 455));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Appointments");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patients");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UCC Hospital");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\caduceus_26px.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\sick_24px.png")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dashboard");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\combo_chart_24px.png")); // NOI18N

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Prescription");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\hand_with_a_pill_30px.png")); // NOI18N

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Treatment");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\syringe_30px.png")); // NOI18N

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Logout");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\logout_rounded_up_24px.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(19, 19, 19)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)))
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16)))
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(818, 518));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Treatments List");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 102, 255));
        jLabel18.setText("Date");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 102, 255));
        jLabel19.setText("Time");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 102, 255));
        jLabel24.setText("Patient");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 102, 255));
        jLabel25.setText("Treatments");

        TreatName.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        TreatName.setForeground(new java.awt.Color(51, 102, 255));
        TreatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatNameActionPerformed(evt);
            }
        });

        AppointmentTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        AppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Treatments", "Time", "Date"
            }
        ));
        AppointmentTable.setRowHeight(30);
        AppointmentTable.setSelectionBackground(new java.awt.Color(51, 102, 255));
        AppointmentTable.setShowGrid(true);
        AppointmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppointmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AppointmentTable);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 102, 255));
        jLabel20.setText("Appointments");

        PatName.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        PatName.setForeground(new java.awt.Color(51, 102, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\close_window_24px.png")); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(51, 102, 255));
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(51, 102, 255));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(51, 102, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        AppTime.setForeground(new java.awt.Color(51, 102, 255));

        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(51, 102, 255));
        ClearBtn.setText("Clear");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(35, 35, 35)))
                        .addGap(18, 18, 18)
                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(AppDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(PatName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(TreatName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(AppTime, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel20)
                    .addContainerGap(813, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TreatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AppTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(AppDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn))
                .addGap(118, 118, 118)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel20)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void TreatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TreatNameActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        Clear();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if(PatName.getSelectedIndex() == -1 || TreatName.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "You have missed a field");
        }else
        {
              try{
//                 int PatKey = 1;
                AppCount();
                 Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
                 PreparedStatement add = Con.prepareStatement("insert into AppointmentTbl values (?,?,?,?,?)");
                 add.setInt(1, AppId);
                 add.setString(2, AppDate.getDate().toString());
                 add.setString(3, PatName.getSelectedItem().toString());
                 add.setString(4, String.valueOf(AppTime.getFormatedTime()));
                 add.setString(5, TreatName.getSelectedItem().toString());
                 
                 int row = add.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Appointment Added Successfully");
                 Con.close();
                 DisplayAppointments();
                 Clear();
              } catch (Exception Ex)
              {
                 Ex.printStackTrace();
              }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    int Key = 1000;
    private void AppointmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)AppointmentTable.getModel();
         int MyIndex = AppointmentTable.getSelectedRow();
         Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
         PatName.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
         TreatName.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_AppointmentTableMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(Key == 1000) {
            JOptionPane.showMessageDialog(this, "Select The Appointment");
        }else
        {
              try{
                 Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
                 String Query = "Update hospital.AppointmentTbl set APPDATE='" + AppDate.getDate().toString() +"'"+",PATIENT='" + PatName.getSelectedItem().toString() +"'"+ ",APPTIME='"+ AppTime.getFormatedTime() + "'" + ",TREATMENT='"+TreatName.getSelectedItem().toString()+ "'" + " where APPID=" + Key;
                 Statement Add = Con.createStatement();
                 Add.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this, "Appointment Updated Successfully");
                 DisplayAppointments();
                 Clear();
              } catch (Exception Ex)
              {
                 Ex.printStackTrace();
              }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
         if(Key == 1000) {
            JOptionPane.showMessageDialog(this, "Select The Appointment");
        }else
        {
              try{
                 Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
                 String Query = "Delete from hospital.AppointmentTbl where APPID="+Key;
                 Statement Add = Con.createStatement();
                 Add.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this, "Appointment Cancelled Successfully");
                 DisplayAppointments();
                 Clear();
              } catch (Exception Ex)
              {
                 Ex.printStackTrace();
              }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       new Treatments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new Prescription().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void Clear(){
        PatName.setSelectedIndex(0);
        TreatName.setSelectedIndex(0);
    }
    
    private void DisplayAppointments(){
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
            St = Con.createStatement();
            Rs = St.executeQuery("Select APPID as ID, APPDATE as DATE, PATIENT, APPTIME as TIME, TREATMENT as TREATMENT  from hospital.AppointmentTbl");
            AppointmentTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception Ex){
            Ex.printStackTrace();
        }
    }


    int AppId;
    private void AppCount(){
        try{
            Stl = Con.createStatement();
            Rsl = Stl.executeQuery("select Max(APPID) from hospital.AppointmentTbl");
            Rsl.next();
            AppId = Rsl.getInt(1)+1;
        } catch (Exception Ex){
            Ex.printStackTrace();
        }
    }    
   
    
    Connection Con = null;
    Statement St = null, Stl= null;
    ResultSet Rs = null, Rsl = null;
    
    private void GetPatient(){
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
            St = Con.createStatement();
            String query = "select * from hospital.PatientTbl";
            Rs = St.executeQuery(query);
            while(Rs.next()){
                String MyPat = Rs.getString("PatName");
                PatName.addItem(MyPat);
            }
        } catch (Exception Ex){
            Ex.printStackTrace();
        }
        
    }
    
    private void GetTreatment(){
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
            St = Con.createStatement();
            String query = "select * from hospital.TreatmentTbl";
            Rs = St.executeQuery(query);
            while(Rs.next()){
                String MyTreat = Rs.getString("TreatName");
                TreatName.addItem(MyTreat);
            }
        } catch (Exception Ex){
            Ex.printStackTrace();
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plSaveBtn
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AppDate;
    private lu.tudor.santec.jtimechooser.JTimeChooser AppTime;
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> PatName;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> TreatName;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
