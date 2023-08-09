import java.awt.*;
import java.awt.event.*;
public class AWT_Mouse extends Frame implements MouseListener{
    AWT_Mouse(){
        addMouseListener(this);
        setTitle("Mouse Listener");
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        Graphics g=getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new AWT_Mouse();
    }
}
