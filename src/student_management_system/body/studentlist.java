/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package student_management_system.body; 
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.StatementImpl;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.*;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.awt.Color;
import java.awt.Font;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import student_management_system.EvenOddRenderer;
import student_management_system.student;
import student_management_system.teacher;
import student_management_system.user;

/**
 *
 * @author sdddd
 */
public class studentlist extends javax.swing.JInternalFrame {
javax.swing.JDesktopPane bPane;
user u;
teacher t;
Font polash= new Font("Noto Mono",Font.BOLD,18);
    /**
     * Creates new form menu1
     * @param 
     */
    public studentlist(javax.swing.JDesktopPane bPane,user u) {
        initComponents();
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI(); 
        ui.setNorthPane (null);
        this.bPane=bPane;
        this.setSize(bPane.getSize());
        this.u=u;
        this.t=u.user_teacher;
        table_std.getTableHeader().setFont(new Font("Noto Mono", Font.BOLD,18));
        table_std.getTableHeader().setOpaque(false);
        table_std.getTableHeader().setBackground(new Color(255,255,255));
        table_std.getTableHeader().setForeground(new Color(255,0,0));
        table_std.getTableHeader().setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        TableCellRenderer renderer = new EvenOddRenderer();
        table_std.setDefaultRenderer(Object.class, renderer);
        update_table();
        table_std.setBorder(null);
        jScrollPane1.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        
    }


private void update_table()
    {
        DefaultTableModel new_raw=(DefaultTableModel)table_std.getModel();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from student";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            new_raw.setRowCount(0);
            while(rs.next())
            {
                String str[]={rs.getString("std_id"),rs.getString("std_name"),rs.getString("dept"),rs.getString("std_cgpa")};
                new_raw.addRow(str);
                //System.out.println(str[0]+" "+str[1]);
            }
            int r= table_std.getRowCount();
            for(int i=0;i<18-r;i++)
            {
                String str[]={" "," "," "," "};
                new_raw.addRow(str);
            }
            //System.out.println(jPanel22.getSize());            
        }              
        catch(Exception e){
            System.out.println("Server error");
        }
     }   
    private void update_table_search(String id)
    {
        DefaultTableModel new_raw=(DefaultTableModel)table_std.getModel();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="SELECT * FROM student where std_id LIKE '"+id+"%'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            new_raw.setRowCount(0);
            System.out.println(table_std.getRowCount());
            while(rs.next())
            {
                //new_raw.getDataVector().removeAllElements();
                String str[]={rs.getString("std_id"),rs.getString("std_name"),rs.getString("dept"),rs.getString("std_cgpa")};
                new_raw.addRow(str);
                System.out.println(str[0]+" "+str[1]);
            }
            int r= table_std.getRowCount();
            for(int i=0;i<12-r;i++)
            {
                String str[]={" "," "," "," "};
                new_raw.addRow(str);
            }
        }              
        catch(Exception e){
            System.out.println("Server error");
        }
     }
    private void update_table_search_by_name(String name)
    {
        DefaultTableModel new_raw=(DefaultTableModel)table_std.getModel();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="SELECT * FROM student where std_name LIKE '%"+name+"%'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            new_raw.setRowCount(0);
            System.out.println(table_std.getRowCount());
            while(rs.next())
            {
                //new_raw.getDataVector().removeAllElements();
                String str[]={rs.getString("std_id"),rs.getString("std_name"),rs.getString("dept"),rs.getString("std_cgpa")};
                new_raw.addRow(str);
                System.out.println(str[0]+" "+str[1]);
            }
            int r= table_std.getRowCount();
            for(int i=0;i<12-r;i++)
            {
                String str[]={" "," "," "," "};
                new_raw.addRow(str);
            }
        }              
        catch(Exception e){
            System.out.println("Server error");
        }
     }
    private void update_table(String dept)
    {
        DefaultTableModel new_raw=(DefaultTableModel)table_std.getModel();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from student where dept='"+dept+"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            new_raw.setRowCount(0);
            while(rs.next())
            {
                String str[]={rs.getString("std_id"),rs.getString("std_name"),rs.getString("dept"),rs.getString("std_cgpa")};
                new_raw.addRow(str);
                System.out.println(str[0]+" "+str[1]);
            }
            int r= table_std.getRowCount();
            for(int i=0;i<12-r;i++)
            {
                String str[]={" "," "," "," "};
                new_raw.addRow(str);
            }
        }              
        catch(Exception e){
            System.out.println("Server error");
        }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        table_std = new JTable();
        jPanel2 = new JPanel();
        search = new JButton();
        search1 = new JButton();
        box_enter_value = new JTextField();
        by_name = new JRadioButton();
        search2 = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        table_std.setFont(new java.awt.Font("Noto Mono", 1, 18));  
        table_std.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Department", "CGPA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_std.setGridColor(new java.awt.Color(255, 255, 255));
        table_std.setRowHeight(40);
        table_std.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_stdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_std);
        if (table_std.getColumnModel().getColumnCount() > 0) {
            table_std.getColumnModel().getColumn(0).setMinWidth(150);
            table_std.getColumnModel().getColumn(0).setPreferredWidth(200);
            table_std.getColumnModel().getColumn(0).setMaxWidth(500);
            table_std.getColumnModel().getColumn(1).setMinWidth(250);
            table_std.getColumnModel().getColumn(1).setPreferredWidth(350);
            table_std.getColumnModel().getColumn(1).setMaxWidth(1500);
            table_std.getColumnModel().getColumn(2).setMinWidth(50);
            table_std.getColumnModel().getColumn(2).setPreferredWidth(100);
            table_std.getColumnModel().getColumn(2).setMaxWidth(500);
            table_std.getColumnModel().getColumn(3).setMinWidth(50);
            table_std.getColumnModel().getColumn(3).setPreferredWidth(100);
            table_std.getColumnModel().getColumn(3).setMaxWidth(500);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        search.setFont(polash);
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        search1.setFont(search.getFont());
        search1.setText("Back");
        search1.setBorder(search.getBorder());
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        box_enter_value.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                box_enter_valueCaretUpdate(evt);
            }
        });
        box_enter_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_enter_valueActionPerformed(evt);
            }
        });

        by_name.setBackground(new java.awt.Color(255, 255, 255));
        by_name.setFont(polash);
        by_name.setText("Search by Name");
        by_name.setBorder(null);
        by_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                by_nameActionPerformed(evt);
            }
        });

        search2.setFont(search.getFont());
        search2.setText("Add Student");
        search2.setBorder(search.getBorder());
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(609, 609, 609))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(box_enter_value)
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(by_name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_enter_value, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(by_name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_enter_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_enter_valueActionPerformed
        // TODO add your handling code here:
        if(by_name.isSelected())
            update_table_search_by_name(box_enter_value.getText());
        else
            update_table_search(box_enter_value.getText());
    }//GEN-LAST:event_box_enter_valueActionPerformed

    private void box_enter_valueCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_box_enter_valueCaretUpdate
        // TODO add your handling code here:
        if(by_name.isSelected())
            update_table_search_by_name(box_enter_value.getText());
        else
            update_table_search(box_enter_value.getText());
    }//GEN-LAST:event_box_enter_valueCaretUpdate

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        bPane.remove(this);
    }//GEN-LAST:event_search1ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        // TODO add your handling code here:
        add_student add_std=new add_student(bPane);
        bPane.add(add_std).setVisible(true);
    }//GEN-LAST:event_search2ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        if(by_name.isSelected())
            update_table_search_by_name(box_enter_value.getText());
        else
            update_table_search(box_enter_value.getText());
    }//GEN-LAST:event_searchActionPerformed

    private void by_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_by_nameActionPerformed
        // TODO add your handling code here:
        if(by_name.isSelected())
            update_table_search_by_name(box_enter_value.getText());
        else
            update_table_search(box_enter_value.getText());
    }//GEN-LAST:event_by_nameActionPerformed

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        // TODO add your handling code here:
        this.setSize(bPane.getSize());
        System.out.println(this.getSize());
    }//GEN-LAST:event_formAncestorResized

    private void table_stdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_stdMouseClicked
        // TODO add your handling code here:
        //System.out.println("row selected"+ table_std.getSelectedRow());
        int column = 0;
        int row = table_std.getSelectedRow();
        String value = table_std.getModel().getValueAt(row, column).toString();
        System.out.println("id : "+value);
        student std=new student(value);
        result_show obj=new result_show(bPane,u,std);
        bPane.add(obj).setVisible(true);
    }//GEN-LAST:event_table_stdMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton by_name;
    JPanel jPanel1;
    JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    JTextField box_enter_value;
    JButton search;
    JButton search1;
    JButton search2;
    private javax.swing.JTable table_std;
    // End of variables declaration//GEN-END:variables
}
