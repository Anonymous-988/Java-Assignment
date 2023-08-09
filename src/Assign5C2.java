import java.awt.*;
import javax.swing.*;

class Assign5C2 extends JFrame {
    private final JButton red, green, yellow;
    private int state = 0;

    public Assign5C2() {
        setTitle("TrafficLight");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        red = new JButton();
        yellow = new JButton();
        green = new JButton();
        setLayout(new GridLayout(3, 1));
        this.add(red);
        this.add(yellow);
        this.add(green);
        Thread t = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    updateState();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }

        });
        t.start();
    }

    private void updateState() {
        int n = state % 3;
        red.setBackground(n == 0 ? Color.RED : Color.WHITE);
        yellow.setBackground(n == 1 ? Color.YELLOW : Color.WHITE);
        green.setBackground(n == 2 ? Color.GREEN : Color.WHITE);
        state++;
    }

    public static void main(String[] args) {
        new Assign5C2().setVisible(true);
    }
}
