package projekt.actors;

import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public Crab() {
        getImage().scale(50,50);
    }
    public void act() {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 2);
        } else if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 2);
        }

        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 2, getY());
        } else if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 2, getY());
        }
    }
}


