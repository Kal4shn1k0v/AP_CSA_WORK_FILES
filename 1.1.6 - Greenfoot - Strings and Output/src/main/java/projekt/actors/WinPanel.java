package projekt.actors;

import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.GreenfootImage;

public class WinPanel extends Actor {
    public WinPanel(String score) { //Create win message.
        setImage(new GreenfootImage("Score: " + score, 30, Color.RED, Color.BLACK));
    }

    public void act() {

    }
}
