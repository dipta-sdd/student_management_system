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
    public void update(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            String sql="UPDATE `student` SET `password`='"+ password +"',`std_name`='"+name+"',`dept`='"+dept+"',`std_cgpa`='"+String.format("%.2f", cgpa)+
                       "',`std_credit`='"+credit+"',`std_gpa`='"+gpa+"',`std_mbl`='"+mbl+"',`std_email`='"+email+"',`std_adrs`='"+address+
                    "',`session`='"+session+"',`reg_status`='Approved' WHERE std_id='"+id+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println(sql);
            ps.executeUpdate();
            System.out.println("updated");
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
    public void check_server(){
        System.out.println("check server");
        System.out.println("id  "+id);
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from student where std_id='" +id +"'";//select * from admin where username='sdd'
            System.out.println(sql);
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
    double old_result(course crs,String id){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select count(*) from result where std_id='" +id +"' and code='"+crs.code+"'";
            System.out.println(sql);
            ResultSet rs=st.executeQuery(sql);
            rs.next();
            int n=rs.getInt("count(*)");
            if (n== 0.0){
                return -1;
            }
            System.out.println("n= "+n);
            double result=0.0d;
            sql="select * from result where std_id='" +id +"' and code='"+crs.code+"'";
            System.out.println(sql);
            rs=st.executeQuery(sql);
            while(rs.next()){
                double tmp =rs.getDouble("cgpa");
                if(tmp>=result)
                    result=tmp;
            }
            return result;
        } catch(Exception e){
            return -1;
        }
    }
    public void add_result(course crs,String result,String id_p){
        System.out.println("add_result");
        System.out.println("id  "+id);
        
        
        student std = new student(id_p);
        double crs_credit=Double.parseDouble(crs.credit);
        double crs_result=Double.parseDouble(result);
        double result_old=old_result(crs,id_p);
        System.out.println("old result = "+result_old);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            String sql="INSERT INTO `result`(`std_id`, `code`, `tittle`, `credit`, `cgpa`, `session`,`semester`) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id_p);
            ps.setString(2, crs.code);
            ps.setString(3, crs.tittle);
            ps.setString(4, crs.credit);
            ps.setString(5,result);
            ps.setString(6, Server.session());
            ps.setString(7, semester);
            System.out.println(ps);
            ps.executeUpdate();
            System.out.println("added");
            if(result_old == -1){
                System.out.println("no old result");
                std.credit+=crs_credit;
                std.gpa+=(double)crs_result*crs_credit;
                std.cgpa=std.gpa/std.credit;
                System.out.println("crs credit= "+crs_credit);
                System.out.println("crs result= "+crs_result);
                System.out.println("cgpa= "+std.cgpa);
                System.out.println("credit= "+std.credit);
                System.out.println("gpa= "+std.gpa);
                std.update();
            } else if(result_old < crs_result){
                System.out.println("adding new result");
                //std.credit+=crs_credit;
                std.gpa+=(double)crs_result*crs_credit;
                std.cgpa=std.gpa/std.credit;
                System.out.println("cgpa= "+std.cgpa);
                System.out.println("credit= "+std.credit);
                System.out.println("gpa= "+std.gpa);
                std.update();
            }
            else 
                System.out.println("old result is better");
        }catch(Exception e){
            System.out.println("server error  hh");
        }
    }
    
    
}
