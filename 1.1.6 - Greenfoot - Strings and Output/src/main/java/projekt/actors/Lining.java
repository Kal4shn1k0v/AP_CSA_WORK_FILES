package projekt.actors;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lining extends Actor {
    public void act() { //Movement
        setLocation(getX()-2, getY());

        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }    
}
