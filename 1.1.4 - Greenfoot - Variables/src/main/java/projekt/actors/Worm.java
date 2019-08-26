package projekt.actors;

import greenfoot.Actor;

public class Worm extends Actor {
    private boolean istouching;

    public Worm() {
        getImage().scale(50,50);
    }

    public void act() {
        if (isTouching(Lobster.class)) {
            System.out.println("Collision!");
            getWorld().removeObject(this);
        }
    }

    public void eat() {

    }
}
