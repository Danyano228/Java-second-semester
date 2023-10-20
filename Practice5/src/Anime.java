import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Anime extends JFrame{

    private ImageIcon images[];

    private int imageIndex = 0;

    public Anime() {

        images = new ImageIcon[5];
        images[0] = new ImageIcon("C:\\Programming\\Java\\Изображения\\1.jpg");
        images[1] = new ImageIcon("C:\\Programming\\Java\\Изображения\\2.jpg");
        images[2] = new ImageIcon("C:\\Programming\\Java\\Изображения\\3.jpg");
        images[3] = new ImageIcon("C:\\Programming\\Java\\Изображения\\4.jpg");
        images[4] = new ImageIcon("C:\\Programming\\Java\\Изображения\\jaba.jpg");

        JLabel label = new JLabel(images[0]);

        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        frame.add(label, BorderLayout.CENTER);

        frame.setResizable(false);

        Timer timer = new Timer(400, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                imageIndex = (imageIndex + 1) % 5;
                label.setIcon(images[imageIndex]);
            }
        });

        frame.setVisible(true);
        timer.start();
    }
}
