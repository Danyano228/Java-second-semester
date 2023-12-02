package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassword extends JFrame{

    JTextField jta1 = new JTextField(20);
    JTextField jta2 = new JTextField(20);
    JTextField jta3 = new JTextField(20);

    JLabel label;

    Font font = new Font("Times new roman", Font.PLAIN, 20);

    public CheckPassword() {
        super("Password application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFont(font);
        setSize(350,200);

        label = new JLabel("", null, JLabel.CENTER);

        JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jp1.add(new JLabel("Service: "));
        jp1.add(jta1);

        JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jp2.add(new JLabel("User name: "));
        jp2.add(jta2);

        JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jp3.add(new JLabel("Password: "));
        jp3.add(jta3);

        GridLayout layout = new GridLayout(4, 1,
                                           0, 5);

        JPanel flow = new JPanel(layout);
        flow.add(jp1);
        flow.add(jp2);
        flow.add(jp3);
        flow.add(label);

        Container container = getContentPane();
        container.add(flow, BorderLayout.CENTER);

        jta3.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String str = (String)jta3.getText();

                Pattern p0 = Pattern.compile("(?=.*[@#$%])");
                Pattern p1 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,20}");
                Matcher m0 = p0.matcher(str);
                Matcher m1 = p1.matcher(str);

                if (!m0.find() && m1.find())
                    label.setText("Good password");
                else label.setText("Bad password");
            }
        });

        setVisible(true);
    }

}
