/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package student_management_system.body;

import java.awt.Color;
import javax.swing.JMenuItem;
import student_management_system.Server;
import student_management_system.course;

/**
 *
 * @author sdd
 */
public class course_registretion_panel extends javax.swing.JPanel {
    public boolean status = false;
    String code,teacher;
    /**
     * Creates new form course_offer_panel
     */
    public course_registretion_panel() {
        initComponents();  
        this.setVisible(false);
    }
    public void setup(String code ,String teacher){
        this.code=code;
        this.teacher=teacher;
        this.setVisible(true);
        code_box.setText(code);
        course crs=new course(code);
        title_box.setText(crs.tittle);
        credit_box.setText(crs.credit);
        teacher_box.setText(teacher);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void tittle(){
        
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        status_box = new javax.swing.JCheckBox();
        credit_box = new javax.swing.JLabel();
        title_box = new javax.swing.JLabel();
        code_box = new javax.swing.JLabel();
        teacher_box = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        status_box.setBackground(new java.awt.Color(255, 255, 255));
        status_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_boxActionPerformed(evt);
            }
        });

        credit_box.setBackground(new java.awt.Color(255, 255, 255));
        credit_box.setFont(my.font);
        credit_box.setText("Credit");

        title_box.setBackground(new java.awt.Color(255, 255, 255));
        title_box.setFont(my.font);
        title_box.setText("Title");

        code_box.setBackground(new java.awt.Color(255, 255, 255));
        code_box.setFont(my.font);
        code_box.setText("Code");

        teacher_box.setBackground(new java.awt.Color(255, 255, 255));
        teacher_box.setFont(my.font);
        teacher_box.setText("Course Teacher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status_box)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(code_box, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_box, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(credit_box, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacher_box, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status_box, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(credit_box, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(teacher_box, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(title_box, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(code_box, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void status_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_boxActionPerformed
        // TODO add your handling code here:
        status = status_box.isSelected();
    }//GEN-LAST:event_status_boxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel code_box;
    private javax.swing.JLabel credit_box;
    public javax.swing.JPopupMenu popup;
    public javax.swing.JCheckBox status_box;
    private javax.swing.JLabel teacher_box;
    private javax.swing.JLabel title_box;
    // End of variables declaration//GEN-END:variables
}
