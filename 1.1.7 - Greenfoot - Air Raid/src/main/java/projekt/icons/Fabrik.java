package projekt.icons;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Fabrik extends Actor {
    //Variable declaration.;
    private int temp1 = 1;
    public static int friendlyProductionPower;

    private GreenfootImage texture  = new GreenfootImage("factory.png");

    public void act() {
        if (temp1 == 1) {
            texture.scale(40,40);
            setImage(texture);
            System.out.println("Set texture.");
            temp1--;
        }
    }
}
