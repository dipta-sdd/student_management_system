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
 * @author sdd
 */
public class course {
    public String code,tittle,credit,dept;
    public boolean status;
    public course(){
        
    }
    public course(String code)
    {
        this.code=code;
        check();
    }
    course(String code,String tittle)
    {
        this.code=code;
        this.tittle=tittle;
        check();
    }
    public course(String code,String tittle,String credit)
    {
        this.code=code;
        this.tittle=tittle;
        this.credit=credit;
        check();
    }
    public course(String code,String tittle,String credit,String dept)
    {
        this.code=code;
        this.tittle=tittle;
        this.credit=credit;
        this.dept=dept;
        check();
    }
    public void check(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select * from course where code='" + code +"'";//select * from admin where username='sdd'
            //System.out.println("sql");
            ResultSet rs=st.executeQuery(sql);
            //while(rs.next()){ // no need while loop cause there are condition in query username='user' 
            rs.next();
            tittle=rs.getString("tittle");
            credit=rs.getString("credit");
            dept=rs.getString("dept");
            status=true;
        }
        catch(Exception e){
            status=false;        
        }
    }
    public void update()
    {
        if(!status)
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
                ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
                String sql="INSERT INTO `course`(`code`, `tittle`, `credit`,`dept`) VALUES (?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1 ,code );
                ps.setString(2 ,tittle );
                ps.setString(3 ,credit);
                ps.setString(4, dept);
                
               // System.out.println(ps);
                ps.executeUpdate();
                System.out.println("added");
                status = true;

            }
            catch(Exception e){
                System.out.println("server_error");
                status = false;
            }
        }
        else
            System.out.println("already added");
    }  
}

/*            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
                ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
                String sql="INSERT INTO `student`(`std_id`, `std_name`, `dept`, `std_cgpa`, `std_credit`, `std_gpa`, `std_mbl`, `std_email`, `std_adrs`) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString( , );
                ps.executeUpdate();
                System.out.println("added");
                status = true;

            }
            catch(Exception e){
                System.out.println("server_error");
                status = false;
            }*/