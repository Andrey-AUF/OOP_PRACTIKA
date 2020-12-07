import javax.swing.*;
import java.awt.*;

public class Player {
    Image img = new ImageIcon("F1/res/2377 (1).png").getImage();
    int v = 0;
    int dv = 0;
    int s = 0;
    int layer1 = 0;

    public void move() {
        s += v;
    }
}
