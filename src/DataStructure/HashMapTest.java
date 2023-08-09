package DataStructure;

import java.util.*;

public class HashMapTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter Number Of Data: ");
        num=sc.nextInt();
        Hashtable hs = new Hashtable();
        for(int i=0; i<num; i++) {
            LinkedList list = new LinkedList();
            System.out.println("Enter Name: ");
            String Name = sc.next();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Gender: ");
            char gender = sc.next().charAt(0);
            list.add(Name);
            list.add(age);
            list.add(gender);
            hs.put((i + 1), list);
        }
        System.out.println(hs);
    }

}
