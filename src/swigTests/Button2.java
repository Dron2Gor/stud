package swigTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Button2 extends JFrame{
    private JButton b1=new JButton("Button 1");
    private JButton b2= new JButton("Button 2");
    private JTextField txt=new JTextField(10);
    private ActionListener bl=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name =((JButton)e.getSource()).getText();

            txt.setText(name);

        }
    };
    public Button2(){
        b1.addActionListener(bl);
        b2.addActionListener(bl);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(txt);
    }
    public static void main(String[] args) {
        SwigConsole.run(new Button2(), 200, 150);
    }
}
