import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCell extends Actor {
    public int velocity;
    public int direction;

    public RedCell (int speed, int rotation) {
        if (speed !=0 ) { //Set speed.
            velocity = speed;
        } else {
            velocity = speed + 3;
        }

        if (rotation < 3) { //Set turn rate.
            direction =  -3;
        } else if (rotation > 3) {
            direction = 3;
        }
    }

    public void act() { //Movement/
        setLocation(getX()-velocity, getY());
        turn(direction);

        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }
}
