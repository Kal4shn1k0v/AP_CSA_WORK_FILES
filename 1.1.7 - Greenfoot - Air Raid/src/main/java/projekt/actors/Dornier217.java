package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import projekt.GameAPI;

public class Dornier217 extends Actor {
    public void act() {
        if (Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 1);
        } else if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 1);
        } else if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 1, getY());
        } else if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 1, getY());
        }
        GameAPI.setGrid("Dornier217", 1,1);
    }

    public static void nice() {
        
    }
}
