package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

public class Crab extends Actor {
    private GreenfootImage image1;
    private GreenfootImage image2;


    public Crab() {
        getImage().scale(50,50);
    }

    public void act() {
        setImage(image1);

        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 4);
        } else if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 4);
        } else if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 4, getY());
        } else if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 4, getY());
        } else if (Greenfoot.isKeyDown("q")) {
            turn(-3);
        } else if (Greenfoot.isKeyDown("e")) {
            turn(3);
        }

        if (isTouching(Lobster.class)) {
            System.out.println("Collision!");
            getWorld().removeObject(this);
        }
    }
}
