package projekt.actors;

import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.GreenfootImage;

public class ScoreBoard extends Actor  {
    public static String temp; //Never used.

    public ScoreBoard(String text, String time) { //Create score panel.
        setImage(new GreenfootImage("Score: " + text + "    Time: " + time, 18, Color.WHITE, Color.BLACK));
    }

    public void act() {

    }
}
