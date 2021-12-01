package gui;

import util.Util;

import javax.swing.*;
import java.awt.*;

public class ArrayPanel extends JPanel {
    private static final String uiClassID = "ArrayPanel";
    private int[] array;
    private int maxValue;

    public ArrayPanel() {
        this(new int[]{3, 1, 12, 25, 20, 5, 30, 5, 4, 5, 2, 8, 10, 6, 7, 9});
    }
    public ArrayPanel(int[] array) {
        super(true);
        setPreferredSize(new Dimension(200, 200));
        setArray(array);
    }

    public void setArray(int[] array) {
        this.array = array;
        maxValue = array[0];
        for (int e : array) {
            maxValue = Math.max(maxValue, e);
        }

        repaint();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void swap(int i, int j) {
        Util.swap(array, i, j);
        repaint();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Rectangle r = g.getClipBounds();

        double colWidth = r.width / (double) array.length;
        g.setColor(Color.BLUE);

        for (int i = 0; i < array.length; i++) {
            int hoehe = array[i] * r.height / maxValue;
            g.fillRect(r.x + (int) Math.round(i * colWidth), r.y + r.height - hoehe, (int) Math.round(colWidth), hoehe);
        }

        g.setColor(Color.BLACK);
        g.drawRect(r.x, r.y, r.width - 1, r.height - 1);
    }
}
