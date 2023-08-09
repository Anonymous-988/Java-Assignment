package exam;
import java.util.*;

import static java.lang.System.exit;

public class UnionIntersection
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();
        LinkedList list4 = new LinkedList();

        String element;

        //LIST 1
        System.out.print("Enter Number Of Elements in List 1: ");
        int n1 = Integer.parseInt(sc.next());
        for(int i=0; i<n1; i++)
        {
            System.out.print("Enter Element "+(i+1)+": ");
            element = sc.next();
            if(!list1.contains(element))
                list1.add(element);
            else{
                System.out.println("Entered Wrong List");
                exit(0);
            }
        }

        //LIST 2
        System.out.print("\nEnter Number Of Elements in List 2: ");
        int n2 = Integer.parseInt(sc.next());
        for(int i=0; i<n2; i++)
        {
            System.out.print("Enter Element "+(i+1)+": ");
            element = sc.next();
            if(!list2.contains(element))
                list2.add(element);
            else{
                System.out.println("Entered Wrong List");
                exit(0);
            }
        }

        //INTERSECTION INITIALIZTION
        for(int i=0; i<n1; i++)
        {
            element = list1.get(i).toString();
            list4.add(element);
        }

        //INTERSECTION AND UNION LIST
        int flag=0;
        for(int i=0; i<n2; i++)
        {
            for(int j=0; j<n1; j++)
            {
                flag=0;
                if(list2.get(i).equals(list1.get(j)))
                {
                    element = list2.get(i).toString();
                    list3.add(element);
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                element = list2.get(i).toString();
                list4.add(element);
            }
        }

        int op;
        while(true)
        {
            System.out.print("\n\n1. Intersection\n2. Union\n3. Exit\nChoose Option: ");
            op = Integer.parseInt(sc.next());
            switch(op)
            {
                case 1:
                    System.out.println("Intersection of List1 & List2: "+list3);
                    break;

                case 2:
                    System.out.println("Union of List1 & List2: "+list4);
                    break;

                case 3:
                    System.out.println("Exiting....");
                    exit(0);
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}