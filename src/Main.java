import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static String temp1, temp2, cur;
    static boolean full = false;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bPl = new JButton("+");
        JButton bEx = new JButton("-");
        JButton bMu = new JButton("*");
        JButton bDi = new JButton("/");
        JButton bEnt = new JButton("=");
        JButton bCls = new JButton("C");
        JButton bCo = new JButton(".");
        JButton bDel = new JButton("<");
        JButton bSR = new JButton("√");
        JButton bMod = new JButton("%");
        JTextArea text = new JTextArea("0");

        text.setBounds(10,10,229,20);
        text.setEditable(false);

        b7.setBounds(10,100,50,50);
        b8.setBounds(70,100,50,50);
        b9.setBounds(130,100,50,50);
        bDi.setBounds(190,100,50,50);
        b4.setBounds(10,160,50,50);
        b5.setBounds(70,160,50,50);
        b6.setBounds(130,160,50,50);
        bMu.setBounds(190,160,50,50);
        b1.setBounds(10,220,50,50);
        b2.setBounds(70,220,50,50);
        b3.setBounds(130,220,50,50);
        bEx.setBounds(190,220,50,50);
        bCls.setBounds(10,40,50,50);
        bMod.setBounds(70,40,50,50);
        bSR.setBounds(130,40,50,50);
        bDel.setBounds(190,40,50,50);
        bCo.setBounds(10,280,50,50);
        b0.setBounds(70,280,50,50);
        bEnt.setBounds(130,280,50,50);
        bPl.setBounds(190,280,50,50);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b1.getText());
                else
                    text.setText(text.getText() + b1.getText());
                full = false;
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b2.getText());
                else
                    text.setText(text.getText() + b2.getText());
                full = false;
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b3.getText());
                else
                    text.setText(text.getText() + b3.getText());
                full = false;
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b4.getText());
                else
                    text.setText(text.getText() + b4.getText());
                full = false;
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b5.getText());
                else
                    text.setText(text.getText() + b5.getText());
                full = false;
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b6.getText());
                else
                    text.setText(text.getText() + b6.getText());
                full = false;
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b7.getText());
                else
                    text.setText(text.getText() + b7.getText());
                full = false;
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b8.getText());
                else
                    text.setText(text.getText() + b8.getText());
                full = false;
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b9.getText());
                else
                    text.setText(text.getText() + b9.getText());
                full = false;
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equals("0") || text.getText().equals("+") || text.getText().equals("-") || text.getText().equals("*") || text.getText().equals("/") || text.getText().equals("%"))
                    text.setText(b0.getText());
                else
                    text.setText(text.getText() + b0.getText());
                full = false;
            }
        });

        bCls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("0");
            }
        });

        bEnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp2 = text.getText();
                if (cur.equals("+")) {
                    text.setText(String.valueOf(Double.parseDouble(temp1) + Double.parseDouble(temp2)));
                    cur = "";
                    full = false;
                }
                else if (cur.equals("-")) {
                    text.setText(String.valueOf(Double.parseDouble(temp1) - Double.parseDouble(temp2)));
                    cur = "";
                    full = false;
                }
                else if (cur.equals("*")) {
                    text.setText(String.valueOf(Double.parseDouble(temp1) * Double.parseDouble(temp2)));
                    cur = "";
                    full = false;
                }
                else if (cur.equals("/")) {
                    text.setText(String.valueOf(Double.parseDouble(temp1) / Double.parseDouble(temp2)));
                    cur = "";
                    full = false;
                }
                else if (cur.equals("%")) {
                    text.setText(String.valueOf(Double.parseDouble(temp1) % Double.parseDouble(temp2)));
                    cur = "";
                    full = false;
                }
            }
        });

        bPl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cur = "+";
                temp1 = text.getText();
                text.setText("+");
                full = true;
            }
        });

        bEx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cur = "-";
                temp1 = text.getText();
                text.setText("-");
                full = true;
            }
        });

        bMu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cur = "*";
                temp1 = text.getText();
                text.setText("*");
                full = true;
            }
        });

        bDi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cur = "/";
                temp1 = text.getText();
                text.setText("/");
                full = true;
            }
        });

        bMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cur = "%";
                temp1 = text.getText();
                text.setText("%");
                full = true;
            }
        });

        bSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp1 = text.getText();
                text.setText(String.valueOf(Math.sqrt(Double.valueOf(temp1))));
            }
        });

        bDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!full) {
                    if (!text.getText().equals("0"))
                        text.setText((text.getText().substring(0,((text.getText().length())-1))));
                    if (text.getText().equals(""))
                        text.setText("0");
                }
            }
        });

        bCo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!full)
                    if (!text.getText().contains("."))
                         text.setText(text.getText() + ".");
            }
        });

        frame.setLayout(null);
        frame.setTitle("Calculator");

        frame.add(text);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bPl);
        frame.add(bEx);
        frame.add(bMu);
        frame.add(bDi);
        frame.add(b0);
        frame.add(bEnt);
        frame.add(bCls);
        frame.add(bCo);
        frame.add(bMod);
        frame.add(bDel);
        frame.add(bSR);

        frame.setVisible(true);
        frame.setSize(265,375);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}