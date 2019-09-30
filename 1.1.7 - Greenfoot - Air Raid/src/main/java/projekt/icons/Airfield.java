package projekt.icons;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Airfield extends Actor {
    //Variable declaration.
    private int temp1 = 1;
    //Sets texture.
    private GreenfootImage texture  = new GreenfootImage("airbaseicon.png");

    public void act() {
        if (temp1 == 1) {
            texture.scale(40, 40);
            setImage(texture);
            //System.out.println("Set texture.");
            temp1--;
        }
    }
}
