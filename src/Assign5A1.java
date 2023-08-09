class MyThread extends Thread {
    String str;
    public MyThread(String s) {
        str = s;
    }
    public void run() {
        while (true) {
            System.out.println((Thread.currentThread()).getName() + " " + "Message: " + str);
            System.out.println("Thread is running.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie.toString());
            }
        }
    }
}
public class Assign5A1 {
    public static void main(String args[]) {
        MyThread t1 = new MyThread("thread ON");
        MyThread t2 = new MyThread("thread OFF");
        System.out.println("Details of the Threads in running state....");
        t1.start();
        t2.start();
    }
}
