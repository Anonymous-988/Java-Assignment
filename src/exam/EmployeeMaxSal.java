package exam;
import java.sql.*;
import java.util.Scanner;

public class EmployeeMaxSal {
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","12345678");
            Statement stmt = conn.createStatement();
            System.out.print("Enter Department");
            String designation = sc.next();
//            ResultSet rs = stmt.executeQuery("select * from employee where salary in(select max(salary) from employee group by design) and design='"+designation+"'");
            ResultSet rs = stmt.executeQuery("select * from employee where empno in(select empno from employee where salary in(select max(salary) from employee where design='"+designation+"'))");
            while(rs.next()){
                System.out.println("Id: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Design: "+rs.getString(3));
                System.out.println("Salary: "+rs.getInt(4));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
