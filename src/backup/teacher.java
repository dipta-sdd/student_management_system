/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backup;
import student_management_system.*;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.StatementImpl;
import java.sql.DriverManager;
import java.sql.ResultSet;


/**
 *
 * @author sdd
 */
public class teacher {
    
    public String name,username,password,dept,mobile,email,address;
    public boolean status = true;
    public teacher()
    {
        
    }
    public teacher (String name,String username,String password,String dept,String mobile,String email,String address)
    {
        this.name = name;
        this.username = username;
        this.password = password;
        this.dept = dept;
        this.mobile = mobile;
        this.email= email;
        this.address = address;
    }
    public boolean check_username(String username)
    {
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select `username` from `teacher` where username ='" +username +"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
            if(rs.getString("username").equals("null"))
            {
                return false;
            }
            return true;           
        }
        catch(Exception e){
            return true;
        }
    }
       
}
