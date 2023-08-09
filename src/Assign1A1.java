import javax.swing.plaf.synth.SynthTreeUI;
import java.util.*;
import java.io.*;

public class Assign1A1 {
    public static void main(String[] args) throws Exception{
        int no, element, key;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        TreeSet ts= new TreeSet();
        System.out.println("Enter the no. of elements: ");
        no=Integer.parseInt(br.readLine());
        for (int i=0;i<no;i++){
            System.out.println("Enter the element: ");
            element=Integer.parseInt(br.readLine());
            ts.add(element);
        }
        System.out.println("The elements in sorted order are: "+ts);
        System.out.println("Enter element to be searched: ");
        key=Integer.parseInt(br.readLine());
        if(ts.contains(key)){
            System.out.println("Element is present in the collection");
        }
        else{
            System.out.println("Element is not present in the collection");
        }
    }
}
