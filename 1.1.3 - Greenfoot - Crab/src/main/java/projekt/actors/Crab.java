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
            move(4);
        } else if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }

        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        } else if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }
}


