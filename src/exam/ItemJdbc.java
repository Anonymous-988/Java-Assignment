package exam;

import java.sql.*;
import java.util.*;

public class ItemJdbc {
    public static void main(String args[]){
        int op;
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","12345678");
            Statement stmt = conn.createStatement();
            PreparedStatement ps1 = null; //conn.prepareStatement("");

            while(true){
                System.out.print("\n1. Insert Values\n2. Display Values\n3. Exit\nChoose option: ");
                op = Integer.parseInt(sc.next());
                switch(op){
                    case 1:
                        int ino;
                        float price;
                        String iname, idesc;
                        ps1 = conn.prepareStatement("insert into item values(?,?,?,?)");
                        System.out.print("Enter Item no: ");
                        ino = Integer.parseInt(sc.next());
                        System.out.print("Enter Item name: ");
                        iname = sc.next();
                        System.out.print("Enter Item description: ");
                        idesc = sc.next();
                        System.out.print("Enter Item price: ");
                        price = Float.parseFloat(sc.next());

                        ps1.setInt(1, ino);
                        ps1.setString(2, iname);
                        ps1.setString(3, idesc);
                        ps1.setFloat(4, price);
                        ps1.executeUpdate();
                        System.out.println("Record Inserted");
                        break;

                    case 2:
                        System.out.println("\nItem No\t| Item Name\t| Item Desc.\t| Price\t\t|");
                        ResultSet rs = stmt.executeQuery("select * from item");
                        while(rs.next()){
                            System.out.println("\t"+rs.getInt(1)+"\t| "+rs.getString(2)+"\t\t| "+rs.getString(3)+"\t\t| "+rs.getFloat(4)+"\t|");
                        }
                        break;

                    case 3:
                        System.out.println("Exiting");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
