package classes;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {

    public Task2(String link) {
        System.out.println(link);

        ImageIcon image = new ImageIcon(link);

        JLabel label = new JLabel(image);

        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        frame.add(label, BorderLayout.CENTER);

        frame.setResizable(false);

        frame.setVisible(true);
    }
}
