package exam;

import java.util.*;
import javax.sql.*;

public class MedianModeArrayList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList();

        System.out.print("Enter No. of Elements: ");
        int num = Integer.parseInt(sc.next());
        int element;
        String temp;
        float sum=0;
        for(int i=0; i<num; i++)
        {
            System.out.print("Enter Element "+(i+1)+": ");
            element = Integer.parseInt(sc.next());
            arr.add(element);
        }

        //System.out.println(arr[2]);
        Iterator it = arr.iterator();

        while(it.hasNext()){
//            temp= it.next().toString();
//            sum += Integer.parseInt(temp);
            sum= sum + Integer.parseInt(it.next().toString());
        }

//        System.out.println(sum);
        float mean = sum/num;

        System.out.println("Mean of ArrayList is: "+mean);

        Collections.sort(arr);
        if(num%2!=0)
        {
            int index=(num/2);
            System.out.println("Median of ArrayList: "+ arr.get(index));
        }
        else
        {
            int index1=(num-1)/2;
            int index2=(num+1)/2;
            float median= (Integer.parseInt(arr.get(index1).toString())+Integer.parseInt(arr.get(index2).toString()))/2.0f;
            System.out.println("Median of ArrayLis Is : "+ median);

        }
    }
}
