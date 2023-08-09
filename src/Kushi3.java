//import java.sql.*;
//import java.util.Scanner;
//
//public class Kushi3 {
//    public static void main(String args[]){
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//
//        Scanner sc = new Scanner(System.in);
//
//        try{
//            Class.forName(org.postgresql.Driver);
//            conn = DriverManager.getConnection("jdbc:192.168.0.66/TY279","TY279","modern");
//            stmt= conn.createStatement();
//
//
//            System.out.println("Enter The Student Roll No: ");
//            int rno = Integer.parseInt(sc.next());
//
//            rs = stmt.executeQuery("select * from students where rno="+rno);
//            while(rs.next()){
//                System.out.println("Roll No: "+rs.getInt(1)+"\tName: "+rs.getString(2)+"\tPercentage: "+rs.getFloat(3));
//
//            }
//
//
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}
