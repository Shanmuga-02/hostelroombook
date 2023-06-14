import java.net.Socket;
import java.sql.*;
import java.util.*;

import javax.swing.plaf.nimbus.State;
public class showhostel {
    Scanner sc=new Scanner(System.in);
    public void showhostels() throws SQLException{

        String query="select * from hostelname";
        Connection conn=Dbconnection.mycon();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getInt(1)+"   "+rs.getString(2));
        }
        conn.close();



    }
    public void showRoomDetails(String hostelName) throws SQLException{
        Connection conn=Dbconnection.mycon();
        String query="select * from "+hostelName;
        // // PreparedStatement ps=conn.prepareStatement(query);
        // // ps.setString(1, hostelName);
        // ResultSet rs=ps.executeQuery();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4));
        }



    }
    public String  getHostelName(int id) throws SQLException{
        String finalName="";
        System.out.println("ID FROM 106"+id);
        Connection conn=Dbconnection.mycon();
        String query="select hostel_name from hostelname where id=?";
        PreparedStatement ps=conn.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            System.out.println("FROM FUNCTION");
            String result=rs.getString("hostel_name");
            System.out.println(result);
            finalName=result;
        }
        return finalName;


    }
    
    // public void showdiamond() throws SQLException{
    //     String query="select * from diamond";
    //     Connection conn=Dbconnection.mycon();
    //     Statement st=conn.createStatement();
    //     ResultSet rs=st.executeQuery(query);
    //     while(rs.next()){
    //         System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4));
    //     }

    // }
    // public void showemerald() throws SQLException{
    //     String query="select * from emerald ";
    //     Connection conn=Dbconnection.mycon();
    //     Statement st=conn.createStatement();
    //     ResultSet rs=st.executeQuery(query);
    //     while(rs.next()){
    //         System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4));
    //     }
    //     conn.close();

    // }
    // public void showpearl() throws SQLException{
    //     String query="select * from pearl";
    //     Connection conn=Dbconnection.mycon();
    //     Statement st=conn.createStatement();
    //     ResultSet rs=st.executeQuery(query);
    //     while(rs.next()){
    //         System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4));

    //     }
    //     conn.close();
    // }
    // public void showsaphire() throws SQLException{
    //     String query="select * from saphire";
    //     Connection conn=Dbconnection.mycon();
    //     Statement st=conn.createStatement();
    //     ResultSet rs=st.executeQuery(query);
    //     while(rs.next()){
    //         System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4));

    //     }
    //     conn.close();
    // }
    // public void showruby() throws SQLException{
    //     String query="select * from ruby";
    //     Connection conn=Dbconnection.mycon();
    //     Statement st=conn.createStatement();
    //     ResultSet rs=st.executeQuery(query);
    //     while(rs.next()){
    //         System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4));

    //     }
    //     conn.close();
    // }
    public void pearlRoom() throws SQLException{
        // int roomNumber;
        // System.out.print("Enter room Number:");
        // roomNumber=sc.nextInt();
        // System.out.println(roomNumber);
        // String query="update pearl set availability=availability-1 where roomNo="+roomNumber;
        // // String query2="update pearl set availability=case where roomNo=? availability<0 then 0 end";
        // String query2 = "UPDATE pearl SET availability = CASE WHEN roomNo = ? AND availability < 0 THEN 0 ELSE availability END WHERE roomNo = ?";
        // Connection conn=Dbconnection.mycon();
        // Statement st=conn.createStatement();
        // PreparedStatement ps=conn.prepareStatement(query2);
        // ps.setInt(1, roomNumber);
        // st.execute(query);
        // ps.executeUpdate(query2);
    int roomNumber;
    Connection conn = Dbconnection.mycon();
    System.out.print("Enter room Number:");
    roomNumber = sc.nextInt();
    System.out.println(roomNumber);
    String query3="select availability from pearl where roomNo= "+roomNumber;
    PreparedStatement ps=conn.prepareStatement(query3);
    ResultSet rs=null;
    rs=ps.executeQuery();
    int result=0;
    if(rs.next()){
        result=rs.getInt("availability");
    }

    System.out.println(result);
    if(result>0){
    String query = "UPDATE pearl SET availability = availability - 1 WHERE roomNo = ?";
    String query2 = "UPDATE pearl SET availability = CASE WHEN roomNo = ? AND availability <=0 THEN 0 ELSE availability END WHERE roomNo = ?";
    ps = conn.prepareStatement(query);
    ps.setInt(1, roomNumber);
    ps.executeUpdate();
    ps = conn.prepareStatement(query2);
    ps.setInt(1, roomNumber);
    ps.setInt(2, roomNumber);
    ps.executeUpdate();
    //SELECT column_name FROM your_table WHERE condition_column = ?
    
    ps.close();
    conn.close();
    }
    else{
        System.out.println("Sorry!!No vacancy available in room number "+roomNumber);
    }

    }
    public void rubyRoom() throws SQLException{
        
    int roomNumber;
    Connection conn = Dbconnection.mycon();
    System.out.print("Enter room Number:");
    roomNumber = sc.nextInt();
    System.out.println(roomNumber);
    String query3="select availability from ruby where roomNo= "+roomNumber;
    PreparedStatement ps=conn.prepareStatement(query3);
    ResultSet rs=null;
    rs=ps.executeQuery();
    int result=0;
    if(rs.next()){
        result=rs.getInt("availability");
    }

    System.out.println(result);
    if(result>0){
    String query = "UPDATE ruby SET availability = availability - 1 WHERE roomNo = ?";
    String query2 = "UPDATE ruby SET availability = CASE WHEN roomNo = ? AND availability <=0 THEN 0 ELSE availability END WHERE roomNo = ?";
    ps = conn.prepareStatement(query);
    ps.setInt(1, roomNumber);
    ps.executeUpdate();
    ps = conn.prepareStatement(query2);
    ps.setInt(1, roomNumber);
    ps.setInt(2, roomNumber);
    ps.executeUpdate();
    //SELECT column_name FROM your_table WHERE condition_column = ?
    
    ps.close();
    conn.close();
    }
    else{
        System.out.println("Sorry!!No vacancy available in room number "+roomNumber);
    }

    }
    public void saphireroom() throws SQLException{
        
    int roomNumber;
    Connection conn = Dbconnection.mycon();
    System.out.print("Enter room Number:");
    roomNumber = sc.nextInt();
    System.out.println(roomNumber);
    String query3="select availability from saphire where roomNo= "+roomNumber;
    PreparedStatement ps=conn.prepareStatement(query3);
    ResultSet rs=null;
    rs=ps.executeQuery();
    int result=0;
    if(rs.next()){
        result=rs.getInt("availability");
    }

    System.out.println(result);
    if(result>0){
    String query = "UPDATE saphire SET availability = availability - 1 WHERE roomNo = ?";
    String query2 = "UPDATE saphire SET availability = CASE WHEN roomNo = ? AND availability <=0 THEN 0 ELSE availability END WHERE roomNo = ?";
    ps = conn.prepareStatement(query);
    ps.setInt(1, roomNumber);
    ps.executeUpdate();
    ps = conn.prepareStatement(query2);
    ps.setInt(1, roomNumber);
    ps.setInt(2, roomNumber);
    ps.executeUpdate();
    //SELECT column_name FROM your_table WHERE condition_column = ?
    
    ps.close();
    conn.close();
    }
    else{
        System.out.println("Sorry!!No vacancy available in room number "+roomNumber);
    }

    }
    public void emeraldroom() throws SQLException{
        
    int roomNumber;
    Connection conn = Dbconnection.mycon();
    System.out.print("Enter room Number:");
    roomNumber = sc.nextInt();
    System.out.println(roomNumber);
    String query3="select availability from emerald where roomNo= "+roomNumber;
    PreparedStatement ps=conn.prepareStatement(query3);
    ResultSet rs=null;
    rs=ps.executeQuery();
    int result=0;
    if(rs.next()){
        result=rs.getInt("availability");
    }

    System.out.println(result);
    if(result>0){
    String query = "UPDATE emerald SET availability = availability - 1 WHERE roomNo = ?";
    String query2 = "UPDATE emerald SET availability = CASE WHEN roomNo = ? AND availability <=0 THEN 0 ELSE availability END WHERE roomNo = ?";
    ps = conn.prepareStatement(query);
    ps.setInt(1, roomNumber);
    ps.executeUpdate();
    ps = conn.prepareStatement(query2);
    ps.setInt(1, roomNumber);
    ps.setInt(2, roomNumber);
    ps.executeUpdate();
    //SELECT column_name FROM your_table WHERE condition_column = ?
    
    ps.close();
    conn.close();
    }
    else{
        System.out.println("Sorry!!No vacancy available in room number "+roomNumber);
    }

    }

    public void diamondroom() throws SQLException{
        
    int roomNumber;
    Connection conn = Dbconnection.mycon();
    System.out.print("Enter room Number:");
    roomNumber = sc.nextInt();
    System.out.println(roomNumber);
    String query3="select availability from diamond where roomNo= "+roomNumber;
    PreparedStatement ps=conn.prepareStatement(query3);
    ResultSet rs=null;
    rs=ps.executeQuery();
    int result=0;
    if(rs.next()){
        result=rs.getInt("availability");
    }

    System.out.println(result);
    if(result>0){
    String query = "UPDATE diamond SET availability = availability - 1 WHERE roomNo = ?";
    String query2 = "UPDATE diamond SET availability = CASE WHEN roomNo = ? AND availability <=0 THEN 0 ELSE availability END WHERE roomNo = ?";
    ps = conn.prepareStatement(query);
    ps.setInt(1, roomNumber);
    ps.executeUpdate();
    ps = conn.prepareStatement(query2);
    ps.setInt(1, roomNumber);
    ps.setInt(2, roomNumber);
    ps.executeUpdate();
    //SELECT column_name FROM your_table WHERE condition_column = ?
    
    ps.close();
    conn.close();
    }
    else{
        System.out.println("Sorry!!No vacancy available in room number "+roomNumber);
    }

    }
}

