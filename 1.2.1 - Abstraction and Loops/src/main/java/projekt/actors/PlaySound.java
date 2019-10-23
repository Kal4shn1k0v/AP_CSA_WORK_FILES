package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static jdk.internal.org.objectweb.asm.util.Printer.TYPES;

public class PlaySound extends Actor {
    public static String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l",";","'","enter"};
    public static String[] whiteNotes = {"3c.wav", "3d.wav", "3e.wav", "3f.wav", "3g.wav", "3a.wav", "3b.wav", "4c.wav", "4d.wav", "4e.wav", "4f.wav", "4g.wav"};
    public static int once = 1;

    public static void playSound(String tempKey) {
        if (once == 1) {
            int tempIndex = Arrays.asList(whiteKeys).indexOf(tempKey);
            Greenfoot.playSound(whiteNotes[tempIndex]);
            //System.out.println(Arrays.asList(whiteKeys).indexOf(tempKey));
            //System.out.println(tempKey);
            once--;
        }
    }

    public void act(){
        //if (Greenfoot.isKeyDown(null)) {

        //}
    }
}
