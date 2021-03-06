package swigTests;

import utilDecember.Countries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;


public class TextArea extends JFrame {
    private JButton b = new JButton("Add data");
    private JButton c = new JButton("Clear data");
    private JTextArea t = new JTextArea(20, 40);
    private Map<String, String> m = new HashMap<>();

    public TextArea() {
        m.putAll(Countries.capitals());
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Map.Entry me : m.entrySet())
                    t.append(me.getKey() + " " + me.getValue() + "\n");
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });
        setLayout(new FlowLayout());
        add(new JScrollPane(t));
        add(b);
        add(c);
    }

    public static void main(String[] args) {
        SwigConsole.run(new TextArea(), 475, 475);
    }
}
