package exam;

import java.util.*;

public class TourHashtable {
    public static void main(String args[]){
        Hashtable ht = new Hashtable();
        Scanner sc =new Scanner(System.in);
        String source, dest;

        System.out.print("Enter Number of Tours: ");
        int n = Integer.parseInt(sc.next());

        for(int i=0; i<n; i++) {
            System.out.print("Enter Tour Source: ");
            source = sc.next();
            System.out.print("Enter Tour Destination: ");
            dest = sc.next();
            ht.put(source,dest);
        }

        System.out.println("Hashtable elements are: "+ht);

        Enumeration kt = ht.keys();
        Enumeration vt = ht.elements();

        System.out.print("Enter Tour Source to search: ");
        source = sc.next();
        System.out.print("Destination for given source is: "+ht.get(source));


    }
}
