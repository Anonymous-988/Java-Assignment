import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;


public class kushi1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Strings: ");
        int n = Integer.parseInt(sc.next());
        LinkedList li = new LinkedList();
        for(int i=0; i<n; i++){
            System.out.print("\nEnter String"+(i+1)+": ");
            li.add(sc.next());
        }

        System.out.println("\nEntered string is: "+li);
    }
}
