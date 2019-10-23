package projekt.actors;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class BlackKey extends Actor {
    private GreenfootImage textureInactive = new GreenfootImage("white-key.png");
    private GreenfootImage textureActive = new GreenfootImage("white-key-down.png");

    public BlackKey() {
        setImage(textureInactive);
        getImage().scale(63, 280);
    }

    public void act() {

    }

}
