import java.util.*;
public class Assign5A2 extends Thread {
    int[] array;
    int sum = 0;

    public int getSum() {
        return sum;
    }

    public Assign5A2() {
        Random r = new Random();
        array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = r.nextInt(100);
    }

    public void run() {
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
    }

    public static void main(String[] args) {
        Assign5A2 t[] = new Assign5A2[10];
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            t[i] = new Assign5A2();
            t[i].start();
        }
        for (int i = 0; i < t.length; i++) {
            sum += t[i].getSum();
        }
        System.out.println("Sum of 1000 integers is: " + sum);
        float avg = sum / 1000.0f;
        System.out.println("Average of 1000 integers is: " + avg);
    }
}
