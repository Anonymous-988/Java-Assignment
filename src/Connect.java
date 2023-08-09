import java.sql.*;
public class Connect {
    public static void main(String args[]){
        Connection conn;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:3306/root","postgres","");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
