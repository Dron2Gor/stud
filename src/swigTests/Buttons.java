package swigTests;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

public class Buttons extends JFrame {
    private JButton jb =new JButton("JButton");
    private BasicArrowButton up=new BasicArrowButton(BasicArrowButton.NORTH);
    private BasicArrowButton down=new BasicArrowButton(BasicArrowButton.SOUTH);
    private BasicArrowButton right=new BasicArrowButton(BasicArrowButton.EAST);
    private BasicArrowButton left=new BasicArrowButton(BasicArrowButton.WEST);
    public Buttons(){
        setLayout(new FlowLayout());
        add(jb);
        add(new JToggleButton("JToggleButton"));
        add(new JCheckBox("JCheckBox"));
        add(new JRadioButton("JRadioButton"));
        JPanel jp=new JPanel();
        jp.setBorder(new TitledBorder(""));
        jp.add(up);
        jp.add(down);
        jp.add(right);
        jp.add(left);
        add(jp);
    }

    public static void main(String[] args) {
        SwigConsole.run(new Buttons(),350, 200);
    }
}
