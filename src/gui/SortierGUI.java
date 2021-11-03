package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SortierGUI extends JFrame {
    private JButton bKnopf;
    private JPanel pMain;
    private JTextArea taAusgabe;
    private JButton bSortieren;

    public SortierGUI() {
        bSortieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ausgabe = SortierAusgabe.sortieren();
                taAusgabe.setText(ausgabe);
            }
        });

        bKnopf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(bKnopf.getText(), "Bombe")) {
                    bKnopf.setText("Bumm!");
                } else {
                    bKnopf.setText("Bombe");
                }
            }
        });

        add(pMain);
        setSize(800, 600);
        setTitle("Mein Fenster 11");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SortierGUI();
    }
}
