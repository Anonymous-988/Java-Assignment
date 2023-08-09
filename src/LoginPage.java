import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class SuccessPage extends JFrame{
    JFrame f1;
    JLabel greet;
    String uname;

    SuccessPage(String str){
        this.uname = str;

        f1 = new JFrame("Success Page");
        f1.setSize(500,500);
        f1.setLocation(100,200);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        greet = new JLabel("Welcome, "+uname);
        greet.setFont(new Font("Serif", Font.BOLD, 40));
        greet.setBackground(Color.yellow);
        greet.setBounds(100,20,600,300);

        f1.add(greet);
        f1.setVisible(true);
    }
}

public class LoginPage extends JFrame implements ActionListener {
    JFrame frame;
    JButton login, signin;
    JTextField text1, text2;
    JLabel username, password;

    Connection conn;
    Statement stmt;
    ResultSet rs;
    PreparedStatement ps;

    LoginPage(){
        frame = new JFrame("Login Page");
        frame.setSize(500,200);
        frame.setLocation(300,600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        username = new JLabel("USERNAME: ");
        username.setBounds(80,20,80,25);

        password = new JLabel("PASSWORD: ");
        password.setBounds(80,59,80,25);

        text1 = new JTextField();
        text1.setBounds(160,20,200,25);

        text2 = new JTextField();
        text2.setBounds(160,60,200,25);

        login = new JButton("LOGIN");
        login.setBounds(140,120, 90,30);
        signin = new JButton("SIGNIN");
        signin.setBounds(240,120, 90,30);

        login.addActionListener(this);
        signin.addActionListener(this);

        frame.add(username);
        frame.add(text1);
        frame.add(password);
        frame.add(text2);
        frame.add(login);
        frame.add(signin);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if((JButton)login==e.getSource()){
            try{
                String user = text1.getText();
                String pass = text2.getText();
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres", "12345678");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("select * from users where uname=\'"+user+"\'");

                if(rs.next()){
                    String pass1 = rs.getString(2);
                    if(pass.equals(pass1)){
                        JOptionPane.showMessageDialog(null,"Login Successful");
                        SuccessPage obj1 = new SuccessPage(user);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid Password");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username");
                }

            }
            catch(Exception ex) {
                System.out.println(ex);
            }
        }
        else if((JButton)signin==e.getSource()){
            try{
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","12345678");
                ps = conn.prepareStatement("insert into users values(?,?)");
                String user = text1.getText();
                String pass = text2.getText();
                ps.setString(1,user);
                ps.setString(2,pass);
                int res= ps.executeUpdate();
                if(res!=0){
                    JOptionPane.showMessageDialog(null, "Value Inserted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Value Cannot Be Inserted");
                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        }
    }

    public static void main(String args[]) {
        LoginPage obj = new LoginPage();
    }
}
