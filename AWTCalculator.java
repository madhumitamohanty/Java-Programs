import java.awt.*;
import java.awt.event.*;

public class AWTCalculator extends Frame implements ActionListener {

    TextField tf;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button add, sub, mul, div, eq, clr;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public AWTCalculator() {
        
        setTitle("AWT Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

       
        tf = new TextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        add(tf, BorderLayout.NORTH);

        
        Panel p = new Panel();
        p.setLayout(new GridLayout(5, 4, 5, 5));

       
        b0 = new Button("0"); b1 = new Button("1"); b2 = new Button("2");
        b3 = new Button("3"); b4 = new Button("4"); b5 = new Button("5");
        b6 = new Button("6"); b7 = new Button("7"); b8 = new Button("8");
        b9 = new Button("9");

        add = new Button("+"); sub = new Button("-");
        mul = new Button("*"); div = new Button("/");
        eq = new Button("="); clr = new Button("C");

       
        
        p.add(b7); p.add(b8); p.add(b9); p.add(add);
        p.add(b4); p.add(b5); p.add(b6); p.add(sub);
        p.add(b1); p.add(b2); p.add(b3); p.add(mul);
        p.add(b0); p.add(clr); p.add(eq); p.add(div);

        add(p, BorderLayout.CENTER);

       
        Button[] buttons = {b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,
                            add,sub,mul,div,eq,clr};

        for (Button b : buttons) {
            b.addActionListener(this);
        }

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        
        if (cmd.matches("[0-9]")) {
            tf.setText(tf.getText() + cmd);
        }

        
        else if (cmd.equals("+") || cmd.equals("-") || 
                 cmd.equals("*") || cmd.equals("/")) {
            num1 = Double.parseDouble(tf.getText());
            operator = cmd.charAt(0);
            tf.setText("");
        }

        
        else if (cmd.equals("=")) {
            num2 = Double.parseDouble(tf.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            tf.setText("" + result);
        }

        
        else if (cmd.equals("C")) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new AWTCalculator();
    }
}