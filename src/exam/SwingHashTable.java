//package exam;
//
//import java.awt.*;
//import java.util.*;
//import javax.swing.*;
//
//public class SwingHashTable extends JFrame {
//    TextField text = new TextField();
//    SwingHashTable(){
//        JPanel pan = new JPanel();
//
//        pan.add(text);
//        setSize(700,700);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
//    }
//
//    public static void main(String args[]) {
//        Hashtable hs = new Hashtable();
//        Enumeration key = hs.keys();
//        Enumeration vals = hs.elements();
//        Scanner sc = new Scanner(System.in);
//        int op;
//        String k, v;
//        while(true){
//            System.out.print("\n1. Enter Elements\n2. Display Elements\n3. Exit\nChoose Option: ");
//            op = Integer.parseInt(sc.next());
//
//            switch(op)
//            {
//                case 1:
//                    System.out.println("Enter Key: ");
//                    k = sc.next();
//                    System.out.println("Enter Value: ");
//                    v = sc.next();
//                    hs.put(k,v);
//                    break;
//
//                case 2:
//                    while(key.hasMoreElements()){
//                        String msg;
//                        msg = key.nextElement().toString()+" = "+vals.nextElement().toString()+"\n";
//                        text.setText(msg);
//                    }
//                    SwingHashTable obj = new SwingHashTable();
//                    break;
//
//                case 3:
//                    System.out.println("Exiting...");
//                    System.exit(0);
//                    break;
//
//                default:
//                    System.out.println("Invalid Option");
//                    break;
//            }
//        }
//
//    }
//}
