package projekt.actors;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class BlackKey extends Actor {
    private GreenfootImage textureInactive = new GreenfootImage("black-key.png");
    private GreenfootImage textureActive = new GreenfootImage("black-key-down.png");

    public BlackKey() {
        setImage(textureInactive);
        getImage().scale(63, 280);
    }

    public void act() {

    }

}
