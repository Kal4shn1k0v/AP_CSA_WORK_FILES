package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

import java.util.concurrent.TimeUnit;

public class Crab extends Actor {
    public Crab() {
        getImage().scale(50,50);
    }

    //GreenfootImage 1 = new GreenfootImage("crab.png");


    public void act() {
        int infinity = 10;
        while (infinity >  5) { /*
            if (new GreenfootImage("crab.png").equals(getImage())){
                setImage("crab2.png");
            }  */

            getImage().scale(50,50);
            Greenfoot.delay(1);
            getImage().scale(60,50);
            Greenfoot.delay(1);
        }

            move(4);

        if (isTouching(Lobster.class)) {
            System.out.println("Collision!");
            getWorld().removeObject(this);
        }
    }
}
