package projekt.buttons;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class DornierIcon extends Actor {
    private int temp1 = 1;

    private GreenfootImage texture  = new GreenfootImage("dornier.png");

    public void act() {
        if (temp1 == 1) {
            texture.scale(40,40);
            setImage(texture);
            System.out.println("Set texture.");
            temp1--;
        }
    }
}
