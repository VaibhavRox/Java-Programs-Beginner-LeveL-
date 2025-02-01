import java.awt.event.*;
import javax.swing.*;

class calc2 extends JFrame implements ActionListener {
    private JButton bAdd, bSub, bMul, bDiv, bMod, bEq, bClear;
    JTextField jtf;
    String operation;
    int res;

    public calc2() {
        setTitle("Calculator");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf = new JTextField();
        jtf.setBounds(50, 50, 300, 30);
        
        // Operator buttons
        bAdd = new JButton("+");
        bAdd.setBounds(50, 100, 50, 30);
        bSub = new JButton("-");
        bSub.setBounds(110, 100, 50, 30);
        bMul = new JButton("*");
        bMul.setBounds(170, 100, 50, 30);
        bDiv = new JButton("/");
        bDiv.setBounds(230, 100, 50, 30);
        bMod = new JButton("%");
        bMod.setBounds(290, 100, 50, 30);

        bEq = new JButton("=");
        bEq.setBounds(50, 140, 140, 30);
        bClear = new JButton("C");
        bClear.setBounds(200, 140, 140, 30);

        // Add action listeners for operator buttons
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bMod.addActionListener(this);
        bEq.addActionListener(this);
        bClear.addActionListener(this);

        // Add components to the frame
        add(jtf);
        add(bAdd); add(bSub); add(bMul); add(bDiv); add(bMod); add(bEq); add(bClear);
    }

    public void doAction(String op) {
        if (operation == null) {
            operation = op;
            try {
                res = Integer.parseInt(jtf.getText());
                jtf.setText("");
            } catch (NumberFormatException e) {
                jtf.setText("Invalid Input");
                operation = null;
            }
        } else {
            try {
                int num = Integer.parseInt(jtf.getText());
                switch (operation) {
                    case "+": res += num; break;
                    case "-": res -= num; break;
                    case "*": res *= num; break;
                    case "%": res %= num; break;
                    case "/":
                        if (num == 0) throw new ArithmeticException("Division by zero");
                        res /= num;
                        break;
                }
                if (op.equals("=")) {
                    jtf.setText(String.valueOf(res));
                    res = 0;
                    operation = null;
                } else {
                    operation = op;
                    jtf.setText("");
                }
            } catch (NumberFormatException e) {
                jtf.setText("Invalid Input");
                operation = null;
                res = 0;
            } catch (ArithmeticException e) {
                jtf.setText(e.getMessage());
                operation = null;
                res = 0;
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bAdd) {
            doAction("+");
        } else if (e.getSource() == bSub) {
            doAction("-");
        } else if (e.getSource() == bMul) {
            doAction("*");
        } else if (e.getSource() == bDiv) {
            doAction("/");
        } else if (e.getSource() == bMod) {
            doAction("%");
        } else if (e.getSource() == bEq) {
            doAction("=");
        } else if (e.getSource() == bClear) {
            jtf.setText("");
            res = 0;
            operation = null;
        }
    }

    public static void main(String[] args) {
        calc2 c = new calc2();
        c.setVisible(true);
    }
}
