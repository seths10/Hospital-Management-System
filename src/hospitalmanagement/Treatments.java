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
public class Treatments extends javax.swing.JFrame {

    /**
     * Creates new form Treatments
     */
    public Treatments() {
        initComponents();
        DisplayTreatments();
        TreatCount();
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
        MedicineTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TreatmentTable = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        TNameTb = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        CostTb = new javax.swing.JTextField();
        ClearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(230, 455));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Treatments");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prescription");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UCC Hospital");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\caduceus_26px.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\hand_with_a_pill_30px.png")); // NOI18N

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
        jLabel12.setText("Appointments");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\health_checkup_24px.png")); // NOI18N

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Patients");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Seth Bithermann\\Desktop\\Hospital management\\sick_24px.png")); // NOI18N

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
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(30, 30, 30))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))))
                .addContainerGap(33, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel12)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(818, 518));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Treatments List");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 102, 255));
        jLabel18.setText("Name");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 102, 255));
        jLabel19.setText("Medicines");

        MedicineTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineTbActionPerformed(evt);
            }
        });

        TreatmentTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TreatmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Treatments", "Cost", "Medicines", "Quantity"
            }
        ));
        TreatmentTable.setRowHeight(30);
        TreatmentTable.setSelectionBackground(new java.awt.Color(51, 102, 255));
        TreatmentTable.setShowGrid(true);
        TreatmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TreatmentTable);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 102, 255));
        jLabel20.setText("Treatments");

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

        TNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNameTbActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 102, 255));
        jLabel27.setText("Cost");

        CostTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostTbActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(TNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(CostTb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedicineTb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(163, 163, 163))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel20)
                    .addContainerGap(843, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedicineTb, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CostTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn))
                .addGap(132, 132, 132)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel20)
                    .addContainerGap(535, Short.MAX_VALUE)))
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

    private void MedicineTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineTbActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void TNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNameTbActionPerformed

    private void CostTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostTbActionPerformed

    
    Connection Con = null;
    Statement St = null, Stl= null;
    ResultSet Rs = null, Rsl = null;
    
    
    private void Clear(){
        TNameTb.setText("");
        CostTb.setText("");
        MedicineTb.setText("");
        Key = 1000;
    }
    
     private void DisplayTreatments(){
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
            St = Con.createStatement();
            Rs = St.executeQuery("Select  TREATID as ID, TREATNAME as TREATMENT, TREATMED as MEDICINE, TREATCOSTONE as COST from hospital.TreatmentTbl");
            TreatmentTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception Ex){
            Ex.printStackTrace();
        }
    }
    
    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        Clear();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if(TNameTb.getText().isEmpty() || CostTb.getText().isEmpty() || MedicineTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have missed a field");
        }else
        {
              try{
//                 int PatKey = 1;
                TreatCount();
                 Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
                 PreparedStatement add = Con.prepareStatement("insert into TreatmentTbl values (?,?,?,?)");
                 add.setInt(1, TreatId);
                 add.setString(2, TNameTb.getText());
                 add.setInt(4, Integer.valueOf(CostTb.getText()));
                 add.setString(3, MedicineTb.getText());
                 int row = add.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Treatment Added Successfully");
                 Con.close();
                 DisplayTreatments();
                 Clear();
              } catch (Exception Ex)
              {
                 Ex.printStackTrace();
              }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    int Key = 1000;
    private void TreatmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentTableMouseClicked
         DefaultTableModel model = (DefaultTableModel)TreatmentTable.getModel();
         int MyIndex = TreatmentTable.getSelectedRow();
         Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
         TNameTb.setText(model.getValueAt(MyIndex, 1).toString());
         CostTb.setText(model.getValueAt(MyIndex, 3).toString());
         MedicineTb.setText(model.getValueAt(MyIndex, 2).toString());
    }//GEN-LAST:event_TreatmentTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(Key == 1000) {
            JOptionPane.showMessageDialog(this, "Select The Treatment");
        }else
        {
            try{
//                 int TreatKey = 1;
                 Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
                 String Query = "Delete from hospital.TreatmentTbl where TREATID="+Key;
                 Statement Add = Con.createStatement();
                 Add.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this, "Treatment Deleted Successfully");
                 DisplayTreatments();
                 Clear();
              } catch (Exception Ex)
              {
                 Ex.printStackTrace();
              }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
       if(Key == 1000) {
            JOptionPane.showMessageDialog(this, "Select The Treatment");
        }else
        {
              try{
                 Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalDatabase","hospital","admin");
                 String Query = "Update hospital.TreatmentTbl set TreatName='" + TNameTb.getText() +"'"+",TreatCostOne='" + CostTb.getText() +"'"+ ",TreatMed='"+ MedicineTb.getText()+"'" + " where TREATID=" + Key;
                 Statement Add = Con.createStatement();
                 Add.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this, "Treatment Updated Successfully");
                 DisplayTreatments();
                 Clear();
              } catch (Exception Ex)
              {
                 Ex.printStackTrace();
              }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new Appointments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Prescription().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

     int TreatId;
    private void TreatCount(){
        try{
            Stl = Con.createStatement();
            Rsl = Stl.executeQuery("select Max(TREATID) from hospital.TreatmentTbl");
            Rsl.next();
            TreatId = Rsl.getInt(1)+1;
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
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treatments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTextField CostTb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField MedicineTb;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField TNameTb;
    private javax.swing.JTable TreatmentTable;
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
    private javax.swing.JLabel jLabel27;
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
