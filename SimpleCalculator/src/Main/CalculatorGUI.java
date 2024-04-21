package Main;

import Test.Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener { 
    private static final long serialVersionUID = 1L;
    private JTextField display;
    private Calculator calculator;
    private JButton[] numberButtons = new JButton[10];
    private JButton addButton, subButton, multiButton, divButton, equalButton, clearButton;
    private JPanel panel;
    
public static void main(String[]args) {
    SwingUtilities.invokeLater(() -> {
        CalculatorGUI calculatorGUI = new CalculatorGUI();
        calculatorGUI.setVisible(true);
    });
}
    private char Operator;
    
public CalculatorGUI() {
    calculator = new Calculator();
        display = new JTextField();
        display.setBounds(30, 25, 200, 40);

        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        equalButton = new JButton("=");
        clearButton = new JButton("Clear");

        numberButtons[0] = new JButton("0");
        numberButtons[1] = new JButton("1");
        numberButtons[2] = new JButton("2");
        numberButtons[3] = new JButton("3");
        numberButtons[4] = new JButton("4");
        numberButtons[5] = new JButton("5");
        numberButtons[6] = new JButton("6");
        numberButtons[7] = new JButton("7");
        numberButtons[8] = new JButton("8");
        numberButtons[9] = new JButton("9");

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(multiButton);
        panel.add(numberButtons[0]);
        panel.add(clearButton);
        panel.add(divButton);
        panel.add(equalButton);


        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        calculator = new Calculator();

        for (JButton button : numberButtons) {
            button.addActionListener(this);
            
        }
        display = new JTextField();
        display.setEditable(false);
        
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiButton.addActionListener(this);
        divButton.addActionListener(this);
        equalButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String buttonText = button.getText();

        switch (buttonText) {
            case "Clear":
                display.setText("");
                break;
            case "=":
                
                String input = display.getText();
                String[] parts = input.split("\\+|-|\\*|/");
                if (parts.length == 2){
                    double firstOperand = Double.parseDouble(parts[0]);
                    double secondOperand = Double.parseDouble(parts[1]);
                    char operator = input.charAt(parts[0].length());
                    
                    
                    calculator.setfirstOperand(firstOperand);
                    calculator.setsecondOperand(secondOperand);
                    calculator.setOperator(Operator);
                    
                    double result = calculator.getResult();
                    display.setText(String.valueOf(result));
                } 
                else {
                    display.setText("Invalid Input");
                }
                break;
            default:
                display.setText(display.getText() + buttonText);
               
                break;
        }
    }

    
}