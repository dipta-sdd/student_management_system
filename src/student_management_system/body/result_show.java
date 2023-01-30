/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package student_management_system.body; 

import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.StatementImpl;
import java.awt.Color;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import student_management_system.EvenOddRenderer;
import student_management_system.course;
import student_management_system.student;
import student_management_system.teacher;
import student_management_system.user;

/**
 *
 * @author sdddd
 */
public class result_show extends javax.swing.JInternalFrame {
javax.swing.JDesktopPane bPane;
user u;
teacher t;
student std;
    /**
     * Creates new form menu1
     */
    public result_show(javax.swing.JDesktopPane bPane,user u,student std) {
        initComponents();
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); 
        //BasicInternalFrameUI ui = 
        BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI(); 
        ui.setNorthPane (null);
        this.bPane=bPane;
        this.setSize(bPane.getSize());
        this.u=u;
        this.t=u.user_teacher;
        this.std=std;
        name.setText(std.name);
        id.setText(std.id);
        dept.setText(std.dept);
        cgpa.setText(std.cgpa+"");
        credit.setText(""+std.credit);
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
String grade(String r){
    double d=Double.parseDouble(r);
    if(d>=4)
        return "A+";
    else if(d>= 3.75)
        return "A";
    else if(d>= 3.5)
        return "A-";
    else if(d>= 3.25)
        return "B+";
    else if(d>= 3)
        return "B";
    else if(d>= 2.75)
        return "B-";
    else if(d>= 2.5)
        return "C+";
    else if(d>= 2.25)
        return "C";
    else if(d>= 2)
        return "D";
    else
        return "F";
}
    private void update_table()
    {
        DefaultTableModel new_raw=(DefaultTableModel)table_std.getModel();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from result where std_id='"+std.id+"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            new_raw.setRowCount(0);
            while(rs.next())
            {   
                String str[]={rs.getString("code"),rs.getString("tittle"),rs.getString("credit"),rs.getString("cgpa"),"",rs.getString("session")};
                str[4]=grade(str[3]);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        id = new JLabel();
        name = new JLabel();
        l_result = new JLabel();
        dept = new JLabel();
        jLabel8 = new JLabel();
        cgpa = new JLabel();
        credit = new JLabel();
        jLabel11 = new JLabel();
        jScrollPane1 = new JScrollPane();
        table_std = new JTable();

        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(my.font2);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Result");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(my.font);
        jLabel2.setText("Name:");
        jLabel2.setMaximumSize(new java.awt.Dimension(130, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(130, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(130, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(my.font);
        jLabel3.setText("ID:");
        jLabel3.setMaximumSize(new java.awt.Dimension(130, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(130, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(130, 40));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(my.font);
        id.setText("id");
        id.setMaximumSize(new java.awt.Dimension(130, 40));
        id.setMinimumSize(new java.awt.Dimension(130, 40));
        id.setPreferredSize(new java.awt.Dimension(130, 40));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(my.font);
        name.setText("jLabel2");
        name.setMaximumSize(new java.awt.Dimension(130, 40));
        name.setMinimumSize(new java.awt.Dimension(130, 40));
        name.setPreferredSize(new java.awt.Dimension(130, 40));

        l_result.setBackground(new java.awt.Color(255, 255, 255));
        l_result.setFont(my.font);
        l_result.setText("Department:");
        l_result.setMaximumSize(new java.awt.Dimension(130, 40));
        l_result.setMinimumSize(new java.awt.Dimension(130, 40));
        l_result.setPreferredSize(new java.awt.Dimension(130, 40));

        dept.setBackground(new java.awt.Color(255, 255, 255));
        dept.setFont(my.font);
        dept.setText("jLabel2");
        dept.setMaximumSize(new java.awt.Dimension(130, 40));
        dept.setMinimumSize(new java.awt.Dimension(130, 40));
        dept.setPreferredSize(new java.awt.Dimension(130, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(my.font);
        jLabel8.setText("CGPA:");
        jLabel8.setMaximumSize(new java.awt.Dimension(130, 40));
        jLabel8.setMinimumSize(new java.awt.Dimension(130, 40));
        jLabel8.setPreferredSize(new java.awt.Dimension(130, 40));

        cgpa.setBackground(new java.awt.Color(255, 255, 255));
        cgpa.setFont(my.font);
        cgpa.setText("jLabel2");
        cgpa.setMaximumSize(new java.awt.Dimension(130, 40));
        cgpa.setMinimumSize(new java.awt.Dimension(130, 40));
        cgpa.setPreferredSize(new java.awt.Dimension(130, 40));

        credit.setBackground(new java.awt.Color(255, 255, 255));
        credit.setFont(my.font);
        credit.setText("jLabel2");
        credit.setMaximumSize(new java.awt.Dimension(130, 40));
        credit.setMinimumSize(new java.awt.Dimension(130, 40));
        credit.setPreferredSize(new java.awt.Dimension(130, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(my.font);
        jLabel11.setText("Credit Completed:");
        jLabel11.setMaximumSize(new java.awt.Dimension(130, 40));
        jLabel11.setMinimumSize(new java.awt.Dimension(130, 40));
        jLabel11.setPreferredSize(new java.awt.Dimension(130, 40));

        javax.swing.GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(l_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 629, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_result, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        table_std.setFont(my.font);
        table_std.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Title", "Credit", "CGPA", "Grade", "Session"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_std.setRowHeight(40);
        jScrollPane1.setViewportView(table_std);
        if (table_std.getColumnModel().getColumnCount() > 0) {
            table_std.getColumnModel().getColumn(0).setMinWidth(80);
            table_std.getColumnModel().getColumn(0).setPreferredWidth(80);
            table_std.getColumnModel().getColumn(0).setMaxWidth(100);
            table_std.getColumnModel().getColumn(1).setMinWidth(400);
            table_std.getColumnModel().getColumn(1).setPreferredWidth(300);
            table_std.getColumnModel().getColumn(1).setMaxWidth(1500);
            table_std.getColumnModel().getColumn(2).setMinWidth(60);
            table_std.getColumnModel().getColumn(2).setPreferredWidth(60);
            table_std.getColumnModel().getColumn(2).setMaxWidth(100);
            table_std.getColumnModel().getColumn(3).setMinWidth(60);
            table_std.getColumnModel().getColumn(3).setPreferredWidth(60);
            table_std.getColumnModel().getColumn(3).setMaxWidth(100);
            table_std.getColumnModel().getColumn(4).setMinWidth(80);
            table_std.getColumnModel().getColumn(4).setPreferredWidth(100);
            table_std.getColumnModel().getColumn(4).setMaxWidth(200);
            table_std.getColumnModel().getColumn(5).setMinWidth(80);
            table_std.getColumnModel().getColumn(5).setPreferredWidth(100);
            table_std.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(183, 183, 183))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        // TODO add your handling code here:
        this.setSize(bPane.getSize());
    }//GEN-LAST:event_formAncestorResized


    // Variables declaration - do not modify//GEN-BEGIN:variables
    JLabel cgpa;
    JLabel credit;
    JLabel dept;
    JLabel id;
    JLabel jLabel1;
    JLabel jLabel11;
    JLabel jLabel2;
    JLabel jLabel3;
    JLabel l_result;
    JLabel jLabel8;
    JPanel jPanel1;
    JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    JLabel name;
    private javax.swing.JTable table_std;
    // End of variables declaration//GEN-END:variables
}