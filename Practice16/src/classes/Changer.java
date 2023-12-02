package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Changer extends JFrame {
    private JTextArea textArea;
    private JMenu colorMenu;
    private JMenu fontMenu;
    Font font = new Font("Times new roman", Font.PLAIN, 20);

    public Changer() {
        setTitle("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);

        textArea = new JTextArea();
        textArea.setFont(font);
        add(new JScrollPane(textArea));

        colorMenu = new JMenu("Цвет");

        JMenuItem blue = new JMenuItem("Синий");
        blue.addActionListener(new ColorActionListener(Color.BLUE));
        colorMenu.add(blue);

        JMenuItem red = new JMenuItem("Красный");
        red.addActionListener(new ColorActionListener(Color.RED));
        colorMenu.add(red);

        JMenuItem black = new JMenuItem("Черный");
        black.addActionListener(new ColorActionListener(Color.BLACK));
        colorMenu.add(black);

        fontMenu = new JMenu("Шрифт");

        JMenuItem timesNewRoman = new JMenuItem("Times New Roman");
        timesNewRoman.addActionListener(new FontActionListener("Times New Roman"));
        fontMenu.add(timesNewRoman);

        JMenuItem msSansSerif = new JMenuItem("MS Sans Serif");
        msSansSerif.addActionListener(new FontActionListener("MS Sans Serif"));
        fontMenu.add(msSansSerif);

        JMenuItem courierNew = new JMenuItem("Courier New");
        courierNew.addActionListener(new FontActionListener("Courier New"));
        fontMenu.add(courierNew);

        JMenuBar menu = new JMenuBar();
        menu.add(colorMenu);
        menu.add(fontMenu);
        setJMenuBar(menu);

        setVisible(true);
    }

    private class ColorActionListener implements ActionListener {
        private Color color;

        public ColorActionListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontActionListener implements ActionListener {
        private String fontName;

        public FontActionListener(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Font font = new Font(fontName, Font.PLAIN, 20);
            textArea.setFont(font);
        }
    }

}