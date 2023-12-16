package classes;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public Calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression in RPN: ");
        String expression = scanner.nextLine();

        String[] elems = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String elem : elems) {
            if (isNumeric(elem)) {
                stack.push(Double.parseDouble(elem));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = 0.0;

                switch (elem) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;
                        break;
                    default:
                        System.out.println("Invalid operator: " + elem);
                        return;
                }

                stack.push(result);
            }
        }

        System.out.println("Result: " + stack.pop());
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator extends JFrame {
    JTextField jta = new JTextField(10);

    Button b0 = new Button("0");
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");

    Button b10 = new Button(".");
    Button b11 = new Button("+");
    Button b12 = new Button("-");
    Button b13 = new Button("*");
    Button b14 = new Button("/");
    Button b15 = new Button("=");

    Button b16 = new Button("ce");

    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    ArrayList list = new ArrayList<Double>();
    ArrayList operators = new ArrayList<Character>();

    String curDig = "";

    Double res = 0.0;

    boolean flag = true;

    public Calculator() {
        super("MyCalculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        setSize(255,300);

        add(jta);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);

        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '0');
            }
        });

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '1');
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '2');
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '3');
            }
        });

        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '4');
            }
        });

        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '5');
            }
        });

        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '6');
            }
        });

        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '7');
            }
        });

        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '8');
            }
        });

        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '9');
            }
        });

        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (!flag) {
                    jta.setText("");
                    list.clear();
                    operators.clear();
                    flag = true;
                }
                jta.setText(jta.getText().trim() + '.');
            }
        });

        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (flag) list.add(Double.valueOf(jta.getText().trim()));
                if (!list.isEmpty()) {
                    operators.add('+');
                    jta.setText("");
                }
            }
        });

        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (flag) list.add(Double.valueOf(jta.getText().trim()));
                if (!list.isEmpty()) {
                    operators.add('-');
                    jta.setText("");
                }

            }
        });

        b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (flag) list.add(Double.valueOf(jta.getText().trim()));
                if (!list.isEmpty()) {
                    operators.add('*');
                    jta.setText("");
                }

            }
        });

        b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if (flag) list.add(Double.valueOf(jta.getText().trim()));
                if (!list.isEmpty()) {
                    operators.add('/');
                    jta.setText("");
                }

            }
        });

        b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                try {
                    list.add(Double.valueOf(jta.getText().trim()));
                    res = (Double) list.get(0);
                    for (int i = 0; i < operators.size(); i++) {
                        switch ((char) operators.get(i)) {
                            case '+':
                                res = res + ((Double) list.get(i + 1)); break;
                            case '-':
                                res = res - ((Double) list.get(i + 1)); break;
                            case '*':
                                res = res * ((Double) list.get(i + 1)); break;
                            case '/':
                                res = res / ((Double) list.get(i + 1));
                        }
                    }
                    jta.setText(String.format("%.3f", res));
                    flag = false;
                    list.clear();
                    operators.clear();
                    list.add(res);
                } catch (Exception e) {
                    jta.setText(e.getMessage());
                    list.clear();
                    operators.clear();
                }
            }
        });

        b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                jta.setText("");
                list.clear();
                operators.clear();
            }
        });

        setVisible(true);
    }
}*/
