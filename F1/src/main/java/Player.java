import javax.swing.*;
import java.awt.*;

public class Player {
    Image img = new ImageIcon("F1/res/2377 (1).png").getImage();
    int v = 4;
    int dv = 0;
    int s = 0;
    int layer1 = 0;
    int x = 100;
    int y = 30;


    public void move() {
        s += v;
        layer1 -= v;
    }
}
