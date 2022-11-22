/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backup;

import student_management_system.*;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.StatementImpl;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author sdddd
 */
public class Server {
    
    public static javax.swing.DefaultComboBoxModel get_semester_list() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from semester";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            //while(rs.next()){ // no need while loop cause there are condition in query username='user' 
            rs.next();
                int x= rs.getInt("count(*)");
            sql="select * from semester";
            rs=st.executeQuery(sql);
            String result[]=new String[x];
            int i=0;
            while(rs.next())
                result[i++]=rs.getString("dept");
            
           // new javax.swing.DefaultComboBoxModel<>(Server.get_dept_list())
            return new javax.swing.DefaultComboBoxModel<>(result);
        }
        catch(Exception e){
            return new javax.swing.DefaultComboBoxModel<>(new String[] {"None"});
            //return ;
        }
    }
    public static javax.swing.DefaultComboBoxModel get_dept_list() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from dept";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            //while(rs.next()){ // no need while loop cause there are condition in query username='user' 
            rs.next();
                int x= rs.getInt("count(*)");
            sql="select * from dept";
            rs=st.executeQuery(sql);
            String result[]=new String[x];
            int i=0;
            while(rs.next())
                result[i++]=rs.getString("dept");
            
           // new javax.swing.DefaultComboBoxModel<>(Server.get_dept_list())
            return new javax.swing.DefaultComboBoxModel<>(result);
        }
        catch(Exception e){
            return new javax.swing.DefaultComboBoxModel<>(new String[] {"None"});
            //return ;
        }
    }
    public static javax.swing.DefaultComboBoxModel get_table_list(String table) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from "+table;//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                int x= rs.getInt("count(*)");
            sql="select * from "+table;
            rs=st.executeQuery(sql);
            String result[]=new String[x];
            int i=0;
            while(rs.next())
                result[i++]=rs.getString(table);
            return new javax.swing.DefaultComboBoxModel<>(result);
        }
        catch(Exception e){
            return new javax.swing.DefaultComboBoxModel<>(new String[] {"None"});
        }
    } 
    public static javax.swing.DefaultComboBoxModel get_course_list(String dept) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from course where dept='"+dept+"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            //while(rs.next()){ // no need while loop cause there are condition in query username='user' 
            rs.next();
                int x= rs.getInt("count(*)");
            sql="select * from course where dept='"+dept+"'";
            rs=st.executeQuery(sql);
            String result[]=new String[x];
            int i=0;
            while(rs.next())
                result[i++]=rs.getString("code");
            
           // new javax.swing.DefaultComboBoxModel<>(Server.get_dept_list())
            return new javax.swing.DefaultComboBoxModel<>(result);
        }
        catch(Exception e){
            return new javax.swing.DefaultComboBoxModel<>(new String[] {"None"});
            //return ;
        }
    }
    public static javax.swing.DefaultComboBoxModel get_table_column(String table,String column) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from "+table;//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            //while(rs.next()){ // no need while loop cause there are condition in query username='user' 
            rs.next();
                int x= rs.getInt("count(*)");
            sql="select * from "+table;
            rs=st.executeQuery(sql);
            String result[]=new String[x];
            int i=0;
            while(rs.next())
                result[i++]=rs.getString(column);
            
           // new javax.swing.DefaultComboBoxModel<>(Server.get_dept_list())
            return new javax.swing.DefaultComboBoxModel<>(result);
        }
        catch(Exception e){
            return new javax.swing.DefaultComboBoxModel<>(new String[] {"None"});
            //return ;
        }
    }
    public static int get_table_count_where_str1_eq_str2(String table,String str1, String str2) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from "+table+" where "+str1+"='"+str2+"'";
            ResultSet rs=st.executeQuery(sql);
            //while(rs.next()){ // no need while loop cause there are condition in query username='user' 
            rs.next();
                int x= rs.getInt("count(*)");
                return x;
   
        }
        catch(Exception e){
            return 0;
            //return ;
        }
    }
    public static javax.swing.DefaultComboBoxModel get_table_column_where_str1_eq_str2(String table,String column,String str1, String str2) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from "+table+" where "+str1+"='"+str2+"'";
            ResultSet rs=st.executeQuery(sql);
            //while(rs.next()){ // no need while loop cause there are condition in query username='user' 
            rs.next();
                int x= rs.getInt("count(*)");
            sql="select * from "+table+" where "+str1+"='"+str2+"'";
            rs=st.executeQuery(sql);
            String result[]=new String[x];
            int i=0;
            while(rs.next())
                result[i++]=rs.getString(column);
            
           // new javax.swing.DefaultComboBoxModel<>(Server.get_dept_list())
            return new javax.swing.DefaultComboBoxModel<>(result);
        }
        catch(Exception e){
            return new javax.swing.DefaultComboBoxModel<>(new String[] {"None"});
            //return ;
        }
    }
    public static javax.swing.DefaultComboBoxModel get_table_column_like(String table,String column,String like) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from "+table+"where "+column+" like '"+like+"%'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            //while(rs.next()){ // no need while loop cause there are condition in query username='user' 
            rs.next();
                int x= rs.getInt("count(*)");
            sql="select * from "+table;
            rs=st.executeQuery(sql);
            String result[]=new String[x];
            int i=0;
            while(rs.next())
                result[i++]=rs.getString(column);
            
           // new javax.swing.DefaultComboBoxModel<>(Server.get_dept_list())
            return new javax.swing.DefaultComboBoxModel<>(result);
        }
        catch(Exception e){
            return new javax.swing.DefaultComboBoxModel<>(new String[] {"None"});
            //return ;
        }
    }
    public static String get_std_count() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from student";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                return (rs.getString("count(*)"));        
        }
        catch(Exception e){
            return "0";
        }
    }
    public static String get_std_count(String dept) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from student where dept='"+dept+"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                return (rs.getString("count(*)"));        
        }
        catch(Exception e){
            return "0";
        }
    }
    public static String get_dept_count() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from dept";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                return (rs.getString("count(*)"));        
        }
        catch(Exception e){
            return "0";
        }
    }
    public static int get_std_count_int() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from student";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                return (rs.getInt("count(*)"));        
        }
        catch(Exception e){
            return 0;
        }
    }
    public static int get_std_count_int(String dept){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from student where dept='"+dept+"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                return (rs.getInt("count(*)"));        
        }
        catch(Exception e){
            return 0;
        }
    }
    public static int get_dept_count_int() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from dept";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                return (rs.getInt("count(*)"));        
        }
        catch(Exception e){
            return 0;
        }
    }
    public static void course_offer_reg(String session, String dept, String semester,String code , String teacher){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            String sql="INSERT INTO `course_offer`(`session`, `dept`, `semester`, `code`, `teacher`) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1 ,session );
            ps.setString(2 ,dept);
            ps.setString(3 ,semester);
            ps.setString(4, code);
            ps.setString(5, teacher);

           // System.out.println(ps);
            ps.executeUpdate();
            System.out.println("Course offered succesfully.");
        }
        catch(Exception e){
            System.out.println("server_error");
        }
    }
    public static String get_std_name(String id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from student where std_id='"+id+"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                return rs.getString("std_name");        
        }
        catch(Exception e){
            return "";
        }
    }
    public static String[] get_teacher_couse_list_of_std_id(String teacher,String code,String dept) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from course_current where code='"+code+"' and teacher='"+teacher+"' and dept='"+dept+"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                int x= rs.getInt("count(*)");
            sql="select * from course_current where code='"+code+"' and teacher='"+teacher+"' and dept='"+dept+"'";
            rs=st.executeQuery(sql);
            String result[]=new String[x];
            int i=0;
            while(rs.next())
                result[i++]=rs.getString("std_id");
            
           // new javax.swing.DefaultComboBoxModel<>(Server.get_dept_list())
            return result;
        }
        catch(Exception e){
            return new String[] {"None"};
            //return ;
        }
    }
    public static int get_teacher_couse_count_of_std_id(String teacher,String code,String dept) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from course_current where code='"+code+"' and teacher='"+teacher+"' and dept='"+dept+"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
                int x= rs.getInt("count(*)");
                return x;
        }
        catch(Exception e){
            return 0;
            //return ;
        }
    }
    public static String session() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from session where id='0'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);System.out.println(sql);
            rs.next();
            return (rs.getString("session"));        
        }
        catch(Exception e){
            return "";
        }
    }
    public static boolean admin_login_admin(String user, String pass){
                String username,password;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from admin where username='" + user +"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            System.out.println(sql);
            rs.next();
                username= rs.getString("username");
                password= rs.getString("password");
                if(user.equals(username) && pass.equals(password)){
                    return true;
                }
                else{
                    return false;
                }
        }
        catch(Exception e){
            return false;        
        }
    }
    public static teacher admin_login_teacher(String user, String pass){
                teacher t=new teacher();
                t.status=false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from teacher where username='" + user +"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            //System.out.println(sql);
            rs.next();
            t.name=rs.getString("name");
            t.username=rs.getString("username");
            t.password= rs.getString("password");
            t.dept=rs.getString("dept");
            t.mobile=rs.getString("mobile");
            t.email=rs.getString("email");
            t.address=rs.getString("address");
            if(user.equals(t.username) && pass.equals(t.password))
                t.status=true;
                return t;
        }
        catch(Exception e){
            t.status=false;
            return t;       
        }
    }
    public static student admin_login_student(String user, String pass){
        System.out.println("entering admin login student");
        student s=new student(user);
        //System.out.println("std name "+s.name);
        //System.out.println("std reg status "+s.reg_status);
        if(user.equals(s.id) && pass.equals(s.password) && s.reg_status.equals("approved")){
            //System.out.println("student match");
            s.status=true;
            //System.out.println("returning true");
             return s;
        }
        else 
        {
            //s=null;
            s.status=false;
            //System.out.println("returning false");
            return s;
        }
    }
    public static user login(String user,String pass){
        user u=new user();
        u.user_student=admin_login_student(user,pass);
        u.user_teacher=admin_login_teacher(user,pass);
        //System.out.println(u.user_student.status);
        if(admin_login_admin(user,pass)){
            u.status=true;
            u.type="admin";
        }
        else if(u.user_student.status){
            u.status=true;
            u.type="student";
        }
        else if(u.user_teacher.status){
            u.status=true;
            u.type="teacher";
        }
        else{
            u.status=false;
        }
        return u;
    }
}
