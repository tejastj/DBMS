
//import static addScoreForm.jTable;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tejas T J
 */
public class editDeleteScore extends javax.swing.JFrame {
    score sc = new score();
    public editDeleteScore() {
        initComponents();
        sc.fillScoreJtable(jTable);
        
        jTable.setRowHeight(40);
        jTable.setGridColor(Color.YELLOW);  
        jTable.setSelectionBackground(Color.BLACK);
        jTable.setShowGrid(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRemoveScore = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_StudentId = new javax.swing.JTextField();
        jButtonAddScore = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jTextField_Score = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Description = new javax.swing.JTextField();
        jTextField_CourseId = new javax.swing.JTextField();
        jButtonEditScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit/Delete Score");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("CourseId :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Score :");

        jButtonRemoveScore.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRemoveScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRemoveScore.setText("Remove");
        jButtonRemoveScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveScoreActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Student Id :");

        jTextField_StudentId.setEditable(false);
        jTextField_StudentId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_StudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StudentIdActionPerformed(evt);
            }
        });

        jButtonAddScore.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAddScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAddScore.setText("Add");
        jButtonAddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddScoreActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Course Id", "Score", "Description             "
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        jTextField_Score.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ScoreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Description :");

        jTextField_Description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DescriptionActionPerformed(evt);
            }
        });

        jTextField_CourseId.setEditable(false);
        jTextField_CourseId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_CourseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CourseIdActionPerformed(evt);
            }
        });

        jButtonEditScore.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEditScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEditScore.setText("Edit");
        jButtonEditScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jButtonRemoveScore))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_StudentId, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(jTextField_Score, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(jTextField_Description, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(jTextField_CourseId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonEditScore, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jButtonAddScore, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_StudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_CourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRemoveScore)
                            .addComponent(jButtonAddScore)
                            .addComponent(jButtonEditScore)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoveScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveScoreActionPerformed
        int Sid = Integer.valueOf(jTextField_StudentId.getText());
        int Cid = Integer.valueOf(jTextField_CourseId.getText());
        
        sc.insertUpdateDeleteStudent('d', Sid, Cid, 0, null);
        jTable.setModel(new DefaultTableModel(null,new Object[]{"StudentId","CourseId","Score","Description"}));
        sc.fillScoreJtable(jTable);
        
        jTextField_StudentId.setText("");
        jTextField_CourseId.setText(" ");
        jTextField_Score.setText(" ");
        jTextField_Description.setText(" ");


        //        if(!jTextField_StudentId.getText().equals("")){
            //            int id = Integer.valueOf(jTextField_StudentId.getText());
            //            c.insertUpdateDeleteStudent('d', id, null,null);
            //            manageCourseForm.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","Label","Hours"}));
            //            c.fillCourseJtable(manageCourseForm.jTable1);
            //            jTextField_StudentId.setText(" ");
            //            jTextField_CourseId.setText(" ");
            //            jSpinner1.setValue(4);
            //        }else{
            //            JOptionPane.showMessageDialog(null,"Enter Course ID to remove course!");
            //        }
        //        if(jTextField_STD_ID.getText().equals("")){
            //            JOptionPane.showMessageDialog(null,"No Student Selected");
            //        }
        //        Integer id = Integer.valueOf(jTextField_STD_ID.getText());
        //        std.insertUpdateDeleteStudent('d', id, null, null, null, null, null, null);
        //        std.fillStudentJtable(jTable1,"");
        //        jTable1.setModel(new DefaultTableModel(null,new Object[]{"id","First Name","Last Name","Sex","BirthDate","Phone","Address"}));
        //        std.fillStudentJtable(jTable1, jTextField_Val_Find.getText());
        //        MainForm.jLabel_StdCount.setText("   "+Integer.toString(MyFunction.countData("student")));
        //
        //        jTextField_STD_ID.setText("");
        //        jTextField_FName.setText("");
        //        jTextField_LName.setText("");
        //        jTextFieldPhone.setText("");
        //        jTextArea_Address.setText("");
        //        jTextFieldBirthDate.setText("");
        //        jRadioButtonMale.setSelected(false);
        //        jRadioButtonFemale.setSelected(false);
    }//GEN-LAST:event_jButtonRemoveScoreActionPerformed

    private void jTextField_StudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StudentIdActionPerformed

    private void jButtonAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddScoreActionPerformed
//        int stdId = Integer.valueOf(jTextField_StudentId.getText());
//        int crsId = c.getCourseId(jComboBox1CourseId.getSelectedItem().toString());
//        double scr = Double.valueOf(jTextField_Score.getText());
//        sc.insertUpdateDeleteStudent('i', stdId, crsId,scr,jTextField_Description.getText());
//        //System.out.println(crsId);
//        //System.out.println(stdId);

                addScoreForm addScf = new addScoreForm();
                addScf.setVisible(true);
                addScf.pack();
                addScf.setLocationRelativeTo(null);
                addScf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAddScoreActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int rowIndex = jTable.getSelectedRow();
        jTextField_StudentId.setText(jTable.getValueAt(rowIndex, 0).toString());
        jTextField_CourseId.setText(jTable.getValueAt(rowIndex, 1).toString());
        jTextField_Score.setText(jTable.getValueAt(rowIndex,2).toString());
        jTextField_Description.setText(jTable.getValueAt(rowIndex, 3).toString());
        
        
        
        

        //        rowIndex = jTable1.getSelectedRow();
        //        // DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        //        if(jTable1.getValueAt(rowIndex,3).toString().equals("Male")){
            //            jRadioButtonMale.setSelected(true);
            //            jRadioButtonFemale.setSelected(false);
            //        }else{
            //            jRadioButtonFemale.setSelected(true);
            //            jRadioButtonMale.setSelected(false);
            //        }
        //        jTextField_STD_ID.setText(model.getValueAt(rowIndex,0).toString());
        //        jTextField_FName.setText(model.getValueAt(rowIndex,1).toString());
        //        jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
        //        jTextFieldBirthDate.setText(model.getValueAt(rowIndex,4).toString());
        //        jTextFieldPhone.setText(model.getValueAt(rowIndex, 5).toString());
        //        jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
    }//GEN-LAST:event_jTableMouseClicked

    private void jTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableKeyReleased

        //        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){
            //            rowIndex = jTable1.getSelectedRow();
            //            jTextField_STD_ID.setText(model.getValueAt(rowIndex,0).toString());
            //            jTextField_FName.setText(model.getValueAt(rowIndex,1).toString());
            //            jTextField_LName.setText(model.getValueAt(rowIndex, 2).toString());
            //            jTextFieldBirthDate.setText(model.getValueAt(rowIndex,4).toString());
            //            jTextFieldPhone.setText(model.getValueAt(rowIndex, 5).toString());
            //            jTextArea_Address.setText(model.getValueAt(rowIndex, 6).toString());
            //
            //            if(jTable1.getValueAt(rowIndex,3).toString().equals("Male")){
                //                jRadioButtonMale.setSelected(true);
                //                jRadioButtonFemale.setSelected(false);
                //            }else{
                //                jRadioButtonFemale.setSelected(true);
                //                jRadioButtonMale.setSelected(false);
                //            }
            //        }
    }//GEN-LAST:event_jTableKeyReleased

    private void jTextField_ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ScoreActionPerformed

    private void jTextField_DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DescriptionActionPerformed

    private void jTextField_CourseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CourseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CourseIdActionPerformed

    private void jButtonEditScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditScoreActionPerformed
        int Sid = Integer.valueOf(jTextField_StudentId.getText());
        int Cid = Integer.valueOf(jTextField_CourseId.getText());
        double scr = Double.valueOf(jTextField_Score.getText());
        String ds = jTextField_Description.getText();
        sc.insertUpdateDeleteStudent('u', Sid, Cid, scr, ds);
        editDeleteScore.jTable.setModel(new DefaultTableModel(null,new Object[]{"StudentId","CourseId","Score","Description"}));
        sc.fillScoreJtable(jTable);
 
        
    }//GEN-LAST:event_jButtonEditScoreActionPerformed

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
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editDeleteScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editDeleteScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddScore;
    private javax.swing.JButton jButtonEditScore;
    private javax.swing.JButton jButtonRemoveScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField_CourseId;
    private javax.swing.JTextField jTextField_Description;
    private javax.swing.JTextField jTextField_Score;
    private javax.swing.JTextField jTextField_StudentId;
    // End of variables declaration//GEN-END:variables
}