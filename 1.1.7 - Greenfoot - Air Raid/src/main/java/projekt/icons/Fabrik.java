package projekt.icons;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import projekt.actors.Spitfire;

public class Fabrik extends Actor {
    //Variable declaration.;
    private int temp1 = 1;
    public static int friendlyProductionPower;

    private GreenfootImage texture1  = new GreenfootImage("factory.png");
    private GreenfootImage texture2  = new GreenfootImage("explosion.png");

    public void act() {
        if (temp1 == 1) {
            texture1.scale(40,40);
            setImage(texture1);
            System.out.println("Set texture.");
            temp1--;
        }

        if (this.isTouching(Spitfire.class)) {
            texture2.scale(40,40);
            setImage(texture2);
            if (getImage().equals(texture1)) {
                getWorld().removeObject(this);
            }
        }
    }
}
