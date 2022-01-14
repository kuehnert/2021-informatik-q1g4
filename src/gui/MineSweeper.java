package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

// t1p.de/uv4p
public class MineSweeper extends JFrame {
    private JPanel pMain;
    private JPanel pButtons;
    private JPanel pMinefield;
    private JButton restartButton;
    private JButton debugButton;
    private int cols = 9;
    private int rows = 9;
    private int mineCount = 10;
    private FieldButton[] field;

    public MineSweeper()  {
        super("Mr K.'s MineSweeper");
        pMinefield.setLayout(new GridLayout(rows, cols));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        field = new FieldButton[cols * rows];
        FieldButtonListener fbl = new FieldButtonListener();

        for (int i = 0; i < cols * rows; i++) {
            FieldButton fb = new FieldButton();
            fb.addActionListener(fbl);
            field[i] = fb;
            pMinefield.add(fb);
        }

        add(pMain);
        pack();
        setVisible(true);

        restartGame();
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });
        debugButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAll();
            }
        });
    }

    private void restartGame() {
        Random gen = new Random();

        for (FieldButton fb : field) {
            fb.setName("L");
        }

        // Setze Minen
        for (int i = 0; i < mineCount; i++) {
            int mine = gen.nextInt(rows*cols);
            field[mine].setName("M");
        }
    }

    private void showAll() {
        for (FieldButton fb : field) {
            fb.setText(fb.getName());
        }
    }

    public static void main(String[] args) {
        new MineSweeper();
    }

    class FieldButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FieldButton fb = (FieldButton) e.getSource();
            fb.setText(fb.getName());
        }
    }}

class FieldButton extends JButton {
    public FieldButton() {
        super();
    }
}
