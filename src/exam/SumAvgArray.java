import java.util.*;

public class SumAvgArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int element, n;
        int sum=0;
        float avg;
        ArrayList alist = new ArrayList();

        System.out.print("Enter Number Of Elements In List: ");
        n = Integer.parseInt(sc.next());

        for(int i=0; i<n; i++){
            System.out.print("Enter Element "+(i+1)+": ");
            element = Integer.parseInt(sc.next());
            alist.add(element);
        }

        System.out.println("Elements In ArrayList are: "+alist);

        Iterator it = alist.iterator();
        while(it.hasNext()){
            element=Integer.parseInt(it.next().toString());
            sum = sum + element;
        }

        System.out.println("Sum of ArrayList Elements Is: "+sum);

        avg = sum/(float)n;

        System.out.println("Average of ArrayList Elements is: "+avg);
    }
}