package gui;

import javax.swing.*;
import java.awt.*;

public class ArrayPanel extends JPanel {
    private static final String uiClassID = "ArrayPanel";
    private int[] array;
    private int maxValue;

    public ArrayPanel() {
        super(true);
        setPreferredSize(new Dimension(200, 200));
        setArray(new int[]{3, 1, 12, 25, 20, 5, 48, 5, 4, 5, 2, 8, 10, 6, 7, 9});
    }

    public void setArray(int[] array) {
        this.array = array;
        maxValue = array[0];
        for (int e : array) {
            maxValue = Math.max(maxValue, e);
        }
        repaint();
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
// r.x = 0; r.y = 0; r.width = 200; r.height = 200; colWidth = 20; a.length = 10