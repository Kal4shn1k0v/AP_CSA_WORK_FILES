import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lining here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lining extends Actor {
    public void act() { //Movement
        setLocation(getX()-2, getY());

        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }    
}
