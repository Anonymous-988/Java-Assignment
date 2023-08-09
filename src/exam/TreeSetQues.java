package exam;

import java.util.*;

public class TreeSetQues {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TreeSet ts = new TreeSet();
        System.out.print("Enter No. of Elements: ");
        int num = Integer.parseInt(sc.next());
        String element;
        for(int i=0; i<num; i++){
            System.out.print("Enter Elements: ");
            element=sc.next();
            ts.add(element);
        }

        System.out.println("Elements in TreeSet are "+ts);

        System.out.print("Enter Element to Search: ");
        element=sc.next();
        if(ts.contains(element)){
          System.out.println("Element "+element+" is present in TreeSet");
        }
        else
        {
            System.out.println("Element "+element+" is not present in TreeSet");
        }
    }
}
