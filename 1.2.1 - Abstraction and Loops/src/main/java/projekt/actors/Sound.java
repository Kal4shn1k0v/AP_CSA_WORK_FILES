package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static jdk.internal.org.objectweb.asm.util.Printer.TYPES;

public class Sound extends Actor {
    public static String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l",";","'","enter"};
    public static String[] whiteNotes = {"3c.wav", "3d.wav", "3e.wav", "3f.wav", "3g.wav", "3a.wav", "3b.wav", "4c.wav", "4d.wav", "4e.wav", "4f.wav", "4g.wav"};
    public static String[] blackKeys = {"w","e","t","y","u","o","p"};
    public static String[] blackNotes = {"3c#.wav","3d#.wav","3f#.wav","3g#.wav","3a#.wav","3c#.wav"};
    public static int whiteOnce = 1;
    public static int blackOnce = 1;

    public static void playWhiteSound(String tempKey) {
        if (whiteOnce == 1) {
            int tempIndex = Arrays.asList(whiteKeys).indexOf(tempKey);
            if (tempIndex >= 0 ) {
                Greenfoot.playSound(whiteNotes[tempIndex]);
            } else {

            }
            whiteOnce--;
        }
    }

    public static void playBlackSound(String tempKey) {
        if (blackOnce == 1) {
            int tempIndex = Arrays.asList(blackKeys).indexOf(tempKey);
            if (tempIndex >= 0 ) {
                Greenfoot.playSound(blackNotes[tempIndex]);
            } else {

            }
            blackOnce--;
        }
    }

    public void act(){
        //if (Greenfoot.isKeyDown(null)) {

        //}
    }
}
