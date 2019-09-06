package projekt.actors;

import bluej.collect.GreenfootInterfaceEvent;
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;
import greenfoot.World;
import projekt.DemoApp;
import projekt.worlds.MyWorld;

public class Worm extends Actor {
    private boolean istouching;
    private GreenfootSound slurpsound = new GreenfootSound("slurp.wav");

    public static int wormsEaten = 0;

    public Worm() {
        getImage().scale(50,50);
    }

    public void act() {
        if (isTouching(Crab.class)) {
            //slurpsound.play(); //not working correctly
            wormsEaten++;
            System.out.println(wormsEaten);
            getWorld().removeObject(this);
        }
    }
}
