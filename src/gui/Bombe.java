package gui;

import util.PlaySound;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Bombe extends JFrame {
    private JButton bClick;
    private JPanel pMain;
    private int counter;
    private ImageIcon iBombe2;
    private Image background;

    public Bombe() {
        super();
        counter = 5;
        try {
            iBombe2 = new ImageIcon(ImageIO.read(getClass().getResource("../bombe2.png")));
            background = Toolkit.getDefaultToolkit().createImage("background.jpg");
        } catch (IOException e) {}

        bClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter > 1) {
                    bClick.setText("Klick mich... " + --counter);
                    bClick.setIcon(iBombe2);
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

    // void paint(Graphics g) {
    //     super(g);
    //     g.drawImage(background, 0, 0, null);
    // }

    public static void main(String[] args) {
        new Bombe();
    }
}
