package classes;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

import static javax.swing.SwingUtilities.paintComponent;

public class Task1 extends JFrame{
    private  static final int WINDOW_WIDTH = 1000;
    private  static final int WINDOW_HEIGHT = 800;
    private  static final int NUMBER_SHAPES = 20;

    public Task1 () {
        setTitle("Figures");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Random random = new Random();

                for (int i = 0; i < NUMBER_SHAPES; i++) {
                    int x = random.nextInt(WINDOW_WIDTH);
                    int y = random.nextInt(WINDOW_HEIGHT);
                    Color color = new Color(random.nextInt(256),
                                            random.nextInt(256),
                                            random.nextInt(256));

                    if (random.nextBoolean()) {
                        g.setColor(color);
                        g.fillOval(x, y, 20 + random.nextInt(31),
                                         20 + random.nextInt(31));
                    } else {
                        g.setColor(color);
                        g.fillRect(x, y, 20 + random.nextInt(31),
                                         20 + random.nextInt(31));
                    }
                }
            }
        };
        add(panel);

        setVisible(true);
    }
}
