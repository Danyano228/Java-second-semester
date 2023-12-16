package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class CalculatorWithGUI extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;

    private Stack<Double> stack = new Stack<>();

    public void push(double value) {
        stack.push(value);
    }

    public double peek() {
        return stack.peek();
    }

    public void add() {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        double result = operand1 + operand2;
        stack.push(result);
    }

    public void subtract() {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        double result = operand1 - operand2;
        stack.push(result);
    }

    public void multiply() {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        double result = operand1 * operand2;
        stack.push(result);
    }

    public void divide() {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        if (operand2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double result = operand1 / operand2;
        stack.push(result);
    }

    public void toClear() {
        stack.clear();
    }

    public CalculatorWithGUI() {
        super("RPN Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        inputField = new JTextField();
        inputField.addActionListener(this);
        add(inputField, BorderLayout.NORTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 4));
        add(buttonPanel, BorderLayout.SOUTH);

        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);

        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);

        JButton clearButton = new JButton("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);

        JButton divideButton = new JButton("/");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);

        JButton equalButton = new JButton("=");
        equalButton.addActionListener(this);
        buttonPanel.add(equalButton);

        pack();
        setVisible(true);
    }

    public String getInput() {
        return inputField.getText();
    }

    public void clearInput() {
        inputField.setText("");
    }

    public void appendOutput(String text) {
        outputArea.append(text + "\n");
    }

    public void clearOutput() {
        outputArea.setText("");
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("=")) {
            calculate();
        } else if (command.equals("C")) {
            toClear();
        } else {
            inputField.setText(inputField.getText() + " " + command);
        }
    }

    private void calculate() {
        clearOutput();

        try {
            String input = getInput();
            String[] tokens = input.split("\\s+");
            for (String token : tokens) {
                switch (token) {
                    case "+":
                        add();
                        break;
                    case "-":
                        subtract();
                        break;
                    case "*":
                        multiply();
                        break;
                    case "/":
                        divide();
                        break;
                    default:
                        double value = Double.parseDouble(token);
                        push(value);
                        break;
                }
            }

            appendOutput(Double.toString(peek()));
        } catch (NumberFormatException e) {
            appendOutput("Invalid input: " + e.getMessage());
        } catch (ArithmeticException e) {
            appendOutput("Error: " + e.getMessage());
        }
    }

    private void clear() {
        toClear();
        clearInput();
        clearOutput();
    }
}
