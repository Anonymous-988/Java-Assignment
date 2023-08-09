package exam;

import java.util.*;

public class NormieHashTable {
    public static void main(String args[]){
        Hashtable hs = new Hashtable();
        Scanner sc = new Scanner(System.in);
        String city, state;
        int op;

        while(true){
            System.out.print("\n1. Insert Date\n2. Delete Data\n3. Display Data\n4. Exit\nEnter Choice: ");
            op = Integer.parseInt(sc.next());
            switch(op){
                case 1:
                    System.out.print("Enter City: ");
                    city = sc.next();
                    System.out.print("Enter State: ");
                    state = sc.next();
                    if(!hs.containsKey(city)){
                        hs.put(city,state);
                        System.out.println(city+" City is added to table");
                    }
                    else
                    {
                        System.out.println("City Already Exists");
                    }
                    break;

                case 2:
                    System.out.print("Enter City to Delete: ");
                    city = sc.next();
                    hs.remove(city);
                    System.out.print(city+" city is removed from table");
                    break;

                case 3:
                    Enumeration key = hs.keys();
                    Enumeration vals = hs.elements();
                    System.out.println("\nCity\t| State");
                    while(key.hasMoreElements()){
                        System.out.println(key.nextElement()+"\t| "+vals.nextElement());
                    }
                    break;

                case 4:
                    System.out.println("EXITING...");
                    System.exit(0);
                    break;

                case 5:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }

}
