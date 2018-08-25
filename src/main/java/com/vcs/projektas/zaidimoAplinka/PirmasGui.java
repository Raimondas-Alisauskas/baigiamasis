package com.vcs.projektas.zaidimoAplinka;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class PirmasGui extends JFrame {

    private JLabel label;
    private JButton button;
    private JTextField textfield;

    public PirmasGui() {
        setLayout(new FlowLayout());

        label = new JLabel("Žaidimas!");
        add(label);

        textfield = new JTextField(10);
        add(textfield);

        button = new JButton("CLICK ME!");
        add(button);
    }

    public static void main(String[] args) {

    PirmasGui gui = new PirmasGui();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(200, 200);
    gui.setVisible(true);
    gui.setTitle("Žaidimas");

}

}
