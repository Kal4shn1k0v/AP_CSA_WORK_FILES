package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import projekt.DemoApp;

public class Worm extends Actor {
    private boolean istouching;

    public Worm() {
        getImage().scale(50,50);
    }

    public void act() {
        if (isTouching(Crab.class)) {
            System.out.println("Collision!");
            getWorld().removeObject(this);
        }
    }

    public void eat() {

    }
}
