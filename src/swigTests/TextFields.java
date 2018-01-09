package swigTests;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFields extends JFrame {
    private JButton b1 = new JButton("Get text");
    private JButton b2 = new JButton("Set text");
    private JTextField
            t1 = new JTextField(30),
            t2 = new JTextField(30),
            t3 = new JTextField(30);
    private String s = "";

    class UpperCaseDocument extends PlainDocument {
        private boolean upperCase = true;
        public void setUpperCase(boolean flag) {
            upperCase = flag;
        }
        public void insertString(int offset, String str, AttributeSet attSet) throws BadLocationException {
            if (upperCase) str = str.toUpperCase();
            super.insertString(offset, str, attSet);
        }
    }

    private UpperCaseDocument ucd = new UpperCaseDocument();

    public TextFields() {
        t1.setDocument(ucd);
        ucd.addDocumentListener(new T1());
        b1.addActionListener(new B1());
        b2.addActionListener(new B2());
        t1.addActionListener(new T1A());
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(t1);
        add(t2);
        add(t3);
    }

    class T1 implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            t2.setText(t1.getText());
            t3.setText("Text: " + t1.getText());
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            t2.setText(t1.getText());
        }

        public void changedUpdate(DocumentEvent e) {
        }

    }

    class T1A implements ActionListener {
        private int count = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            t3.setText("t1 Action Event " + count++);
        }
    }

    class B1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (t1.getSelectedText() == null)
                s = t1.getText();
            else s = t1.getSelectedText();
            t1.setEditable(true);

        }
    }
    class B2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ucd.setUpperCase(false);
            t1.setText("Insert by button 2: " + s);
            ucd.setUpperCase(true);
            t1.setEditable(false);
        }
    }

    public static void main(String[] args) {
        SwigConsole.run(new TextFields(), 375, 200);
    }

}
