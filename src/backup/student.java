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

/**
 *
 * @author sdddd
 */
public class student {
    public String id,name,dept,email,mbl,address,semester,session,password,reg_status;
    public double cgpa,credit,gpa;
    public boolean status = false;
    public student(){
        
    }
    public student(String s_id){
        id=s_id;
        check_server();
    }
    public void add(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            String sql="INSERT INTO `student`(`std_id`,`password`, `std_name`, `dept`, `std_cgpa`, `std_credit`, `std_gpa`, `std_mbl`, `std_email`, `std_adrs`,`session`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.setString(4, dept);
            ps.setString(5, "0");
            ps.setString(6, "0");
            ps.setString(7, "0");
            ps.setString(8, mbl);
            ps.setString(9, email);
            ps.setString(10,address);
            ps.setString(11, session);
            ps.executeUpdate();
            System.out.println("added");
            status = true;
        }catch(Exception e){
            System.out.println("server");
            System.out.println(e);
            status = false;
        }
    }
    public void update_id(String s_id)
    {
        id=s_id;
        System.out.println("update id");
        check_server();
    }
    //////////////////////////////
    void check_server(){
        System.out.println("check server");
        System.out.println("id  "+id);
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from student where std_id='" +id +"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
            password=rs.getString("password");
            name=rs.getString("std_name");
            dept=rs.getString("dept");
            cgpa= Double.parseDouble(rs.getString("std_cgpa"));
            credit= Double.parseDouble(rs.getString("std_credit"));
            gpa= Double.parseDouble(rs.getString("std_gpa"));
            mbl=rs.getString("std_mbl");
            email=rs.getString("std_email");
            address= rs.getString("std_adrs");
            session=rs.getString("session");
            reg_status=rs.getString("reg_status");
            semester=Server.sessionToSemester(session);
            System.out.println(name);
            System.out.println(id);
            System.out.println(dept);
            System.out.println(cgpa);
            System.out.println(credit);
            System.out.println(gpa);
            System.out.println(mbl);
            System.out.println(email);
            System.out.println(address);
            System.out.println(reg_status);
            System.out.println(session);
            System.out.println("sem: "+semester);
            status=true;
            //System.out.println("name " +name );
            
        }
        catch(Exception e){
            status=false;
                    // TODO add your handling code here:
                //search_std_id.setText("");
        }
    }
/////////////////////////////////////////
    public void add_result(course crs,String result,String id_p){
        System.out.println("add_result");
        System.out.println("id  "+id);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            String sql="INSERT INTO `result`(`std_id`, `code`, `tittle`, `credit`, `cgpa`, `session`) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id_p);
            ps.setString(2, crs.code);
            ps.setString(3, crs.tittle);
            ps.setString(4, crs.credit);
            ps.setString(5,result);
            ps.setString(6, Server.session());
            System.out.println(ps);
            ps.executeUpdate();
            System.out.println("added");
        }catch(Exception e){
            System.out.println("server error  hh");
        }
    }
    
    
}
