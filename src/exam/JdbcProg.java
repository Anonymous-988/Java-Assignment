import java.sql.*;
import java.util.Scanner;

class JdbcProg
{
    public static void main(String[] args) throws Exception
    {

        Statement stmt =  null;
        ResultSet rs = null;
        PreparedStatement ps1 = null, ps2=null;
        Scanner sc = new Scanner(System.in);
        String name;
        int r,choice;
        float per;
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","12345678");
        stmt = conn.createStatement();

        while(true)
        {
            System.out.println("\n1: View Records");
            System.out.println("2: Insert Record");
            System.out.println("3: Delete Record");
            System.out.println("4: Modify Record");
            System.out.println("5: Search Record");
            System.out.println("6: Exit");
            System.out.print("\nEnter your choice : ");
            choice = Integer.parseInt(sc.next());
            switch(choice)
            {
                case 1:
                    rs = stmt.executeQuery("Select * from students");
                    while(rs.next())
                    {
                        System.out.print("Roll Number = " + rs.getInt(1));
                        System.out.print("\tName = " + rs.getString(2));
			System.out.println("\tPercentage = " + rs.getFloat(3));
                    }
                    break;
                case 2:
                    System.out.print("\nEnter the roll number: ");
                    r = Integer.parseInt(sc.next());
                    System.out.print("\nEnter Name:");
                    name = sc.next();
                    System.out.print("\nEnter Percentage:");
                    per = Float.parseFloat(sc.next());
                    ps1 = conn.prepareStatement("Insert into students values(?,?,?)");
                    ps1.setInt(1,r);
                    ps1.setString(2,name);
                    ps1.setFloat(3, per);
                    ps1.executeUpdate();
                    System.out.println("\nrecord inserted successfully");
                    break;
                case 3:
                    System.out.print("\nEnter the roll number to be deleted: ");
                    r = Integer.parseInt(sc.next());
                    stmt.executeUpdate("Delete from students where sno = " + r);
                    System.out.println("\nrecord deleted successfully");
                    break;
                case 4:
                    System.out.print("\nEnter the roll number to be modified: ");
                    r = Integer.parseInt(sc.next());
                    System.out.print("\nEnter new name: ");
                    name = sc.next();
                    System.out.print("\nEnter new perctentage: ");
                    per = Float.parseFloat(sc.next());
                    ps2 = conn.prepareStatement("Update students set sname = ?,percentage=? where sno = ?");
                    ps2.setString(1,name);
                    ps2.setFloat(2,per);
                    ps2.setInt(3,r);
                    ps2.executeUpdate();
                    System.out.println("\nrecord modified successfully");
                    break;
                case 5:
                    System.out.print("\nEnter the roll number to be searched: ");
                    r = Integer.parseInt(sc.next());
                    rs = stmt.executeQuery("Select * from students where sno = " + r);
                    if(rs.next())
                    {
                        System.out.println("\nRoll Number = " + rs.getInt(1));
                        System.out.println("Name = " + rs.getString(2));
                        System.out.println("Percentage = " + rs.getFloat(3));
                    }
                    else
                        System.out.println("\nStudent not found");
                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
