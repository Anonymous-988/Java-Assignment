class StackClass {
    private Object[] stackArray;
    private volatile int topOfStack;

    StackClass(int capacity) {
        stackArray = new Object[capacity];
        topOfStack = -1;
    }

    public synchronized Object pop() {
        System.out.println(Thread.currentThread() + ": popping");
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Object obj = stackArray[topOfStack];
        stackArray[topOfStack--] = null;
        return obj;
    }

    public synchronized void push(Object element) {
        System.out.println(Thread.currentThread() + ": pushing");
        while (isFull()) {
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stackArray[++topOfStack] = element;
    }

    public boolean isFull() {
        return topOfStack >= stackArray.length - 1;
    }

    public boolean isEmpty() {
        return topOfStack < 0;
    }
}


abstract class StackUser extends Thread {
    protected StackClass stack;

    StackUser(String threadName, StackClass stack) {
        super(threadName);
        this.stack = stack;
        setDaemon(true);
        start();
    }
}


class StackPopper extends StackUser {
    StackPopper(String threadName, StackClass stack) {
        super(threadName, stack);
    }

    public void run() {
        while (true) {
            stack.pop();
        }
    }

}

class StackPusher extends StackUser {
    StackPusher(String threadName, StackClass stack) {
        super(threadName, stack);
    }

    public void run() {
        while (true) {
            stack.push(new Integer(1));
        }
    }
}

public class Assign5C3 {
    public static void main(String[] args) {
        StackClass stack = new StackClass(5);
        new StackPusher("One", stack);
        new StackPusher("Two", stack);
        new StackPopper("Three", stack);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
