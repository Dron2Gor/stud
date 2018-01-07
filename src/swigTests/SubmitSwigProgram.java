package swigTests;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SubmitSwigProgram extends JFrame {
    JLabel label;

    public SubmitSwigProgram() {
//        super("Hello Swing");
        label = new JLabel("A lable");
        add(label);
    }

    static SubmitSwigProgram ssp;

    public static void main(String[] args) throws InterruptedException {
        ssp = new SubmitSwigProgram();
        SwigConsole.run(ssp, 300, 100);
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.label.setText("Hey! This is Defferent! ");
            }
        });
    }
}
