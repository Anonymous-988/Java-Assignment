package exam;

class MyThread2 extends Thread{
    String msg;

    MyThread2(String str){
        this.msg = str;
    }

    public void run(){
        while(true){
            System.out.println(msg+" is running ");
            try {
                this.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

}

public class InfiniteMultiThread {
    public static void main(String args[]){
        MyThread2 th1 = new MyThread2("Thread-1");
        th1.start();
        MyThread2 th2 = new MyThread2("Thread-2");
        th2.start();
    }
}
