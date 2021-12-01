package gui;

import sortieren.BubbleSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortierGUI extends JFrame {
    private JPanel pMain;
    private JTextArea taBubble;
    private JButton bBubble;
    private JPanel pButtons;
    private JPanel pBubble;
    private JPanel POut;
    private JButton bFill;
    private JTextArea taInsertion;
    private JButton bInsertion;
    private JButton bSwap;
    private ArrayPanel pArray;
    private SortierAusgabe ausgabe;
    private int[] array;

    public SortierGUI() {
        array = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        ausgabe = new SortierAusgabe(taBubble);
        bBubble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleSort bsort = new BubbleSort(array, ausgabe);
                bsort.sortieren();
                pArray.setArray(array);
            }
        });

        pArray = new ArrayPanel(array);
        POut.add(pArray);

        add(pMain);
        setSize(800, 600);
        setTitle("Mein Fenster 11G4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        bFill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taBubble.setText("dsajd hsajlkdh jsadhjksah djkhsakjdh sahjkd hsajkdh kjsah d hsjakh djksahjkdh " +
                        "sjakdh jksa hdjk hsajkd hjsakhdjksahjkdh sjakdh jksah dhsajkd hsjakh dsakjdhjkash djksah " + "dksh ajkd jksah djksah kjdh sakjdh jksah dkjsah jdkh sadhsjlakd hjslak jdoksa jkdl sjalkd " + "jksladjlksa jdklsa jkldjsakld jklsadjiowaj diowhroiwj iepfrj sadokh saj dlksajldkj sakld " + "jaslkd");
            }
        });
        bSwap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Swap!");

                int x = (int) (Math.random() * 8) ;
                int y = (int) (Math.random() * 8) ;
                pArray.swap(x, y);
            }
        });
    }

    public static void main(String[] args) {
        new SortierGUI();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

