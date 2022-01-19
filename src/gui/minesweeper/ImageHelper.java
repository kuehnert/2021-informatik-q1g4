package gui.minesweeper;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;

class ImageHelper {
    MineSweeper main;
    HashMap<String, ImageIcon> images = new HashMap<>();
    String[] names = {"field", "flag", "mine", "red", "mine0", "mine1", "mine2", "mine3", "mine4", "mine5", "mine6",
            "mine7", "mine8"};

    public ImageHelper(MineSweeper main) {
        this.main = main;

        for (String name : names) {
            ImageIcon icon = null;
            String fname = "../../ms/" + name + ".png";

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
