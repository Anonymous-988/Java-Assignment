import java.awt.*;
import javax.swing.*;

class Assign5B2 extends JFrame implements Runnable {
    Thread t;
    int x, y;

    Assign5B2() {
        super();
        t = new Thread(this);
        x = 10;
        y = 10;
        t.start();
        setSize(200, 200);
        setVisible(true);
        setTitle("BOUNCEING BOLL WINDOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {
        try {
            while (true) {
                x += 10;
                y += 10;
                repaint();
                Thread.sleep(10);
            }
        } catch (Exception e) {

        }
    }

    public void paint(Graphics g) {

        g.drawOval(x, y, 0, 0);

    }

    public static void main(String a[]) throws Exception {
        Assign5B2 t = new Assign5B2();
        Thread.sleep(10);
    }
}
