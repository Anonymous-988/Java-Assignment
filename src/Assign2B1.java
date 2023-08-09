import java.sql.*;
import java.util.Scanner;

class Assign2B1
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
        Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.0.66/TY279","TY279","modern");
        stmt = conn.createStatement();

        while(true)
        {
            System.out.println("\n1: View Records");
            System.out.println("2: Insert Record");
            System.out.println("3: Delete Record");
            System.out.println("4: Modify Record");
            System.out.println("5: Search Record");
            System.out.println("6: Exit");
            System.out.println("\nEnter your choice : ");
            choice = Integer.parseInt(sc.next());
            switch(choice)
            {
                case 1:
                    rs = stmt.executeQuery("Select * from students");
                    while(rs.next())
                    {
                        System.out.print("Roll Number = " + rs.getInt(1));
                        System.out.println("Name = " + rs.getString(2));
                    }
                    break;
                case 2:
                    System.out.println("Enter the roll number");
                    r = Integer.parseInt(sc.next());
                    System.out.println("Enter Name:");
                    name = sc.next();
                    System.out.println("Enter Percentage:");
                    per = Float.parseFloat(sc.next());
                    ps1 = conn.prepareStatement("Insert into students values(?,?,?)");
                    ps1.setInt(1,r);
                    ps1.setString(2,name);
                    ps1.setFloat(3, per);
                    ps1.executeUpdate();
                    System.out.println("record inserted successfully");
                    break;
                case 3:
                    System.out.println("Enter the roll number to be deleted ");
                    r = Integer.parseInt(sc.next());
                    stmt.executeUpdate("Delete from students where sno = " + r);
                    System.out.println("record deleted successfully");
                    break;
                case 4:
                    System.out.println("Enter the roll number to be modified ");
                    r = Integer.parseInt(sc.next());
                    System.out.println("Enter new name");
                    name = sc.next();
                    System.out.println("Enter new perctentage");
                    per = Float.parseFloat(sc.next());
                    ps2 = conn.prepareStatement("Update student set sname = ?,percentage=? where sno = ?");
                    ps2.setString(1,name);
                    ps2.setFloat(2,per);
                    ps2.setInt(3,r);
                    ps2.executeUpdate();
                    System.out.println("record modified successfully");
                    break;
                case 5:
                    System.out.println("Enter the roll number to be searched ");
                    r = Integer.parseInt(sc.next());
                    rs = stmt.executeQuery("Select * from student where rollno = " + r);
                    if(rs.next())
                    {
                        System.out.print("Roll Number = " + rs.getInt(1));
                        System.out.println("Name = " + rs.getString(2));
                        System.out.println("Percentage = " + rs.getFloat(3));
                    }
                    else
                        System.out.println("Student not found");
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
