import java.sql.*;

public class StudentTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn;
        Statement st;
        ResultSet rs;
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost/stud","postgres","password");
        if(true){
            System.out.println("Connection successful");
        }
        else{
            System.out.println("Connection unsuccessful");
        }
    }
}
