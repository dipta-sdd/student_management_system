
package student_management_system;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.StatementImpl;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public void add(){
        if(username_available()){      
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                //ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6518757","sql6518757","jXZABmjPLt");
                ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
                String sql="INSERT INTO `teacher`(`name`, `username`, `password`, `dept`, `mobile`, `email`, `address`) VALUES  (?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, username);
                ps.setString(3, password);
                ps.setString(4, dept);
                ps.setString(5, mobile);
                ps.setString(6, email);
                ps.setString(7, address);
                ps.executeUpdate();
                System.out.println("added");
                status = true;
            }catch(Exception e){
                System.out.println(e);
                status = false;
            }
        }
    }
    public boolean username_available()
    {
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionImpl conn=(ConnectionImpl)DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sms","root","2580");
            StatementImpl st= (StatementImpl)conn.createStatement();
            String sql="select `username` from `teacher` where username ='" +username +"'";//select * from admin where username='sdd'
            ResultSet rs=st.executeQuery(sql);
            rs.next();
            if(rs.getString("username").equals(username))
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
