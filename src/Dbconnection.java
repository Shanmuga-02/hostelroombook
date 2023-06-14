import java.sql.*;

public class Dbconnection {

    public static Connection mycon(){
        // System.out.println("DB FROM CONNECT DB");

        Connection conn=null;
        try{
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelroombooking","root","shanmu");
            // System.out.println("DB FROM CONNECT DB");
            
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return conn;
    }
}
