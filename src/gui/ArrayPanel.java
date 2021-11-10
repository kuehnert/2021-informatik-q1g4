package gui;

import javax.swing.*;
import java.awt.*;

public class ArrayPanel extends JPanel {
    private static final String uiClassID = "ArrayPanel";
    private int[] array;

    public ArrayPanel() {
        super(true);
        setPreferredSize(new Dimension(200, 200));
        array = new int[]{3, 1, 4, 5, 2, 8, 10 , 6, 7, 9};
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Rectangle r = g.getClipBounds();

        int colWidth = r.width / array.length;
        g.setColor(Color.BLUE);

        for (int i = 0; i < array.length; i++) {
            int hoehe = array[i] * r.height / array.length;
            g.fillRect(r.x + i * colWidth, r.y+r.height-hoehe, colWidth, hoehe);
        }

        g.setColor(Color.BLACK);
        g.drawRect(r.x, r.y, r.width-1, r.height-1);
    }
}
// r.x = 0; r.y = 0; r.width = 200; r.height = 200; colWidth = 20; a.length = 10