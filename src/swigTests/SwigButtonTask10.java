package swigTests;

import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SwigButtonTask10 extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField textField = new JTextField(10);
    private String str = "";
    private char letter;
    private boolean mad = false;

    FocusListener fl = new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            mad = true;
            ExecutorService exec = Executors.newSingleThreadExecutor();
            exec.execute(new Runnable() {
                @Override
                public void run() {
                    while (mad) {
                        textField.setText(str);

                    }
                    str = "";
                }
            });
            exec.shutdown();
        }
        @Override
        public void focusLost(FocusEvent e) {
            mad = false;
        }
    };
    KeyListener kl = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            letter = e.getKeyChar();
            str = str + letter;
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    };

    public SwigButtonTask10() {
        button.addFocusListener(fl);
        button.addKeyListener(kl);
        addKeyListener(kl);
        setLayout(new FlowLayout());
        add(textField);
        add(button);

    }

    public static void main(String[] args) {
        SwigConsole.run(new SwigButtonTask10(), 300, 300);

    }
}
