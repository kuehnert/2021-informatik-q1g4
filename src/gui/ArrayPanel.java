package gui;

import javax.swing.*;
import java.awt.*;

public class ArrayPanel extends JPanel {
    private static final String uiClassID = "ArrayPanel";

    public ArrayPanel() {
        super();
        setPreferredSize(new Dimension(100, 100));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Rectangle r = g.getClipBounds();
        g.drawLine(r.x, r.y, r.width, r.height);
    }
}
