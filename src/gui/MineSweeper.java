package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

// t1p.de/uv4p
public class MineSweeper extends JFrame {
    private final int cols = 9;
    private final int rows = 9;
    private final int mineCount = 10;
    private final FieldButton[] field;
    private final ImageHelper helper;
    private JPanel pMain;
    private JPanel pButtons;
    private JPanel pMinefield;
    private JButton restartButton;
    private JButton debugButton;

    public MineSweeper() {
        super("Mr K.'s MineSweeper");
        pMinefield.setLayout(new GridLayout(rows, cols));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        helper = new ImageHelper(this);
        field = new FieldButton[cols * rows];
        FieldButtonListener fbl = new FieldButtonListener();
        setResizable(false);

        for (int i = 0; i < cols * rows; i++) {
            FieldButton fb = new FieldButton(helper, i);
            fb.addActionListener(fbl);
            fb.setIcon(helper.getImage("field"));
            fb.setBorder(null);
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

    public static void main(String[] args) {
        new MineSweeper();
    }

    private void restartGame() {
        Random gen = new Random();

        for (int i = 0; i < cols * rows; i++) {
            FieldButton fb = field[i];
            fb.reset();
        }

        // Setze Minen
        for (int i = 0; i < mineCount; i++) {
            int mine;
            do {
                mine = gen.nextInt(rows * cols);
            } while (field[mine].isMine());

            ArrayList<Integer> ns = getNeighbours(mine);
            // System.out.println("Neighbours of " + mine + ": " + ns);
            field[mine].setMine(true);

            for (Integer n : ns) {
                field[n].incMineCount();
            }
        }
    }

    private void showAll() {
        for (FieldButton fb : field) {
            fb.aufdecken();
        }
    }

    private ArrayList<Integer> getNeighbours(int index) {
        ArrayList<Integer> ns = new ArrayList<Integer>();

        for (int c = -1; c <= 1; c++) {
            for (int r = -1; r <= 1; r++) {
                int target = index + c + r * cols;
                int scol = index % cols;
                int tcol = (index + c) % cols;

                if ((c == 0 && r == 0) || target < 0 || target >= rows * cols || (scol == 0 && tcol == cols - 1 || (scol == cols - 1 && tcol == 0))) {
                    continue;
                }

                ns.add(target);
            }
        }

        return ns;
    }

    private void aufdecken(int index) {
        FieldButton fb = field[index];
        if (!fb.isEnabled()) {return;}
        fb.aufdecken();

        if (fb.getMineCount() == 0) {
            ArrayList<Integer> nb = getNeighbours(index);
            for (Integer i : nb) {
                aufdecken(i);
            }
        }
    }

    class FieldButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FieldButton fb = (FieldButton) e.getSource();
            aufdecken(fb.getIndex());
        }
    }
}

class FieldButton extends JButton {
    private final ImageHelper images;
    private final int index;
    private boolean mine;
    private int mineCount;

    public FieldButton(ImageHelper images, int index) {
        super();
        this.images = images;
        this.index = index;
        reset();
    }

    public int getMineCount() {
        return mineCount;
    }

    public int getIndex() {
        return index;
    }

    public void reset() {
        mine = false;
        mineCount = 0;
        setName("mine0");
        setIcon(images.getImage("field"));
        setEnabled(true);
    }

    public void incMineCount() {
        if (!mine) {
            setName("mine" + ++mineCount);
        }
    }

    public void aufdecken() {
        setDisabledIcon(images.getImage(getName()));
        setEnabled(false);
    }

    public boolean isMine() {
        return mine;
    }

    public void setMine(boolean mine) {
        this.mine = mine;
        if (mine) {
            mineCount = 9;
            setName("mine");
            setDisabledIcon(images.getImage("mine"));
        }
    }
}

class ImageHelper {
    MineSweeper main;
    HashMap<String, ImageIcon> images = new HashMap<>();
    String[] names = {"field", "flag", "mine", "red", "mine0", "mine1", "mine2", "mine3", "mine4", "mine5", "mine6",
            "mine7", "mine8"};

    public ImageHelper(MineSweeper main) {
        this.main = main;

        for (String name : names) {
            ImageIcon icon = null;
            String fname = "../ms/" + name + ".png";

            try {
                icon = new ImageIcon(ImageIO.read(main.getClass().getResource(fname)));
                images.put(name, icon);
            } catch (IllegalArgumentException iae) {
                System.err.println("Fehler beim Laden von " + fname);
            } catch (IOException ioe) {
                System.err.println("Fehler beim Laden von " + fname);
            }
        }
    }

    public ImageIcon getImage(String id) {
        return images.get(id);
    }
}
