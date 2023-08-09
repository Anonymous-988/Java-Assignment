import java.util.*;

public class Assign1A2 {
    public static void main(String[] args) {
        LinkedList ls1 = new LinkedList();
        ls1.add("Red");
        ls1.add("Blue");
        ls1.add("Yellow");
        ls1.add("Orange");
        Iterator it = ls1.iterator();
        //PART A
        System.out.println("THE LINKED LIST CONTAINS: ");
        while(it.hasNext()){
            //String str= (String)it.next();
            System.out.println(it.next());
        }

        //PART B
        ListIterator lit= ls1.listIterator();
        while(lit.hasNext()) {
            lit.next();
        }
        System.out.println("THE LINKED LIST CONTAINS( In Reverse): ");
        while(lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        LinkedList ls2 = new LinkedList();
        ls2.add("Pink");
        ls2.add("Green");
        Iterator it2 =ls2.iterator();
        ls1.add(2,it2.next());
        ls1.add(3,it2.next());
        Iterator it3 =ls1.iterator();
        System.out.println("The New Linked List Is: ");
        while(it3.hasNext()){
            System.out.println(it3.next());
        }
    }
}