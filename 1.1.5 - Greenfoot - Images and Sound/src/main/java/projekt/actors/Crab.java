package projekt.actors;

import greenfoot.Actor;

public class Crab extends Actor {
    public Crab() {
        getImage().scale(50,50);
    }

    public void act() {
        if (isTouching(Lobster.class)) {
            System.out.println("Collision!");
            getWorld().removeObject(this);
        }
    }
}
