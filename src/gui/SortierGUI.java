package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SortierGUI extends JFrame {
    private JPanel pMain;
    private JTextArea taAusgabe;
    private JButton bSortieren;
    private JPanel pButtons;
    private JPanel pOutput;
    private JPanel POut;
    private ArrayPanel pArray;

    public SortierGUI() {
        bSortieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ausgabe = SortierAusgabe.sortieren();
                taAusgabe.setText(ausgabe);
            }
        });

        pArray = new ArrayPanel();
        POut.add(pArray);

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
