package util;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.InputStream;

public class PlaySound {
    public static void playSound(String filename) {
        try {
            Clip clip = AudioSystem.getClip();
            InputStream is = PlaySound.class.getResourceAsStream("../" + filename);
            System.out.println(is);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(is);
            System.out.println(audioIn);
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        playSound("bombe.wav");
        // Ohne sleep wird das Programm beendet, bevor der Ton abgespielt ist
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
