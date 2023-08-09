package exam;

import java.sql.*;

public class DatabaseInfo{
    public static void main(String args[]){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","12345678");
            DatabaseMetaData dbmd = conn.getMetaData();
            System.out.println("Database Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Version: "+dbmd.getDriverMajorVersion());
            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            ResultSet rs = dbmd.getTables(null,null,null,new String[]{"TABLE"});
            System.out.println("List of Tables Are: ");
            while(rs.next()){
                System.out.println(rs.getString("TABLE_NAME"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}