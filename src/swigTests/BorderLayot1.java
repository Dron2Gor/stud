package swigTests;

import javax.swing.*;
import java.awt.*;

public class BorderLayot1 extends JFrame {
    public BorderLayot1(){
        add(BorderLayout.NORTH, new JButton("North"));
        add(BorderLayout.SOUTH, new JButton("South"));
        add(BorderLayout.EAST, new JButton("East"));
        add(BorderLayout.WEST, new JButton("West"));
        add(BorderLayout.CENTER, new JButton("Center"));
    }

    public static void main(String[] args) {
        SwigConsole.run(new BorderLayot1(), 300, 250);
    }
}
