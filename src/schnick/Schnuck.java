package schnick;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class Schnuck extends JFrame {
    public static int ROCK = 0;
    public static int PAPER = 1;
    public static int SCISSORS = 2;

    public ImageIcon iRock;
    public ImageIcon iPaper;
    public ImageIcon iScissors;
    public ImageIcon[] icons;

    private Random random = new Random();
    private JButton bRock;
    private JButton bPaper;
    private JButton pScissors;
    private JLabel lbComputer;
    private JPanel pMain;

    public Schnuck() {
        super();

        try {
            iRock = new ImageIcon(ImageIO.read(getClass().getResource("../rock.jpg")));
            iPaper = new ImageIcon(ImageIO.read(getClass().getResource("../paper.jpg")));
            iScissors = new ImageIcon(ImageIO.read(getClass().getResource("../scissors.jpg")));
            icons = new ImageIcon[]{iRock, iPaper, iScissors};
        } catch (IOException e) {}

        add(pMain);
        setTitle("MrK's Schnick, Schnack, Schnuck");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        bRock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makePlay(ROCK);
            }
        });
        bPaper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makePlay(PAPER);
            }
        });
        pScissors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makePlay(SCISSORS);
            }
        });
    }

    public static void main(String[] args) {
        new Schnuck();
    }

    private void makePlay(int playerChoice) {
        int computerChoice = random.nextInt(3);
        lbComputer.setIcon(icons[computerChoice]);
    }
}
