import java.io.*;
import java.util.*;

public class Assign1A3 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable ht=new Hashtable();
        float per;
        String name=null;
        System.out.println("Enter no of Students : ");
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter Student name :");
            name=br.readLine();
            System.out.print("Enter Student percentage :");
            per = Float.parseFloat(br.readLine());
            ht.put(name,per);
        }
        System.out.println("Hash table contents are: "+ht);
        Enumeration key = ht.keys();
        Enumeration val= ht.elements();
        System.out.println("ID\tName");
        while(key.hasMoreElements())
        {
            System.out.println(key.nextElement()+"\t"+val.nextElement());
        }
        System.out.println("Enter name to be search : ");
        String sname=br.readLine();
        key = ht.keys();
        val= ht.elements();
        int cnt=0;
        while(key.hasMoreElements())
        {
            name = (String)key.nextElement();
            if(sname.equals(name))
            {           cnt++;
                System.out.println("Percentage = "+val.nextElement());
            }
        }
        if(cnt==0)
            System.out.println("Student not found");
    }
}
