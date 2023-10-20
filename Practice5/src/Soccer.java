import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Soccer extends JFrame {
    private int milan = 0;
    private int madrid = 0;

    JLabel label1 = new JLabel("Result: 0 X 0", JLabel.CENTER);
    JLabel label2 = new JLabel("LastScorer: N/A", JLabel.CENTER);
    JLabel label3 = new JLabel("Winner: DRAW", JLabel.CENTER);

    public Soccer() {
        JFrame frame = new JFrame("Match results");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(360, 200));

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");

        button1.setBounds(20, 20, 150, 50);
        button2.setBounds(190, 20, 150, 50);

        panel.add(button1);
        panel.add(button2);


        label1.setBounds(20, 90, 320, 10);
        label2.setBounds(20, 120, 320, 10);
        label3.setBounds(20, 150, 320, 10);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                label1.setText(String.format("Result: %d X %d", milan, madrid));
                label2.setText("LastScorer: AC Milan");
                setWinner();
            }
        });

        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                madrid++;
                label1.setText(String.format("Result: %d X %d", milan, madrid));
                label2.setText("LastScorer: Real Madrid");
                setWinner();
            }
        });

        frame.setResizable(false);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public void setWinner() {
        if (milan == madrid) {
            label3.setText("Winner: DRAW");
        } else if (milan > madrid) {
            label3.setText("Winner: AC Milan");
        } else {
            label3.setText("Winner: Real Madrid");
        }
    }
}
