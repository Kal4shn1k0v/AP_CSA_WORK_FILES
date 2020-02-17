package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

public class Apple extends Actor {
    public Apple() {

    }

    private int once = 0;

    public void act() {
        while(once == 0){
            GreenfootImage myimage = new GreenfootImage("apple.png");
            setImage(myimage);
            myimage.scale(40,40);
            once ++;
        }
    }
}
