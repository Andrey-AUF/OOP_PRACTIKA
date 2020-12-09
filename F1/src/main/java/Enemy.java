import javax.swing.*;
import java.awt.*;

public class Enemy {
    int x;
    int y;
    int v;
    Image img = new ImageIcon("F1/res/81ce14b89dd9aac90649db28065bdaef.png").getImage();
    Road road;
    public Rectangle getRect(){
        return new Rectangle(x,y,180,101);
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
