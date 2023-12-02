package classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionListenerExample extends JFrame {

    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JTextField jta3 = new JTextField(10);
    JTextField jta4 = new JTextField(10);
    JTextField jta5 = new JTextField(10);
    JTextField jta6 = new JTextField(10);

    Button b0 = new Button("add student");
    Button b1 = new Button("find student by surname");
    Button b2 = new Button("sort student array");
    Button b3 = new Button("display students");

    JLabel label = new JLabel("", null, JLabel.CENTER);

    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    public ActionListenerExample(SortingStudentsByGPA students) {
        super("Task 19");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        setSize(255,300);

        add(new JLabel("          Name:"));
        add(jta1);
        add(new JLabel("       Surname:"));
        add(jta2);
        add(new JLabel("Specialization:"));
        add(jta3);
        add(new JLabel("          Curs:"));
        add(jta4);
        add(new JLabel("         Group:"));
        add(jta5);
        add(new JLabel("           GPA:"));
        add(jta6);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(label);
        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                label.setText("");
                try {
                    String name = jta1.getText().trim();
                    String surname = jta2.getText().trim();
                    String specialization = jta3.getText().trim();
                    int curs = Integer.parseInt(jta4.getText().trim());
                    String group = jta5.getText().trim();
                    int GPA = Integer.parseInt(jta6.getText().trim());
                    students.addStudent(name, surname, specialization, curs, group, GPA);
                } catch (NumberFormatException e) {
                    label.setText("Wrong input");
                }
                catch (Exception e) {
                    label.setText(e.getMessage());
                }
            }
        });

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String surname = jta2.getText().trim();
                String text = null;
                try {
                    text = "Student is found\n" + students.findStudent(surname);
                } catch (Exception e) {
                    text = "Student is not found";
                } finally {
                    try{
                        JOptionPane.showMessageDialog(null,
                                text,"List",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch(Exception e){
                        label.setText(e.getMessage());
                    }
                }

            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                label.setText("");
                students.sortStudents();
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                label.setText("");
                try{
                    JOptionPane.showMessageDialog(null,
                            students.getStudents(),"List",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception e){
                    label.setText(e.getMessage());
                }
            }
        });
        setVisible(true);
    }

}
