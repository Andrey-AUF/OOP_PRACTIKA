import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Road extends JPanel implements ActionListener {
    Timer mainTimer = new Timer(20, this);
    Image img = new ImageIcon("F1/res/doroga.jpg").getImage();
    Player p = new Player();
    public Road(){
        mainTimer.start();
    }

    public void paint(Graphics g) {
        g = (Graphics2D) g;
        g.drawImage(img, p.layer1, 0, null);
        g.drawImage(p.img, p.x, p.y, null);
    }

    public void actionPerformed(ActionEvent e) {
        p.move();
        repaint();

    }
}
