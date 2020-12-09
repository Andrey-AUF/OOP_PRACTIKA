import javax.swing.*;
import java.awt.*;

public class Enemy {
    int x;
    int y;
    int v;
    Image img = new ImageIcon("F1/res/pngtree-classic-old-luxury-car-design-png-image_1040384.jpg").getImage();
    Road road;
    public Rectangle getRect(){
        return new Rectangle(x,y,100,101);
    }

    public Enemy(int x, int y, int v, Road road) {
        this.x = x;
        this.y = y;
        this.v = v;
        this.road = road;


    }

    public void move() {
        x = x - road.p.v + v;
    }
}
