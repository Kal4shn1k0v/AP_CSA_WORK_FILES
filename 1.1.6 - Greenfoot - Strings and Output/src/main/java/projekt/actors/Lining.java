package projekt.actors;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lining extends Actor {
    public void act() {
        setLocation(getX()-2, getY());

        if (getX() == 0) {
            getWorld().removeObject(this);
            getWorld().addObject(this,225, 360);
        }
    }    
}
