package classes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu implements ItemListener{

    JFrame fr;
    JComboBox c;
    JLabel label;

    public Menu()
    {
        fr = new JFrame("Menu");
        fr.setSize(200,150);
        fr.setLayout(new FlowLayout());

        String[] s = {"Australia","China","England","Russia"};
        c = new JComboBox(s);
        label = new JLabel();

        c.addItemListener(this);

        fr.add(c);
        fr.add(label);

        fr.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        String str = (String)c.getSelectedItem();
        if (str.equals("Australia")) label.setText("Information about Australia");
        else if (str.equals("China")) label.setText("Information about China");
        else if (str.equals("England")) label.setText("Information about England");
        else if (str.equals("Russia")) label.setText("Information about Russia");
    }
}
