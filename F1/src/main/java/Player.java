import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {
    Image img = new ImageIcon("F1/res/2377 (1).png").getImage();
    int v = 0;
    int dv = 0;
    int s = 0;
    int layer1 = 0;
    int layer2 = 4608;
    int x = 100;
    int y = 30;
    int dy = 0;


    public void move() {
        s += v;
        v += dv;
        y += dy;
        if (layer2 - v < 0) {
            layer1 = 0;
            layer2 = 4608;

        } else {
            layer1 -= v;
            layer2 -= v;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            dv = 1;
        }
        if (key == KeyEvent.VK_LEFT) {
            dv = -1;
        }
        if (key == KeyEvent.VK_UP) {
            dy = 3;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = -5;
        }

    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT) {
            dv = 0;
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
        }

    }
}
