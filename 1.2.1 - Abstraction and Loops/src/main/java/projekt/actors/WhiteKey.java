package projekt.actors;

import greenfoot.*;

import java.util.Arrays;

public class WhiteKey extends Actor {
    private GreenfootImage textureInactive = new GreenfootImage("white-key.png");
    private GreenfootImage textureActive = new GreenfootImage("white-key-down.png");

    public WhiteKey() {
        setImage(textureInactive);
        getImage().scale(63, 280);
    }

    private boolean isDown = false;

    public void act() {
/*        if (!isDown && Greenfoot.isKeyDown("a") ) {
            setImage(textureActive);
            isDown = true;
            PlaySound.playSound();
        } else if (isDown && !Greenfoot.isKeyDown("a") ) {
            setImage(textureInactive);
            isDown = false;
            PlaySound.playSound();
            PlaySound.once = 1;
        } */
    }
}

