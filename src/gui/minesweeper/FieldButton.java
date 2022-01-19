package gui.minesweeper;

import javax.swing.*;

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

    // increment i++
    public void incMineCount() {
        if (!mine) {
            setName("mine" + ++mineCount);
        }
    }

    public boolean aufdecken() {
        setDisabledIcon(images.getImage(getName()));
        setEnabled(false);
        return mine;
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
