package swigTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTask5 extends JFrame{
    private JButton b1=new JButton("Button1");
    private JButton b2=new JButton("Button2");
    private JButton b3=new JButton("Button3");
    private JTextField textField=new JTextField(10);
    private ActionListener al=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name=((JButton)e.getSource()).getText();
            textField.setText(name);
        }
    };
    public ButtonTask5(){
        b1.addActionListener(al);
        b2.addActionListener(al);
        b3.addActionListener(al);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
//        setLayout(new FlowLayout());
        add(b3);
        add(textField);
    }

    public static void main(String[] args) {
        SwigConsole.run(new ButtonTask5(),200, 400);
    }
}
