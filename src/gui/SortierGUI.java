package gui;

import sortieren.BubbleSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortierGUI extends JFrame {
    private JPanel pMain;
    private JTextArea taAusgabe;
    private JButton bSortieren;
    private JPanel pButtons;
    private JPanel pOutput;
    private JPanel POut;
    private ArrayPanel pArray;
    private SortierAusgabe ausgabe;

    public SortierGUI() {
        ausgabe = new SortierAusgabe(taAusgabe);
        bSortieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleSort bsort = new BubbleSort(new int[]{3, 6, 12, 8, 3, 78, 3, 5}, ausgabe);
                bsort.sortieren();
            }
        });

        pArray = new ArrayPanel();
        POut.add(pArray);

        add(pMain);
        setSize(800, 600);
        setTitle("Mein Fenster 11G4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SortierGUI();
    }
}
