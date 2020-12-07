import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;

public class Road extends JPanel {
    Image img = new ImageIcon("F1/res/doroga.jpg").getImage();

    public void paint(Graphics g) {
        g = (Graphics2D) g;
g.drawImage(img,0,0,null);
    }
}
