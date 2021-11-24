package gui;

import util.PlaySound;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bombe extends JFrame {
    private JButton bClick;
    private JPanel pMain;
    private int counter;

    public Bombe() {
        super();
        counter = 5;

        bClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter > 1) {
                    bClick.setText("Klick mich... " + --counter);
                } else {
                    bClick.setText("Bumm!");
                    PlaySound.playSound("bombe.wav");
                }
            }
        });

        setTitle("MrK's Bombe");
        add(pMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Bombe();
    }
}
