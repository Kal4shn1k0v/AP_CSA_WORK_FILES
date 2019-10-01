package projekt.actors;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import projekt.worlds.MyWorld;

public class Spitfire extends Actor {
    //Declares variable.
    private int friendlyPositionX;
    private int friendlyPositionY;
    private int temp1 = 1;
    private int temp2 = 0;

    //Sets texture.
    private GreenfootImage texture1  = new GreenfootImage("spitfire.png");
    private GreenfootImage texture2  = new GreenfootImage("explosion.png");

    public void act() {
        if (temp1 == 1) {
            texture1.scale(40,40);
            setImage(texture1);
            System.out.println("Set texture.");
            temp1--;
        }

        if (this.isTouching(Messerschmitt109.class)) {
            setImage(texture2);
            if (getImage().equals(texture1)) {
                getWorld().removeObject(this);
            }
        }

        Heinkel274 heinkel274 = getWorld().getObjects(Heinkel274.class).get(1);
        friendlyPositionX = heinkel274.getX();
        friendlyPositionY = heinkel274.getY();
    }
}
