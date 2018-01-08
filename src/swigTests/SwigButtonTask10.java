package swigTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SwigButtonTask10 extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField textField = new JTextField(10);
    private char letter = 'a';
    private String temp;


    FocusListener fl = new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {

            textField.setText(Character.toString(letter));
        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("!!!"+ e.getSource().getClass());
            textField.setText("__NO__");
        }
    };
    KeyListener kl = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            letter=e.getKeyChar();

        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    };

    public SwigButtonTask10() {
        button.addFocusListener(fl);
        button.addKeyListener(kl);
        setLayout(new FlowLayout());
        add(textField);
        add(button);

    }

    public static void main(String[] args) {
        SwigConsole.run(new SwigButtonTask10(), 300, 300);

    }
}
