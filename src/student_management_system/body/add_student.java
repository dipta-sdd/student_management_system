



package student_management_system.body; 

import javax.swing.*;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import student_management_system.Server;
import student_management_system.student;

import javax.swing.plaf.basic.BasicInternalFrameUI;

    
    
/**
 *
 * @author sdddd
 */
public class add_student extends javax.swing.JInternalFrame {
javax.swing.JDesktopPane bPane;
private int x=80;
private int y=70;
    /**
     * Creates new form menu1
     */
    public add_student(javax.swing.JDesktopPane bPane) {
        initComponents();
        set_font();
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); 
        //BasicInternalFrameUI ui = 
        BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI(); 
        ui.setNorthPane (null);
        this.bPane=bPane;
        this.setSize(bPane.getSize());
    }
    private void set_font()
    {
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        add_std_id.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        add_std_name.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        add_std_dept.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        add_std_mbl.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        add_std_email.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        add_std_adrs.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        note = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        add_std_email = new javax.swing.JTextField();
        add_std_mbl = new javax.swing.JTextField();
        add_std_name = new javax.swing.JTextField();
        add_std_adrs = new javax.swing.JTextField();
        add_std_dept = new javax.swing.JComboBox<>();
        add_std_id = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(808, 454));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Noto Mono", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(jPanel2);
        jLabel1.setText("Sign up");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(my.font);
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Adrress");
        jLabel7.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel7.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel6.setFont(my.font);
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Email");
        jLabel6.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(my.font);
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("ID");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel2.setFont(my.font);
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Name");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel5.setFont(my.font);
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Mobile");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel4.setFont(my.font);
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Department");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel8.setFont(my.font);
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Password");
        jLabel8.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel8.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        add_std_email.setForeground(new java.awt.Color(102, 102, 255));
        add_std_email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add_std_email.setMaximumSize(new java.awt.Dimension(300, 30));
        add_std_email.setMinimumSize(new java.awt.Dimension(300, 30));
        add_std_email.setPreferredSize(new java.awt.Dimension(300, 30));

        add_std_mbl.setForeground(new java.awt.Color(102, 102, 255));
        add_std_mbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add_std_mbl.setMaximumSize(new java.awt.Dimension(300, 30));
        add_std_mbl.setMinimumSize(new java.awt.Dimension(300, 30));
        add_std_mbl.setPreferredSize(new java.awt.Dimension(300, 30));
        add_std_mbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_std_mblActionPerformed(evt);
            }
        });

        add_std_name.setForeground(new java.awt.Color(102, 102, 255));
        add_std_name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add_std_name.setMaximumSize(new java.awt.Dimension(2147483647, 46));
        add_std_name.setMinimumSize(new java.awt.Dimension(300, 30));
        add_std_name.setPreferredSize(new java.awt.Dimension(300, 30));

        add_std_adrs.setForeground(new java.awt.Color(102, 102, 255));
        add_std_adrs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add_std_adrs.setMaximumSize(new java.awt.Dimension(300, 30));
        add_std_adrs.setMinimumSize(new java.awt.Dimension(300, 30));
        add_std_adrs.setPreferredSize(new java.awt.Dimension(300, 30));
        add_std_adrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_std_adrsActionPerformed(evt);
            }
        });

        add_std_dept.setForeground(new java.awt.Color(102, 102, 255));
        add_std_dept.setModel(Server.get_dept_list());
        add_std_dept.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add_std_dept.setMaximumSize(new java.awt.Dimension(300, 30));
        add_std_dept.setMinimumSize(new java.awt.Dimension(300, 30));
        add_std_dept.setPreferredSize(new java.awt.Dimension(300, 30));
        add_std_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_std_deptActionPerformed(evt);
            }
        });

        add_std_id.setForeground(new java.awt.Color(102, 102, 255));
        add_std_id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add_std_id.setMaximumSize(new java.awt.Dimension(2147483647, 46));
        add_std_id.setPreferredSize(new java.awt.Dimension(150, 30));
        add_std_id.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                add_std_idCaretUpdate(evt);
            }
        });
        add_std_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_std_idActionPerformed(evt);
            }
        });

        password.setFont(my.font);
        password.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_std_dept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_std_name, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
            .addComponent(add_std_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_std_mbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_std_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_std_adrs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(password)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_std_id, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(add_std_name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(add_std_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(add_std_mbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(add_std_email, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(add_std_adrs, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Sign Up");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(my.font);
        jButton2.setForeground(new java.awt.Color(255, 51, 102));
        jButton2.setText("Not a Student ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(215, 215, 215))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                        .addGap(254, 254, 254))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        // TODO add your handling code here:
        this.setSize(bPane.getSize());
    }//GEN-LAST:event_formAncestorResized

    private void add_std_idCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_add_std_idCaretUpdate
        // TODO add your handling code here:
        String id=add_std_id.getText();
        student std = new student(id);
        add_std_name.setText(std.name);
        add_std_dept.setSelectedItem(std.dept);
        add_std_mbl.setText(std.mbl);
        add_std_email.setText(std.email);
        add_std_adrs.setText(std.address);

    }//GEN-LAST:event_add_std_idCaretUpdate

    private void add_std_deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_std_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_std_deptActionPerformed

    private void add_std_adrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_std_adrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_std_adrsActionPerformed

    private void add_std_mblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_std_mblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_std_mblActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        student std= new student(add_std_id.getText());
        std.name=add_std_name.getText();
        std.dept=(String) add_std_dept.getSelectedItem();
        std.mbl=add_std_mbl.getText();
        std.address=add_std_adrs.getText();
        std.add();
        if(std.status)
        {
            note.setForeground(Color.blue);
            note.setText("Successfully Added");

        }
        else
        {
            note.setForeground(Color.red);
            note.setText("Something went worong.");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void add_std_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_std_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_std_idActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        add_teacher obj=new add_teacher(bPane ); 
        bPane.add(obj).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_std_adrs;
    private javax.swing.JComboBox<String> add_std_dept;
    private javax.swing.JTextField add_std_email;
    private javax.swing.JTextField add_std_id;
    private javax.swing.JTextField add_std_mbl;
    private javax.swing.JTextField add_std_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel note;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
