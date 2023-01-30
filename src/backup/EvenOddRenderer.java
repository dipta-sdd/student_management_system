/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backup;

import student_management_system.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author sdddd
 */
public class EvenOddRenderer implements TableCellRenderer {
 public static final DefaultTableCellRenderer DEFAULT_RENDERER =
 new DefaultTableCellRenderer();
 @Override
 public Component getTableCellRendererComponent(JTable table, Object value,
 boolean isSelected, boolean hasFocus, int row, int column) {
 Component renderer =
 DEFAULT_RENDERER.getTableCellRendererComponent(table, value,
 isSelected, hasFocus, row, column);
 Color foreground, background;
 if (isSelected) {
 foreground = Color.white;
 background = Color.blue;
 
 } else {
 if (row % 2 == 0) {
 foreground = Color.BLUE;
 background = Color.WHITE;
 } else {
 foreground = Color.BLUE;
 background = new Color(204,255,255);
 }
 }
 renderer.setForeground(foreground);
 renderer.setBackground(background);
 return renderer;
 }
}

/*


    public studentlist1(javax.swing.JDesktopPane bPane) {
        initComponents();
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI(); 
        ui.setNorthPane (null);
        jPanel22=jPanel2;
        table_std.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,14));
        table_std.getTableHeader().setOpaque(false);
        table_std.getTableHeader().setBackground(new Color(255,255,255));
        table_std.getTableHeader().setForeground(new Color(255,0,0));
        table_std.getTableHeader().setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        TableCellRenderer renderer = new EvenOddRenderer();
        table_std.setDefaultRenderer(Object.class, renderer);
        update_table();
    }
    public studentlist1(javax.swing.JDesktopPane bPane,String dept) {
        initComponents();
        this.setBorder (javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI(); 
        ui.setNorthPane (null);
        jPanel22=jPanel2;
        table_std.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,14));
        table_std.getTableHeader().setOpaque(false);
        table_std.getTableHeader().setBackground(new Color(255,255,255));
        table_std.getTableHeader().setForeground(new Color(255,0,0));
        table_std.getTableHeader().setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        TableCellRenderer renderer = new EvenOddRenderer();
        table_std.setDefaultRenderer(Object.class, renderer);
        update_table(dept);
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
            System.out.println(jPanel22.getSize());
            //new_raw.getDataVector().removeAllElements();//to clear table;
            
        }              
        catch(Exception e){
            System.out.println("Server error");
        }
     }   
    private void update_table(String id_min,String id_max)
    {
        DefaultTableModel new_raw=(DefaultTableModel)table_std.getModel();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from student where std_id>"+id_min+" and std_id<"+id_max;//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            new_raw.getDataVector().removeAllElements();
            new_raw.getDataVector().removeAllElements();
            while(rs.next())
            {
                new_raw.getDataVector().removeAllElements();
                String str[]={rs.getString("std_id"),rs.getString("std_name"),rs.getString("dept"),rs.getString("std_cgpa")};
                new_raw.addRow(str);
                System.out.println(str[0]+" "+str[1]);
            }
            System.out.println(jPanel22.getSize());
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
            while(rs.next())
            {
                String str[]={rs.getString("std_id"),rs.getString("std_name"),rs.getString("dept"),rs.getString("std_cgpa")};
                new_raw.addRow(str);
                System.out.println(str[0]+" "+str[1]);
            }

        }              
        catch(Exception e){
            System.out.println("Server error");
        }
     }



*/