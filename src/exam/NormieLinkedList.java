package exam;

import java.util.*;

public class NormieLinkedList {
    public static void main(String args[]){
        //List Initialization
        LinkedList list1 = new LinkedList();
        list1.add("red");
        list1.add("blue");
        list1.add("yellow");
        list1.add("orange");
        System.out.println("LinkedList Contents are "+list1);

        //Iterator
        Iterator it = list1.iterator();
        System.out.print("\nLinkedList Contents using Iterator: ");
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }

        //ListIterator
        ListIterator lit = list1.listIterator();
        while(lit.hasNext()){
            lit.next();
        }
        System.out.print("\nLinkedList Contents In Reverse Order (using List Iterator): ");
        while(lit.hasPrevious()){
            System.out.print(" "+lit.previous());
        }

        //Combining Two Linked Lists
        LinkedList list2 = new LinkedList();
        list2.add("pink");
        list2.add("green");

        Iterator it1 = list2.iterator();
            list1.add(2,it1.next());
            list1.add(3,it1.next());
        //list1.add(2,list2);           //alternate method
        System.out.println("\nNew LinkedList Contents are: "+list1);
    }
}
