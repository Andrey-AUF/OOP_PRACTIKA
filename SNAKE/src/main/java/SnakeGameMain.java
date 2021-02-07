import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SnakeGameMain extends JPanel implements ActionListener {

    public static JFrame jFrame;
    public static final int SCALE = 32;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    public static int speed = 10;

    Snake s = new Snake(5, 6, 5, 5);
    Timer timer = new Timer(1000 / speed, this);

    public SnakeGameMain() {
        timer.start();
        addKeyListener(new KeyBoard());
        setFocusable(true);

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH * SCALE, SCALE * HEIGHT);
        for (int x = 0; x < WIDTH * SCALE; x += SCALE) {
            g.setColor(Color.WHITE);
            g.drawLine(x, 0, x, HEIGHT * SCALE);

        }
        for (int y = 0; y < HEIGHT * SCALE; y += SCALE) {
            g.setColor(Color.WHITE);
            g.drawLine(0, y, WIDTH * SCALE, y);

        }
        for (int l = 0; l < s.length; l++) {
            g.setColor(Color.green);
            g.fillRect(s.sX[l] * SCALE + 1, s.sY[l] * SCALE + 1, SCALE - 1, SCALE - 1);
        }
    }

    public static void main(String[] args) {
        jFrame = new JFrame("Title");
        jFrame.setSize(WIDTH * SCALE + 6, SCALE * HEIGHT + 28);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(new SnakeGameMain());
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        s.move();
        repaint();

    }

    public class KeyBoard extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getExtendedKeyCode();
            if ((key == KeyEvent.VK_UP) && (s.direction != 2)) s.direction = 0;
            if ((key == KeyEvent.VK_DOWN) && (s.direction != 0)) s.direction = 2;
            if ((key == KeyEvent.VK_RIGHT) && (s.direction != 3)) s.direction = 1;
            if ((key == KeyEvent.VK_LEFT) && (s.direction != 1)) s.direction = 3;
        }
    }
}
