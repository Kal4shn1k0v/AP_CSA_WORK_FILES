package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlaySound extends Actor {
    public static String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l",";","'","enter"};
    public static String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"};
    public static int once = 1;

    public static void playSound() {
        if (once == 1) {
            String tempKey = Greenfoot.getKey();
            //Greenfoot.playSound(whiteNotes[Arrays.asList(PlaySound.whiteKeys).indexOf(tempKey)]);
            //System.out.println(whiteNotes[Arrays.asList(PlaySound.whiteKeys).indexOf(tempKey)]);
            System.out.println(tempKey);
            once--;
        }
    }

    public void act(){
        //if (Greenfoot.isKeyDown(null)) {

        //}
    }
}
