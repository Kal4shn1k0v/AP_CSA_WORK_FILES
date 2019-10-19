package projekt.actors;

import greenfoot.*;

public class DisplayWhiteKey extends Actor {
    private GreenfootImage textureInactive = new GreenfootImage("white-key.png");
    private GreenfootImage textureActive = new GreenfootImage("white-key-down.png");

    public DisplayWhiteKey() {
        setImage(textureInactive);
        getImage().scale(63, 280);
    }

    private boolean isDown;

    public void act() {
        if (!isDown && Greenfoot.isKeyDown("a") ) {
            setImage(textureActive);
            isDown = true;
        } else if (isDown && !Greenfoot.isKeyDown("a") ) {
            setImage(textureInactive);
            isDown = false;
        }

        if (!isDown && Greenfoot.isKeyDown("s") ) {
            //set image dark
            isDown = true;
        } else if (isDown && !Greenfoot.isKeyDown("s") ) {
            //set image light
            isDown = false;
        }
    }
}

