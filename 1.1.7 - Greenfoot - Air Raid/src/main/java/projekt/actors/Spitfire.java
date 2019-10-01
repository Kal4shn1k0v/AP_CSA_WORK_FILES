package projekt.actors;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import projekt.worlds.MyWorld;

public class Spitfire extends Actor {
    //Declares variable.
    private int friendlyPositionX;
    private int friendlyPositionY;

    //Sets texture.
    private GreenfootImage texture1  = new GreenfootImage("spitfire.png");
    private GreenfootImage texture2  = new GreenfootImage("explosion.png");

    public void act() {
        if (this.isTouching(Messerschmitt109.class)) {
            setImage(texture2);
            if (getImage().equals(texture1)) {
                getWorld().removeObject(this);
            }
        }
    }
}
