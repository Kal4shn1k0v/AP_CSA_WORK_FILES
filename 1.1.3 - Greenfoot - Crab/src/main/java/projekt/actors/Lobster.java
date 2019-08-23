package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Lobster extends Actor {
    public Lobster() {
        getImage().scale(51,51);
    }

    public void act() {
        move(4);
        if (Greenfoot.getRandomNumber(100) < 25) {
            turn(Greenfoot.getRandomNumber(90) - 30);
        }
/*
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 2);
        } else if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 2);
        }

        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 2, getY());
        } else if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 2, getY());
        }*/
    }
}
