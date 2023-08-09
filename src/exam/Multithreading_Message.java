package exam;

class MyThread1 extends Thread{
    String msg="";
    int num=0;
    MyThread1(String msg, int num){
        this.msg=msg;
        this.num=num;
    }

    public void run() {
        for (int i = 0; i < num; i++) {
            System.out.println(msg + " printed " + (i + 1) + " times");
        }
    }
}

public class Multithreading_Message {
    public static void main(String args[]){
        MyThread1 t1 = new MyThread1("I am FY",10);
        MyThread1 t2 = new MyThread1("I am SY",20);
        MyThread1 t3 = new MyThread1("I am TY",30);
        t1.start();
        t2.start();
        t3.start();
    }

}
