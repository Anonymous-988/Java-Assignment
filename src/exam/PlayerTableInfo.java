package exam;
import java.sql.*;

public class PlayerTableInfo{
    public static void main(String args[]){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","12345678");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from player");
            ResultSetMetaData rsmd = rs.getMetaData();
            int noc = rsmd.getColumnCount();
            for(int i=1; i<=noc; i++){
                System.out.println("\nColumn No: "+i);
                System.out.println("Column Name: "+rsmd.getColumnName(i));
                System.out.println("Column Datatype: "+rsmd.getColumnTypeName(i));
                System.out.println("Column Size: "+rsmd.getColumnDisplaySize(i));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}