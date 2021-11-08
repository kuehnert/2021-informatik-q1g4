package gui;

import javax.swing.*;
import java.awt.*;

public class ArrayPanel extends JPanel {
    private static final String uiClassID = "ArrayPanel";
    private int[] array;

    public ArrayPanel() {
        super(true);
        setPreferredSize(new Dimension(200, 200));
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Rectangle r = g.getClipBounds();
        g.drawRect(r.x, r.y, r.width, r.height);

        int colWidth = r.width / array.length;
        g.setColor(Color.BLUE);

        for (int i = 0; i < array.length; i++) {
            g.fillRect(r.x + i * colWidth, r.y, colWidth, array[i] * r.height / array.length);
        }
    }
}
// r.x = 0; r.y = 0; r.width = 200; r.height = 200; colWidth = 20; a.length = 10