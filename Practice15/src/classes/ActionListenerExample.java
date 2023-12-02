package classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionListenerExample extends JFrame{

    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);

    Button b0 = new Button("sum");
    Button b1 = new Button("sub");
    Button b2 = new Button("mul");
    Button b3 = new Button("div");

    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    public ActionListenerExample() {
        super("Example");

        setLayout(new FlowLayout());
        setSize(250,150);

        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result =" + (x1+x2),"Alert",
                            JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null,
                            "Error in Numbers !","alert" ,
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result =" + (x1-x2),"Alert",
                            JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null,
                            "Error in Numbers !","alert" ,
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result =" + (x1*x2),"Alert",
                            JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null,
                            "Error in Numbers !","alert" ,
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result =" + (x1/x2),"Alert",
                            JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null,
                            "Error in Numbers !","alert" ,
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

}
