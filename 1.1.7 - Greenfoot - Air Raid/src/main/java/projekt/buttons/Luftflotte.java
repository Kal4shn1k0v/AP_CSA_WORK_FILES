package projekt.buttons;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Luftflotte extends Actor {
    private GreenfootImage texture = new GreenfootImage("luftlotte.png");

    public Luftflotte() {
        int temp1 = 1;
        if (temp1 == 1) {
            texture.scale(40, 40);
            setImage(texture);
            temp1--;
        }
    }

    public void act() {

    }
}