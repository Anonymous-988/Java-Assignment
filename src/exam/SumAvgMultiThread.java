package exam;

import java.util.*;

public class SumAvgMultiThread extends Thread{
    int arr[];
    int sum=0;
    SumAvgMultiThread(){
        Random rand = new Random();
        int num;
        arr = new int[20];
        for(int i=0; i<arr.length; i++){
            num=rand.nextInt(1,100);
            arr[i]=num;
        }
    }
    public void run(){
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
    }

    int getSum(){
        return sum;
    }

    public static void main(String args[]){
        int sum=0;
        float avg;
        SumAvgMultiThread obj[] = new SumAvgMultiThread[5];
        for(int i=0; i<obj.length; i++){
            obj[i] = new SumAvgMultiThread();
            obj[i].start();
        }
        for(int i=0; i<obj.length; i++){
            sum= sum + obj[i].getSum();
        }
        System.out.println("\nSum of 100 Numbers is: "+sum);
        avg=sum/100.0f;
        System.out.println("\nAverage of 100 Numbers is "+avg);
    }
}
