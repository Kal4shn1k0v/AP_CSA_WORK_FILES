import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus extends Actor {
    public void act() { //Movement.
        setLocation(getX()-2, getY());
        turn(1);

        if (getX() == 0) {
            getWorld().removeObject(this);
        } else if (this.isTouching(WhiteCell.class)) {
            getWorld().removeObject(this);
        }
    }
}
