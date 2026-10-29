package ua.com.kisit.lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ClockFrame2 {

    JFrame frame;
    JPanel panel;
    JLabel display;

    public ClockFrame2() {

        frame = new JFrame("MyClock");
        panel = new JPanel();
        display = new JLabel();

        panel.add(display);
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 80);

        ClockExt2 clockExt = new ClockExt2(18, 2, 23, 0);

        display.setText(clockExt.toString());


        Timer timer = new Timer(100, e -> {
            clockExt.nextMs();
            display.setText(clockExt.toString());
        }
        );
        timer.start();
        frame.setVisible(true);
    }

    static void main() {
        new ClockFrame2();
    }
}
