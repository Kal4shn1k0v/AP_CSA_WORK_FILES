package projekt.actors;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bacteria extends Actor {
    public Bacteria() {

    }
    public void act() {
        setLocation(getX()-2, getY());
        turn(1);
        
        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }
}
